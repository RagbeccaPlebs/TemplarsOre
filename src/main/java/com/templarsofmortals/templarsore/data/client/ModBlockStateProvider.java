package com.templarsofmortals.templarsore.data.client;

import com.templarsofmortals.templarsore.TemplarsOre;
import com.templarsofmortals.templarsore.core.registries.Ore;
import com.templarsofmortals.templarsore.core.registries.Stone;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, TemplarsOre.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        String[] ores = {
                "antimony",
                "cobalt",
                "copper",
                "lead",
                "palladium",
                "platinum",
                "silver",
                "tin",
                "titanium",
                "tungsten",
                "zinc",
        };
        Arrays.stream(ores).forEach(this::registerOre);
        String[] stones = {
                "aplite",
                "argillite",
                "basalt",
                "dolerite",
                "eclogite",
                "gabbro",
                "latite",
                "limestone",
                "marble",
                "marl",
                "quartzite",
                "scoria",
                "tuff",
        };
        Arrays.stream(stones).forEach(this::registerStone);
    }

    private void registerOre(String name) {
        simpleBlock(Ore.blocks.get(name + "_ore").get());
    }

    private void registerStone(String name) {
        simpleBlock(Stone.blocks.get(name).get());
    }
}
