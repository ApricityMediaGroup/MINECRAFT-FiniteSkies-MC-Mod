package finiteskies.fsmod.blocks.building;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SlateStoneBrick extends Block {

	public SlateStoneBrick() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.SLATESTONEBRICK.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.SLATESTONEBRICK.getRegistryName());
		setHardness(2.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

}