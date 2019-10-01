package finiteskies.fsmod;



import finiteskies.fsmod.entity.EntitySquirrel;
import finiteskies.fsmod.entity.ModEntities;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModFuelHandler;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.init.ModSoundEvents;
import finiteskies.fsmod.preinit.ModTileEntities;
import finiteskies.fsmod.proxy.CommonProxy;
import finiteskies.fsmod.tileentity.JarTileEntity;
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
	
	
	
	public static final CreativeTabs modTab = new CreativeTabs(Reference.MOD_ID) {
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemRegistry.strawberryItem);
		}
	};
	

		
	//PlayerLightSource playerLightSource = new PlayerLightSource();
	//DynamicLights dynamicLights = new DynamicLights();
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");

		//ModSoundEvents.registerSounds();
		//GameRegistry.registerWorldGenerator(new OreGen(), 0);
		//playerLightSource.preInit(event);
		//dynamicLights.preInit(event);
		proxy.preInit();

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");	
		//ModCrafting.register();
		ModEntities.registerEntity();
		ModTileEntities.init();
		//EmpyreanDimension.mainRegistry();
		//ModBiomes.init();
		proxy.registerRenders();	
		proxy.registerRenderers();
		proxy.registerGuis();
		GameRegistry.registerFuelHandler(new ModFuelHandler());
		
		// TODO Add a class file to register tile entitys like Mod Blocks and Mod Items so we dont have to list them all in here...
		GameRegistry.registerTileEntity(JarTileEntity.class, Reference.MOD_ID + "JarTileEntity");

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
