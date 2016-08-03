package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class VanillaBeans extends ItemFood{

	public VanillaBeans() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.VANILLABEANS.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.VANILLABEANS.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 64;
    }
}
