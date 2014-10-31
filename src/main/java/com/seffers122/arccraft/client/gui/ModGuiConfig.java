package com.seffers122.arccraft.client.gui;

import com.seffers122.arccraft.handler.ConfigurationHandler;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraftforge.common.config.ConfigElement;
import com.seffers122.arccraft.reference.Reference;
import com.seffers122.arccraft.ArcCraft;
import net.minecraftforge.common.config.Configuration;
import net.minecraft.client.gui.GuiScreen;


/**
 * Created by seffe_000 on 10/30/2014.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen){
        super(guiScreen,
        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
        Reference.MOD_ID,
        false,
        false,
        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

    }
}
