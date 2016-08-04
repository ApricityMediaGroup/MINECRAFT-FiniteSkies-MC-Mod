package finiteskies.fsmod.items.crops;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class StrawberrySeeds extends Item {
	public StrawberrySeeds() {
		setUnlocalizedName(Reference.FiniteItems.STRAWBERRYSEEDS.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRYSEEDS.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_PLANTS);
	}
	
	
}
