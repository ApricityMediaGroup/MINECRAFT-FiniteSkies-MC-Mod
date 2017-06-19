package finiteskies.fsmod.proxy;
import finiteskies.fsmod.worldgen.OreGen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy implements ProxyInterface
{
	public void registerRenders()
	{

	}

	public World getClientWorld()
	{
		return null;
	}

	public EntityPlayer getClientPlayer()
	{
		return null;
	}

	@Override
	public boolean isSinglePlayer()
	{
		return false;
	}

	@Override
	public boolean isDedicatedServer()
	{
		return !Minecraft.getMinecraft().isIntegratedServerRunning();
	}

	@Override
	public void preInit()
	{
		
	}
	@Override
	public void init()
	{
		
	}
	@Override
	public void registerRenderers() {
	}
	
	public void registerGuis() {
		
	}
    public void init(FMLInitializationEvent e) {
    }

}
