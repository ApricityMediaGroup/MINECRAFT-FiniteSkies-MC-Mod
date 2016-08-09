package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Pineapple extends ItemFood {

	public Pineapple() {
		super(3, 0.0F, false);
		setUnlocalizedName(Reference.FiniteItems.PINEAPPLE.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.PINEAPPLE.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
	 
	public int getMaxItemUseDuration(ItemStack stack)
	    {
	        return 32;
	    }
	
}
