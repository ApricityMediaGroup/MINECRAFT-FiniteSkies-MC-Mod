package finiteskies.fsmod.tileentity;

import javax.swing.border.CompoundBorder;

import finiteskies.fsmod.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;

public class JarTileEntity extends TileEntity {

	private int storageCount = 0;
	
	public boolean addItem(){
			if(storageCount < 8){
				storageCount++;
				return true;
			}
		return false;
	}
	public void removeItem(){
			if(storageCount > 0){
				world.spawnEntity(new EntityItem(world, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, new ItemStack(ModItems.strawberry)));
				storageCount--;
			}	
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setInteger("StorageCount", this.storageCount);
		return compound;
}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		this.storageCount = compound.getInteger("StorageCount");
	}
	
}
