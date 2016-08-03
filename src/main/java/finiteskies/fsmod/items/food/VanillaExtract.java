package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class VanillaExtract extends ItemFood{

	public VanillaExtract() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.VANILLAEXTRACT.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.VANILLAEXTRACT.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
}
