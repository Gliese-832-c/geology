package gliese832c.geology.proxy;

import java.util.*;

//import lach_01298.qmd.ArmourBonusHandler;
//import lach_01298.qmd.QMDOreDictionary;
//import lach_01298.qmd.block.QMDBlocks;
//import lach_01298.qmd.fluid.QMDFluids;
//import lach_01298.qmd.item.QMDItems;
//import lach_01298.qmd.recipes.QMDRecipes;
import gliese832c.geology.Geology;
import gliese832c.geology.block.GeologyBlocks;
import gliese832c.geology.block.rocks.BlockSpecialRockRocks;
import gliese832c.geology.config.GeologyConfig;
import gliese832c.geology.item.GeologyItems;
import gliese832c.geology.world.WorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModIdMappingEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;

public class CommonProxy
{
    public static Set<Integer> dimension_whitelist = new HashSet<>();
    public static HashMap<IBlockState, IBlockState> blockSamplePairs = new HashMap<>();
    public static HashMap<IBlockState, int[]> sampleDataPairs = new HashMap<>();

    public void preInit(FMLPreInitializationEvent preEvent)
    {
        GeologyBlocks.init();
        GeologyItems.init();

        GeologyBlocks.register();
        GeologyItems.register();

        /*QMDOreDictionary.register();
        QMDPacketHandler.registerMessages(QMD.MOD_ID);
        MinecraftForge.EVENT_BUS.register(new QMDRecipes());*/
    }

    public void init(FMLInitializationEvent event)
    {
        /*MinecraftForge.EVENT_BUS.register(new ArmourBonusHandler());*/

        GameRegistry.registerWorldGenerator(new VeinGenerator(
                GeologyBlocks.rockVolcanic.getDefaultState()
                        .withProperty(BlockRockVolcanic.TYPE, BlockTypes.RockVolcanicTypes.BASALT),
                0.1,
                8,
                256
                ), 0
        );
      
        // Registers dimension whitelist

        int[] tempVarDims = GeologyConfig.dimension_whitelist;
        Set<Integer> tempVarSet = new HashSet<>();

        for (int i : tempVarDims) {
            tempVarSet.add(i);
        }

        dimension_whitelist = tempVarSet;



        // Registers blockstate-sample pairs

        String[] tempVarPairs = GeologyConfig.blockSamplePairs;

        for (String s : tempVarPairs) {

            String blockString = s.split("\\|")[0];
            String blockStringWithoutMeta = blockString.split(":")[0] + ":" + blockString.split(":")[1];
            int blockStringMeta = Integer.parseInt(blockString.split(":")[2]);

            Block tempVarBlock = Block.getBlockFromName(blockStringWithoutMeta);
            IBlockState tempVarBlockBlockstate = tempVarBlock.getStateFromMeta(blockStringMeta);

            String sampleString = s.split("\\|")[1];
            String sampleStringWithoutMeta = sampleString.split(":")[0] + ":" + sampleString.split(":")[1];
            int sampleStringMeta = Integer.parseInt(sampleString.split(":")[2]);

            Block tempVarSample = Block.getBlockFromName(sampleStringWithoutMeta);
            IBlockState tempVarSampleBlockstate = tempVarSample.getStateFromMeta(sampleStringMeta);

            blockSamplePairs.put(tempVarBlockBlockstate, tempVarSampleBlockstate);

            int[] sampleData = new int[]{
                    Integer.parseInt(s.split("\\|")[2]),
                    Integer.parseInt(s.split("\\|")[3]),
                    Integer.parseInt(s.split("\\|")[4])
            };
            sampleDataPairs.put(tempVarSampleBlockstate, sampleData);
        }
    }

    public void postInit(FMLPostInitializationEvent postEvent)
    {

    }

    public void onIdMapping(FMLModIdMappingEvent idMappingEvent)
    {

    }

    public void registerFluidBlockRendering(Block block, String name)
    {
        name = name.toLowerCase(Locale.ROOT);
    }

    public EntityPlayer getPlayerClient()
    {
        return null;
    }
}