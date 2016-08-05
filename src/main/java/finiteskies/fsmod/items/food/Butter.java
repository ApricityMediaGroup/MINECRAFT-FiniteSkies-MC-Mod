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

public class Butter extends ItemFood{

	public Butter() {
		super(1, 0.0F, false);
		setUnlocalizedName(Reference.FiniteItems.BUTTER.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.BUTTER.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_FOOD);

	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 16;
    }
    //add disgust sound when eaten
    
    //add effects when eaten
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {

        player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300, 1));
	        Minecraft.getMinecraft().thePlayer.sendChatMessage("Not as good as I imagined...");
    }
    
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean show){
    list.add("You stare at it in temptation...");
    }
    
}
