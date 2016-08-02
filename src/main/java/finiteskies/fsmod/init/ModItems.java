package finiteskies.fsmod.init;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.items.plants.StrawberryPlant;
import finiteskies.fsmod.items.food.Blueberry;
import finiteskies.fsmod.items.food.Strawberry;
import finiteskies.fsmod.items.misc.MilkPot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//foods
	public static Item strawberry;
	public static Item blueberry;
	//plants
	public static Item strawberryPlant;
	//misc
	public static MilkPot milkPot;

	
	public static void init() {
		strawberry = new Strawberry();
		blueberry = new Blueberry();
		strawberryPlant = new StrawberryPlant();		
		milkPot = new MilkPot();
		
	}
	
	public static void register() {
		GameRegistry.register(strawberry);
		GameRegistry.register(blueberry);
		GameRegistry.register(strawberryPlant);
		GameRegistry.register(milkPot);
	}
	
	public static void registerRenders() {
		registerRender(strawberry);
		registerRender(blueberry);
		registerRender(strawberryPlant);
		registerRender(milkPot);		
	}

	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
