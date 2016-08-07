package finiteskies.fsmod.blocks.ore;

import java.util.Random;
import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class StoneFossil extends Block
{
    public StoneFossil()
    {
        super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.STONEFOSSIL.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.STONEFOSSIL.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_ORE);
    }

    public StoneFossil(MapColor color)
    {
        super(Material.ROCK, color);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == ModBlocks.stoneFossil ? Items.BONE : Item.getItemFromBlock(this);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return this == ModBlocks.stoneFossil ? 1 + random.nextInt(1) : 1;
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
    
}