package finiteskies.fsmod.blocks.lights;

import java.util.Random;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Firepit extends Block {
	//set extends block to BlockContainer
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 0, 0, 0.0625 * 0, 0.0625 * 16, 0.0625 * 3, 0.0625 * 16);

	public Firepit() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.FIREPIT.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.FIREPIT.getRegistryName());
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_FURNITURE);
		setLightLevel(0.9f);
		setLightOpacity(12);
		setHardness(1.0f);
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
		return BlockRenderLayer.CUTOUT;
	}
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
	
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
    	
    	float minX = 0.1f;
    	float maxX = 0.5f;

    	Random daddy = new Random();

    	float finalX = rand.nextFloat() * (maxX - minX) + minX;
    	
        double d0 = (double)pos.getX() + 0.0D + finalX;
        double d1 = (double)pos.getY() + 0.0D + finalX;
        double d2 = (double)pos.getZ() + 0.0D + finalX;
        double d3 = 0.22D;
        double d4 = 0.27D;

            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D, new int[0]);
            
            
            if (rand.nextInt(24) == 0)
            {
                worldIn.playSound((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), ModSoundEvents.firepit, SoundCategory.AMBIENT, 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F, false);
            }
            
            
    }

    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
    {
        this.checkForDrop(worldIn, pos, state);
    }

    private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!this.canBlockStay(worldIn, pos))
        {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockToAir(pos);
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean canBlockStay(World worldIn, BlockPos pos)
    {
        return !worldIn.isAirBlock(pos.down());
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return side == EnumFacing.UP ? true : (blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side));
    }
    
    
    
}
