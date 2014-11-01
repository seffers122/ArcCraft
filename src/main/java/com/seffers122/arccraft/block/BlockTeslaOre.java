package com.seffers122.arccraft.block;

import com.seffers122.arccraft.creativetab.CreativeTabAC;

/**
 * Created by seffe_000 on 10/31/2014.
 */
public class BlockTeslaOre extends BlockAC{
    public BlockTeslaOre()
    {
        super();
        this.setBlockName("TeslaOre");
        this.setBlockTextureName("TeslaOre");
        this.setHardness(3.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabAC.AC_TAB);
    }
}
