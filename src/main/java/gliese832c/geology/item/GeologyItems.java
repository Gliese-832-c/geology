package gliese832c.geology.item;

import gliese832c.geology.Geology;
import gliese832c.geology.enums.BlockTypes;
import gliese832c.geology.tab.GeologyTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class GeologyItems {

    public static GeologyItemDamage rockVolcanic;
    public static GeologyItemDamage rockPlutonic;
    public static GeologyItemDamage rockSedimentary;
    public static GeologyItemDamage rockMetasedimentary;
    public static GeologyItemDamage rockMetaigneous;
    public static GeologyItemDamage specialRock;

    public static GeologyItemDamage specialRockShard;

    public static GeologyItemAxe axeFlint, axeChert, axeObsidian, axeNativecopper;
    public static GeologyItemHoe hoeFlint, hoeChert, hoeObsidian, hoeNativecopper;
    public static GeologyItemKnife knifeFlint, knifeChert, knifeObsidian, knifeNativecopper;
    public static GeologyItemPickaxe pickaxeNativecopper;
    public static GeologyItemChisel chiselNativecopper;
    public static GeologyItemHammer hammerNativecopper;



    public static final Item.ToolMaterial ROCK_ITEM = EnumHelper.addToolMaterial("rock_item", 0, 0, 1.0f, 3.0f, 0);
    public static final Item.ToolMaterial GEOLOGY_FLINT = EnumHelper.addToolMaterial("geology_flint", 1, 100, 2.0f, 3.0f, 4);
    public static final Item.ToolMaterial GEOLOGY_CHERT = EnumHelper.addToolMaterial("geology_chert", 1, 100, 2.0f, 3.0f, 4);
    public static final Item.ToolMaterial GEOLOGY_OBSIDIAN = EnumHelper.addToolMaterial("geology_obsidian", 1, 80, 2.5f, 4.0f, 8);
    public static final Item.ToolMaterial GEOLOGY_NATIVECOPPER = EnumHelper.addToolMaterial("geology_nativecopper", 1, 400, 3.0f, 3.0f, 10);



    public static void init() {
        rockVolcanic = createItemGID(new GeologyItemMetaDamage<>(0.0f, -3.7f, ROCK_ITEM, null, BlockTypes.RockVolcanicTypes.class, "rock_item"), "rock_volcanic_item");
        rockPlutonic = createItemGID(new GeologyItemMetaDamage<>(0.0f, -3.7f, ROCK_ITEM, null, BlockTypes.RockPlutonicTypes.class, "rock_item"), "rock_plutonic_item");
        rockSedimentary = createItemGID(new GeologyItemMetaDamage<>(-1.0f, -3.7f, ROCK_ITEM, null, BlockTypes.RockSedimentaryTypes.class, "rock_item"), "rock_sedimentary_item");
        rockMetasedimentary = createItemGID(new GeologyItemMetaDamage<>(0.0f, -3.7f, ROCK_ITEM, null, BlockTypes.RockMetasedimentaryTypes.class, "rock_item"), "rock_metasedimentary_item");
        rockMetaigneous = createItemGID(new GeologyItemMetaDamage<>(0.0f, -3.7f, ROCK_ITEM, null, BlockTypes.RockMetaigneousTypes.class, "rock_item"), "rock_metaigneous_item");

        specialRock = createItemGID(new GeologyItemMetaDamage<>(0.0f, -3.7f, ROCK_ITEM, null, BlockTypes.SpecialRockItemTypes.class, "rock_item"), "special_rock_item");
        specialRockShard = createItemGID(new GeologyItemMetaDamage<>(-1.5f, -3.0f, ROCK_ITEM, null, BlockTypes.SpecialRockItemShard.class, "shard_item"), "special_rock_shard");



        axeFlint = createItemAxe(new GeologyItemAxe(GEOLOGY_FLINT), "axe_flint");
        axeChert = createItemAxe(new GeologyItemAxe(GEOLOGY_CHERT), "axe_chert");
        axeObsidian = createItemAxe(new GeologyItemAxe(GEOLOGY_OBSIDIAN), "axe_obsidian");

        hoeFlint = createItemHoe(new GeologyItemHoe(GEOLOGY_FLINT), "hoe_flint");
        hoeChert = createItemHoe(new GeologyItemHoe(GEOLOGY_CHERT), "hoe_chert");
        hoeObsidian = createItemHoe(new GeologyItemHoe(GEOLOGY_OBSIDIAN), "hoe_obsidian");

        knifeFlint = createItemKnife(new GeologyItemKnife(-1.0f, -2.0f, GEOLOGY_FLINT, null), "knife_flint");
        knifeChert =  createItemKnife(new GeologyItemKnife(-1.0f, -2.0f, GEOLOGY_CHERT, null), "knife_chert");
        knifeObsidian =  createItemKnife(new GeologyItemKnife(-1.0f, -2.0f, GEOLOGY_OBSIDIAN, null), "knife_obsidian");



        axeNativecopper = createItemAxe(new GeologyItemAxe(GEOLOGY_NATIVECOPPER), "axe_nativecopper");
        hoeNativecopper = createItemHoe(new GeologyItemHoe(GEOLOGY_NATIVECOPPER), "hoe_nativecopper");
        knifeNativecopper = createItemKnife(new GeologyItemKnife(-1.0f, -2.0f, GEOLOGY_NATIVECOPPER, null), "knife_nativecopper");
        pickaxeNativecopper = createItemPickaxe(new GeologyItemPickaxe(GEOLOGY_NATIVECOPPER), "pickaxe_nativecopper");
        chiselNativecopper = createItemChisel(new GeologyItemChisel(-1.5f, -2.25f, GEOLOGY_NATIVECOPPER, null), "chisel_nativecopper");
        hammerNativecopper = createItemHammer(new GeologyItemHammer(1.0f, -3.5f, GEOLOGY_NATIVECOPPER, null), "hammer_nativecopper");
    }

    public static void register() {
        registerItem(rockVolcanic, GeologyTabs.ROCKS);
        registerItem(rockPlutonic, GeologyTabs.ROCKS);
        registerItem(rockSedimentary, GeologyTabs.ROCKS);
        registerItem(rockMetasedimentary, GeologyTabs.ROCKS);
        //registerItem(rockMetaigneous, GeologyTabs.ROCKS);

        registerItem(specialRock, GeologyTabs.ROCKS);
        registerItem(specialRockShard, GeologyTabs.MODIFIED);



        registerItem(axeFlint, GeologyTabs.MODIFIED);
        registerItem(axeChert, GeologyTabs.MODIFIED);
        registerItem(axeObsidian, GeologyTabs.MODIFIED);

        registerItem(hoeFlint, GeologyTabs.MODIFIED);
        registerItem(hoeChert, GeologyTabs.MODIFIED);
        registerItem(hoeObsidian, GeologyTabs.MODIFIED);

        registerItem(knifeFlint, GeologyTabs.MODIFIED);
        registerItem(knifeChert, GeologyTabs.MODIFIED);
        registerItem(knifeObsidian, GeologyTabs.MODIFIED);



        registerItem(axeNativecopper, GeologyTabs.MODIFIED);
        registerItem(hoeNativecopper, GeologyTabs.MODIFIED);
        registerItem(knifeNativecopper, GeologyTabs.MODIFIED);
        registerItem(pickaxeNativecopper, GeologyTabs.MODIFIED);
        registerItem(chiselNativecopper, GeologyTabs.MODIFIED);
        registerItem(hammerNativecopper, GeologyTabs.MODIFIED);
    }

    public static void registerRenders() {
        for (int i = 0; i < BlockTypes.RockVolcanicTypes.values().length; ++i) {
            registerRender(rockVolcanic, i, BlockTypes.RockVolcanicTypes.values()[i].getName()); }
        for (int i = 0; i < BlockTypes.RockPlutonicTypes.values().length; ++i) {
            registerRender(rockPlutonic, i, BlockTypes.RockPlutonicTypes.values()[i].getName()); }
        for (int i = 0; i < BlockTypes.RockSedimentaryTypes.values().length; ++i) {
            registerRender(rockSedimentary, i, BlockTypes.RockSedimentaryTypes.values()[i].getName()); }
        for (int i = 0; i < BlockTypes.RockMetasedimentaryTypes.values().length; ++i) {
            registerRender(rockMetasedimentary, i, BlockTypes.RockMetasedimentaryTypes.values()[i].getName()); }
        for (int i = 0; i < BlockTypes.RockMetaigneousTypes.values().length; ++i) {
            registerRender(rockMetaigneous, i, BlockTypes.RockMetaigneousTypes.values()[i].getName()); }

        for (int i = 0; i < BlockTypes.SpecialRockItemTypes.values().length; ++i) {
            registerRender(specialRock, i, BlockTypes.SpecialRockItemTypes.values()[i].getName()); }
        for (int i = 0; i < BlockTypes.SpecialRockItemShard.values().length; ++i) {
            registerRender(specialRockShard, i, BlockTypes.SpecialRockItemShard.values()[i].getName()); }



        registerRender(axeFlint);
        registerRender(axeChert);
        registerRender(axeObsidian);

        registerRender(hoeFlint);
        registerRender(hoeChert);
        registerRender(hoeObsidian);

        registerRender(knifeFlint);
        registerRender(knifeChert);
        registerRender(knifeObsidian);



        registerRender(axeNativecopper);
        registerRender(hoeNativecopper);
        registerRender(knifeNativecopper);
        registerRender(pickaxeNativecopper);
        registerRender(chiselNativecopper);
        registerRender(hammerNativecopper);
    }



    public static <T extends Item> Item createItem(T item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static GeologyItemAxe createItemAxe(GeologyItemAxe item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static GeologyItemHoe createItemHoe(GeologyItemHoe item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static GeologyItemKnife createItemKnife(GeologyItemKnife item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static GeologyItemPickaxe createItemPickaxe(GeologyItemPickaxe item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static GeologyItemChisel createItemChisel(GeologyItemChisel item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static GeologyItemHammer createItemHammer(GeologyItemHammer item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }
    public static <T extends GeologyItemDamage> GeologyItemDamage createItemGID(T item, String name) {
        item.setTranslationKey(Geology.MOD_ID + "." + name).setRegistryName(new ResourceLocation(Geology.MOD_ID, name));
        return item;
    }



    public static void registerItem(Item item, CreativeTabs tab) {
        ForgeRegistries.ITEMS.register(item);
        item.setCreativeTab(tab);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void registerRender(Item item, int meta, String type) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Geology.MOD_ID, "items/" + item.getRegistryName().getPath()), "type=" + type));
    }
}
