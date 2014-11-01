package com.seffers122.arccraft.init;

import com.seffers122.arccraft.ArcCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


/**
 * Created by seffe_000 on 11/1/2014.
 */
public class Recipes
{
    public static void init()
    {
        GameRegistry.addSmelting(ModBlocks.TeslaOre, new ItemStack(ModItems.TeslaChunk), 0.5F);
    }
}
