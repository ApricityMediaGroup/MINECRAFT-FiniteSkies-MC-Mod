package finiteskies.fsmod.blocks.crops;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StrawberryCrop extends BlockCrops {

	public StrawberryCrop() {
		setUnlocalizedName(Reference.FiniteBlocks.STRAWBERRYCROP.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.STRAWBERRYCROP.getRegistryName());
		setSoundType(SoundType.PLANT);
	}

	protected Item getSeed(){
		return super.getSeed();
	}
	
	@Override
	protected Item getCrop() {
		return super.getCrop();
	}
	
}
