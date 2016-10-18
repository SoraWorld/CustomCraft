/*******************************************************************************
 * Created by Himmelt on 2016/7/25.
 * Copyright (c) 2015-2016. Himmelt All rights reserved.
 * https://opensource.org/licenses/MIT
 ******************************************************************************/

package org.soraworld.customcraft.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import org.soraworld.customcraft.blocks.MColorBlock;
import org.soraworld.customcraft.blocks.MColorCrystal;
import org.soraworld.customcraft.items.MIColorBlock;
import org.soraworld.customcraft.reference.R;

@GameRegistry.ObjectHolder(R.MODID)
public class ModRegistry {
    // 注册方块
    public static void registerBlocks() {
        GameRegistry.registerBlock(new MColorBlock(R.B.colorBlock, R.B.colorBlock),
                MIColorBlock.class, R.B.colorBlock);
        GameRegistry.registerBlock(new MColorBlock(R.B.colorBightBlock, R.B.colorBlock).setLightLevel(1.0F),
                MIColorBlock.class, R.B.colorBightBlock);
        GameRegistry.registerBlock(new MColorCrystal(R.B.colorCrystal, R.B.colorCrystal),
                MIColorBlock.class, R.B.colorCrystal);
        GameRegistry.registerBlock(new MColorCrystal(R.B.colorBightCrystal, R.B.colorCrystal).setLightLevel(1.0F),
                MIColorBlock.class, R.B.colorBightCrystal);
    }
}
