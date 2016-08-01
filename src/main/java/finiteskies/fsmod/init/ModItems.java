package finiteskies.fsmod.init;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.items.food.Blueberry;
import finiteskies.fsmod.items.food.Strawberry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//foods
	public static Item strawberry;
	public static Item blueberry;
	
	public static void init() {
		strawberry = new Strawberry();
		blueberry = new Blueberry();
		
	}
	
	public static void register(){
		GameRegistry.register(strawberry);
		GameRegistry.register(blueberry);
	}
	
	public static void registerRender() {
		registerRender(strawberry);
		registerRender(blueberry);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
