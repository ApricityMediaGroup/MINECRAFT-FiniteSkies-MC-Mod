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
		GameRegistry.addSmelting(ModItems.carbonSteelMixture, new ItemStack(ModItems.carbonSteelIngot), 0.3f);
		//milk bucket to milk jars
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.jarOfWholeMilk, 3), new Object[]{
				Items.MILK_BUCKET, ModItems.glassJar, ModItems.glassJar, ModItems.glassJar
		});
		//milk bucket to big milk jar
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bigJarOfWholeMilk, 1), new Object[]{
				Items.MILK_BUCKET, ModItems.bigGlassJar
		});
		//glass jar
		GameRegistry.addRecipe(new ItemStack(ModItems.glassJar,3), new Object[]{
				" B ",
				"A A",
				"AAA",
				Character.valueOf('A'), new ItemStack(Blocks.GLASS),Character.valueOf('B'), new ItemStack(Blocks.WOODEN_BUTTON)
				});
		//big glass jar
		GameRegistry.addRecipe(new ItemStack(ModItems.bigGlassJar,1), new Object[]{
				"ABA",
				"A A",
				"AAA",
				Character.valueOf('A'), new ItemStack(Blocks.GLASS),Character.valueOf('B'), new ItemStack(Blocks.WOODEN_BUTTON)
				});
		//heavy cream
		GameRegistry.addSmelting(ModItems.bigJarOfWholeMilk, new ItemStack(ModItems.heavyCream), 0.5f);
		//vinegar
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vinegar, 1), new Object[]{
				Items.APPLE,Items.WHEAT,Items.SUGAR, ModItems.glassJar
		});	
		//bowl
		GameRegistry.addRecipe(new ItemStack(ModItems.bowl,1), new Object[]{
				"A A",
				"ABA",
				Character.valueOf('A'), new ItemStack(Blocks.STONE),Character.valueOf('B'), new ItemStack(Blocks.STONE_PRESSURE_PLATE)
				});
		//sour cream
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sourCream, 1), new Object[]{
				ModItems.vinegar,ModItems.heavyCream,ModItems.bigJarOfWholeMilk,ModItems.bowl
		});	
		//vanilla extract
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.vanillaExtract, 1), new Object[]{
				ModItems.vanillaBeans,ModItems.vanillaBeans,ModItems.vanillaBeans,ModItems.alcohol,ModItems.glassJar
		});	
		//whipped cream
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.whippedCream, 1), new Object[]{
				ModItems.heavyCream,Items.SUGAR,ModItems.vanillaExtract,ModItems.bowl
		});	
		//strawberries and cream
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.strawberriesAndCream, 1), new Object[]{
				ModItems.sourCream,ModItems.strawberry,ModItems.strawberry,ModItems.strawberry,ModItems.whippedCream,Items.SUGAR
		});	
		//carbon steel mixture
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.carbonSteelMixture, 1), new Object[]{
				Items.IRON_INGOT,ModItems.cokingCoal
		});	
		//butter
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.butter, 1), new Object[]{
				ModItems.heavyCream
		});
	}
}
