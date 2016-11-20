package finiteskies.fsmod.blocks.building;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StainedOakWoodPlanks extends Block {

	public StainedOakWoodPlanks() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.STAINEDOAKWOODPLANKS.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.STAINEDOAKWOODPLANKS.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.WOOD);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

}