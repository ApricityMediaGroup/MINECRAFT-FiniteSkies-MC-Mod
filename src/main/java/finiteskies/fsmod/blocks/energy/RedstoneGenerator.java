package finiteskies.fsmod.blocks.energy;

import java.lang.reflect.InvocationTargetException;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.gui.ContainerRedstoneGenerator;
import finiteskies.fsmod.gui.GuiHandler;
import finiteskies.fsmod.gui.GuiRedstoneGenerator;
import finiteskies.fsmod.tileentity.TileEntityRedstoneGenerator;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;


public class RedstoneGenerator extends BlockContainer {
    
	private final Class<? extends TileEntity> tileEntityClass;
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final PropertyBool isActive = PropertyBool.create("active");
    public static SimpleNetworkWrapper INSTANCE = new SimpleNetworkWrapper(Reference.MOD_ID);

	public RedstoneGenerator(Class<? extends TileEntity> tileEntityClass) {
		super(Material.IRON);
		this.tileEntityClass = tileEntityClass;
		this.setUnlocalizedName(Reference.FiniteBlocks.REDSTONEGENERATOR.getUnlocalizedName());
		this.setRegistryName(Reference.FiniteBlocks.REDSTONEGENERATOR.getRegistryName());
		this.setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}
	
    public ContainerRedstoneGenerator getServerGuiElement(int id, EntityPlayer player, World world, BlockPos blockPos) {
        return new ContainerRedstoneGenerator(player.inventory, (TileEntityRedstoneGenerator) world.getTileEntity(blockPos));
    }

    
    /*public Gui getClientGuiElement(int id, EntityPlayer player, World world, BlockPos blockPos) {
        return new GuiRedstoneGenerator(player.inventory, (TileEntityRedstoneGenerator) world.getTileEntity(blockPos), null);
    } */
   
    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        worldIn.setBlockState(pos, iblockstate.getBlock().getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)).withProperty(isActive, active), 3);
        
        if(tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }
    
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING, isActive});
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        boolean active = false;
        if((meta & 15 >> 2) == 1) {
            active = true;
        }
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta)).withProperty(isActive, active);
    }
    
    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | (state.getValue(FACING)).getHorizontalIndex();
        if(state.getValue(isActive)) {
            i = i | 1 << 2;
        } else {
            i = i | 0 << 2;
        }
        return i;
    }
    
    
    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()).withProperty(isActive, false);
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
        	playerIn.openGui(FSMod.instance, GuiHandler.REDSTONE_GENERATOR_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
        }
        return true;
    }
    
    
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
    
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		  try {
	            return tileEntityClass.getConstructor().newInstance();
	        } catch(InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
	            e.printStackTrace();
	        }
	        return new TileEntityRedstoneGenerator();
	}

}
