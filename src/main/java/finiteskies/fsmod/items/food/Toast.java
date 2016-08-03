package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Toast extends ItemFood{

	public Toast() {
		super(2, 0.6F, false);
		setUnlocalizedName(Reference.FiniteItems.TOAST.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.TOAST.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 25;
    }
}
