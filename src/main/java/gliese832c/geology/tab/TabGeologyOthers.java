package gliese832c.geology.tab;

import gliese832c.geology.block.GeologyBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabGeologyOthers extends CreativeTabs
{
    public TabGeologyOthers()
    {
        super("geology.others");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(GeologyBlocks.rockVolcanic);
    }
}
