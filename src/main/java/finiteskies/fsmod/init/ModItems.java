package finiteskies.fsmod.init;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.blocks.plants.StrawberryPlant;
import finiteskies.fsmod.items.food.Blueberry;
import finiteskies.fsmod.items.food.BreadSlice;
import finiteskies.fsmod.items.food.Strawberry;
import finiteskies.fsmod.items.food.Toast;
import finiteskies.fsmod.items.misc.MilkPot;
import finiteskies.fsmod.items.ore.CarbonSteelIngot;
import finiteskies.fsmod.items.tools.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//foods
	public static Item strawberry;
	public static Item blueberry;
	public static Item breadSlice;
	public static Item toast;
	//plants
	public static Block strawberryPlant;
	//misc
	public static Item milkPot;
    //tools
	public static Item foodKnife;
	//ore & ingots
	public static Item carbonSteelIngot;
	
	public static void init() {
		strawberry = new Strawberry();
		blueberry = new Blueberry();
		milkPot = new MilkPot();
		breadSlice = new BreadSlice();
		toast = new Toast();
		foodKnife = new FoodKnife();
		carbonSteelIngot = new CarbonSteelIngot();
	}
	
	public static void register() {
		GameRegistry.register(strawberry);
		GameRegistry.register(blueberry);
		GameRegistry.register(milkPot);
		GameRegistry.register(breadSlice);
		GameRegistry.register(toast);
		GameRegistry.register(foodKnife);
		GameRegistry.register(carbonSteelIngot);
	}
	
	public static void registerRenders() {
		registerRender(strawberry);
		registerRender(blueberry);
		registerRender(milkPot);
		registerRender(breadSlice);
		registerRender(toast);
		registerRender(foodKnife);
		registerRender(carbonSteelIngot);
	}

	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
