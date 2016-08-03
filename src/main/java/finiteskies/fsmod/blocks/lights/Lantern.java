package finiteskies.fsmod.blocks.lights;

import finiteskies.fsmod.FSMod;
import finiteskies.fsmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Lantern extends Block {

	public Lantern() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.FiniteBlocks.LANTERN.getUnlocalizedName());
		setRegistryName(Reference.FiniteBlocks.LANTERN.getRegistryName());
		setSoundType(SoundType.STONE);
		setCreativeTab(FSMod.CREATIVE_TAB_FURNITURE);
		this.setLightLevel(11);
	}
}
