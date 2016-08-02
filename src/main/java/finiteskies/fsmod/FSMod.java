package finiteskies.fsmod;

import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.proxy.CommonProxy;
import javafx.geometry.Side;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class FSMod {

	@Instance
	public static FSMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB_FOOD = new CreativeTabs("tabFSModFood") {
		   @Override
		   public Item getTabIconItem() {
		       return ModItems.strawberry;
		   }
		};
	public static final CreativeTabs CREATIVE_TAB_MISC = new CreativeTabs("tabFSModMisc") {
			   @Override
			   public Item getTabIconItem() {
			       return ModItems.blueberry;
		  }
		};
	public static final CreativeTabs CREATIVE_TAB_PLANTS = new CreativeTabs("tabFSModPlants") {
			   @Override
			   public Item getTabIconItem() {
			       return ModItems.strawberryPlant;
		  }
		};
	public static final CreativeTabs CREATIVE_TAB_BLOCKS = new CreativeTabs("tabFSModBlocks") {
			   @Override
			   public Item getTabIconItem() {
				   return Item.getItemFromBlock(ModBlocks.sandstoneBrick);
		  }
		};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		
		proxy.init();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");

	}

}
