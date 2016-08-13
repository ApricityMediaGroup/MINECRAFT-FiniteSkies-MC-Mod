package finiteskies.fsmod.blocks.cave;

import java.util.List;
import java.util.Random;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.blocks.properties.BlockHangCave;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Stalactite extends BlockHangCave {

	public Stalactite() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.STALACTITE.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.STALACTITE.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_PLANTS);
	}
	
public Item getItemDropped(IBlockState state, Random rand, int fortune){
        
    	return Items.ACACIA_BOAT ;
    }
    
    //how many dropped
    @Override
    public int quantityDropped(Random random){
        return 1 + random.nextInt(2);
    }
    
    //Can Shear? if so what gives?
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return false; }
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
    {
        List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
        ret.add(new ItemStack(Blocks.STONE, 1));
        return ret;
    }
    
    //Can place block on plant?
    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }

}