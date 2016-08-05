package finiteskies.fsmod.proxy;

public interface ProxyInterface
{
	public void preInit();
	
	public boolean isSinglePlayer();

	public boolean isDedicatedServer();

}