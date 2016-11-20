package finiteskies.fsmod.blocks.building;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Cottonwood extends BlockLog {

	public Cottonwood() {
		setUnlocalizedName(Reference.FiniteBlocks.COTTONWOOD.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.COTTONWOOD.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

}