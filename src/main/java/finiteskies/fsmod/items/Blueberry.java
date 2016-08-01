package finiteskies.fsmod.items;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;

public class Blueberry extends Item {
	public Blueberry() {
		setUnlocalizedName(Reference.FiniteItems.BLUEBERRY.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.BLUEBERRY.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB);
	}
}
