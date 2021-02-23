package com.templarsofmortals.templarsore.core.registries;

import com.templarsofmortals.templarsore.TemplarsOre;
import net.minecraft.block.Block;
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
        registerItem("test");
    }

    public static final HashMap<String, RegistryObject<Block>> blocks;
    public static final HashMap<String, RegistryObject<Item>> items;

    public static void registerItem(String name) {
        items.put(name, TemplarsOre.REGISTRY_HELPER.createItem(name, () -> new Item(new Item.Properties().group(ItemGroup.BREWING))));
    }

}
