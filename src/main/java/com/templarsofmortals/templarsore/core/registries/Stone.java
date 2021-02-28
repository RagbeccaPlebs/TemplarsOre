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
public class Stone {

    static {
        blocks = new HashMap<>();
        items = new HashMap<>();
        registerStone("aplite", MaterialColor.RED_TERRACOTTA, 3.0F, 3.0F, 4);
        registerStone("argillite", MaterialColor.WHITE_TERRACOTTA, 3.0F, 3.0F, 6);
        registerStone("basalt", MaterialColor.GRAY, 3.0F, 3.0F, 13);
        registerStone("chalk", MaterialColor.LIGHT_GRAY, 3.0F, 3.0F, 3);
        registerStone("dolerite", MaterialColor.BLACK_TERRACOTTA, 3.0F, 3.0F, 7);
        registerStone("eclogite", MaterialColor.GREEN, 3.0F, 3.0F, 17);
        registerStone("gabbro", MaterialColor.LIGHT_GRAY, 3.0F, 3.0F, 9);
        registerStone("latite", MaterialColor.LIGHT_GRAY_TERRACOTTA, 3.0F, 3.0F, 16);
        registerStone("limestone", MaterialColor.YELLOW, 3.0F, 3.0F, 6);
        registerStone("marble", MaterialColor.WHITE_TERRACOTTA, 3.0F, 3.0F, 5);
        registerStone("marl", MaterialColor.LIGHT_GRAY, 3.0F, 3.0F, 5);
        registerStone("quartzite", MaterialColor.LIGHT_GRAY_TERRACOTTA, 3.0F, 3.0F, 11);
        registerStone("scoria", MaterialColor.ORANGE_TERRACOTTA, 3.0F, 3.0F, 15);
        registerStone("shale", MaterialColor.ORANGE_TERRACOTTA, 3.0F, 3.0F, 2);
        registerStone("soapstone", MaterialColor.GRAY, 3.0F, 3.0F, 3);
        registerStone("tuff", MaterialColor.ORANGE_TERRACOTTA, 3.0F, 3.0F, 10);
    }

    public static final HashMap<String, RegistryObject<Block>> blocks;
    public static final HashMap<String, RegistryObject<Item>> items;

    protected static void registerStone(String stoneName, MaterialColor materialColor,
                                     float hardness, float resistance,
                                     int harvestLevel) {
        blocks.put(stoneName, TemplarsOre.REGISTRY_HELPER.createBlock(stoneName,
                () -> new StoneBlock(AbstractBlock.Properties.create(Material.ROCK, materialColor)
                        .harvestLevel(harvestLevel)
                        .harvestTool(ToolType.PICKAXE)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(hardness, resistance)
                        .setRequiresTool()), ItemGroupOre.creativeTab));
    }
}
