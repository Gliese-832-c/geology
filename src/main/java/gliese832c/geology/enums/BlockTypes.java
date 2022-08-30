package gliese832c.geology.enums;

import gliese832c.geology.enums.IBlockMetaEnum;
import net.minecraft.util.IStringSerializable;

public class BlockTypes
{
    public enum RockVolcanicTypes implements IStringSerializable, IBlockMetaEnum
    {
        RHYOLITE("rhyolite", 0, 5.0f, 30.0f, 2),
        DACITE("dacite", 1, 5.0f, 30.0f, 2),
        ANDESITE("andesite", 2, 5.0f, 30.0f, 2),
        BASALTIC_ANDESITE("basaltic_andesite", 3, 5.0f, 30.0f, 2),
        BASALT("basalt", 4, 5.0f, 30.0f, 2),
        PICRITE("picrite", 5, 5.0f, 30.0f, 2),

        OBSIDIAN("obsidian", 6, 5.0f, 30.0f, 2),
        AMYGDALOIDAL_BASALT("amygdaloidal_basalt", 7, 5.0f, 30.0f, 2),
        KOMATIITE("komatiite", 8, 5.0f, 30.0f, 2);


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
        GRANITE("granite", 0, 5.0f, 30.0f, 2),
        GRANODIORITE("granodiorite", 1, 5.0f, 30.0f, 2),
        DIORITE("diorite", 2, 5.0f, 30.0f, 2),
        GABBRO("gabbro", 3, 5.0f, 30.0f, 2),
        PERIDOTITE("peridotite", 4, 5.0f, 30.0f, 2),

        ANORTHOSITE("anorthosite", 5, 5.0f, 30.0f, 2),
        DIABASE("diabase", 6, 5.0f, 30.0f, 2),
        NORITE("norite", 7, 5.0f, 30.0f, 2),
        TROCTOLITE("troctolite", 8, 5.0f, 30.0f, 2),
        DUNITE("dunite", 9, 5.0f, 30.0f, 2),
        KIMBERLITE("kimberlite", 10, 5.0f, 30.0f, 2);


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
        LIMESTONE("limestone", 0, 5.0f, 30.0f, 2),
        CHALK("chalk", 1, 5.0f, 30.0f, 2),
        DOLOMITE("dolomite", 2, 5.0f, 30.0f, 2),
        MARLSTONE("marlstone", 3, 5.0f, 30.0f, 2),

        SHALE("shale", 4, 5.0f, 30.0f, 2),
        CLAYSTONE("claystone", 5, 5.0f, 30.0f, 2),
        MUDSTONE("mudstone", 6, 5.0f, 30.0f, 2),
        SILTSTONE("siltstone", 7, 5.0f, 30.0f, 2),
        SANDSTONE("sandstone", 8, 5.0f, 30.0f, 2),
        RED_SANDSTONE("red_sandstone", 9, 5.0f, 30.0f, 2),
        CONGLOMERATE("conglomerate", 10, 5.0f, 30.0f, 2),
        GRAYWACKE("graywacke", 11, 5.0f, 30.0f, 2);


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



    public enum RockIgneousTypes implements IStringSerializable, IBlockMetaEnum
    {
        PUMICE("pumice", 0, 5.0f, 30.0f, 2),
        SCORIA("scoria", 1, 5.0f, 30.0f, 2),

        RHYOLITIC_TUFF("rhyolitic_tuff", 2, 5.0f, 30.0f, 2),
        DACITIC_TUFF("dacitic_tuff", 3, 5.0f, 30.0f, 2),
        ANDESITIC_TUFF("andesitic_tuff", 4, 5.0f, 30.0f, 2),
        BASALTIC_TUFF("basaltic_tuff", 5, 5.0f, 30.0f, 2),
        KOMATIITIC_TUFF("komatiitic_tuff", 6, 5.0f, 30.0f, 2);


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
}
