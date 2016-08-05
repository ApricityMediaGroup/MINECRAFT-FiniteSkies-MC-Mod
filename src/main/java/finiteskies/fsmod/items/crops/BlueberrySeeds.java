package finiteskies.fsmod.items.crops;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class BlueberrySeeds extends Item {
	public BlueberrySeeds() {
		setUnlocalizedName(Reference.FiniteItems.BLUEBERRYSEEDS.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.BLUEBERRYSEEDS.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_PLANTS);
	}
	
	
}
