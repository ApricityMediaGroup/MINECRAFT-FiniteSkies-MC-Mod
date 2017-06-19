package finiteskies.fsmod.gui;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.*;

public class TileSlotItemHandler extends SlotItemHandler {
    
    
    public TileSlotItemHandler(IItemHandler inventory, int number, int x, int y) {
        super(inventory, number, x, y);
    }
    
    public boolean isItemValid(ItemStack stack) {
        return inventory.isItemValidForSlot(this.slotNumber, stack);
    }
    
}