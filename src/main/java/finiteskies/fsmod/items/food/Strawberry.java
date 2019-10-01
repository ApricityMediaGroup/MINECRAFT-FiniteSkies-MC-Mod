package finiteskies.fsmod.items.food;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.ItemRegistry;
import finiteskies.fsmod.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Strawberry extends ItemFood {
	public Strawberry() {
		super(1, 0.1F, false);
		setUnlocalizedName(ItemRegistry.registerFoodItems.STRAWBERRY.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRY.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 15;
    }
}
