package finiteskies.fsmod.gui;

import finiteskies.fsmod.tileentity.TileEntityRedstoneGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerRedstoneGenerator extends Container {
	
	private TileEntityRedstoneGenerator tile;
	private int maxRedstoneCharge;
	private int redstoneCharge;
	private int generateTime;
    
    public ContainerRedstoneGenerator(InventoryPlayer invPlayer, TileEntityRedstoneGenerator tile) {
    	this.tile = tile;
    	addSlotToContainer(new TileSlotItemHandler(tile.itemStackHandler, 0, 80, 17));
        for(int x = 0; x < 9; x++) {
            addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 142));
        }
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 9; x++) {
                addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 84 + y * 18));
            }
        }
        
    }

	@Override
    public void detectAndSendChanges() {
    	 super.detectAndSendChanges();
    	 
    	 for (int i = 0; i < this.listeners.size(); ++i)
         {
             IContainerListener icontainerlistener = this.listeners.get(i);

             if (this.redstoneCharge != this.tile.getField(0))
             {
                 icontainerlistener.sendProgressBarUpdate(this, 0, this.tile.getField(0));
             }

             if (this.maxRedstoneCharge != this.tile.getField(1))
             {
                 icontainerlistener.sendProgressBarUpdate(this, 1, this.tile.getField(1));
             }

             if (this.generateTime != this.tile.getField(2))
             {
                 icontainerlistener.sendProgressBarUpdate(this, 2, this.tile.getField(2));
             }

         }
    	 
    	
    }
    
	@Override 
	@SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.tile.setField(id, data);
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
