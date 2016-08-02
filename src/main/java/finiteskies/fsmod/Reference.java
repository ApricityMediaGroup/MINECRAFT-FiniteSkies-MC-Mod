package finiteskies.fsmod;

public class Reference {
	public static final String MOD_ID = "fsm";
	public static final String NAME = "FiniteSkies Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "finiteskies.fsmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "finiteskies.fsmod.proxy.ServerProxy";
	
	public static enum FiniteItems {


		STRAWBERRY("strawberry", "strawberry"),
		BLUEBERRY("blueberry", "blueberry"),
		STRAWBERRYPLANT("strawberryPlant","strawberry_plant"),
		MILKPOT("milkPot","milk_pot"),
		SANDSTONE_BRICK("sandstoneBrick","sandstone_brick");

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
}