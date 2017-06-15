package finiteskies.fsmod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityMusketBullet extends EntityThrowable
{
	public EntityLivingBase shooter;
	private int ticksAlive = 300;
	
	public EntityMusketBullet(World worldIn)
    {
        super(worldIn);
    }

    public EntityMusketBullet(World worldIn, EntityLivingBase shooter)
    {
        super(worldIn, shooter);
        this.shooter = shooter;
		this.setAim();
    }

    public EntityMusketBullet(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    public void setAim(){
        this.setLocationAndAngles(shooter.posX, shooter.posY, shooter.posZ, shooter.rotationYaw, shooter.rotationPitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        double accelX = 10 + this.rand.nextGaussian() * 0.4D;
        double accelY = 10 + this.rand.nextGaussian() * 0.4D;
        double accelZ = 10 + this.rand.nextGaussian() * 0.4D;
        double d0 = (double)MathHelper.sqrt(accelX * accelX + accelY * accelY + accelZ * accelZ);
        this.motionX = accelX / d0 * 0.1D;
        this.motionY = accelY / d0 * 0.1D;
        this.motionZ = accelZ / d0 * 0.1D;

    }
    
    @Override
    public void onUpdate(){
    	
    	this.posX += this.motionX;
    	this.posY += this.motionY;
    	this.posZ += this.motionZ;
    	
    	ticksAlive --;
    	if(ticksAlive <= 0) this.setDead();
    	super.onUpdate();
    }
    
    public static void registerFixesSnowball(DataFixer fixer)
    {
        EntityThrowable.registerFixesThrowable(fixer, "Snowball");
    }

    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            for (int i = 0; i < 8; ++i)
            {
                this.world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    
    protected void onImpact(RayTraceResult result)
    {
        if (result.entityHit != null)
        {
            int i = 0;

            if (result.entityHit instanceof EntityBlaze)
            {
                i = 3;
            }

            result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
        }

        if (!this.world.isRemote)
        {
            this.world.setEntityState(this, (byte)3);
            //this.setDead();
        }
    }
    

}
