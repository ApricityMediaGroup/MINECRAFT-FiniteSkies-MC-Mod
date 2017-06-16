package finiteskies.fsmod;



import finiteskies.fsmod.entity.EntitySquirrel;
import finiteskies.fsmod.entity.ModEntities;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModFuelHandler;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.init.ModSoundEvents;
import finiteskies.fsmod.proxy.CommonProxy;
import finiteskies.fsmod.worldgen.OreGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Built on Forge 12.18.1.2044 | Minecraft 1.10.2 | Made with Love <3 - Finite Team
//Updating to Forge 13.19.0.2157 | 1.11 | Simmering with Love <3 

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class FSMod {
	
	@Instance(Reference.MOD_ID)
	public static FSMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB_FOOD = new CreativeTabs("tabFSModFood") {
		   @SideOnly(Side.CLIENT)
	        public ItemStack getTabIconItem(){
	            return new ItemStack(ModItems.strawberry);
	        }
		};
	public static final CreativeTabs CREATIVE_TAB_MISC = new CreativeTabs("tabFSModMisc") {
		   @SideOnly(Side.CLIENT)
	        public ItemStack getTabIconItem(){
	            return new ItemStack(ModItems.milkPot);
	        }
		};
	public static final CreativeTabs CREATIVE_TAB_PLANTS = new CreativeTabs("tabFSModPlants") {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem(){
            return new ItemStack(Item.getItemFromBlock(ModBlocks.strawberryPlant));
        }
	};
	public static final CreativeTabs CREATIVE_TAB_TOOLS = new CreativeTabs("tabFSModTools") {
		   @SideOnly(Side.CLIENT)
	        public ItemStack getTabIconItem(){
	            return new ItemStack(ModItems.foodKnife);
	        }
		};
	public static final CreativeTabs CREATIVE_TAB_BLOCKS = new CreativeTabs("tabFSModBlocks") {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem(){
            return new ItemStack(Item.getItemFromBlock(ModBlocks.sandstoneBrick));
        }
		};
	public static final CreativeTabs CREATIVE_TAB_ORE = new CreativeTabs("tabFSModOre") {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem(){
            return new ItemStack(Item.getItemFromBlock(ModBlocks.dirtFossil));
        }
		};
	public static final CreativeTabs CREATIVE_TAB_FURNITURE = new CreativeTabs("tabFSModFurniture") {
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem(){
            return new ItemStack(Item.getItemFromBlock(ModBlocks.lantern));
        }
		};
		
	//PlayerLightSource playerLightSource = new PlayerLightSource();
	//DynamicLights dynamicLights = new DynamicLights();
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
		ModSoundEvents.registerSounds();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		//playerLightSource.preInit(event);
		//dynamicLights.preInit(event);
		proxy.preInit();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");	
		//ModCrafting.register();
		ModEntities.registerEntity();
		//EmpyreanDimension.mainRegistry();
		//ModBiomes.init();
		proxy.registerRenders();	
		proxy.registerRenderers();
		GameRegistry.registerFuelHandler(new ModFuelHandler());

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");
		EntityRegistry.addSpawn(EntitySquirrel.class, 10, 3, 10, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.FOREST_HILLS, 
		Biomes.ROOFED_FOREST, Biomes.TAIGA, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS);
	}
	
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    	//playerLightSource.load(event);
    	//dynamicLights.load(event);
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent event)
    {
    	//playerLightSource.modsLoaded(event);
    }
    
    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent tick)
    {
    	//playerLightSource.onTick(tick);
    	//dynamicLights.onTick(tick);
    }
}
