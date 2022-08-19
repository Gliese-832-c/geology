package gliese832c.geology.block;

import gliese832c.geology.tab.GeologyTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GeologyBlock extends Block
{
	public GeologyBlock(Material material)
    {
        super(material);
        this.setCreativeTab(GeologyTabs.ROCKS);
    }
}
