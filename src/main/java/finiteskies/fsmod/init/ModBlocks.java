package finiteskies.fsmod.init;

import java.util.Random;

import finiteskies.fsmod.blocks.building.Cottonwood;
import finiteskies.fsmod.blocks.building.ForestBrick;
import finiteskies.fsmod.blocks.building.Rubble;
import finiteskies.fsmod.blocks.building.RubbleMossy;
import finiteskies.fsmod.blocks.building.SandstoneBrick;
import finiteskies.fsmod.blocks.building.SandstoneBrickStairs;
import finiteskies.fsmod.blocks.building.SlateStoneBrick;
import finiteskies.fsmod.blocks.building.StainedOakWoodPlanks;
import finiteskies.fsmod.blocks.building.Tilebrick;
import finiteskies.fsmod.blocks.building.TilebrickCarved;
import finiteskies.fsmod.blocks.building.TilebrickCracked;
import finiteskies.fsmod.blocks.building.TilebrickMossy;
import finiteskies.fsmod.blocks.cave.Stalactite;
import finiteskies.fsmod.blocks.ground.FiniteGrassBlock;
import finiteskies.fsmod.blocks.ground.GroundMarble;
import finiteskies.fsmod.blocks.lights.Firepit;
import finiteskies.fsmod.blocks.lights.Lantern;
import finiteskies.fsmod.blocks.ore.CokingCoalOre;
import finiteskies.fsmod.blocks.ore.DirtFossil;
import finiteskies.fsmod.blocks.ore.SaltOre;
import finiteskies.fsmod.blocks.ore.StoneFossil;
import finiteskies.fsmod.blocks.plants.BlueberryPlant;
import finiteskies.fsmod.blocks.plants.CottonwoodLeaves;
import finiteskies.fsmod.blocks.plants.FlowerPot;
import finiteskies.fsmod.blocks.plants.StrawberryPlant;
import finiteskies.fsmod.blocks.portal.EmpyreanPortal;
import finiteskies.fsmod.blocks.portal.Glowquartz;
import finiteskies.fsmod.blocks.stairs.TilebrickStairs;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks {
	
	public static Block sandstoneBrick;
	public static Block strawberryPlant;
	public static Block lantern;
	public static Block cokingCoalOre;
	public static Block blueberryPlant;
	public static Block flowerPot;
	public static Block dirtFossil;
	public static Block stoneFossil;
	public static Block saltOre;
	public static Block groundMarble; 
	public static Block glowquartz;
	public static Block stalactite;
	public static Block firePit;
	//public static Block sandstoneBrickStairs;
	public static Block cottonwoodLeaves;
	public static Block cottonwood;
	public static Block stainedOakWoodPlanks;
	public static Block slateStoneBrick;
	public static Block forestBrick;
	public static Block rubble;
	public static Block rubbleMossy;
	public static Block tilebrick;
	public static Block tilebrickMossy;
	public static Block tilebrickCracked;
	public static Block tilebrickCarved;
	public static Block tilebrickStairs;

	
	public static void init() {
		sandstoneBrick = new SandstoneBrick();
		strawberryPlant = new StrawberryPlant();
		lantern = new Lantern();
		cokingCoalOre = new CokingCoalOre();
		blueberryPlant = new BlueberryPlant();
		flowerPot = new FlowerPot();
		dirtFossil = new DirtFossil();
		stoneFossil = new StoneFossil();
		saltOre = new SaltOre();
		groundMarble = new GroundMarble();
		//empyreanPortal = new EmpyreanPortal();
		glowquartz = new Glowquartz();
		stalactite = new Stalactite();
		firePit = new Firepit();
		//sandstoneBrickStairs = new SandstoneBrickStairs(null); //IDK about this. finish stairs.
		cottonwoodLeaves = new CottonwoodLeaves();
		cottonwood = new Cottonwood();
		stainedOakWoodPlanks = new StainedOakWoodPlanks();
		slateStoneBrick = new SlateStoneBrick();
		forestBrick = new ForestBrick();
		rubble = new Rubble();
		rubbleMossy = new RubbleMossy();
		tilebrick = new Tilebrick();
		tilebrickMossy = new TilebrickMossy();
		tilebrickCracked = new TilebrickCracked();
		tilebrickCarved = new TilebrickCarved();
		tilebrickStairs = new TilebrickStairs();

	}
	
	public static void register() {
		registerBlock(sandstoneBrick);
		registerBlock(strawberryPlant);
		registerBlock(lantern);
		registerBlock(cokingCoalOre);
        registerBlock(blueberryPlant);
        registerBlock(flowerPot);
        registerBlock(dirtFossil);
        registerBlock(stoneFossil);
        registerBlock(saltOre);
        registerBlock(groundMarble);
        //registerBlock(empyreanPortal);
        registerBlock(glowquartz);
        registerBlock(stalactite);
        registerBlock(firePit);
        //registerBlock(sandstoneBrickStairs);
        registerBlock(cottonwoodLeaves);
        registerBlock(cottonwood);
        registerBlock(stainedOakWoodPlanks);
        registerBlock(slateStoneBrick);
        registerBlock(forestBrick);
        registerBlock(rubble);
        registerBlock(rubbleMossy);
        registerBlock(tilebrick);
        registerBlock(tilebrickMossy);
        registerBlock(tilebrickCracked);
        registerBlock(tilebrickCarved);
        registerBlock(tilebrickStairs);

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
		registerRender(flowerPot);
		registerRender(dirtFossil);
		registerRender(stoneFossil);
		registerRender(saltOre);
		registerRender(groundMarble);
        //registerRender(empyreanPortal);
        registerRender(glowquartz);
		registerRender(stalactite);
		registerRender(firePit);
		//registerRender(sandstoneBrickStairs);
		registerRender(cottonwoodLeaves);
		registerRender(cottonwood);
		registerRender(stainedOakWoodPlanks);
		registerRender(slateStoneBrick);
		registerRender(forestBrick);
		registerRender(rubble);
		registerRender(rubbleMossy);
		registerRender(tilebrick);
		registerRender(tilebrickMossy);
		registerRender(tilebrickCracked);
		registerRender(tilebrickCarved);
		registerRender(tilebrickStairs);

	}

	private static void registerRender(Block block) {
		System.out.println(block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
