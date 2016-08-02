package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class BreadSlice extends ItemFood{

	public BreadSlice() {
		super(3, 0.3F, false);
		setUnlocalizedName(Reference.FiniteItems.BREAD_SLICE.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.BREAD_SLICE.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}

}
