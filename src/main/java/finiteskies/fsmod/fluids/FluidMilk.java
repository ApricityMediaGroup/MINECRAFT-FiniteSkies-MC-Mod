package finiteskies.fsmod.fluids;
import finiteskies.fsmod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
public class FluidMilk extends Fluid {

	public FluidMilk(String name, String resourceLocation1, String resourceLocation2)         {
    	super(name, new ResourceLocation(resourceLocation1), new ResourceLocation(resourceLocation2));
    }

	public int getColor() {
		return 0xFFFFED;
		
	}
}
