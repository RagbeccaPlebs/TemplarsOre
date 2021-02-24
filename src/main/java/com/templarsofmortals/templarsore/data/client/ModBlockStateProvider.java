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
        simpleBlock(Ore.blocks.get("tin_ore").get());
        simpleBlock(Ore.blocks.get("zinc_ore").get());
    }
}
