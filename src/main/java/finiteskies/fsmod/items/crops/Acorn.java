package finiteskies.fsmod.items.crops;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.init.ModBlocks;
import finiteskies.fsmod.init.ModSoundEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class Acorn extends ItemFood {
	public Acorn() {
		super(1, 0.0F, false);
		setUnlocalizedName(Reference.FiniteItems.ACORN.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.ACORN.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_PLANTS);
	}
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 16;
    }
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
            worldIn.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, ModSoundEvents.crunch, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);

    }
}
