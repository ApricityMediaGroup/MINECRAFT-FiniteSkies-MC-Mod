package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class WhippedCream extends ItemFood{

	public WhippedCream() {
		super(4, 0.3F, false);
		setUnlocalizedName(Reference.FiniteItems.WHIPPEDCREAM.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.WHIPPEDCREAM.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 64;
    }
}
