package com.seffers122.arccraft.init;

import com.seffers122.arccraft.item.ItemAC;
import com.seffers122.arccraft.item.ItemArcGlove;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by seffe_000 on 10/31/2014.
 */
public class ModItems
{
    public static final ItemAC ArcGlove = new ItemArcGlove();
    public static void init()
    {
        GameRegistry.registerItem(ArcGlove, "ArcGlove");
    }
}
