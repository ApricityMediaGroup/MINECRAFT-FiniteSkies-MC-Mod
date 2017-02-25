package finiteskies.fsmod.blocks.plants;

import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CottonwoodLeaves extends BlockLeaves 
{

	public CottonwoodLeaves() 
	{
		super();
		setUnlocalizedName(Reference.FiniteBlocks.COTTONWOODLEAVES.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.COTTONWOODLEAVES.getRegistryName());
		this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
		this.setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}
	
	@Override
    public int quantityDropped(Random random)
    {
        return random.nextInt(40) == 0 ? 1 : 0;
    }
	
   //w @SuppressWarnings("incomplete-switch")
	//@Nullable
  //  @Override
  //  public Item getItemDropped(IBlockState state, Random rand, int fortune)
   // {
    //	Block sapling = ModBlocks.SAPLING_APPLE;
   // 	
   //     switch(type)
   //     {	
   //     	case HAZEL:
   //     		sapling = ModBlocks.SAPLING_HAZEL;
    //    		break;
   //     	case ELDER:
    //    		sapling = ModBlocks.SAPLING_ELDER;
   //     		break;
    //    	case THORN:
     //   		sapling = ModBlocks.SAPLING_THORN;
     //   		break;   	
     //   }
    	
     //   return Item.getItemFromBlock(sapling);
   // }

	@Override
	public boolean shouldSideBeRendered(@Nonnull IBlockState blockState, @Nonnull IBlockAccess blockAccess, @Nonnull BlockPos pos, @Nonnull EnumFacing side) 
	{
		// isOpaqueCube returns !leavesFancy to us. We have to fix the variable before calling super
		this.leavesFancy = !Blocks.LEAVES.isOpaqueCube(blockState);

		return super.shouldSideBeRendered(blockState, blockAccess, pos, side);
	}

	@Nonnull
	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() 
	{
		return Blocks.LEAVES.getBlockLayer();
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return Blocks.LEAVES.isOpaqueCube(state);
	}

	
	protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1);
    }

	
	@Override
	public EnumType getWoodType(int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return java.util.Arrays.asList(new ItemStack(this, 1));
	}
	
	
	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {DECAYABLE, CHECK_DECAY});
    }
	
	
	@Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }
	
	
	@Override
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (!((Boolean)state.getValue(DECAYABLE)).booleanValue())
        {
            i |= 4;
        }

        if (((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
        {
            i |= 8;
        }

        return i;
    }

}