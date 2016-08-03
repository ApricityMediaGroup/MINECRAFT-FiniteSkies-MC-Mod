package finiteskies.fsmod;

public class Reference {
	public static final String MOD_ID = "fsm";
	public static final String NAME = "FiniteSkies Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "finiteskies.fsmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "finiteskies.fsmod.proxy.ServerProxy";
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
		STRAWBERRIESANDCREAM("strawberriesAndCream","strawberries_and_cream");
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
		BLOCKFLUIDMILK("blockFluidMilk", "block_fluid_milk"),
		STRAWBERRYPLANT("strawberryPlant","strawberry_plant"),
		LANTERN("lantern","lantern");
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
}

