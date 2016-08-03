package finiteskies.fsmod.blocks.lights;

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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Lantern extends Block {
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12, 0.0625 * 9, 0.0625 * 12);

	public Lantern() {
		super(Material.GLASS);
		setUnlocalizedName(Reference.FiniteBlocks.LANTERN.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.LANTERN.getRegistryName());
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_FURNITURE);
		this.setLightLevel(0.9f);
		this.setLightOpacity(12);
	}
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
		return BlockRenderLayer.TRANSLUCENT;
	}
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
}
