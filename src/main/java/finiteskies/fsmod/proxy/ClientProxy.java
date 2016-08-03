package finiteskies.fsmod.proxy;

import finiteskies.fsmod.init.FluidRenderRegister;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModFluids;
import finiteskies.fsmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void preinit() {
		FluidRenderRegister.init();
		
	}

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModFluids.registerRenders();
		
	}

}
 