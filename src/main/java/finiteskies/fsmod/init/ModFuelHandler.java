package finiteskies.fsmod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ModFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		Item var1 = fuel.getItem();
		
		if(var1 == ModItems.cokingCoal){
			return 1700;
			//ADD [ELSE IF] IF YOU WANT TO ADD MORE FUEL...
		}else{
			return 0;
		}
	}

}
