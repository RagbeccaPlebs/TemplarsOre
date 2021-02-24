package com.templarsofmortals.templarsore.core.registries;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupOre {
    public static final ItemGroup creativeTab = new ItemGroup("templarsore") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Ore.blocks.get("tin_ore").get());
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };
}
