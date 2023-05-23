package gliese832c.geology.world.gen;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class VeinGenerator implements IWorldGenerator
{
    IBlockState state;
    double generationChance;
    int veinAttempts;
    int blockAttempts;

    public VeinGenerator(IBlockState state, double generationChance, int veinAttempts, int blockAttempts)
    {
        this.state = state;
        this.generationChance = generationChance;
        this.veinAttempts = veinAttempts;
        this.blockAttempts = blockAttempts;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        final BlockPos chunkBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);

        Biome biome = world.getBiomeForCoordsBody(chunkBlockPos);
        int dimension = world.provider.getDimension();

        if (random.nextDouble() < generationChance)
        {
            for (int i = 0; i < veinAttempts; i++)
            {
                BlockPos pos = getTopSolid(
                        world,
                        chunkBlockPos.add(
                                8 + random.nextInt(16),
                                0,
                                8 + random.nextInt(16)
                        ),
                        state
                );

                generateVein(blockAttempts, world, random, pos.down(4), 2);
            }
        }
    }

    private void generateVein(int attempts, World world, Random rand, BlockPos targetPos, int flags)
    {
        for (int i = 0; i < attempts; i++)
        {
            BlockPos pos = targetPos.add(
                    rand.nextInt(8) - rand.nextInt(8),
                    rand.nextInt(4) - rand.nextInt(4),
                    rand.nextInt(8) - rand.nextInt(8)
            );

            if (!world.isBlockLoaded(pos)) continue;

            if (world.getBlockState(pos).getMaterial() == Material.ROCK
                    || world.getBlockState(pos).getMaterial() == Material.GROUND
                    || world.getBlockState(pos).getMaterial() == Material.GRASS)
            {
                world.setBlockState(pos, state, flags);
            }
        }
    }

    public BlockPos getTopSolid(World world, BlockPos pos, IBlockState stateToIgnore)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos;
        BlockPos blockpos1;

        for (blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ()); blockpos.getY() >= 0; blockpos = blockpos1)
        {
            blockpos1 = blockpos.down();
            IBlockState state = chunk.getBlockState(blockpos1);

            if (state.getMaterial().blocksMovement()
                    && !(state.getMaterial() == Material.WOOD)
                    && !state.getBlock().isLeaves(state, world, blockpos1)
                    && !state.getBlock().isFoliage(world, blockpos1)
                    && !(state == stateToIgnore))
            {
                break;
            }
        }

        return blockpos;
    }

}
