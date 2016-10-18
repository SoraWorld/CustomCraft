/*******************************************************************************
 * Created by Himmelt on 2016/10/10.
 * Copyright (c) 2015-2016. Himmelt All rights reserved.
 * https://opensource.org/licenses/MIT
 ******************************************************************************/

package org.soraworld.customcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.soraworld.customcraft.creativetab.ModCreativeTab;
import org.soraworld.customcraft.reference.R;

import java.util.List;

public class MColorBlock extends MBlock {

    public MColorBlock(String blockName, String textureName) {
        super(blockName, textureName);
        this.setCreativeTab(ModCreativeTab.ModColorTab).setResistance(2.0F).setStepSound(soundTypeStone).setHardness(2.0F);
    }

    public MColorBlock(String blockName, String textureName, Material material) {
        super(blockName, textureName, material);
        this.setCreativeTab(ModCreativeTab.ModColorTab).setResistance(2.0F).setStepSound(soundTypeStone).setHardness(2.0F);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(getTextureName());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return blockIcon;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
        world.setBlockMetadataWithNotify(x, y, z, itemStack.getItemDamage(), 2);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess world, int x, int y, int z) {
        return this.getRenderColor(world.getBlockMetadata(x, y, z));
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(int meta) {
        return R.COLORS[meta];
    }
}
