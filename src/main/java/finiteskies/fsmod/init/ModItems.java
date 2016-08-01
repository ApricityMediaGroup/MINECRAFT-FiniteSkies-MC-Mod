package finiteskies.fsmod.init;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.items.ItemStrawberry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//foods
	public static Item strawberry;
	
	public static void init() {
		strawberry = new ItemStrawberry();
		
	}
	
	public static void register(){
		GameRegistry.register(strawberry);
	}
	
	public static void registerRender() {
		registerRender(strawberry);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
