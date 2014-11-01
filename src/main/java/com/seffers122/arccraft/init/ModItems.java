package com.seffers122.arccraft.init;

import com.seffers122.arccraft.item.ItemAC;
import com.seffers122.arccraft.item.ItemArcCell;
import com.seffers122.arccraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by seffe_000 on 10/31/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAC ArcConduit = new ItemArcCell();
    public static void init()
    {
        GameRegistry.registerItem(ArcConduit, "ArcConduit");
    }
}
