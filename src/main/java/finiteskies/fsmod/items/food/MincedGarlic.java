package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class MincedGarlic extends ItemFood {
	public MincedGarlic() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.MINCEDGARLIC.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.MINCEDGARLIC.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 15;
    }
}
