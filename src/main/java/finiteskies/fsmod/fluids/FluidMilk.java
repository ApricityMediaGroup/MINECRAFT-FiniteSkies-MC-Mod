package finiteskies.fsmod.fluids;
import finiteskies.fsmod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
public class FluidMilk extends Fluid {
	public static final String name = "fluid_milk";
	public static final FluidMilk instance = new FluidMilk();

	public FluidMilk()         {
    	super(name, new ResourceLocation("fsm", "fsm:blocks/fluid_milk_still"), new ResourceLocation("fsm", "fsm:blocks/fluid_milk_flow"));
    }
	@Override
	public int getColor() {
		return 0xFFFFED;
		
	}
}
