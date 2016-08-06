package finiteskies.fsmod.proxy;

public interface ProxyInterface
{
	public void preInit();
	public void init();
	public boolean isSinglePlayer();

	public boolean isDedicatedServer();
	public void registerRenderers();

}