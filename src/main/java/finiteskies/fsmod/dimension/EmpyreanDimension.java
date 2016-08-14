package finiteskies.fsmod.dimension;

import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;

public class EmpyreanDimension 
{
	public static final int DIMENSION_ID = DimensionManager.getNextFreeDimId();
	public static final String DIM_NAME = "The Empyrean";
	public static final DimensionType EMPYREAN_DIMENSION = DimensionType.register("The Empyrean", "_empyrean", DIMENSION_ID, WorldProviderEmpyrean.class, false);
//	"EMPYREAN", "_empyrean", DIMENSION_ID, WorldProviderEmpyrean.class, false
	public static void mainRegistry()
	{
		DimensionManager.registerDimension(DIMENSION_ID, EmpyreanDimension.EMPYREAN_DIMENSION);
	}
	
	public static boolean isEmpyreanDimension(World world)
	{
		return isEmpyreanDimension(world.provider.getDimension());
	}
	
	public static boolean isEmpyreanDimension(int id)
	{
		return id == EmpyreanDimension.DIMENSION_ID;
	}
}