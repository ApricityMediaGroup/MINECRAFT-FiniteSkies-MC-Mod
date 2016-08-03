package finiteskies.fsmod.blocks;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SandstoneBrick extends Block {

	public SandstoneBrick() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.SANDSTONEBRICK.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.SANDSTONEBRICK.getRegistryName());
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

}