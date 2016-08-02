package finiteskies.fsmod.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void register() {
		//crafting handler

		
		//cutting bread to slices
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.breadSlice, 3), new Object[]{
				Items.BREAD, ModItems.foodKnife
		});
		//cooking toast
		GameRegistry.addSmelting(ModItems.breadSlice, new ItemStack(ModItems.toast), 0.1f);
		//sandstone brick
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sandstoneBrick,4), new Object[]{
				"AA",
				"AA",
				Character.valueOf('A'), new ItemStack(Blocks.SANDSTONE,0,2),
				});
		//food knife
		GameRegistry.addRecipe(new ItemStack(ModItems.foodKnife), new Object[]{
				" B",
				"A ",
				Character.valueOf('A'), new ItemStack(Items.STICK),Character.valueOf('B'), new ItemStack(ModItems.carbonSteelIngot),
				});
		//smelt iron to carbon iron
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.carbonSteelIngot), 0.3f);
	}
}
