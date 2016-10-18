/*******************************************************************************
 * Created by Himmelt on 2016/10/10.
 * Copyright (c) 2015-2016. Himmelt All rights reserved.
 * https://opensource.org/licenses/MIT
 ******************************************************************************/

package org.soraworld.customcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import org.soraworld.customcraft.reference.R;

public class ModCreativeTab {

    public static final CreativeTabs ModTab = new CreativeTabs(R.MODID) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.stone);
        }
    };
    public static final CreativeTabs ModColorTab = new CreativeTabs(R.CreativeTabs.colorTab) {

        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.wool);
        }
    };
}