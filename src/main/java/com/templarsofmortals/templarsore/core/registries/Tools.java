package com.templarsofmortals.templarsore.core.registries;

import com.templarsofmortals.templarscore.common.tools.Pickaxe;
import com.templarsofmortals.templarsore.TemplarsOre;
import com.templarsofmortals.templarsore.core.tools.MetalItemTiers;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Tools {

    static {
        items = new HashMap<>();
        registerTools("antimony", 1, 1, MetalItemTiers.antimony);
        registerTools("brass", 1, 1, MetalItemTiers.brass);
        registerTools("bronze", 1, 1, MetalItemTiers.bronze);
        registerTools("cobalt", 1, 1, MetalItemTiers.cobalt);
        registerTools("copper", 1, 1, MetalItemTiers.copper);
        registerTools("lead", 1, 1, MetalItemTiers.lead);
        registerTools("palladium", 1, 1, MetalItemTiers.palladium);
        registerTools("platinum", 1, 1, MetalItemTiers.platinum);
        registerTools("silver", 1, 1, MetalItemTiers.silver);
        registerTools("steel", 1, 1, MetalItemTiers.steel);
        registerTools("tin", 1, 1, MetalItemTiers.tin);
        registerTools("titanium", 1, 1, MetalItemTiers.titanium);
        registerTools("tungsten", 1, 1, MetalItemTiers.tungsten);
        registerTools("zinc", 1, 1, MetalItemTiers.zinc);
    }

    public static final HashMap<String, RegistryObject<Item>> items;

    public static void registerTools(String metalName, int attackDamage, float attackSpeed, IItemTier toolMaterial){
        String combinedPickaxeName = metalName + "_pickaxe";
        items.put(combinedPickaxeName, TemplarsOre.REGISTRY_HELPER.createItem(combinedPickaxeName,
                () -> new Pickaxe(toolMaterial, attackDamage, attackSpeed, new Item.Properties().group(ItemGroupOre.creativeTab))));
    }
}
