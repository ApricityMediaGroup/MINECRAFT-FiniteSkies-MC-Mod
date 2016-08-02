package finiteskies.fsmod.proxy;

import finiteskies.fsmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		
	}

}
 