package finiteskies.fsmod.items.weapons;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import finiteskies.fsmod.entity.EntityMusketBullet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class Musket extends Item{

	private final double damage;
	private final float spread;
	
	public Musket(double damage, float spread){
		setUnlocalizedName(Reference.FiniteItems.MUSKET.getUnlocalizedName());
		setRegistryName(Reference.FiniteItems.MUSKET.getRegistryName());
		setCreativeTab(FSMod.CREATIVE_TAB_TOOLS);
		this.damage = damage;
		this.spread = spread;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		if(!worldIn.isRemote){
			playerIn.sendMessage(new TextComponentString("Fire!"));
			EntityMusketBullet bullet = new EntityMusketBullet(worldIn, playerIn/*, spread*/);
			worldIn.spawnEntity(bullet);
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
}
