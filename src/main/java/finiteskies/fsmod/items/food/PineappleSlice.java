package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class PineappleSlice extends ItemFood {

	public PineappleSlice() {
		super(1, 0.5F, false);
		setUnlocalizedName(Reference.FiniteItems.PINEAPPLESLICE.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.PINEAPPLESLICE.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
	 
	public int getMaxItemUseDuration(ItemStack stack)
	    {
	        return 32;
	    }
	
}
