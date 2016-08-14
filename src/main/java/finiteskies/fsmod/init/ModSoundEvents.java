package finiteskies.fsmod.init;


import finiteskies.fsmod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSoundEvents {

		public static SoundEvent disgust;
		public static SoundEvent firepit;

	public static void registerSounds() {
		disgust = registerSound("player.disgust");
		firepit = registerSound("furniture.firepit.firepit");
	}


	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}