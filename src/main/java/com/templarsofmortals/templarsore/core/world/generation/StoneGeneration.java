package com.templarsofmortals.templarsore.core.world.generation;

import com.templarsofmortals.templarsore.core.registries.Stone;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class StoneGeneration {

    public static void generateStones(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateStone(event.getGeneration(),
                    Stone.blocks.get("aplite").get().getDefaultState(), 10, 128, 10);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("argillite").get().getDefaultState(), 10, 128, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("basalt").get().getDefaultState(), 10, 80, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("chalk").get().getDefaultState(), 10, 256, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("dolerite").get().getDefaultState(), 10, 128, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("eclogite").get().getDefaultState(), 10, 64, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("gabbro").get().getDefaultState(), 10, 80, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("latite").get().getDefaultState(), 10, 64, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("limestone").get().getDefaultState(), 10, 128, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("marble").get().getDefaultState(), 10, 128, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("marl").get().getDefaultState(), 10, 128, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("quartzite").get().getDefaultState(), 10, 80, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("scoria").get().getDefaultState(), 10, 64, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("shale").get().getDefaultState(), 10, 256, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("soapstone").get().getDefaultState(), 10, 128, 1);
            generateStone(event.getGeneration(),
                    Stone.blocks.get("tuff").get().getDefaultState(), 10, 80, 1);
        }
    }

    private static void generateStone(BiomeGenerationSettingsBuilder settings, BlockState state,
                                    int size, int range, int veinCount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, state, size))
                        .range(range)
                        .square()
                        .func_242731_b(veinCount));
    }
}
