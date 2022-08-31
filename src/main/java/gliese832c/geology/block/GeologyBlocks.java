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

    public static Block rockVolcanic, rockPlutonic, rockSedimentary;
    // public static Block rockIgneous;
    public static Block rockVolcanicCracked, rockPlutonicCracked, rockSedimentaryCracked;
    // public static Block rockIgneousCracked;
    public static Block rockVolcanicPolished, rockPlutonicPolished, rockSedimentaryPolished;
    public static Block rockVolcanicBricks, rockPlutonicBricks, rockSedimentaryBricks;
    public static Block rockVolcanicBoulder, rockPlutonicBoulder, rockSedimentaryBoulder;

    public static void init()
    {
        rockVolcanic = withName(new BlockRockVolcanic(), "rock_volcanic");
        rockPlutonic = withName(new BlockRockPlutonic(), "rock_plutonic");
        rockSedimentary = withName(new BlockRockSedimentary(), "rock_sedimentary");
        //rockIgneous = withName(new BlockRockIgneous(), "rock_igneous_others");

        rockVolcanicCracked = withName(new BlockRockVolcanicCracked(), "rock_volcanic_cracked");
        rockPlutonicCracked = withName(new BlockRockPlutonicCracked(), "rock_plutonic_cracked");
        rockSedimentaryCracked = withName(new BlockRockSedimentaryCracked(), "rock_sedimentary_cracked");
        //rockIgneousCracked = withName(new BlockRockIgneousCracked(), "rock_igneous_others_cracked");

        rockVolcanicPolished = withName(new BlockRockVolcanicPolished(), "rock_volcanic_polished");
        rockPlutonicPolished = withName(new BlockRockPlutonicPolished(), "rock_plutonic_polished");
        rockSedimentaryPolished = withName(new BlockRockSedimentaryPolished(), "rock_sedimentary_polished");

        rockVolcanicBricks = withName(new BlockRockVolcanicBricks(), "rock_volcanic_bricks");
        rockPlutonicBricks = withName(new BlockRockPlutonicBricks(), "rock_plutonic_bricks");
        rockSedimentaryBricks = withName(new BlockRockSedimentaryBricks(), "rock_sedimentary_bricks");

        rockVolcanicBoulder= withName(new BlockRockVolcanicBoulder(), "rock_volcanic_boulder");
        rockPlutonicBoulder = withName(new BlockRockPlutonicBoulder(), "rock_plutonic_boulder");
        rockSedimentaryBoulder = withName(new BlockRockSedimentaryBoulder(), "rock_sedimentary_boulder");
    }

    public static void register()
    {
        registerBlock(rockVolcanic, new ItemBlockMeta(rockVolcanic, BlockTypes.RockVolcanicTypes.class, ""));
        registerBlock(rockPlutonic, new ItemBlockMeta(rockPlutonic, BlockTypes.RockPlutonicTypes.class, ""));
        registerBlock(rockSedimentary, new ItemBlockMeta(rockSedimentary, BlockTypes.RockSedimentaryTypes.class, ""));
        //registerBlock(rockIgneous, new ItemBlockMeta(rockIgneous, BlockTypes.RockIgneousTypes.class));

        registerBlock(rockVolcanicCracked, new ItemBlockMeta(rockVolcanicCracked, BlockTypes.RockVolcanicTypes.class, "cracked"));
        registerBlock(rockPlutonicCracked, new ItemBlockMeta(rockPlutonicCracked, BlockTypes.RockPlutonicTypes.class, "cracked"));
        registerBlock(rockSedimentaryCracked, new ItemBlockMeta(rockSedimentaryCracked, BlockTypes.RockSedimentaryTypes.class, "cracked"));
        //registerBlock(rockIgneous, new ItemBlockMeta(rockIgneous, BlockTypes.RockIgneousTypes.class));

        registerBlock(rockVolcanicPolished, new ItemBlockMeta(rockVolcanicPolished, BlockTypes.RockVolcanicTypes.class, "polished"));
        registerBlock(rockPlutonicPolished, new ItemBlockMeta(rockPlutonicPolished, BlockTypes.RockPlutonicTypes.class, "polished"));
        registerBlock(rockSedimentaryPolished, new ItemBlockMeta(rockSedimentaryPolished, BlockTypes.RockSedimentaryTypes.class, "polished"));
        //registerBlock(rockIgneous, new ItemBlockMeta(rockIgneous, BlockTypes.RockIgneousTypes.class));

        registerBlock(rockVolcanicBricks, new ItemBlockMeta(rockVolcanicBricks, BlockTypes.RockVolcanicTypes.class, "bricks"));
        registerBlock(rockPlutonicBricks, new ItemBlockMeta(rockPlutonicBricks, BlockTypes.RockPlutonicTypes.class, "bricks"));
        registerBlock(rockSedimentaryBricks, new ItemBlockMeta(rockSedimentaryBricks, BlockTypes.RockSedimentaryTypes.class, "bricks"));
        //registerBlock(rockIgneous, new ItemBlockMeta(rockIgneous, BlockTypes.RockIgneousTypes.class));

        registerBlock(rockVolcanicBoulder, new ItemBlockMeta(rockVolcanicBoulder, BlockTypes.RockVolcanicTypes.class, "boulder"));
        registerBlock(rockPlutonicBoulder, new ItemBlockMeta(rockPlutonicBoulder, BlockTypes.RockPlutonicTypes.class, "boulder"));
        registerBlock(rockSedimentaryBoulder, new ItemBlockMeta(rockSedimentaryBoulder, BlockTypes.RockSedimentaryTypes.class, "boulder"));
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
        //for (int i=0; i < BlockTypes.RockIgneousTypes.values().length; i++) {
        //    registerRender(rockIgneous, i, BlockTypes.RockIgneousTypes.values()[i].getName());
        //}



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicPolished, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicPolished, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryPolished, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
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



        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanicBoulder, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonicBoulder, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockSedimentaryTypes.values().length; i++) {
            registerRender(rockSedimentaryBoulder, i, BlockTypes.RockSedimentaryTypes.values()[i].getName());
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
