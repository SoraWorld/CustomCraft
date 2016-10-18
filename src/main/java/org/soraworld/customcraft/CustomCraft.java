/*******************************************************************************
 * Created by Himmelt on 2016/10/10.
 * Copyright (c) 2015-2016. Himmelt All rights reserved.
 * https://opensource.org/licenses/MIT
 ******************************************************************************/

package org.soraworld.customcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import org.soraworld.customcraft.proxy.IProxy;
import org.soraworld.customcraft.reference.R;

@Mod(modid = R.MODID,
        name = R.NAME,
        version = R.VERSION,
        acceptedMinecraftVersions = R.ACMCVERSION)
public class CustomCraft {

    public static Logger MODLOG;

    @Mod.Instance(R.MODID)
    public static CustomCraft instance;

    @SidedProxy(clientSide = R.CLIENT_PROXY_CLASS, serverSide = R.SERVER_PROXY_CLASS)
    private static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MODLOG = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.Init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}