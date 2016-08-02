package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Toast extends ItemFood{

	public Toast() {
		super(6, 0.4F, false);
		setUnlocalizedName(Reference.FiniteItems.TOAST.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.TOAST.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}

}
