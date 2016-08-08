package finiteskies.fsmod.worldgen;

import java.util.Random;

import finiteskies.fsmod.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {
	// OverWorldOres
	private WorldGenerator COKING_COAL;
	private WorldGenerator DIRT_FOSSIL;
	private WorldGenerator STONE_FOSSIL;
	private WorldGenerator SALT_ORE;
	private WorldGenerator GROUND_MARBLE;

	public OreGen() {
		// spawn block with vein size
		this.COKING_COAL = new WorldGenMinable(ModBlocks.cokingCoalOre.getDefaultState(), 12);
		this.DIRT_FOSSIL = new WorldGenMinableInDirt(ModBlocks.dirtFossil.getDefaultState(), 7);
		this.STONE_FOSSIL = new WorldGenMinable(ModBlocks.stoneFossil.getDefaultState(), 7);
		this.SALT_ORE = new WorldGenMinable(ModBlocks.saltOre.getDefaultState(), 7);
		this.GROUND_MARBLE = new WorldGenMinable(ModBlocks.groundMarble.getDefaultState(), 30);

	}

	@Override
	public void generate(Random random, int chunckX, int chunckZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0: // OverWorld
				// rarity - minHeight - max height (don't go out of bounds(0-256))
			this.runGenerator(this.COKING_COAL, world, random, chunckX, chunckZ, 10, 0, 100);
			this.runGenerator(this.DIRT_FOSSIL, world, random, chunckX, chunckZ, 10, 44, 80);
			this.runGenerator(this.STONE_FOSSIL, world, random, chunckX, chunckZ, 3, 44, 60);
			//make salt only spawn under oceans? where else does salt come from?
			this.runGenerator(this.SALT_ORE, world, random, chunckX, chunckZ, 3, 50, 70);
			this.runGenerator(this.GROUND_MARBLE, world, random, chunckX, chunckZ, 2, 0, 55);


			break;

		case -1: // Neather

			break;

		case 1: // EndWorld

			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random random, int chunckX, int chunckZ,
			int chanceToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Minimum or Maximum Height out of bounds");

		int heightDiff = maxHeight - minHeight + 1;

		for (int i = 0; i < chanceToSpawn; i++) {
			int x = chunckX * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunckZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}

}