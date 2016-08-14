package finiteskies.fsmod.dimension.biome;
import finiteskies.fsmod.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeEmpyrean extends Biome {

	public BiomeEmpyrean(BiomeProperties properties) {
		super(properties);
		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 2;
		this.theBiomeDecorator.cactiPerChunk = 1;
		this.theBiomeDecorator.clayPerChunk = 1;
		this.theBiomeDecorator.deadBushPerChunk = 5;
		this.theBiomeDecorator.mushroomsPerChunk = 2;
		
		this.topBlock = ModBlocks.glowquartz.getDefaultState();
		this.fillerBlock = Blocks.AIR.getDefaultState();
		this.spawnableCaveCreatureList.removeAll(spawnableCaveCreatureList);
		this.spawnableMonsterList.removeAll(spawnableMonsterList);
		this.spawnableWaterCreatureList.removeAll(spawnableWaterCreatureList);
		this.spawnableCreatureList.removeAll(spawnableCreatureList);
		//this.spawnableCreatureList.add(new SpawnListEntry(Entity.class, 5, 1, 2));
		//this.spawnableCreatureList.add(new SpawnListEntry(Entity.class, 1, 1, 1));
	}
}