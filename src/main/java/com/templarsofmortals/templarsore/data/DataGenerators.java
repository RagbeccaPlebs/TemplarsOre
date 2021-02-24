package com.templarsofmortals.templarsore.data;

import com.templarsofmortals.templarsore.TemplarsOre;
import com.templarsofmortals.templarsore.data.client.ModBlockStateProvider;
import com.templarsofmortals.templarsore.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TemplarsOre.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        dataGenerator.addProvider(new ModBlockStateProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new ModItemModelProvider(dataGenerator, existingFileHelper));
    }
}
