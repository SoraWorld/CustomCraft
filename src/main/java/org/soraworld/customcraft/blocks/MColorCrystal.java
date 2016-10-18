/*******************************************************************************
 * Created by Himmelt on 2016/10/10.
 * Copyright (c) 2015-2016. Himmelt All rights reserved.
 * https://opensource.org/licenses/MIT
 ******************************************************************************/

package org.soraworld.customcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

public class MColorCrystal extends MColorBlock {

    public MColorCrystal(String blockName, String textureName) {
        super(blockName, textureName);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderBlockPass() {
        return 1;//alpha
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
        return !(iBlockAccess.getBlock(x, y, z) instanceof MColorCrystal);
        //Block block = iBlockAccess.getBlock(x, y, z);
        //return iBlockAccess.getBlockMetadata(x, y, z) != iBlockAccess.getBlockMetadata(x - Facing.offsetsXForSide[side], y - Facing.offsetsYForSide[side], z - Facing.offsetsZForSide[side]) || !(block instanceof MColorCrystal) && super.shouldSideBeRendered(iBlockAccess, x, y, z, side);
    }
}
