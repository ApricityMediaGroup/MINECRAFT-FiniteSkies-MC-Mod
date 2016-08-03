package finiteskies.fsmod.init;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.blocks.plants.StrawberryPlant;
import finiteskies.fsmod.items.crops.StrawberrySeeds;
import finiteskies.fsmod.items.food.Alcohol;
import finiteskies.fsmod.items.food.BigJarOfWholeMilk;
import finiteskies.fsmod.items.food.Blueberry;
import finiteskies.fsmod.items.food.BreadSlice;
import finiteskies.fsmod.items.food.HeavyCream;
import finiteskies.fsmod.items.food.JarOfWholeMilk;
import finiteskies.fsmod.items.food.SourCream;
import finiteskies.fsmod.items.food.StrawberriesAndCream;
import finiteskies.fsmod.items.food.Strawberry;
import finiteskies.fsmod.items.food.Toast;
import finiteskies.fsmod.items.food.VanillaBeans;
import finiteskies.fsmod.items.food.VanillaExtract;
import finiteskies.fsmod.items.food.Vinegar;
import finiteskies.fsmod.items.food.WhippedCream;
import finiteskies.fsmod.items.misc.BigGlassJar;
import finiteskies.fsmod.items.misc.Bowl;
import finiteskies.fsmod.items.misc.GlassJar;
import finiteskies.fsmod.items.misc.MilkPot;
import finiteskies.fsmod.items.ore.CarbonSteelIngot;
import finiteskies.fsmod.items.ore.CarbonSteelMixture;
import finiteskies.fsmod.items.ore.CokingCoal;
import finiteskies.fsmod.items.tools.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//ONE --------------------------------------------------
	
	//foods
	public static Item strawberry;
	public static Item blueberry;
	public static Item breadSlice;
	public static Item toast;
	public static Item jarOfWholeMilk;
	public static Item bigJarOfWholeMilk;
	public static Item heavyCream;
	public static Item vinegar;
	public static Item sourCream;
	public static Item alcohol;
	public static Item vanillaBeans;
	public static Item vanillaExtract;
	public static Item whippedCream;
	public static Item strawberriesAndCream;
	//plants
	public static Item strawberrySeeds;
	//crops
	public static Item strawberryCrop;
	//misc
	public static Item milkPot;
	public static Item glassJar;
	public static Item bigGlassJar;
	public static Item bowl;
    //tools
	public static Item foodKnife;
	//ore & ingots
	public static Item carbonSteelIngot;
	public static Item cokingCoal;
	public static Item carbonSteelMixture;
	//TWO ---------------------------------------------------
	public static void init() {
		strawberry = new Strawberry();
		blueberry = new Blueberry();
		milkPot = new MilkPot();
		breadSlice = new BreadSlice();
		toast = new Toast();
		foodKnife = new FoodKnife();
		carbonSteelIngot = new CarbonSteelIngot();
		glassJar = new GlassJar();
		jarOfWholeMilk = new JarOfWholeMilk();
		bigGlassJar = new BigGlassJar();
		bigJarOfWholeMilk = new BigJarOfWholeMilk();
		heavyCream = new HeavyCream();
		vinegar = new Vinegar();
		sourCream = new SourCream();
		bowl = new Bowl();
		alcohol = new Alcohol();
		vanillaBeans = new VanillaBeans();
		vanillaExtract = new VanillaExtract();
		whippedCream = new WhippedCream();
		strawberriesAndCream = new StrawberriesAndCream();
		cokingCoal = new CokingCoal();
		carbonSteelMixture = new CarbonSteelMixture();
		//Initiate Crop seeds here
		strawberrySeeds = new ItemSeeds(ModBlocks.strawberryCrop, Blocks.FARMLAND);
	}
	//THREE -----------------------------------------------------
	public static void register() {
		GameRegistry.register(strawberry);
		GameRegistry.register(blueberry);
		GameRegistry.register(milkPot);
		GameRegistry.register(breadSlice);
		GameRegistry.register(toast);
		GameRegistry.register(foodKnife);
		GameRegistry.register(carbonSteelIngot);
		GameRegistry.register(glassJar);
		GameRegistry.register(jarOfWholeMilk);
		GameRegistry.register(bigGlassJar);
		GameRegistry.register(bigJarOfWholeMilk);
		GameRegistry.register(heavyCream);
		GameRegistry.register(vinegar);
		GameRegistry.register(sourCream);
		GameRegistry.register(bowl);
		GameRegistry.register(alcohol);
		GameRegistry.register(vanillaBeans);
		GameRegistry.register(vanillaExtract);
		GameRegistry.register(whippedCream);
		GameRegistry.register(strawberriesAndCream);
		GameRegistry.register(cokingCoal);
		GameRegistry.register(carbonSteelMixture);
		GameRegistry.register(strawberrySeeds);
	}
	//FOUR --------------------------------------------------------
	public static void registerRenders() {
		registerRender(strawberry);
		registerRender(blueberry);
		registerRender(milkPot);
		registerRender(breadSlice);
		registerRender(toast);
		registerRender(foodKnife);
		registerRender(carbonSteelIngot);
		registerRender(glassJar);
		registerRender(jarOfWholeMilk);
		registerRender(bigGlassJar);
		registerRender(bigJarOfWholeMilk);
		registerRender(heavyCream);
		registerRender(vinegar);
		registerRender(sourCream);
		registerRender(bowl);
		registerRender(alcohol);
		registerRender(vanillaBeans);
		registerRender(vanillaExtract);
		registerRender(whippedCream);
		registerRender(strawberriesAndCream);
		registerRender(cokingCoal);
		registerRender(carbonSteelMixture);
		registerRender(strawberrySeeds);
	}
	//DONE --- STOP
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
