package gliese832c.geology.proxy;

import java.util.Locale;

//import lach_01298.qmd.ArmourBonusHandler;
//import lach_01298.qmd.QMDOreDictionary;
//import lach_01298.qmd.block.QMDBlocks;
//import lach_01298.qmd.fluid.QMDFluids;
//import lach_01298.qmd.item.QMDItems;
//import lach_01298.qmd.recipes.QMDRecipes;
import gliese832c.geology.block.GeologyBlocks;
import gliese832c.geology.block.rocks.BlockRockVolcanic;
import gliese832c.geology.enums.BlockTypes;
import gliese832c.geology.item.GeologyItems;
import gliese832c.geology.world.gen.VeinGenerator;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModIdMappingEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
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