// Code taken and modified from https://github.com/Valerate/SimpleOreSamples/blob/master/src/main/java/valerate/simpleoresamples/blocks/SampleBlock.java as per Public Domain license

package gliese832c.geology.world;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import gliese832c.geology.Geology;
import gliese832c.geology.block.rocks.BlockSpecialRockRocks;
import gliese832c.geology.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import gliese832c.geology.config.GeologyConfig;
import org.apache.logging.log4j.LogManager;

public class WorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        //LogManager.getFormatterLogger(Geology.MOD_ID).error("Generate function called for: " + chunkX + ", " + chunkZ);

        if (!CommonProxy.dimension_whitelist.contains(world.provider.getDimension()) || GeologyConfig.disableAllSampleGeneration) {
            return;
        }

        HashMap<IBlockState, Integer> counter = scanChunk(world.getChunk(chunkX, chunkZ));

        for (Map.Entry<IBlockState, Integer> entry : counter.entrySet()) {

            IBlockState sampleState = CommonProxy.blockSamplePairs.get(entry.getKey());
            if (sampleState != null) {

                int[] sampleData = CommonProxy.sampleDataPairs.get(sampleState);

                if (entry.getValue() > sampleData[2]) {
                    int samples;
                    if (sampleData[0] == 0) {
                        samples = sampleData[1];
                    }
                    else {
                        samples = Math.min(entry.getValue() / sampleData[0], sampleData[1]);
                    }

                    for (int i = 0; i < samples; i++) {
                        if (random.nextFloat() < GeologyConfig.oreSampleChance) {
                            int x = (chunkX << 4) + random.nextInt(16);
                            int z = (chunkZ << 4) + random.nextInt(16);
                            placeSample(world, x, z, sampleState);

                            //LogManager.getFormatterLogger(Geology.MOD_ID).error("Placing sample! " + sampleState.getBlock().getRegistryName());
                        }
                    }
                }
            }
        }
    }

    public HashMap<IBlockState, Integer> scanChunk(Chunk chunk) {

        HashMap<IBlockState, Integer> counter = new HashMap<>();

        for (int i = 1; i <= 256; i++) {
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < 16; k++) {
                    IBlockState bs = chunk.getBlockState(j, i, k);
                    Block b = bs.getBlock();

                    //if (b == Blocks.AIR || b == Blocks.STONE || b == Blocks.DIRT || b == Blocks.GRAVEL) {
                    if (b == Blocks.AIR) {
                        continue;
                    }

                    // TODO: Replace with check whether there is a BlockSamplePair that has this blockstate as its block.
                    if (true) {
                        Integer count = counter.get(bs);

                        if (count != null) {
                            counter.put(bs, count + 1);
                        } else {
                            counter.put(bs, 1);
                        }
                    }
                }
            }
        }

        return counter;
    }



    public void placeSample(World world, int x, int z, IBlockState sample) {
        BlockPos surface = world.getTopSolidOrLiquidBlock(new BlockPos(x, 64, z));
        if (surface.getY() > 1 && surface.getY() < 255) {
            Block surfaceBlock = world.getBlockState(surface).getBlock();

            // Don't place in fluids, but do replace grass and junk on the surface
            if (!(surfaceBlock instanceof BlockLiquid)
                    && !(world.getBlockState(getTopRegardlessOfUnsolid(surface, world)).getBlock().getRegistryName().equals(sample.getBlock().getRegistryName()))
                    && surfaceBlock.isReplaceable(world, surface)
                    && sample.getBlock().canPlaceBlockAt(world, surface)) {
                world.setBlockState(surface, sample);
            }
        }
    }


    /**
     * Finds the highest block on the x and z coordinate that is solid or liquid, and returns its y coord.
     */
    public BlockPos getTopRegardlessOfUnsolid(BlockPos pos, World world)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos;
        BlockPos blockpos1;

        for (blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ()); blockpos.getY() >= 0; blockpos = blockpos1)
        {
            blockpos1 = blockpos.down();
            IBlockState state = chunk.getBlockState(blockpos1);

            if (!state.getMaterial().equals(Material.AIR))
            {
                break;
            }
        }

        return blockpos.down();
    }
}