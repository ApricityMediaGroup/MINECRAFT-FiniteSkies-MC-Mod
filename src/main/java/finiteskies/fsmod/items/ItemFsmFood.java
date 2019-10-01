package finiteskies.fsmod.items;


import java.util.List;

import finiteskies.fsmod.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemFsmFood extends ItemFood {

    public final float saturation;

    public ItemFsmFood(int healAmount, float saturation) {
        super(healAmount, saturation, false);

        this.saturation = saturation;
    }

}