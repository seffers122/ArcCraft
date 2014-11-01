package com.seffers122.arccraft;


import com.seffers122.arccraft.handler.ConfigurationHandler;
import com.seffers122.arccraft.init.ModBlocks;
import com.seffers122.arccraft.init.ModItems;
import com.seffers122.arccraft.proxy.IProxy;
import com.seffers122.arccraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.seffers122.arccraft.reference.Reference;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ArcCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static ArcCraft instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("PreInitialization Complete!");

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
        }
        LogHelper.info("PostInitialization Complete!");

    }
}

