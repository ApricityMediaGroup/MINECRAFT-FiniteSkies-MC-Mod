package finiteskies.fsmod.dimension;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.chunk.IChunkGenerator;

public class WorldProviderEmpyrean extends WorldProvider
{	

	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return new EmpyreanChunkGenerator(this.worldObj, this.getDimension(), false);
	}

	@Override
	public Biome getBiomeForCoords(BlockPos pos)
    {
        return Biomes.SKY;
    }

	@Override
	public boolean canRespawnHere()
	{
		return true;
	}

	@Override
	public int getRespawnDimension(EntityPlayerMP player)
	{
		return EmpyreanDimension.DIMENSION_ID;
	}

	@Override
	public boolean isSurfaceWorld()
	{
		return true;
	}

	@Override
	public String getWelcomeMessage()
	{
		return "Entering The Empyrean";
	}

	@Override
	public DimensionType getDimensionType() 
	{
		return EmpyreanDimension.EMPYREAN_DIMENSION;
	}
	@Override
	public void createBiomeProvider() {
		this.biomeProvider = new BiomeProviderSingle(Biomes.SKY);
		this.isHellWorld = true;
		this.hasNoSky = true;
	}
}