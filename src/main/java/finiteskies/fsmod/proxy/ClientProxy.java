package finiteskies.fsmod.proxy;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.entity.passive.EntitySquirrel;
import finiteskies.fsmod.entity.passive.ModelEntitySquirrel;
import finiteskies.fsmod.entity.passive.RenderEntitySquirrel;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ClientProxy implements CommonProxy {

	@Override
	public void preinit() {
//		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, 
//			      new RenderEntitySquirrel(Minecraft.getMinecraft().getRenderManager(), new ModelEntitySquirrel(), 0.5F));
//		EntityRegistry.registerModEntity(EntitySquirrel.class, "EntitySquirrel", 645, FSMod.class, 500, 1000, true);


	}

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
 