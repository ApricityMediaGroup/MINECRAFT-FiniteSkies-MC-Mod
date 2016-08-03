package finiteskies.fsmod.items.tools;

import java.awt.List;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodKnife extends Item{
	public FoodKnife() {
		setUnlocalizedName(Reference.FiniteItems.FOODKNIFE.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.FOODKNIFE.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_TOOLS);
		setMaxStackSize(1);
		setMaxStackSize(1);
		setMaxDamage(64);
	}    
}
