package finiteskies.fsmod.init;


import finiteskies.fsmod.block.SandstoneBrick;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block sandstone_brick;
	
	
	public static void init() {
		sandstone_brick = new SandstoneBrick();	
		
	}
	
	public static void register(){
		GameRegistry.registerBlock(sandstone_brick = new SandstoneBrick(), sandstone_brick.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRenders(sandstone_brick);
	}

	private static void registerRenders(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}


