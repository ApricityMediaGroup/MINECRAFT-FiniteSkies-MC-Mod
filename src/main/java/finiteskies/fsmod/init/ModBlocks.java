package finiteskies.fsmod.init;

import finiteskies.fsmod.blocks.building.SandstoneBrick;
import finiteskies.fsmod.blocks.crops.StrawberryCrop;
import finiteskies.fsmod.blocks.lights.Lantern;
import finiteskies.fsmod.blocks.plants.BlueberryPlant;
import finiteskies.fsmod.blocks.plants.FlowerPot;
import finiteskies.fsmod.blocks.plants.StrawberryPlant;
import finiteskies.fsmod.blocks.ore.CokingCoalOre;
import finiteskies.fsmod.blocks.ore.DirtFossil;
import finiteskies.fsmod.blocks.ore.StoneFossil;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks {
	
	public static Block sandstoneBrick;
	public static Block strawberryPlant;
	public static Block lantern;
	public static Block cokingCoalOre;
	public static Block blueberryPlant;
	public static Block strawberryCrop;
	public static Block flowerPot;
	public static Block dirtFossil;
	public static Block stoneFossil;
	
	public static void init() {
		sandstoneBrick = new SandstoneBrick();
		strawberryPlant = new StrawberryPlant();
		lantern = new Lantern();
		cokingCoalOre = new CokingCoalOre();
		blueberryPlant = new BlueberryPlant();
		strawberryCrop = new StrawberryCrop();
		flowerPot = new FlowerPot();
		dirtFossil = new DirtFossil();
		stoneFossil = new StoneFossil();
	}
	
	public static void register() {
		registerBlock(sandstoneBrick);
		registerBlock(strawberryPlant);
		registerBlock(lantern);
		registerBlock(cokingCoalOre);
        registerBlock(blueberryPlant);
        registerBlock(strawberryCrop);
        registerBlock(flowerPot);
        registerBlock(dirtFossil);
        registerBlock(stoneFossil);
	}

	static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		}
	
	public static void registerRenders() {
		registerRender(sandstoneBrick);
		registerRender(strawberryPlant);
		registerRender(lantern);
		registerRender(cokingCoalOre);
		registerRender(blueberryPlant);
		registerRender(strawberryCrop);
		registerRender(flowerPot);
		registerRender(dirtFossil);
		registerRender(stoneFossil);
	}

	private static void registerRender(Block block) {
		System.out.println(block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
