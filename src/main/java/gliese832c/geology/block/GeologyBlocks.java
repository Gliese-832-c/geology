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

    public static Block rockVolcanic;
    public static Block rockPlutonic;
    public static Block rockIgneous;

    public static void init()
    {
        rockVolcanic = withName(new BlockRockVolcanic(), "rock_volcanic");
        rockPlutonic = withName(new BlockRockPlutonic(), "rock_plutonic");
        rockIgneous = withName(new BlockRockIgneous(), "rock_igneous_others");
    }

    public static void register()
    {
        registerBlock(rockVolcanic, new ItemBlockMeta(rockVolcanic, BlockTypes.RockVolcanicTypes.class));
        registerBlock(rockPlutonic, new ItemBlockMeta(rockPlutonic, BlockTypes.RockPlutonicTypes.class));
        //registerBlock(rockIgneous, new ItemBlockMeta(rockIgneous, BlockTypes.RockIgneousTypes.class));
    }

    public static void registerRenders()
    {
        for (int i=0; i < BlockTypes.RockVolcanicTypes.values().length; i++) {
            registerRender(rockVolcanic, i, BlockTypes.RockVolcanicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockPlutonicTypes.values().length; i++) {
            registerRender(rockPlutonic, i, BlockTypes.RockPlutonicTypes.values()[i].getName());
        }
        for (int i=0; i < BlockTypes.RockIgneousTypes.values().length; i++) {
            registerRender(rockIgneous, i, BlockTypes.RockIgneousTypes.values()[i].getName());
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
