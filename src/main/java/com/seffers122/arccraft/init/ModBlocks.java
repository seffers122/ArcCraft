package com.seffers122.arccraft.init;

import com.seffers122.arccraft.block.BlockAC;
import com.seffers122.arccraft.block.BlockTeslaOre;
import com.seffers122.arccraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by seffe_000 on 10/31/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockAC TeslaOre = new BlockTeslaOre();
    public static void init()
    {
        GameRegistry.registerBlock(TeslaOre, "TeslaOre");
    }
}
