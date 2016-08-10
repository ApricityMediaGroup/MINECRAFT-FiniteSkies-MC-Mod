package finiteskies.fsmod.dimension.biome;

import net.minecraftforge.common.config.Configuration;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;



public class ModBiomes {
	public static Configuration config;

	//Settings
	public static int empyreanBiomeId = 128;

	
	public static void init() {
		MainRegistry();
	}
	

	public static void MainRegistry() {
		initializeBiome();
		registerBiome();
	}
	
	public static Biome empyrean_biome;
	public static final int biomeID = ModBiomes.empyreanBiomeId;
	
	
	public static void initializeBiome() {
		empyrean_biome = new BiomeEmpyrean(new BiomeProperties("The Empyrean").setTemperature(1.2f).setRainfall(0.9f).setWaterColor(16720774).setBaseHeight(1.5f).setHeightVariation(1.0f));
		Biome.registerBiome(biomeID, "The Empyrean", empyrean_biome);
	}
	
	public static void registerBiome() {
		BiomeDictionary.registerBiomeType(empyrean_biome, Type.END);
		BiomeManager.addSpawnBiome(empyrean_biome);
	}
}