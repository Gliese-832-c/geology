package gliese832c.geology;

//import lach_01298.qmd.capabilities.CapabilityParticleStackHandler;
//import lach_01298.qmd.config.QMDConfig;
//import lach_01298.qmd.gui.GUIHandler;
import gliese832c.geology.proxy.CommonProxy;
//import lach_01298.qmd.util.Util;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLModIdMappingEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Geology.MOD_ID, name = Geology.MOD_NAME, version = Geology.VERSION, acceptedMinecraftVersions = Geology.MCVERSION)
public class Geology {
    public static final String MOD_NAME = "Geology";
    public static final String MOD_ID = "geology";
    public static final String VERSION = "@VERSION@";
    public static final String MCVERSION = "1.12.2";



    @Instance(MOD_ID)
    public static Geology instance;


    @SidedProxy(clientSide = "gliese832c.geology.proxy.ClientProxy", serverSide = "gliese832c.geology.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Util.getLogger().info("PreInitialization");
        //QMDConfig.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Util.getLogger().info("Initialization");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //Util.getLogger().info("PostInitialization");
        proxy.postInit(event);
    }



    @EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        //Util.getLogger().info("Server Load");
    }

    @EventHandler
    public void onIdMapping(FMLModIdMappingEvent idMappingEvent)
    {
        proxy.onIdMapping(idMappingEvent);
    }
}