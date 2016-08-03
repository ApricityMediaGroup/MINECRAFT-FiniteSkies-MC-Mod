package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class BreadSlice extends ItemFood{

	public BreadSlice() {
		super(1, 0.2F, false);
		setUnlocalizedName(Reference.FiniteItems.BREADSLICE.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.BREADSLICE.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 25;
    }
}
