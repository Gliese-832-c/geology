package gliese832c.geology.render;

import gliese832c.geology.block.GeologyBlocks;

public class GeologyRenderHandler
{
    public static void init()
    {
        GeologyBlocks.registerRenders();
        //QMDItems.registerRenders();
        //QMDArmour.registerRenders();
    }
}