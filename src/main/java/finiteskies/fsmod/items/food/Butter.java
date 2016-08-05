package finiteskies.fsmod.items.food;

import java.util.List;

import javax.annotation.Nullable;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModItems;
import finiteskies.fsmod.init.ModSoundEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
	        player.worldObj.playSound(null , player.posX, player.posY, player.posZ, ModSoundEvents.disgust , SoundCategory.PLAYERS , 2.0F, 1.0F);
    }
    
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean show){
    list.add("You stare at it in temptation...");
    }
    
}
