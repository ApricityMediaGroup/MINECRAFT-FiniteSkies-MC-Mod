package finiteskies.fsmod.dimension;

import finiteskies.fsmod.dimension.biome.ModBiomes;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderEmpyrean extends WorldProvider
{	

	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return null;
		//return new EmpyreanChunkGenerator(this.worldObj, this.getDimension());
	}

	@Override
	public Biome getBiomeForCoords(BlockPos pos)
    {
        return ModBiomes.empyrean_biome;
    }

	@Override
	public boolean canRespawnHere()
	{
		return false;
	}
    @Override
    public int getAverageGroundLevel()
    {
        return 100;
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
	/*
	@Override
	public void createBiomeProvider() {
		this.biomeProvider = new BiomeProviderSingle(ModBiomes.empyrean_biome);
		this.isHellWorld = false;
		this.hasNoSky = false;
	}
    @SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 8.0F;
    }
    @SideOnly(Side.CLIENT)
    public Vec3d getSkyColor(net.minecraft.entity.Entity cameraEntity, float partialTicks)
    {
        return worldObj.getSkyColorBody(cameraEntity, partialTicks);
    }

    @SideOnly(Side.CLIENT)
    public Vec3d getCloudColor(float partialTicks)
    {
        return worldObj.getCloudColorBody(partialTicks);
    }

    /**
     * Gets the Sun Brightness for rendering sky.
     * */
	/*@SideOnly(Side.CLIENT)
    public float getSunBrightness(float par1)
    {
        return worldObj.getSunBrightnessBody(par1);
    }

    /**
     * Gets the Star Brightness for rendering sky.
     * */
	/*@SideOnly(Side.CLIENT)
    public float getStarBrightness(float par1)
    {
        return worldObj.getStarBrightnessBody(par1);
    }*/
    
}