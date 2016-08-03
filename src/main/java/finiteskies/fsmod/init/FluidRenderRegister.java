package finiteskies.fsmod.init;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.BlockFluidClassic;

public class FluidRenderRegister {

	public static void init() {
		registerFluid(ModFluids.blockFluidMilk, "fluid_milk");
	}
	
	private static void registerFluid(BlockFluidClassic block, String name) {
		Item item = Item.getItemFromBlock(block);
		ModelBakery.registerItemVariants(item);
		final ModelResourceLocation loc = new ModelResourceLocation(Reference.MOD_ID + ":fluids", name);
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition()
		{
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return loc;
			}
		});
		
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {		
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return loc;
			}
		});
	}

}
