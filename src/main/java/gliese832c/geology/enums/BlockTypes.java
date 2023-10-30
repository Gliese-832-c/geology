package gliese832c.geology.enums;

import gliese832c.geology.enums.IBlockMetaEnum;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;

public class BlockTypes
{
    public static float hardnessMultiplier = 1.0f;
    public static float resistanceMultiplier = 1.0f;



    public enum RockVolcanicTypes implements IStringSerializable, IBlockMetaEnum
    {
        RHYOLITE("rhyolite", 0, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        DACITE("dacite", 1, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        ANDESITE("andesite", 2, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        BASALTIC_ANDESITE("basaltic_andesite", 3, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        BASALT("basalt", 4, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        PICRITE("picrite", 5, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),

        OBSIDIAN("obsidian", 6, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 1),
        AMYGDALOIDAL_BASALT("amygdaloidal_basalt", 7, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        KOMATIITE("komatiite", 8, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockVolcanicTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockPlutonicTypes implements IStringSerializable, IBlockMetaEnum
    {
        GRANITE("granite", 0, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        GRANODIORITE("granodiorite", 1, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        DIORITE("diorite", 2, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        GABBRO("gabbro", 3, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        PERIDOTITE("peridotite", 4, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),

        ANORTHOSITE("anorthosite", 5, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        DIABASE("diabase", 6, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        NORITE("norite", 7, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        TROCTOLITE("troctolite", 8, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        DUNITE("dunite", 9, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        KIMBERLITE("kimberlite", 10, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        PYROXENITE("pyroxenite", 11, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockPlutonicTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockSedimentaryTypes implements IStringSerializable, IBlockMetaEnum
    {
        LIMESTONE("limestone", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        CHALK("chalk", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        DOLOMITE("dolomite", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        MARLSTONE("marlstone", 3, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),

        SHALE("shale", 4, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        CLAYSTONE("claystone", 5, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        MUDSTONE("mudstone", 6, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        SILTSTONE("siltstone", 7, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        SANDSTONE("sandstone", 8, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        RED_SANDSTONE("red_sandstone", 9, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        CONGLOMERATE("conglomerate", 10, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        GRAYWACKE("graywacke", 11, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockSedimentaryTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockSedimentaryTypes2 implements IStringSerializable, IBlockMetaEnum
    {
        SHALE_RED("shale_red", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        SHALE_BLACK("shale_black", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        SANDSTONE_GRAY("sandstone_gray", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        INTERBEDDED_GRAY("interbedded_gray", 3, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        INTERBEDDED_RED("interbedded_red", 4, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        INTERBEDDED_THIN("interbedded_thin", 5, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        CROSSBEDDED_GRAY("crossbedded_gray", 6, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        LIMESTONE_STRATIFORM("limestone_stratiform", 7, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        DOLOMITE_STRATIFORM("dolomite_stratiform", 8, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockSedimentaryTypes2(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockUnconsolidatedTypes implements IStringSerializable, IBlockMetaEnum
    {
        TILL("till", 0, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        FLUVIAL_SEDIMENT("fluvial_sediment", 1, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        ALLUVIUM("alluvium", 2, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        LOESS("loess", 3, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        DIATOMACEOUS_EARTH("diatomaceous_earth", 4, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        MARL("marl", 5, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockUnconsolidatedTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockIgneousTypes implements IStringSerializable, IBlockMetaEnum
    {
        PUMICE("pumice", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2),
        SCORIA("scoria", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2),

        RHYOLITIC_TUFF("rhyolitic_tuff", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2),
        DACITIC_TUFF("dacitic_tuff", 3, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2),
        ANDESITIC_TUFF("andesitic_tuff", 4, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2),
        BASALTIC_TUFF("basaltic_tuff", 5, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2),
        KOMATIITIC_TUFF("komatiitic_tuff", 6, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 2);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockIgneousTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockMetasedimentaryTypes implements IStringSerializable, IBlockMetaEnum
    {
        // Mudrock series
        SLATE("slate", 0, hardnessMultiplier * 30.0f, resistanceMultiplier * 5.0f, 1),
        PHYLLITE("phyllite", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        SCHIST("schist", 2, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        PARAGNEISS("paragneiss", 3, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        MIGMATITE("migmatite", 4, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),

        // Others
        QUARTZITE("quartzite", 5, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        METACONGLOMERATE("metaconglomerate", 6, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),

        // Marble types
        MARBLE("marble", 7, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 1),
        MARBLE_BLACK("marble_black", 8, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 1),
        MARBLE_PINK("marble_pink", 9, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 1),
        MARBLE_GREEN("marble_green", 10, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 1);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockMetasedimentaryTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum RockMetaigneousTypes implements IStringSerializable, IBlockMetaEnum
    {
        GREENSCHIST("greenschist", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        BLUESCHIST("blueschist", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        AMPHIBOLITE("amphibolite", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        GRANULITE("granulite", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        ECLOGITE("eclogite", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),

        ORTHOGNEISS("orthogneiss", 0, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        HORNFELS("hornfels", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),

        SKARN("skarn", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),
        SERPENTINITE("serpentinite", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2),

        SUEVITE("suevite", 1, hardnessMultiplier * 40.0f, resistanceMultiplier * 5.0f, 2);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private RockMetaigneousTypes(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }





    public enum SpecialRockRocks implements IStringSerializable, IBlockMetaEnum
    {
        FLINT("flint", 0, hardnessMultiplier * 30.0f, resistanceMultiplier * 5.0f, 0),
        CHERT("chert", 1, hardnessMultiplier * 30.0f, resistanceMultiplier * 5.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private SpecialRockRocks(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }





    public enum SpecialRockFlint implements IStringSerializable, IBlockMetaEnum
    {
        NODULAR_CHALK("nodular_chalk", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        NODULAR_MARLSTONE("nodular_marlstone", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        NODULAR_LIMESTONE("nodular_limestone", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private SpecialRockFlint(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }





    public enum SpecialRockChert implements IStringSerializable, IBlockMetaEnum
    {
        BEDDED("bedded", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        NODULAR_LIMESTONE("nodular_limestone", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        NODULAR_SHALE("nodular_shale", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 1),
        NODULAR_RED_SANDSTONE("nodular_red_sandstone", 3, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        NODULAR_SANDSTONE("nodular_sandstone", 4, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        NODULAR_DOLOMITE("nodular_dolomite", 5, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private SpecialRockChert(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }





    public enum SpecialRockItemTypes implements IStringSerializable, IBlockMetaEnum
    {
        FLINT("flint", 0),
        CHERT("chert", 1);


        private String name;
        private int id;


        private SpecialRockItemTypes(String name, int id)
        {
            this.name = name;
            this.id = id;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public int getHarvestLevel() { return 0; }
        @Override
        public String getHarvestTool() { return null; }
        @Override
        public float getHardness() { return 0; }
        @Override
        public float getResistance() { return 0; }
        @Override
        public int getLightValue() { return 0; }
    }





    public enum SpecialRockItemShard implements IStringSerializable, IBlockMetaEnum
    {
        FLINT("flint", 0),
        CHERT("chert", 1),
        OBSIDIAN("obsidian", 2);


        private String name;
        private int id;


        private SpecialRockItemShard(String name, int id)
        {
            this.name = name;
            this.id = id;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public int getHarvestLevel() { return 0; }
        @Override
        public String getHarvestTool() { return null; }
        @Override
        public float getHardness() { return 0; }
        @Override
        public float getResistance() { return 0; }
        @Override
        public int getLightValue() { return 0; }
    }















    public enum MineralsCoal implements IStringSerializable, IBlockMetaEnum
    {
        LIGNITE("lignite", 0, hardnessMultiplier * 10.0f, resistanceMultiplier * 5.0f, 0),
        SUB_BITUMINOUS("sub_bituminous", 1, hardnessMultiplier * 15.0f, resistanceMultiplier * 5.0f, 0),
        BITUMINOUS("bituminous", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        ANTHRACITE("anthracite", 3, hardnessMultiplier * 25.0f, resistanceMultiplier * 5.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsCoal(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsBasaltic implements IStringSerializable, IBlockMetaEnum
    {
        CUPRIFEROUS_BASALT("cupriferous_basalt", 0, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        CUPRIFEROUS_AMYGDALOIDAL_BASALT("cupriferous_amygdaloidal_basalt", 1, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsBasaltic(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsGravel implements IStringSerializable, IBlockMetaEnum
    {
        CASSITERITE("cassiterite", 0, 0.6f, 0.6f, -1),
        GOLD("gold", 1, 0.6f, 0.6f, -1),
        PYRITE("pyrite", 2, 0.6f, 0.6f, -1);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsGravel(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "shovel";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsSand implements IStringSerializable, IBlockMetaEnum
    {
        DESERT("desert", 0, 0.4f, 0.4f, -1),
        QUARTZ("quartz", 1, 0.4f, 0.4f, -1),
        MAGNETITE("magnetite", 2, 0.4f, 0.4f, -1);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsSand(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "shovel";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsCarbonatehosted implements IStringSerializable, IBlockMetaEnum
    {
        MALACHITE("malachite", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        MALACHITE_POOR("malachite_poor", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        GALENA_LIMESTONE("galena_limestone", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        GALENA_LIMESTONE_POOR("galena_limestone_poor", 3, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        GALENA_MARLSTONE("galena_marlstone", 4, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        GALENA_MARLSTONE_POOR("galena_marlstone_poor", 5, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        GALENA_DOLOMITE("galena_dolomite", 6, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        GALENA_DOLOMITE_POOR("galena_dolomite_poor", 7, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        MAGNETITE_SKARN("magnetite_skarn", 8, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsCarbonatehosted(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsMagmatic implements IStringSerializable, IBlockMetaEnum
    {
        TITANOMAGNETITE("titanomagnetite", 0, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        CHROMITITE_MERENSKY("chromitite_merensky", 1, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        CHROMITITE_PYROXENITE_RICH("chromitite_pyroxenite_rich", 2, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        CHROMITITE_ANORTHOSITE("chromitite_anorthosite", 3, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        CHROMITITE_PYROXENITE("chromitite_pyroxenite", 4, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2),
        CHROMITITE("chromitite", 5, hardnessMultiplier * 50.0f, resistanceMultiplier * 5.0f, 2);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsMagmatic(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsMuddy implements IStringSerializable, IBlockMetaEnum
    {
        PEAT("peat", 0, 3.0f, 0.5f, -1),
        BOG_IRON_MUD("bog_iron_mud", 1, 3.0f, 0.5f, -1);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsMuddy(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        //@Override
        //public String getHarvestTool()
        //{
        //    return "shovel";
        //}
        @Override
        public String getHarvestTool()
        {
            return null;
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsPile implements IStringSerializable, IBlockMetaEnum
    {
        METEORIC_IRON_SMALL("meteoric_iron_small", 0, 1.0f, 0.25f, -1, new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0, 4.0 / 16.0, 12.0 / 16.0, 6.0 / 16.0, 12.0 / 16.0), true),
        METEORIC_IRON("meteoric_iron", 1, 2.0f, 0.25f, -1, new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0, 4.0 / 16.0, 12.0 / 16.0, 8.0 / 16.0, 12.0 / 16.0), true),
        METEORIC_IRON_PRISTINE("meteoric_iron_pristine", 2, 1.0f, 0.25f, -1, new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0, 4.0 / 16.0, 12.0 / 16.0, 6.0 / 16.0, 12.0 / 16.0), true),

        NATIVE_COPPER("native_copper", 3, 0.5f, 0.25f, -1, new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0, 4.0 / 16.0, 12.0 / 16.0, 2.0 / 16.0, 12.0 / 16.0), false),
        NATIVE_COPPER_LARGE("native_copper_large", 4, 1.0f, 0.25f, -1, new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0, 4.0 / 16.0, 12.0 / 16.0, 3.0 / 16.0, 12.0 / 16.0), false),
        NATIVE_COPPER_BOULDER("native_copper_boulder", 5, 5.0f, 0.25f, -1, new AxisAlignedBB(4.0 / 16.0, 0.0 / 16.0, 4.0 / 16.0, 12.0 / 16.0, 8.0 / 16.0, 12.0 / 16.0), true);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;
        private AxisAlignedBB AABB;
        private boolean playerCollision;


        private MineralsPile(String name, int id, float hardness, float resistance, int harvestLevel, AxisAlignedBB AABB, boolean playerCollision)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
            this.AABB = AABB;
            this.playerCollision = playerCollision;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        public AxisAlignedBB getAABB()
        {
            return AABB;
        }

        public boolean getPlayerCollision()
        {
            return playerCollision;
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsUnconsolidated implements IStringSerializable, IBlockMetaEnum
    {
        BOG_IRON("bog_iron", 0, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        LIMONITE("limonite", 1, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        BAUXITE("bauxite", 2, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0),
        GARNIERITE("garnierite", 3, hardnessMultiplier * 10.0f, resistanceMultiplier * 2.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsUnconsolidated(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }



    public enum MineralsSedimentary implements IStringSerializable, IBlockMetaEnum
    {
        BANDED_IRON("banded_iron", 0, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        BANDED_IRON_RICH("banded_iron_rich", 1, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        TACONITE("taconite", 2, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        BEDDED_IRON("bedded_iron", 3, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0),
        SIDERITE("siderite", 4, hardnessMultiplier * 20.0f, resistanceMultiplier * 5.0f, 0);


        private String name;
        private int id;
        private float hardness;
        private float resistance;
        private int harvestLevel;


        private MineralsSedimentary(String name, int id, float hardness, float resistance, int harvestLevel)
        {
            this.name = name;
            this.id = id;
            this.hardness = hardness;
            this.resistance = resistance;
            this.harvestLevel = harvestLevel;
        }

        @Override
        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return getName();
        }

        public int getID()
        {
            return id;
        }

        @Override
        public float getHardness()
        {
            return hardness;
        }

        @Override
        public float getResistance()
        {
            return resistance;
        }

        @Override
        public int getHarvestLevel()
        {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool()
        {
            return "pickaxe";
        }

        @Override
        public int getLightValue() {
            return 0;
        }
    }
}