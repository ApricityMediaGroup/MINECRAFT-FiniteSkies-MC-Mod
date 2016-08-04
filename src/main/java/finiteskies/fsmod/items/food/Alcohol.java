package finiteskies.fsmod.items.food;

import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class Alcohol extends ItemFood{

	public Alcohol() {
		super(0, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.ALCOHOL.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.ALCOHOL.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 64;
    }
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;  
    }
}
