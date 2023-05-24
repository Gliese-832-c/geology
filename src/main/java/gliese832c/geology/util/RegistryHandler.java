package gliese832c.geology.util;

import gliese832c.geology.world.WorldGen;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {


    static WorldGen generator = new WorldGen();

    @SubscribeEvent
    public static void onBiomeDecoPost(DecorateBiomeEvent.Post event) {
        generator.generate(event.getRand(), event.getChunkPos().x, event.getChunkPos().z , event.getWorld(), null, null);
    }

    public static void InitRegistries(FMLInitializationEvent e) {
        //GameRegistry.registerWorldGenerator(new WorldGen(), 999);
    }
}