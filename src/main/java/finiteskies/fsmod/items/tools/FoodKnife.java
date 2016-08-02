package finiteskies.fsmod.items.tools;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FoodKnife extends Item{
	public FoodKnife() {
		setUnlocalizedName(Reference.FiniteItems.FOODKNIFE.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.FOODKNIFE.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_TOOLS);
	}

}
