package finiteskies.fsmod;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import finiteskies.fsmod.items.ItemFsmFood;

public final class ItemRegistry{
	
	public static final List<Item> itemlist = new ArrayList<Item>();
    public static final HashMap<String, Item> items = new HashMap<String, Item>();

	public static final HashSet<Item> allFishRaw = new HashSet<Item>();
	public static final HashSet<Item> allFood = new HashSet<Item>();
	public static final HashSet<Item> allJuice = new HashSet<Item>();
	
	
	// Items
	public static Item strawberryItem;
	
	
	
	public static boolean initialized = false;
	
	public static void registerItems() {
		registerFoodItems();
				
		initialized = true;
	}
	
	private static void registerFoodItems() {
		
		strawberryItem = registerItemFood("strawberry", 2, 2);
		
	}
	
	private static Item registerItemFood(String registryName, int amount, float saturation) {
		final Item item = new ItemFsmFood(amount, saturation);
		allFood.add(item);

		return registerItem(item, registryName);
	}
	
	private static Item registerGenericItem(String registryName) {
		final Item item = new Item();

		return registerItem(item, registryName);
	}

	public static Item registerItem(Item item, String registryName) {
        item.setCreativeTab(FSMod.modTab);
        item.setRegistryName(registryName);
        item.setUnlocalizedName(registryName);
        itemlist.add(item);
        return item;
    }
	
	
}	
	/*
	
	public static enum FiniteItems {
	//REGISTER ITEMS HERE
	//Set item names here NAMENAME(<nameName>, <name_name>)
		STRAWBERRY("strawberry", "strawberry"),
		BLUEBERRY("blueberry", "blueberry"),
		STRAWBERRYPLANT("strawberryPlant","strawberry_plant"),
		MILKPOT("milkPot","milk_pot"),
		BREADSLICE("breadSlice","bread_slice"),
		TOAST("toast","toast"),
		FOODKNIFE("foodKnife","food_knife"),
		CARBONSTEELINGOT("carbonSteelIngot","carbon_steel_ingot"),
		GLASSJAR("glassJar","glass_jar"),
		JAROFWHOLEMILK("jarOfWholeMilk","jar_of_whole_milk"),
		BIGGLASSJAR("bigGlassJar","big_glass_jar"),
		BIGJAROFWHOLEMILK("bigJarOfWholeMilk","big_jar_of_whole_milk"),
		HEAVYCREAM("heavyCream","heavy_cream"),
		VINEGAR("vinegar","vinegar"),
		SOURCREAM("sourCream","sour_cream"),
		BOWL("bowl","bowl"),
		ALCOHOL("alcohol","alcohol"),
		VANILLABEANS("vanillaBeans","vanilla_beans"),
		VANILLAEXTRACT("vanillaExtract","vanilla_extract"),
		WHIPPEDCREAM("whippedCream","whipped_cream"),
		STRAWBERRIESANDCREAM("strawberriesAndCream","strawberries_and_cream"),
		COKINGCOAL("cokingCoal","coking_coal"),
		CARBONSTEELMIXTURE("carbonSteelMixture","carbon_steel_mixture"),
		STRAWBERRYSEEDS("strawberrySeeds","strawberry_seeds"),
		BUTTER("butter","butter"),
		COCOABUTTER("cocoaButter","cocoa_butter"),
		BLUEBERRYSEEDS("blueberrySeeds","blueberry_seeds"),
		CHOCOLATE("chocolate","chocolate"),
		PINEAPPLE("pineapple", "pineapple"),
		PINEAPPLESLICE("pineappleSlice", "pineapple_slice"),
		SALTLUMP("saltLump","salt_lump"),
		BACON("bacon", "bacon"),
		RAWBACON("rawBacon", "raw_bacon"),
		CORRUPTSWORD("corruptSword","corrupt_sword"),
		MUSKET("musket","musket"),
		COFFEEBEANS("coffeeBeans","coffee_beans"),
		ANISESEEDS("aniseSeeds","anise_seeds"),
		CHILIPEPPER("chiliPepper","chili_pepper"),
		GARLIC("garlic","garlic"),
		GROUNDPEPPER("groundPepper","ground_pepper"),
		GROUNDSALT("groundSalt","ground_salt"),
		MINCEDGARLIC("mincedGarlic","minced_garlic"),
		PAPRIKA("paprika","paprika"),
		PEPPERCORN("pepperCorn","pepper_corn"),
		PIGINTESTINES("pigIntestines","pig_intestines"),
		BANANA("banana","banana"),
		BANANABUNDLE("bananaBundle","banana_bundle"),
		BANANASLICES("bananaSlices","banana_slices"),
		ACORN("acorn","acorn");	

		//Ends with semicolon continues with commas		

		private String unlocalizedName;
		private String registryName;
	
		FiniteItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
	    public String getRegistryName() {
			return registryName;
		}
	}


	public static enum FiniteBlocks {
	//REGISTER BLOCKS HERE
	//Set block names here NAMENAME(<nameName>, <name_name>)
		SANDSTONEBRICK("sandstoneBrick","sandstone_brick"),	
		FLUIDMILK("fluidMilk", "fluid_milk"),
		STRAWBERRYPLANT("strawberryPlant","strawberry_plant"),
		LANTERN("lantern","lantern"),
		COKINGCOALORE("cokingCoalOre","coking_coal_ore"),
		BLUEBERRYPLANT("blueberryPlant","blueberry_plant"),
		FLOWERPOT("flowerPot","flower_pot"),
		DIRTFOSSIL("dirtFossil","dirt_fossil"),
		STONEFOSSIL("stoneFossil","stone_fossil"),
		SALTORE("saltOre","salt_ore"),
		GROUNDMARBLE("groundMarble","ground_marble"),
		EMPYREANPORTAL("empyreanPortal","empyrean_portal"),
		GLOWQUARTZ("glowquartz","glowquartz"),
		STALACTITE("stalactite","stalactite"),
		FIREPIT("firePit","fire_pit"),
		FINITEGRASSBLOCK("finiteGrassBlock","finite_grass_block"),
		//SANDSTONEBRICKSTAIRS("sandstoneBrickStairs","sandstone_brick_stairs"),
		COTTONWOOD("cottonwood","cottonwood"),
		COTTONWOODLEAVES("cottonwoodLeaves","cottonwood_leaves"),
		STAINEDOAKWOODPLANKS("stainedOakWoodPlanks","stained_oak_wood_planks"),
		SANDSTONEDOORBLOCK("sandstoneDoorBlock","sandstone_door_block"),
		CONVEYORBLOCK("sandstoneDoorBlock","sandstone_door_block"),
		FORESTBRICK("forestBrick","forest_brick"),
		RUBBLE("rubble","rubble"),
		RUBBLEMOSSY("rubbleMossy","rubble_mossy"),
		TILEBRICK("tilebrick","tilebrick"),
		TILEBRICKMOSSY("tilebrickMossy","tilebrick_mossy"),
		TILEBRICKCRACKED("tilebrickCracked","tilebrick_cracked"),
		TILEBRICKCARVED("tilebrickCarved","tilebrick_carved"),
		TILEBRICKSTAIRS("tilebrickStairs","tilebrick_stairs"),
		BEEHIVE("beehive","beehive"),
		RUBBLEPATH("rubblePath","rubble_path"),
		BRICKPATH("brickPath","brick_path"),
		JAR("jar","jar"),
		TOWEROFPIMPS("towerOfPimps","tower_of_pimps"),
		SLATESTONEBRICK("slateStoneBrick", "slate_stone_brick"),
		REDSTONEGENERATOR("redstoneGenerator","redstone_generator");
		//Ends with semicolon continues with commas		
*/


