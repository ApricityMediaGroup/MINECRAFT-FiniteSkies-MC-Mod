package finiteskies.fsmod.blocks.portal;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModBlocks;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Glowquartz extends BlockGlowstone {

	public Glowquartz() {
		super(Material.GLASS);
		setUnlocalizedName(Reference.FiniteBlocks.GLOWQUARTZ.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.GLOWQUARTZ.getRegistryName());
		setHardness(1.5F);
		setResistance(10.0F);
		setLightLevel(0.9f);
		setLightOpacity(12);
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}
    @SuppressWarnings("deprecation")
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
    	//((EmpyreanPortal) ModBlocks.empyreanPortal).trySpawnPortal(worldIn, pos);
    }
}

