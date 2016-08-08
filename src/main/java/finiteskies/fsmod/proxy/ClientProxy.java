package finiteskies.fsmod.proxy;

import finiteskies.fsmod.entity.EntityFish;
import finiteskies.fsmod.entity.EntitySquirrel;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.model.ModelEntityFish;
import finiteskies.fsmod.model.ModelEntitySquirrel;
import finiteskies.fsmod.render.RenderEntityFish;
import finiteskies.fsmod.render.RenderEntitySquirrel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy
{
	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	@Override
	public void registerRenders()
	{		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		}

	@Override
	public EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().thePlayer;
	}

	@Override
	public boolean isSinglePlayer()
	{
		return Minecraft.getMinecraft().isSingleplayer();
	}

	@Override
	public boolean isDedicatedServer()
	{
		return false;
	}

	@Override
	public void preInit()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
	@Override
	public void init() {
	}
	@Override
	public void registerRenderers() {
		float shadowSize = 0.0F;
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, new RenderEntitySquirrel(rm, new ModelEntitySquirrel(), shadowSize));
		RenderingRegistry.registerEntityRenderingHandler(EntityFish.class, new RenderEntityFish(rm, new ModelEntityFish(), shadowSize));
	}
	@SubscribeEvent
	public void onPrePlayerRender(RenderPlayerEvent.Pre event)
	{
		if(!rendering)
			return;
		
		if(event.getEntityPlayer() == renderEntity)
		{
			this.backupEntity = Minecraft.getMinecraft().getRenderManager().renderViewEntity;
//			Minecraft.getMinecraft().getRenderManager().renderViewEntity = renderEntity;
		}
	}

	@SubscribeEvent
	public void onPostPlayerRender(RenderPlayerEvent.Post event)
	{
		if(!rendering)
			return;
		
		if (event.getEntityPlayer() == renderEntity)
		{
			Minecraft.getMinecraft().getRenderManager().renderViewEntity = backupEntity;
			renderEntity = null;
		}
	}
}