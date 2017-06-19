package finiteskies.fsmod.proxy;

import finiteskies.fsmod.entity.EntityFish;
import finiteskies.fsmod.entity.EntityMusketBullet;
import finiteskies.fsmod.entity.EntityAlpaca;
import finiteskies.fsmod.entity.EntitySquirrel;
import finiteskies.fsmod.gui.GuiHandler;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.model.ModelEntityFish;
import finiteskies.fsmod.model.ModelEntityMusketBullet;
import finiteskies.fsmod.model.ModelEntityAlpaca;
import finiteskies.fsmod.model.ModelEntitySquirrel;
import finiteskies.fsmod.render.RenderEntityFish;
import finiteskies.fsmod.render.RenderEntityMusketBullet;
import finiteskies.fsmod.render.EntityMusketBulletRenderFactory;
import finiteskies.fsmod.render.RenderEntityAlpaca;
import finiteskies.fsmod.render.RenderEntitySquirrel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderLeashKnot;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy
{
	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;
	public static RenderItem renderItem;
	@Override
	public void registerRenders()
	{		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		}

	@Override
	public EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().player;
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
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public void registerRenderers() {
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		RenderItem ri = Minecraft.getMinecraft().getRenderItem();
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, new RenderEntitySquirrel(rm, new ModelEntitySquirrel(), 0.1F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFish.class, new RenderEntityFish(rm, new ModelEntityFish(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAlpaca.class, new RenderEntityAlpaca(rm, new ModelEntityAlpaca(), 0.4F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMusketBullet.class, new RenderEntityMusketBullet(rm));
	}
	@Override
	public void registerGuis() {
	        super.registerGuis();
	        new GuiHandler();
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