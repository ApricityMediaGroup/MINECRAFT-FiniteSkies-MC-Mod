package finiteskies.fsmod.tileentity;

import finiteskies.fsmod.api.RedstoneEnergy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityRedstoneGenerator extends TileEntity implements ITickable, IEnergyStorage {

	public final RedstoneEnergy energy;
    public ItemStackHandler itemStackHandler;


    public int maxRedstoneCharge = 64;
    public int redstoneCharge;
    public int generateTime;
    
	public TileEntityRedstoneGenerator() {
		this.redstoneCharge = 0; 
		this.energy = new RedstoneEnergy(redstoneCharge,redstoneCharge);
		itemStackHandler = new ItemStackHandler(1);

	}
	
	@Override
	public void update() {
		if(!this.world.isRemote) {
			ItemStack stack = this.itemStackHandler.getStackInSlot(0);
			if(stack.getItem() == Items.REDSTONE || stack.getItem() == Item.getItemFromBlock(Blocks.REDSTONE_BLOCK)) {
				if(this.generateTime > 0 ) {
					this.generateTime -= 1;
					if(this.generateTime <= 0 && this.canReceive()) {
						this.generateTime += getGenerationTime(stack);
						this.itemStackHandler.extractItem(0, 1, false);
						this.redstoneCharge++;
					}
				} else if (this.canReceive()) {
					this.generateTime += getGenerationTime(stack);
				}
			}
		}
				

	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.redstoneCharge = compound.getInteger("RedstoneCharge");
        this.generateTime = compound.getInteger("GenerateTime");
    }
	
	@Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setInteger("RedstoneCharge", (short)this.redstoneCharge);
        compound.setInteger("GenerateTime", (short)this.generateTime);
        return compound;
    }
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
	  if (capability == CapabilityEnergy.ENERGY) {
	    return true;
	  }
	  return super.hasCapability(capability, facing);
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
	  if (capability == CapabilityEnergy.ENERGY) {
	    return CapabilityEnergy.ENERGY.cast(this);
	  }
	  return super.getCapability(capability, facing);
	}
	
	public boolean isGeneratingEnergy() {
		return (this.generateTime > 0);
	}
	

	public int getField(int id)
    {
        switch (id)
        {
            case 0:
                return this.redstoneCharge;
            case 1:
                return this.maxRedstoneCharge; 
            case 2:
                return this.generateTime;
            default:
                return 0;
        }
    }
	

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:
                this.redstoneCharge = value;
                break;
            case 1:
                this.maxRedstoneCharge = value;
                break;
            case 2:
                this.generateTime = value;
                break;
        }
    }
    
	public int getGenerationTime(ItemStack stack) {
		Item item = stack.getItem();
		if (stack.isEmpty())
        {
            return 0;
        }
        else if(item == Items.REDSTONE) {
        	return 20;
        } else {
        	return 40;
        }
	}

	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		if (this.canReceive()) {
			this.redstoneCharge += maxReceive;
			return maxReceive;
		}
		return 0;
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {
		if (this.canExtract()) {
			this.redstoneCharge -= maxExtract;
			return maxExtract;
		}
		return 0;
	}

	@Override
	public int getEnergyStored() {
		return this.redstoneCharge;
	}

	@Override
	public int getMaxEnergyStored() {
		return this.maxRedstoneCharge;
	}

	@Override
	public boolean canExtract() {
		if (this.redstoneCharge > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean canReceive() {
		if(this.redstoneCharge < this.maxRedstoneCharge) {
			return true;
		} else {
			this.generateTime = 0;
		}
		return false;
	}

}
