package com.seffers122.arccraft.handler;


import java.io.File;
import com.seffers122.arccraft.reference.Reference;
import com.seffers122.arccraft.utility.LogHelper;
import com.sun.org.apache.xpath.internal.operations.Equals;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue=false;
    public static void init(File configFile){
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID) )
        {
            loadConfiguration();

        }
    }
    private static void loadConfiguration()
    {
        LogHelper.info("Configuration Generated");
        testValue=configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");
        if (configuration.hasChanged() )
        {
            configuration.save();
            LogHelper.info("Configuration Changed!");
        }
    }
}