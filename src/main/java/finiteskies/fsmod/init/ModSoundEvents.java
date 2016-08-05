package finiteskies.fsmod.init;


import finiteskies.fsmod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Registers this mod's {@link SoundEvent}s.
 *
 * 
 */

	public class ModSoundEvents {

		
		public static SoundEvent disgust;

	/**
	 * Register the {@link SoundEvent}s.
	 */
	public static void registerSounds() {
		disgust = registerSound("disgust");
	}

	/**
	 * Register a {@link SoundEvent}.
	 *
	 * 
	 * @return The SoundEvent
	 */
	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}