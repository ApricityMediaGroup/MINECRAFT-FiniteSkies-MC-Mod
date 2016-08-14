package finiteskies.fsmod;

import finiteskies.fsmod.items.food.Butter;

public class Reference {
	public static final String MOD_ID = "fsm";
	public static final String NAME = "FiniteSkies Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "finiteskies.fsmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "finiteskies.fsmod.proxy.CommonProxy";
	public static final String RESOURCE_PREFIX = Reference.MOD_ID + ":";

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
		SALTLUMP("saltLump","salt_lump");

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
		STRAWBERRYCROP("strawberryCrop","strawberry_crop"),
		FLOWERPOT("flowerPot","flower_pot"),
		DIRTFOSSIL("dirtFossil","dirt_fossil"),
		STONEFOSSIL("stoneFossil","stone_fossil"),
		SALTORE("saltOre","salt_ore"),
		GROUNDMARBLE("groundMarble","ground_marble"),
		EMPYREANPORTAL("empyreanPortal","empyrean_portal"),
		GLOWQUARTZ("glowquartz","glowquartz"),
		STALACTITE("stalactite","stalactite"),
		FIREPIT("firePit","fire_pit");
		//Ends with semicolon continues with commas		

		private String unlocalizedName;
		private String registryName;
		
		FiniteBlocks(String unlocalizedName, String registryName) {
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
	
	public static enum FiniteSounds {



		}
}

