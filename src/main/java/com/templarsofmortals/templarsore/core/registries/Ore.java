package com.templarsofmortals.templarsore.core.registries;

import com.templarsofmortals.templarscore.common.blocks.StoneBlock;
import com.templarsofmortals.templarsore.TemplarsOre;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ore {

    static {
        blocks = new HashMap<>();
        items = new HashMap<>();
        registerOre("zinc", MaterialColor.GRAY, 8, 8, 3);
        registerOre("tin", MaterialColor.GRAY, 8, 8, 3);
    }

    public static final HashMap<String, RegistryObject<Block>> blocks;
    public static final HashMap<String, RegistryObject<Item>> items;

    public static void registerOre(String oreName, MaterialColor materialColor,
                                   float hardness, float resistance,
                                   int harvestLevel) {
        String combinedOreName = oreName + "_ore";
        String combinedChunkName = oreName + "_chunk";
        String combinedIngotName = oreName + "_ingot";
        String combinedNuggetName = oreName + "_nugget";

        blocks.put(combinedOreName, TemplarsOre.REGISTRY_HELPER.createBlock(combinedOreName,
                () -> new StoneBlock(AbstractBlock.Properties.create(Material.ROCK, materialColor)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(hardness, resistance)
                        .harvestTool(ToolType.PICKAXE)
                        .harvestLevel(harvestLevel)), ItemGroupOre.creativeTab));
        items.put(combinedChunkName, TemplarsOre.REGISTRY_HELPER.createItem(combinedChunkName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
        items.put(combinedIngotName, TemplarsOre.REGISTRY_HELPER.createItem(combinedIngotName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
        items.put(combinedNuggetName, TemplarsOre.REGISTRY_HELPER.createItem(combinedNuggetName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));

    }

    public static void registerOreOtherName(String oreName, String metalName, MaterialColor materialColor,
                                            float hardness, float resistance,
                                            int harvestLevel) {
        String combinedOreName = oreName + "_ore";
        String combinedChunkName = oreName + "_chunk";
        String combinedIngotName = metalName + "_ingot";
        String combinedNuggetName = metalName + "_nugget";

        blocks.put(combinedOreName, TemplarsOre.REGISTRY_HELPER.createBlock(combinedOreName,
                () -> new StoneBlock(AbstractBlock.Properties.create(Material.ROCK, materialColor)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(hardness, resistance)
                        .harvestTool(ToolType.PICKAXE)
                        .harvestLevel(harvestLevel)), ItemGroupOre.creativeTab));
        items.put(combinedChunkName, TemplarsOre.REGISTRY_HELPER.createItem(combinedChunkName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
        items.put(combinedIngotName, TemplarsOre.REGISTRY_HELPER.createItem(combinedIngotName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
        items.put(combinedNuggetName, TemplarsOre.REGISTRY_HELPER.createItem(combinedNuggetName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
    }

    public static void registerAlloy(String metalName) {
        String combinedIngotName = metalName + "_ingot";
        String combinedNuggetName = metalName + "_nugget";

        items.put(combinedIngotName, TemplarsOre.REGISTRY_HELPER.createItem(combinedIngotName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
        items.put(combinedNuggetName, TemplarsOre.REGISTRY_HELPER.createItem(combinedNuggetName,
                () -> new Item(new Item.Properties().group(ItemGroupOre.creativeTab))));
    }

}
