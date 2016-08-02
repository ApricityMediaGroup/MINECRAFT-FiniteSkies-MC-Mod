package finiteskies.fsmod.block;

import java.util.Random;

import finiteskies.fsmod.FSMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.MathHelper;

public class SandstoneBrick extends Block{

	public SandstoneBrick() {
		super(Material.ROCK);
		this.setUnlocalizedName("sandstone_brick");
		this.setHardness(0.3f);
		this.setLightLevel(1.0f);
		this.setLightOpacity(16);
		// 16 IS OPAQUE
		this.setResistance(1.5f);
		this.setSoundType(SoundType.ANVIL);
		setCreativeTab(FSMod.CREATIVE_TAB_BLOCKS);
	}
	
	public int quantityDroppedWithBonus(int fortune, Random random){
		return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
	}
	
	public int quantityDropped(Random random){
		return 2 + random.nextInt(3);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Items.GLOWSTONE_DUST;
	}
	
	public MapColor getMapColor(IBlockState state){
		return MapColor.SAND;
	}
	
}
