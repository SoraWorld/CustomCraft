/*******************************************************************************
 * Created by Himmelt on 2016/7/25.
 * Copyright (c) 2015-2016. Himmelt All rights reserved.
 * https://opensource.org/licenses/MIT
 ******************************************************************************/

package org.soraworld.customcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.soraworld.customcraft.reference.R;

class MBlock extends Block {

    MBlock(String blockName, String textureName) {
        super(Material.rock);
        this.setBlockName(blockName).setBlockTextureName(R.MODID + ":" + textureName);
    }

    MBlock(String blockName, String textureName, Material material) {
        super(material);
        this.setBlockName(blockName).setBlockTextureName(R.MODID + ":" + textureName);
    }

    @Override
    public int damageDropped(int damage) {
        return damage;
    }
}
