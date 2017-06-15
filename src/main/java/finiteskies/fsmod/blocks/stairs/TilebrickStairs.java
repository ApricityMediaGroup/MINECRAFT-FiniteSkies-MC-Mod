package finiteskies.fsmod.blocks.stairs;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModBlocks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;

public class TilebrickStairs extends BlockStairs {

	public TilebrickStairs() {
		super(ModBlocks.tilebrick.getDefaultState());
		setUnlocalizedName(Reference.FiniteBlocks.TILEBRICKSTAIRS.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.TILEBRICKSTAIRS.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
        this.setLightOpacity(255);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}



}
