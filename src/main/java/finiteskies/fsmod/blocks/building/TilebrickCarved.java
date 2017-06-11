package finiteskies.fsmod.blocks.building;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TilebrickCarved extends Block {

	public TilebrickCarved() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.TILEBRICKCARVED.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.TILEBRICKCARVED.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

}