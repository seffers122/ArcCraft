package com.seffers122.arccraft.creativetab;


import com.seffers122.arccraft.init.ModItems;
import com.seffers122.arccraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by seffe_000 on 10/31/2014.
 */
public class CreativeTabAC {
    public static final CreativeTabs AC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.ArcCell;
        }
    };
}
