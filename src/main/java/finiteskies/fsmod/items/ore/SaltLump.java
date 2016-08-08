package finiteskies.fsmod.items.ore;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SaltLump extends ItemFood{

	public SaltLump() {
		super(1, 0.1F, false);
		setUnlocalizedName(Reference.FiniteItems.SALTLUMP.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.SALTLUMP.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);
	}
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
	        player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 300, 1));
	    }
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 64;
    }
}
