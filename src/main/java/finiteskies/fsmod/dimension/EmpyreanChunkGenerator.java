package finiteskies.fsmod.dimension;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkGenerator;

public class EmpyreanChunkGenerator implements IChunkGenerator
{
	private World worldObj;

	public EmpyreanChunkGenerator(World worldIn, long dimID, boolean mapFeaturesEnabled)
	{
		worldIn.setSeaLevel(64);
		this.worldObj = worldIn;
	}

	@Override
	public Chunk provideChunk(int x, int z) 
	{
		ChunkPrimer chunkprimer = new ChunkPrimer();
		Chunk chunk = new Chunk(this.worldObj, chunkprimer, x, z);
		Biome[] abiomegenbase = this.worldObj.getBiomeProvider().loadBlockGeneratorData((Biome[])null, x * 16, z * 16, 16, 16);
        byte[] abyte = chunk.getBiomeArray();

        for (int l = 0; l < abyte.length; ++l)
        {
            abyte[l] = (byte)Biome.getIdForBiome(abiomegenbase[l]);
        }

        chunk.generateSkylightMap();
		return chunk;
	}

	@Override
	public void populate(int x, int z) {}
	@Override
	public void recreateStructures(Chunk ch, int x, int z) {}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) 
	{
		return false;
	}

	@Override
	public List<net.minecraft.world.biome.Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType,
			BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockPos getStrongholdGen(World worldIn, String structureName, BlockPos position) {
		// TODO Auto-generated method stub
		return null;
	}
}
