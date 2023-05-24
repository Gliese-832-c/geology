package gliese832c.geology.config;

import gliese832c.geology.Geology;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Geology.MOD_ID)
public class GeologyConfig {

    @Config.Comment("Disable all sample generation")
    public static boolean disableAllSampleGeneration = false;

    @Config.Comment("Global multiplier for the chance of placing any given sample. (1 = 100%)")
    // Float Range: 0.0f to 1.0f
    public static float oreSampleChance = 1.0f;

    @Config.Comment("Whitelist of dimensions to generate samples in. (Requires restart.)")
    public static int[] dimension_whitelist = new int[]{
            0
    };

    @Config.Comment("Blockstate-sample pairs. X block will cause the generation of Y sample. The first number is how many blocks you need for one sample, and the second one is an absolute limit on how many samples will spawn. Setting the first number to 0 will make it always attempt to spawn the maximum amount. The third number denotes the minimum amount of blocks that must be present for any samples to spawn at all. All values separated by | character. (Requires restart.)")
    public static String[] blockSamplePairs = new String[] {
            "geology:rock_plutonic:10|geology:rock_plutonic_rocks:10|1000|16|500"
    };



    public static class ConfigHandler
    {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
        {
            if (event.getModID().equalsIgnoreCase(Geology.MOD_ID))
            {
                ConfigManager.sync(Geology.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}