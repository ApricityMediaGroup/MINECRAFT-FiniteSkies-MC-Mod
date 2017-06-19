package finiteskies.fsmod.gui;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.tileentity.TileEntityRedstoneGenerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;


public class GuiHandler implements IGuiHandler {
   
	public static final int REDSTONE_GENERATOR_GUI = 1;
	
    public GuiHandler() {
        NetworkRegistry.INSTANCE.registerGuiHandler(FSMod.instance, this);
    }
    
    
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos blockPos = new BlockPos(x, y, z);

        if(id == REDSTONE_GENERATOR_GUI) {
        	return new ContainerRedstoneGenerator(player.inventory, (TileEntityRedstoneGenerator)world.getTileEntity(blockPos));
        } else {
        	return null;
        }

    }
    
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, final int z) {
        BlockPos blockPos = new BlockPos(x, y, z);

        if(id == REDSTONE_GENERATOR_GUI) {
        	return new GuiRedstoneGenerator(player.inventory, (TileEntityRedstoneGenerator)world.getTileEntity(blockPos));

        } else {
        	return null;
        }

    }
    

}