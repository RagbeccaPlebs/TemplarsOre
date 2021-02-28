package com.templarsofmortals.templarsore.data.client;

import com.templarsofmortals.templarsore.TemplarsOre;
import com.templarsofmortals.templarsore.core.registries.Ore;
import com.templarsofmortals.templarsore.core.registries.Stone;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;

/**
 * In this class BlockStates and Models will be automatically made.
 * The thing need to be done to create a new model is a new register function (Look at the previous ones for examples)
 */
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
                "chalk",
                "dolerite",
                "eclogite",
                "gabbro",
                "latite",
                "limestone",
                "marble",
                "marl",
                "quartzite",
                "scoria",
                "shale",
                "soapstone",
                "tuff",
        };
        Arrays.stream(stones).forEach(this::registerStone);
    }

    /**
     * Registers a ore model
     * @param name - Name of the block
     */
    private void registerOre(String name) {
        simpleBlock(Ore.blocks.get(name + "_ore").get());
    }

    /**
     * Registers a stone model
     * @param name - Name of the block
     */
    private void registerStone(String name) {
        simpleBlock(Stone.blocks.get(name).get());
    }
}
