package com.templarsofmortals.templarsore.core.tools;

import com.templarsofmortals.templarsore.core.registries.Ore;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public class MetalItemTiers {

    public static final IItemTier antimony = new ToolMaterial(13, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("antimony_ingot").get()));
    public static final IItemTier brass = new ToolMaterial(11, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("brass_ingot").get()));
    public static final IItemTier bronze = new ToolMaterial(9, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("bronze_ingot").get()));
    public static final IItemTier cobalt = new ToolMaterial(17, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("cobalt_ingot").get()));
    public static final IItemTier copper = new ToolMaterial(8, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("copper_ingot").get()));
    //public static final IItemTier gold = new ToolMaterial(10, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("gold_ingot").get()));
    //public static final IItemTier iron = new ToolMaterial(14, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("iron_ingot").get()));
    public static final IItemTier lead = new ToolMaterial(6, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("lead_ingot").get()));
    public static final IItemTier palladium = new ToolMaterial(16, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("palladium_ingot").get()));
    public static final IItemTier platinum = new ToolMaterial(15, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("platinum_ingot").get()));
    public static final IItemTier silver = new ToolMaterial(12, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("silver_ingot").get()));
    public static final IItemTier steel = new ToolMaterial(19, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("steel_ingot").get()));
    public static final IItemTier tin = new ToolMaterial(7, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("tin_ingot").get()));
    public static final IItemTier titanium = new ToolMaterial(18, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("titanium_ingot").get()));
    public static final IItemTier tungsten = new ToolMaterial(5, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("tungsten_ingot").get()));
    public static final IItemTier zinc = new ToolMaterial(4, 100, 9.5F, 1.0F, 10, () -> Ingredient.fromItems(Ore.items.get("zinc_ingot").get()));

    private static class ToolMaterial implements IItemTier {

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repair;

        public ToolMaterial(int harvestLevel, int maxUses, float efficiency, double attackDamage, int enchantability, Supplier<Ingredient> supplier) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = (float)attackDamage;
            this.enchantability = enchantability;
            this.repair = new LazyValue<Ingredient>(supplier);
        }

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
            return repair.getValue();
        }
    }
}
