package finiteskies.fsmod.blocks.building;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Conveyor extends BlockHorizontal {
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	IBlockState facing;
	EntityItem entityItem;

	public Conveyor() {
		super(Material.IRON);
		setUnlocalizedName(Reference.FiniteBlocks.CONVEYORBLOCK.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.CONVEYORBLOCK.getRegistryName());
		setHardness(2.5F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}

	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos)
				&& worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
	}

	/**
	 * Returns the blockstate with the given rotation from the passed
	 * blockstate. If inapplicable, returns the passed blockstate.
	 */
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
	}

	/**
	 * Returns the blockstate with the given mirror of the passed blockstate. If
	 * inapplicable, returns the passed blockstate.
	 */
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
	}

	/**
	 * Called by ItemBlocks just before a block is actually set in the world, to
	 * allow for adjustments to the IBlockstate
	 */
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY,
			float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	/**
	 * Convert the given metadata into a BlockState for this Block
	 */
	public IBlockState getStateFromMeta(int meta) {
		facing = this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

	/**
	 * Convert the BlockState into the correct metadata value/
	 */
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {

		if (worldIn.getBlockState(pos).toString().contains("east")) {
			entityIn.motionX = -0.6;
			//entityItem.motionX = -0.3;
		}
		if (worldIn.getBlockState(pos).toString().contains("west")) {
			entityIn.motionX = 0.6;
			//entityItem.motionX = 0.3;
		}
		if (worldIn.getBlockState(pos).toString().contains("north")) {
			entityIn.motionZ = 0.6;
			//entityItem.motionZ = 0.3;
		}
		if (worldIn.getBlockState(pos).toString().contains("south")) {
			entityIn.motionZ = -0.6;
			//entityItem.motionZ = -0.3;
		}

		super.onEntityWalk(worldIn, pos, entityIn);
	}
}
