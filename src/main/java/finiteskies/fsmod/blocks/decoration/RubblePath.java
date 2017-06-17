package finiteskies.fsmod.blocks.decoration;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RubblePath extends Block {

	private static final AxisAlignedBB BOUNDING_BOX =  new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.05D, 1.0D);
	
	public RubblePath() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.RUBBLEPATH.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.RUBBLEPATH.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}
	//TODO Make the sound of stone when walking on, currently makes the sound of block underneath.
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
}