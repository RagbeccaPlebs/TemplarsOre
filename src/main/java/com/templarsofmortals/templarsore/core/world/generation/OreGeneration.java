package com.templarsofmortals.templarsore.core.world.generation;

import com.templarsofmortals.templarsore.core.registries.Ore;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("zinc_ore").get().getDefaultState(), 6, 32, 256, 10);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("tungsten_ore").get().getDefaultState(), 6, 32, 208, 14);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("lead_ore").get().getDefaultState(), 6, 32, 176, 13);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("tin_ore").get().getDefaultState(), 6, 32, 128, 12);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("copper_ore").get().getDefaultState(), 5, 32, 96, 11);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("silver_ore").get().getDefaultState(), 6, 32, 64, 9);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("antimony_ore").get().getDefaultState(), 6, 32, 56, 8);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("platinum_ore").get().getDefaultState(), 4, 24, 32, 6);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("palladium_ore").get().getDefaultState(), 5, 16, 24, 5);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("cobalt_ore").get().getDefaultState(), 5, 0, 16, 4);
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    Ore.blocks.get("titanium_ore").get().getDefaultState(), 5, 0, 16, 3);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int veinCount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(veinCount));
    }
}
