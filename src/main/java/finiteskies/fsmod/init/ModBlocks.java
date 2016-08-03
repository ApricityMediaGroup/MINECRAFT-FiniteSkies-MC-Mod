package finiteskies.fsmod.init;

import finiteskies.fsmod.blocks.SandstoneBrick;
import finiteskies.fsmod.fluids.BlockFluidMilk;
import finiteskies.fsmod.blocks.plants.StrawberryPlant;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block sandstoneBrick;
	public static Block strawberryPlant;
	
	public static void init() {
		sandstoneBrick = new SandstoneBrick();
		strawberryPlant = new StrawberryPlant();
	}
	
	public static void register() {
		registerBlock(sandstoneBrick);
		registerBlock(strawberryPlant);

	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		}
	
	public static void registerRenders() {
		registerRender(sandstoneBrick);
		registerRender(strawberryPlant);
	}

	private static void registerRender(Block block) {
		System.out.println(block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
