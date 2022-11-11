package gliese832c.geology.block;

import gliese832c.geology.Geology;
import gliese832c.geology.block.item.ItemBlockMeta;
import gliese832c.geology.enums.BlockTypes;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class GeologyBlocks {

    public static Block rockVolcanic, rockPlutonic, rockSedimentary, rockMetasedimentary, rockMetaigneous;
    // public static Block rockIgneous;
    public static Block rockVolcanicCracked, rockPlutonicCracked, rockSedimentaryCracked, rockMetasedimentaryCracked, rockMetaigneousCracked;
    // public static Block rockIgneousCracked;
    public static Block rockVolcanicPolished, rockPlutonicPolished, rockSedimentaryPolished, rockMetasedimentaryPolished, rockMetaigneousPolished;
    public static Block rockVolcanicBricks, rockPlutonicBricks, rockSedimentaryBricks, rockMetasedimentaryBricks, rockMetaigneousBricks;
    public static Block rockVolcanicBoulder, rockPlutonicBoulder, rockSedimentaryBoulder, rockMetasedimentaryBoulder, rockMetaigneousBoulder;
    public static Block rockVolcanicRocks, rockPlutonicRocks, rockSedimentaryRocks, rockMetasedimentaryRocks, rockMetaigneousRocks;

    public static void init()
    {
        rockVolcanic = withName(new BlockRockVolcanic(), "rock_volcanic");
        rockPlutonic = withName(new BlockRockPlutonic(), "rock_plutonic");
        rockSedimentary = withName(new BlockRockSedimentary(), "rock_sedimentary");
        rockMetasedimentary = withName(new BlockRockMetasedimentary(), "rock_metasedimentary");
        rockMetaigneous = withName(new BlockRockMetaigneous(), "rock_metaigneous");
        //rockIgneous = withName(new BlockRockIgneous(), "rock_igneous_others");

        rockVolcanicCracked = withName(new BlockRockVolcanicCracked(), "rock_volcanic_cracked");
        rockPlutonicCracked = withName(new BlockRockPlutonicCracked(), "rock_plutonic_cracked");
        rockSedimentaryCracked = withName(new BlockRockSedimentaryCracked(), "rock_sedimentary_cracked");
        rockMetasedimentaryCracked = withName(new BlockRockMetasedimentaryCracked(), "rock_metasedimentary_cracked");
        rockMetaigneousCracked = withName(new BlockRockMetaigneousCracked(), "rock_metaigneous_cracked");
        //rockIgneousCracked = withName(new BlockRockIgneousCracked(), "rock_igneous_others_cracked");

        rockVolcanicPolished = withName(new BlockRockVolcanicPolished(), "rock_volcanic_polished");
        rockPlutonicPolished = withName(new BlockRockPlutonicPolished(), "rock_plutonic_polished");
        rockSedimentaryPolished = withName(new BlockRockSedimentaryPolished(), "rock_sedimentary_polished");
        rockMetasedimentaryPolished = withName(new BlockRockMetasedimentaryPolished(), "rock_metasedimentary_polished");
        rockMetaigneousPolished = withName(new BlockRockMetaigneousPolished(), "rock_metaigneous_polished");

        rockVolcanicBricks = withName(new BlockRockVolcanicBricks(), "rock_volcanic_bricks");
        rockPlutonicBricks = withName(new BlockRockPlutonicBricks(), "rock_plutonic_bricks");
        rockSedimentaryBricks = withName(new BlockRockSedimentaryBricks(), "rock_sedimentary_bricks");
        rockMetasedimentaryBricks = withName(new BlockRockMetasedimentaryBricks(), "rock_metasedimentary_bricks");
        rockMetaigneousBricks = withName(new BlockRockMetaigneousBricks(), "rock_metaigneous_bricks");

        rockVolcanicBoulder = withName(new BlockRockVolcanicBoulder(), "rock_volcanic_boulder");
        rockPlutonicBoulder = withName(new BlockRockPlutonicBoulder(), "rock_plutonic_boulder");
        rockSedimentaryBoulder = withName(new BlockRockSedimentaryBoulder(), "rock_sedimentary_boulder");
        rockMetasedimentaryBoulder = withName(new BlockRockMetasedimentaryBoulder(), "rock_metasedimentary_boulder");
        rockMetaigneousBoulder = withName(new BlockRockMetaigneousBoulder(), "rock_metaigneous_boulder");

        rockVolcanicRocks = withName(new BlockRockVolcanicRocks(), "rock_volcanic_rocks");
        rockPlutonicRocks = withName(new BlockRockPlutonicRocks(), "rock_plutonic_rocks");
        rockSedimentaryRocks = withName(new BlockRockSedimentaryRocks(), "rock_sedimentary_rocks");
        rockMetasedimentaryRocks = withName(new BlockRockMetasedimentaryRocks(), "rock_metasedimentary_rocks");
        rockMetaigneousRocks = withName(new BlockRockMetaigneousRocks(), "rock_metaigneous_rocks");
    }

    public static void register()
    {
        registerBlock(rockVolcanic, new ItemBlockMeta(rockVolcanic, BlockTypes.RockVolcanicTypes.class, ""));
        registerBlock(rockPlutonic, new ItemBlockMeta(rockPlutonic, BlockTypes.RockPlutonicTypes.class, ""));
        registerBlock(rockSedimentary, new ItemBlockMeta(rockSedimentary, BlockTypes.RockSedimentaryTypes.class, ""));
        registerBlock(rockMetasedimentary, new ItemBlockMeta(rockMetasedimentary, BlockTypes.RockMetasedimentaryTypes.class, ""));
        registerBlock(rockMetaigneous, new ItemBlockMeta(rockMetaigneous, BlockTypes.RockMetaigneousTypes.class, ""));
        //registerBlock(rockIgneous, new ItemBlockMeta(rockIgneous, BlockTypes.RockIgneousTypes.class));

        registerBlock(rockVolcanicCracked, new ItemBlockMeta(rockVolcanicCracked, BlockTypes.RockVolcanicTypes.class, "cracked"));
        registerBlock(rockPlutonicCracked, new ItemBlockMeta(rockPlutonicCracked, BlockTypes.RockPlutonicTypes.class, "cracked"));
        registerBlock(rockSedimentaryCracked, new ItemBlockMeta(rockSedimentaryCracked, BlockTypes.RockSedimentaryTypes.class, "cracked"));
        registerBlock(rockMetasedimentaryCracked, new ItemBlockMeta(rockMetasedimentaryCracked, BlockTypes.RockMetasedimentaryTypes.class, "cracked"));
        registerBlock(rockMetaigneousCracked, new ItemBlockMeta(rockMetaigneousCracked, BlockTypes.RockMetaigneousTypes.class, "cracked"));

        registerBlock(rockVolcanicPolished, new ItemBlockMeta(rockVolcanicPolished, BlockTypes.RockVolcanicTypes.class, "polished"));
        registerBlock(rockPlutonicPolished, new ItemBlockMeta(rockPlutonicPolished, BlockTypes.RockPlutonicTypes.class, "polished"));
        registerBlock(rockSedimentaryPolished, new ItemBlockMeta(rockSedimentaryPolished, BlockTypes.RockSedimentaryTypes.class, "polished"));
        registerBlock(rockMetasedimentaryPolished, new ItemBlockMeta(rockMetasedimentaryPolished, BlockTypes.RockMetasedimentaryTypes.class, "polished"));
        registerBlock(rockMetaigneousPolished, new ItemBlockMeta(rockMetaigneousPolished, BlockTypes.RockMetaigneousTypes.class, "polished"));

        registerBlock(rockVolcanicBricks, new ItemBlockMeta(rockVolcanicBricks, BlockTypes.RockVolcanicTypes.class, "bricks"));
        registerBlock(rockPlutonicBricks, new ItemBlockMeta(rockPlutonicBricks, BlockTypes.RockPlutonicTypes.class, "bricks"));
        registerBlock(rockSedimentaryBricks, new ItemBlockMeta(rockSedimentaryBricks, BlockTypes.RockSedimentaryTypes.class, "bricks"));
        registerBlock(rockMetasedimentaryBricks, new ItemBlockMeta(rockMetasedimentaryBricks, BlockTypes.RockMetasedimentaryTypes.class, "bricks"));
        registerBlock(rockMetaigneousBricks, new ItemBlockMeta(rockMetaigneousBricks, BlockTypes.RockMetaigneousTypes.class, "bricks"));

        registerBlock(rockVolcanicBoulder, new ItemBlockMeta(rockVolcanicBoulder, BlockTypes.RockVolcanicTypes.class, "boulder"));
        registerBlock(rockPlutonicBoulder, new ItemBlockMeta(rockPlutonicBoulder, BlockTypes.RockPlutonicTypes.class, "boulder"));
        registerBlock(rockSedimentaryBoulder, new ItemBlockMeta(rockSedimentaryBoulder, BlockTypes.RockSedimentaryTypes.class, "boulder"));
        registerBlock(rockMetasedimentaryBoulder, new ItemBlockMeta(rockMetasedimentaryBoulder, BlockTypes.RockMetasedimentaryTypes.class, "boulder"));
        registerBlock(rockMetaigneousBoulder, new ItemBlockMeta(rockMetaigneousBoulder, BlockTypes.RockMetaigneousTypes.class, "boulder"));

        registerBlock(rockVolcanicRocks, new ItemBlockMeta(rockVolcanicRocks, BlockTypes.RockVolcanicTypes.class, "rocks"));
        registerBlock(rockPlutonicRocks, new ItemBlockMeta(rockPlutonicRocks, BlockTypes.RockPlutonicTypes.class, "rocks"));
        registerBlock(rockSedimentaryRocks, new ItemBlockMeta(rockSedimentaryRocks, BlockTypes.RockSedimentaryTypes.class, "rocks"));
        registerBlock(rockMetasedimentaryRocks, new ItemBlockMeta(rockMetasedimentaryRocks, BlockTypes.RockMetasedimentaryTypes.class, "rocks"));
        registerBlock(rockMetaigneousRocks, new ItemBlockMeta(rockMetaigneousRocks, BlockTypes.RockMetaigneousTypes.class, "rocks"));
    }

    public static void registerRenders()
    {
        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanic, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonic, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentary, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetasedimentaryTypes.values().length; i++) {
            registerRender(rockMetasedimentary, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetaigneousTypes.values().length; i++) {
            registerRender(rockMetaigneous, i, BlockTypes.RockMetaigneousTypes.values()[i].getName());
        }
        //for (int i=0; i < BlockTypes.RockIgneousTypes.values().length; i++) {
        //    registerRender(rockIgneous, i, BlockTypes.RockIgneousTypes.values()[i].getName());
        //}



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicCracked, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicCracked, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryCracked, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetasedimentaryTypes.values().length; i++) {
            registerRender(rockMetasedimentaryCracked, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetaigneousTypes.values().length; i++) {
            registerRender(rockMetaigneousCracked, i, BlockTypes.RockMetaigneousTypes.values()[i].getName());
        }



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicPolished, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicPolished, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryPolished, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetasedimentaryTypes.values().length; i++) {
            registerRender(rockMetasedimentaryPolished, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetaigneousTypes.values().length; i++) {
            registerRender(rockMetaigneousPolished, i, BlockTypes.RockMetaigneousTypes.values()[i].getName());
        }



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicBricks, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicBricks, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryBricks, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetasedimentaryTypes.values().length; i++) {
            registerRender(rockMetasedimentaryBricks, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetaigneousTypes.values().length; i++) {
            registerRender(rockMetaigneousBricks, i, BlockTypes.RockMetaigneousTypes.values()[i].getName());
        }



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicBoulder, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicBoulder, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryBoulder, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetasedimentaryTypes.values().length; i++) {
            registerRender(rockMetasedimentaryBoulder, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetaigneousTypes.values().length; i++) {
            registerRender(rockMetaigneousBoulder, i, BlockTypes.RockMetaigneousTypes.values()[i].getName());
        }



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicRocks, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicRocks, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryRocks, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetasedimentaryTypes.values().length; i++) {
            registerRender(rockMetasedimentaryRocks, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockMetaigneousTypes.values().length; i++) {
            registerRender(rockMetaigneousRocks, i, BlockTypes.RockMetaigneousTypes.values()[i].getName());
        }
    }




    public static Block withName(Block block, String name) {
        return block.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
    }

    /*public static <T extends Block & ITileType> Block withName(T block) {
        return block.setTranslationKey(Geology.MOD_ID + "." + block.getTileName()).setRegistryName(new ResourceLocation(Geology.MOD_ID, block.getTileName()));
    }*/

    public static String fixedLine(String name) {
        return "tile." + Geology.MOD_ID + "." + name + ".fixd";
    }

    public static String infoLine(String name) {
        return "tile." + Geology.MOD_ID + "." + name + ".desc";
    }

    public static void registerBlock(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ItemBlock itemBlock = new ItemBlock(block);
        ForgeRegistries.ITEMS.register(itemBlock.setRegistryName(block.getRegistryName()));
    }

    public static void registerBlock(Block block, ItemBlock itemBlock) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock.setRegistryName(block.getRegistryName()));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    public static void registerRender(Block block, int meta, String type) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Geology.MOD_ID, block.getRegistryName().getPath()), "type=" + type));
    }
}
