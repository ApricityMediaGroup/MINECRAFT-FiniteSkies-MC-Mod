package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class GroundPepper extends ItemFood {
	public GroundPepper() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.GROUNDPEPPER.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.GROUNDPEPPER.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 15;
    }
}
