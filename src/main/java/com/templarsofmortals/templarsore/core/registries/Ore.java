package com.templarsofmortals.templarsore.core.registries;

import com.templarsofmortals.templarscore.common.blocks.StoneBlock;
import com.templarsofmortals.templarsore.TemplarsOre;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ore {

    static {
        blocks = new HashMap<>();
        items = new HashMap<>();
        registerStuff("test");
    }

    public static final HashMap<String, RegistryObject<Block>> blocks;
    public static final HashMap<String, RegistryObject<Item>> items;

    public static void registerStuff(String name) {
        blocks.put(name, TemplarsOre.REGISTRY_HELPER.createBlock(name, () ->
                new StoneBlock(AbstractBlock.Properties.create(Material.ROCK)
                        .sound(SoundType.SOUL_SAND)), ItemGroup.BREWING));
    }

}
