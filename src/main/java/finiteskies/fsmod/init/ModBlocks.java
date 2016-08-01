package finiteskies.fsmod.init;


import finiteskies.fsmod.block.SandstoneBrick;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static void init() {
		sandstonebrick = new SandstoneBrick();	
		
	}
	
	public static void register(){
		GameRegistry.register(sandstone_brick);
	}
	
	public static void registerRender() {
		registerRender(sandstone_brick);
	}

	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}


