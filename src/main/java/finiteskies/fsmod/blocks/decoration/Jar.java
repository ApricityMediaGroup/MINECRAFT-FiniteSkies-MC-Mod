package finiteskies.fsmod.blocks.decoration;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.tileentity.JarTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Jar extends Block implements ITileEntityProvider {
	
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 5, 0, 0.0625 * 5, 0.0625 * 11, 0.0625 * 9, 0.0625 * 11);

	public Jar() {
		super(Material.GLASS);
		setUnlocalizedName(Reference.FiniteBlocks.JAR.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.JAR.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FURNITURE);
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
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		
		//ItemStack itemInHand = playerIn.getHeldItem(hand).stack;
		if(!worldIn.isRemote){
		if(tileEntity instanceof JarTileEntity){
			JarTileEntity jar = (JarTileEntity) tileEntity;
			if(playerIn.getHeldItemMainhand().getItem() != null){ //may need to be setEmpty
			if(playerIn.getHeldItemMainhand().getItem() == ModItems.strawberry){
				if(jar.addItem()){
					
					ItemStack itemsInHand = new ItemStack(playerIn.getHeldItemMainhand().getItem());
					int itemsInHandSize = itemsInHand.getCount();
					itemsInHand.setCount(itemsInHandSize--);
					//itemsInHandSize--;
					//setCount if thisdoesnt work
					return true;

					}
				}
			}
			jar.removeItem();
		}	
	}
	return true;
}
	
	// TODO Figure out Collision Boxes. Add a Collision box along side a Bounding Box. 
	
	//@Override
	//public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List collidingBoxes){
	//	super.addCollisionBoxToList(pos, entityBox, collidingBoxes);
	//}
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new JarTileEntity();
	}}
