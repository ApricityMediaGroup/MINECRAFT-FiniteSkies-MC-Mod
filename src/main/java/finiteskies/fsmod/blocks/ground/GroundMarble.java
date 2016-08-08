package finiteskies.fsmod.blocks.ground;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GroundMarble extends Block {

	public GroundMarble() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.GROUNDMARBLE.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.GROUNDMARBLE.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

}