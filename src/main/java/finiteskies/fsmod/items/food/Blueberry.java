package finiteskies.fsmod.items.food;

import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Blueberry extends ItemFood {
	public Blueberry() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.BLUEBERRY.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.BLUEBERRY.getRegistryName());
	}
}
