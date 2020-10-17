package com.gdambrosio132.blackstonetoolsmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
/*
 * ItemBase Class - extends Item
 * Create a basis of what your item is -- material in this case
 */
public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(ItemGroup.MATERIALS));
    }
}
