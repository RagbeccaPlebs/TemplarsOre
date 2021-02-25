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
        registerOre("antimony", MaterialColor.WHITE_TERRACOTTA, 8,8, 12);
        registerAlloy("brass");
        registerAlloy("bronze");
        registerOre("cobalt", MaterialColor.BLUE_TERRACOTTA, 8,8 , 16);
        registerOre("copper", MaterialColor.ORANGE_TERRACOTTA, 8,8, 7);
        registerOre("lead", MaterialColor.BLACK_TERRACOTTA, 8,8, 5);
        registerOre("palladium", MaterialColor.WHITE_TERRACOTTA, 8,8, 15);
        registerOre("platinum", MaterialColor.LIGHT_GRAY, 8,8,14);
        registerOre("silver", MaterialColor.LIGHT_GRAY, 8,8,11);
        registerAlloy("steel");
        registerOre("tin", MaterialColor.LIGHT_GRAY_TERRACOTTA, 8,8, 6);
        registerOre("titanium", MaterialColor.GRAY, 8,8,17);
        registerOre("tungsten", MaterialColor.WHITE_TERRACOTTA, 8,8, 4);
        registerOre("zinc", MaterialColor.GRAY, 8, 8, 3);
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
                        .setRequiresTool()
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
