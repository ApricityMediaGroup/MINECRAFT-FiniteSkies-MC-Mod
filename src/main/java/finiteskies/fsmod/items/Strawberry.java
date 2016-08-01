package finiteskies.fsmod.items;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;

import net.minecraft.item.Item;

public class Strawberry extends Item {
	public Strawberry() {
		setUnlocalizedName(Reference.FiniteItems.STRAWBERRY.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRY.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB);
	}
}
