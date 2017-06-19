package finiteskies.fsmod.preinit;

import finiteskies.fsmod.Reference;
import finiteskies.fsmod.tileentity.TileEntityRedstoneGenerator;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {
	
	public static void init() {
		  register("redstoneGenerator", TileEntityRedstoneGenerator.class);	
	}
	
	private static void register(String tileId, Class<? extends TileEntity> tileEntityClass) {
		GameRegistry.registerTileEntity(tileEntityClass, Reference.MOD_ID + tileId);
	}
}
