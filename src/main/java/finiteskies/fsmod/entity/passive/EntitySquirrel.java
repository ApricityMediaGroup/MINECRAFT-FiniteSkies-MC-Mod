package finiteskies.fsmod.entity.passive;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

import java.util.UUID;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntitySquirrel extends EntityCreature {
 
	public EntitySquirrel(World worldIn) {
		super(worldIn);
		this.setupAI(); //does this work? might have to directly put tasks in here if not
	}

	public static final UUID FLEEING_SPEED_MODIFIER_UUID = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
    public static final AttributeModifier FLEEING_SPEED_MODIFIER = (new AttributeModifier(FLEEING_SPEED_MODIFIER_UUID, "Fleeing speed bonus", 2.0D, 2)).setSaved(false);
    private BlockPos homePosition = BlockPos.ORIGIN;
    /** If -1 there is no maximum distance */
    private float maximumHomeDistance = -1.0F;
    private final EntityAIBase aiBase = new EntityAIMoveTowardsRestriction(this, 1.0D);
    private boolean isMovementAITaskSet;
    private float restoreWaterCost = PathNodeType.WATER.getPriority();
    /** Set entity attributes here */

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes(); 

        // standard attributes registered to EntityLivingBase
       getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
       getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
       getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
       getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);

        // need to register any additional attributes
       getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
       getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
    }
    @Override
    public float getBlockPathWeight(BlockPos pos)
    {
        return 0.0F;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return super.getCanSpawnHere() && this.getBlockPathWeight(new BlockPos(this.posX, this.getEntityBoundingBox().minY, this.posZ)) >= 0.0F;
    }

    /**
     * if the entity got a PathEntity it returns true, else false
     */
    @Override
    public boolean hasPath()
    {
        return !this.navigator.noPath();
    }
    @Override
    public boolean isWithinHomeDistanceCurrentPosition()
    {
        return this.isWithinHomeDistanceFromPosition(new BlockPos(this));
    }
    @Override
    public boolean isWithinHomeDistanceFromPosition(BlockPos pos)
    {
        return this.maximumHomeDistance == -1.0F ? true : this.homePosition.distanceSq(pos) < (double)(this.maximumHomeDistance * this.maximumHomeDistance);
    }

    /**
     * Sets home position and max distance for it
     */
    @Override
    public void setHomePosAndDistance(BlockPos pos, int distance)
    {
        this.homePosition = pos;
        this.maximumHomeDistance = (float)distance;
    }
    @Override
    public BlockPos getHomePosition()
    {
        return this.homePosition;
    }
    @Override
    public float getMaximumHomeDistance()
    {
        return this.maximumHomeDistance;
    }
    @Override
    public void detachHome()
    {
        this.maximumHomeDistance = -1.0F;
    }

    /**
     * Returns whether a home area is defined for this entity.
     */
    @Override
    public boolean hasHome()
    {
        return this.maximumHomeDistance != -1.0F;
    }

    @Override
    protected void onLeashDistance(float p_142017_1_)
    {
    }
    protected boolean isAIEnabled()
    {
       return true;
    }
    @Override
    public int getMaxFallHeight()
    {
        return 10;
    }
 // set up AI tasks
    protected void setupAI() {
       clearAITasks(); // clear any tasks assigned in super classes
       tasks.addTask(0, new EntityAISwimming(this));
       EntityAIBase aiSwimming = new EntityAISwimming(this);
       tasks.addTask(1, new EntityAIPanic(this, interpTargetPitch));
       EntityAIBase aiPanic = new EntityAIPanic(this, interpTargetPitch);
       // the leap and the collide together form an actual attack
       tasks.addTask(2, new EntityAILeapAtTarget(this, 0.1F));
       EntityAIBase aiLeap = new EntityAILeapAtTarget(this, 0.1F);
       tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.BEETROOT_SEEDS, false));
       EntityAIBase aiTempt = new EntityAITempt(this, 1.25D, Items.BEETROOT_SEEDS, false);
       tasks.addTask(4, new EntityAIWander(this, 1.0D));
       EntityAIBase aiWander = new EntityAIWander(this, 1.0D);
       tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
       EntityAIBase aiWatchClosest = new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F);
       tasks.addTask(6, new EntityAILookIdle(this));
       targetTasks.addTask(0, new EntityAIHurtByTarget(this, true)); 
       EntityAIBase aiHurtByTarget = new EntityAIHurtByTarget(this, true); 
       //DEBUG
       System.out.println("EntitySquirrel contructor setupAI");
    }

    protected void clearAITasks() {
       tasks.taskEntries.clear();
       targetTasks.taskEntries.clear();
    }
    @Override
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
        if (isEntityInvulnerable(par1DamageSource))
        {
            return false;
        }
        else
        {
            //DEBUG
            System.out.println("EntitySquirrel attackEntityFrom");
        	this.setAttackTarget(getAttackTarget());
            return super.attackEntityFrom(par1DamageSource, par2);

        }
    }
}