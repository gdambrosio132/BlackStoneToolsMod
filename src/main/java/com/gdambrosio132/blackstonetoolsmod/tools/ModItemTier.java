package com.gdambrosio132.blackstonetoolsmod.tools;

import com.gdambrosio132.blackstonetoolsmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

/*
 * ModItemTier enum - implements from IItemTier
 * collect the blackstone tier by giving its attributes
 */
public enum ModItemTier implements IItemTier {

    //Blackstone tier -- similar to stone tools
    BLACKSTONETIER(1, 131, 4.0F, 3.0F, 5, () -> {
        return Ingredient.fromItems(RegistryHandler.BLACKSTONE_SWORD.get());
    });

    //properties for our blackstone tier
    private final int harvestLevel, maxUses, enchantability;
    private final float efficiency, attackDamage;
    private final Supplier<Ingredient> repairMaterial;

    //constructor
    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.enchantability = enchantability;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.repairMaterial = repairMaterial;
    }

    //Accessors - we need to get the value
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
