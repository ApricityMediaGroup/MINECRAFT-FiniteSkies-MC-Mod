package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Strawberry extends ItemFood {
	public Strawberry() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.STRAWBERRY.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRY.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
	
}
