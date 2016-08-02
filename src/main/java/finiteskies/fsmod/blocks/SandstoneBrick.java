package finiteskies.fsmod.blocks;

import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SandstoneBrick extends Block {

	public SandstoneBrick() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.SANDSTONEBRICK.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.SANDSTONEBRICK.getRegistryName());
	}

}