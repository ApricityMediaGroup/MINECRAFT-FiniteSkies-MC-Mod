package finiteskies.fsmod.init;

import finiteskies.fsmod.fluids.FluidMilk;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.fluids.BlockFluidMilk;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModFluids {
	public static BlockFluidMilk blockFluidMilk;
	public static FluidMilk fluidMilk;
	
	public static void init() {
		fluidMilk = new FluidMilk("fluid_milk", "fsm:blocks/fluid_milk_still", "fsm:blocks/fluid_milk_flow");
		FluidRegistry.registerFluid(fluidMilk);
		blockFluidMilk = new BlockFluidMilk(fluidMilk);
	}
	
	public static void register() {
		registerBlock(blockFluidMilk);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		}
	
	public static void registerRenders() {
		registerRender(blockFluidMilk);
	}

	private static void registerRender(Block block) {
		System.out.println(block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
