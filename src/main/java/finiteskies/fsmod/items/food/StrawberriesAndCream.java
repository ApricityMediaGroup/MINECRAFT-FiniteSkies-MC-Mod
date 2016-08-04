package finiteskies.fsmod.items.food;

import java.util.List;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class StrawberriesAndCream extends ItemFood{

	public StrawberriesAndCream() {
		super(15, 0.9F, false);
		setUnlocalizedName(Reference.FiniteItems.STRAWBERRIESANDCREAM.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.STRAWBERRIESANDCREAM.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean show){
    list.add("Your hard work has finally paid off.");
    list.add("Now treat yourself.");
    }
}
