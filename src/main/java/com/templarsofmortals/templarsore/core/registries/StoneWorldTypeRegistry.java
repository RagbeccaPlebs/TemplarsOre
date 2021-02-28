package com.templarsofmortals.templarsore.core.registries;

import com.templarsofmortals.templarsore.core.world.regions.StoneWorldType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StoneWorldTypeRegistry {
    public static StoneWorldType stoneWorldType = new StoneWorldType();

    public static void setup(){
        stoneWorldType.setRegistryName(new ResourceLocation("templarsore"));
        ForgeRegistries.WORLD_TYPES.register(stoneWorldType);
    }
}
