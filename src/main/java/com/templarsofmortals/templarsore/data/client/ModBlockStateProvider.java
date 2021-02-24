package com.templarsofmortals.templarsore.data.client;

import com.templarsofmortals.templarsore.TemplarsOre;
import com.templarsofmortals.templarsore.core.registries.Ore;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TemplarsOre.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        registerOre("antimony");
        registerOre("cobalt");
        registerOre("copper");
        registerOre("lead");
        registerOre("palladium");
        registerOre("platinum");
        registerOre("silver");
        registerOre("tin");
        registerOre("titanium");
        registerOre("tungsten");
        registerOre("zinc");
    }

    public void registerOre(String name) {
        simpleBlock(Ore.blocks.get(name + "_ore").get());
    }
}
