package finiteskies.fsmod.init;


import finiteskies.fsmod.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Registers this mod's {@link SoundEvent}s.
 *
 * 
 */

	public class ModSoundEvents {
	public static SoundEvent record_solaris;

	/**
	 * Register the {@link SoundEvent}s.
	 */
	public static void registerSounds() {
		record_solaris = registerSound("record.solaris");
	}

	/**
	 * Register a {@link SoundEvent}.
	 *
	 * @param soundName The SoundEvent's name without the testmod3 prefix
	 * @return The SoundEvent
	 */
	private static SoundEvent registerSound(String soundName) {
		final ResourceLocation soundID = new ResourceLocation(Reference.MOD_ID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}