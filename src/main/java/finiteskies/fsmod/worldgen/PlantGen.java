package finiteskies.fsmod.worldgen;

import java.util.Random;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class PlantGen extends WorldGenerator
{
    private BlockFlower plant;
    private IBlockState state;

    public PlantGen(BlockFlower flowerIn, BlockFlower.EnumFlowerType type)
    {
        this.setGeneratedBlock(flowerIn, type);
    }

    public void setGeneratedBlock(BlockFlower flowerIn, BlockFlower.EnumFlowerType typeIn)
    {
        this.plant = flowerIn;
        this.state = flowerIn.getDefaultState().withProperty(flowerIn.getTypeProperty(), typeIn);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        for (int i = 0; i < 64; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.getHasNoSky() || blockpos.getY() < 255) && this.plant.canBlockStay(worldIn, blockpos, this.state))
            {
                worldIn.setBlockState(blockpos, this.state, 2);
            }
        }

        return true;
    }
}