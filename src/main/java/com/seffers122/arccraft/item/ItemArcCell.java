package com.seffers122.arccraft.item;


import com.seffers122.arccraft.creativetab.CreativeTabAC;
import com.seffers122.arccraft.utility.NBTHelper;
import net.minecraft.item.ItemStack;

/**
 * Created by seffe_000 on 10/31/2014.
 */
public class ItemArcCell extends ItemAC
{
    public ItemArcCell()
    {
        super();
        this.setUnlocalizedName("ArcCell");
        this.maxStackSize=1;
        this.setCreativeTab(CreativeTabAC.AC_TAB);

    }
   // public static String setChargedValue(ItemStack itemStack){
     //   NBTHelper.setString(itemStack, );

   // }
   // public static String getChargedValue(ItemStack itemStack){
      //  NBTHelper.getString(itemStack, );
   // }

}
