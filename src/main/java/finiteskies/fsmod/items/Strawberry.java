package finiteskies.fsmod.items;

import finiteskies.fsmod.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Strawberry extends ItemFood {
	public Strawberry() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.STRAWBERRY.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRY.getRegistryName());
	}
}
