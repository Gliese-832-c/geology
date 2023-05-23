package gliese832c.geology.render;

import gliese832c.geology.block.GeologyBlocks;
import gliese832c.geology.item.GeologyItems;

public class GeologyRenderHandler
{
    public static void init()
    {
        GeologyBlocks.registerRenders();
        GeologyItems.registerRenders();
    }
}