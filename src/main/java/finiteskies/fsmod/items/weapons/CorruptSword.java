package finiteskies.fsmod.items.weapons;

import java.util.List;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class CorruptSword extends Item{
	public CorruptSword() {
		setUnlocalizedName(Reference.FiniteItems.CORRUPTSWORD.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.CORRUPTSWORD.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_TOOLS);
		setMaxStackSize(1);
		setMaxDamage(64);
	}
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean show){
    list.add("Cuts eggs surprisingly well...");
    }
}
