package finiteskies.fsmod.api;

import net.minecraftforge.energy.EnergyStorage;

public class RedstoneEnergy extends EnergyStorage {

	 public RedstoneEnergy(int capacity)
	    {
		 	super(capacity);
	    }

	    public RedstoneEnergy(int capacity, int maxTransfer)
	    {
	    	super(capacity, maxTransfer);
	    }

	    public RedstoneEnergy(int capacity, int maxReceive, int maxExtract)
	    {
	    	super(capacity, maxReceive, maxExtract);
	    }

	    public RedstoneEnergy(int capacity, int maxReceive, int maxExtract, int energy)
	    {
	    	super(capacity, maxReceive, maxExtract, energy);
	    }
}
