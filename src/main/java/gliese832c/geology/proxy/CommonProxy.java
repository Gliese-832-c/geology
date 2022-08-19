package gliese832c.geology.proxy;

import java.util.Locale;

//import lach_01298.qmd.ArmourBonusHandler;
//import lach_01298.qmd.QMDOreDictionary;
//import lach_01298.qmd.block.QMDBlocks;
//import lach_01298.qmd.fluid.QMDFluids;
//import lach_01298.qmd.item.QMDItems;
//import lach_01298.qmd.recipes.QMDRecipes;
import gliese832c.geology.block.GeologyBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModIdMappingEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent preEvent)
    {
        GeologyBlocks.init();

        /*QMDItems.init();
        QMDArmour.init();
        QMDFluids.init();*/

        GeologyBlocks.register();
        /*QMDItems.register();
        QMDArmour.register();
        QMDFluids.register();

        QMDOreDictionary.register();

        QMDPacketHandler.registerMessages(QMD.MOD_ID);

        MinecraftForge.EVENT_BUS.register(new QMDRecipes());*/
    }

    public void init(FMLInitializationEvent event)
    {
        /*MinecraftForge.EVENT_BUS.register(new ArmourBonusHandler());*/
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