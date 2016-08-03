package finiteskies.fsmod.entity.ai;

import finiteskies.fsmod.entity.passive.EntitySquirrel;
import net.minecraft.entity.ai.EntityAIBase;

public class EntitySquirrelAI extends EntityAIBase {
	private final EntitySquirrel EntitySquirrel;

	public EntitySquirrelAI(EntitySquirrel squirrel)
	{
		EntitySquirrel = squirrel;
		setMutexBits(1);

	    // DEBUG
	    System.out.println("EntitySquirrelAI constructor()");
	}

	@Override
	public boolean shouldExecute()
	{
/*	    if (theEntity.getAITarget() == null && theEntity.isBurning())
	    {
	        return false;
	    }
	    else
	    {
	        if (theEntity.isRearingFirstTick()) // only set the first tick that is rearing
	        {
	            return true;                    
	        }
	        else
	        {
	            return false;
	        }
	    }    */   
		return true;
	}

	@Override
	public void startExecuting() {
	   // DEBUG
	   System.out.println("EntitySquirrelAI startExecute()");
	}
	@Override
	public boolean continueExecuting()
	{
		return true;
		/*  theEntity.decrementRearingCounter();;
	   Boolean continueExecuting = theEntity.getRearingCounter()>0; 
	   if (!continueExecuting)
	   {
	      theEntity.setRearing(false);
	      // now attack back
	      theEntity.setAttackTarget(theEntity.getLastAttacker()); 
	   }
	   // DEBUG
	   System.out.println("EntityAIPanicHerdAnimal continueExecuting ="
	      +continueExecuting);
	   return (continueExecuting);
*/  
	}
}
