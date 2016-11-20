package finiteskies.fsmod.items.food;

import java.util.List;

import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class RawBacon extends ItemFood{

	public RawBacon() {
		super(2, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.RAWBACON.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.RAWBACON.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
		isWolfsFavoriteMeat();

	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 64;
    }
    
    
}
