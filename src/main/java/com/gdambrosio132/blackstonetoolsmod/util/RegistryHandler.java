package com.gdambrosio132.blackstonetoolsmod.util;

import com.gdambrosio132.blackstonetoolsmod.BlackStoneToolsMod;
import com.gdambrosio132.blackstonetoolsmod.items.ItemBase;
import com.gdambrosio132.blackstonetoolsmod.tools.ModItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //Have items refer to forge register
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlackStoneToolsMod.MOD_ID);

    //init for our main
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    /*
     * BlackStone Shard - item used to craft tools/weapon - yield from putting blackstone in crafting table
     */
    public static final RegistryObject<Item> BLACKSTONE_SHARD = ITEMS.register("blackstone_shard", ItemBase::new);

    //TODO: make the tools for all the other stuff like axe, shovel, pickaxe, hoe, etc.

    /*
     * BlackStone Tools/Weapon - follow basic minecraft crafting recipe and attributes
     * create new item by registering it and giving its values for attributes similar to stone tools
     */

    //Blackstone Sword
    public static final RegistryObject<SwordItem> BLACKSTONE_SWORD = ITEMS.register("blackstone_sword", () ->
        new SwordItem(ModItemTier.BLACKSTONETIER, 1, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)));


    //Blackstone Pickaxe
    public static final RegistryObject<PickaxeItem> BLACKSTONE_PICKAXE= ITEMS.register("blackstone_pickaxe", () ->
            new PickaxeItem(ModItemTier.BLACKSTONETIER, -1, -2.8F, new Item.Properties().group(ItemGroup.TOOLS)));

    //Blackstone Axe
    public static final RegistryObject<AxeItem> BLACKSTONE_AXE = ITEMS.register("blackstone_axe", () ->
            new AxeItem(ModItemTier.BLACKSTONETIER, 5, -3.2F, new Item.Properties().group(ItemGroup.TOOLS)));

    //Blackstone Shovel
    public static final RegistryObject<ShovelItem> BLACKSTONE_SHOVEL = ITEMS.register("blackstone_shovel", () ->
            new ShovelItem(ModItemTier.BLACKSTONETIER, -1, -3F, new Item.Properties().group(ItemGroup.TOOLS)));

    //Blackstone Hoe
    public static final RegistryObject<HoeItem> BLACKSTONE_HOE = ITEMS.register("blackstone_hoe", () ->
            new HoeItem(ModItemTier.BLACKSTONETIER, -3, -2F, new Item.Properties().group(ItemGroup.TOOLS)));



}
