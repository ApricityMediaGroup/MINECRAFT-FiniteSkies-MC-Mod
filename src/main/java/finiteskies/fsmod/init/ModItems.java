package finiteskies.fsmod.init;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.items.plants.StrawberryPlant;
import finiteskies.fsmod.items.food.Blueberry;
import finiteskies.fsmod.items.food.BreadSlice;
import finiteskies.fsmod.items.food.Strawberry;
import finiteskies.fsmod.items.food.Toast;
import finiteskies.fsmod.items.misc.MilkPot;
import finiteskies.fsmod.items.tools.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//foods
	public static Item strawberry;
	public static Item blueberry;
	public static Item breadSlice;
	public static Item toast;
	//plants
	public static Item strawberryPlant;
	//misc
	public static Item milkPot;
    //tools
	public static Item foodKnife;
	
	public static void init() {
		strawberry = new Strawberry();
		blueberry = new Blueberry();
		strawberryPlant = new StrawberryPlant();		
		milkPot = new MilkPot();
		breadSlice = new BreadSlice();
		toast = new Toast();
		foodKnife = new FoodKnife();
		
	}
	
	public static void register() {
		GameRegistry.register(strawberry);
		GameRegistry.register(blueberry);
		GameRegistry.register(strawberryPlant);
		GameRegistry.register(milkPot);
		GameRegistry.register(breadSlice);
		GameRegistry.register(toast);
		GameRegistry.register(foodKnife);
	}
	
	public static void registerRenders() {
		registerRender(strawberry);
		registerRender(blueberry);
		registerRender(strawberryPlant);
		registerRender(milkPot);
		registerRender(breadSlice);
		registerRender(toast);
		registerRender(foodKnife);
	}

	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
