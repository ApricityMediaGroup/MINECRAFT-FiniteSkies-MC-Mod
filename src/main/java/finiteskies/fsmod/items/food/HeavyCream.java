package finiteskies.fsmod.items.food;

import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class HeavyCream extends ItemFood{

	public HeavyCream() {
		super(5, 0.7F, false);
		setUnlocalizedName(Reference.FiniteItems.HEAVYCREAM.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.HEAVYCREAM.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);

	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
    	// Milk Bucket is 32
        return 128;
    }
}
