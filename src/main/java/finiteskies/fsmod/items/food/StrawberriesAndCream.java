package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class StrawberriesAndCream extends ItemFood{

	public StrawberriesAndCream() {
		super(15, 0.9F, false);
		setUnlocalizedName(Reference.FiniteItems.STRAWBERRIESANDCREAM.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRIESANDCREAM.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
}
