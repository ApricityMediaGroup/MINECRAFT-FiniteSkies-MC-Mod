package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class SourCream extends ItemFood{

	public SourCream() {
		super(3, 0.3F, false);
		setUnlocalizedName(Reference.FiniteItems.SOURCREAM.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.SOURCREAM.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 64;
    }
}
