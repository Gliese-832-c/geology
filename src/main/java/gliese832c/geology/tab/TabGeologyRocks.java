package gliese832c.geology.tab;

import gliese832c.geology.block.GeologyBlock;
import gliese832c.geology.block.GeologyBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabGeologyRocks extends CreativeTabs
{
    public TabGeologyRocks()
    {
        super("geology.rocks");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(GeologyBlocks.rockVolcanic);
    }
}
