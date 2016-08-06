package finiteskies.fsmod.init;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	//OverWorldOres
	private WorldGenerator COKING_COAL;
	
	public ModWorldGen()
	{
		this.COKING_COAL = new ModWorldGenMinable(ModBlocks.cokingCoalOre.getDefaultState(), 3);
	}

	@Override
	public void generate(Random random, int chunckX, int chunckZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:  //OverWorld
			
			this.runGenerator(this.COKING_COAL, world, random, chunckX, chunckZ, 45, 0, 35);
			
			break;
			
		case -1:  //Neather
			
			break;
			
		case 1:  //EndWorld
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunckX, int chunckZ, int chanceToSpawn, int minHeight, int maxHeight)
	{
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) 
			throw new IllegalArgumentException("Minimum or Maximum Height out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for(int i = 0; i < chanceToSpawn; i++)
		{
			int x = chunckX * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunckZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
}