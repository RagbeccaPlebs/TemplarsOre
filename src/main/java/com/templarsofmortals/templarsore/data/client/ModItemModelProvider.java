package com.templarsofmortals.templarsore.data.client;

import com.templarsofmortals.templarsore.TemplarsOre;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;

/**
 * In this class ItemModels will be automatically made.
 * To do this you need to create a new register function like #registerAlloy and an array (See others for examples)
 *
 * @author Ragbecca
 * @since 1.0
 * @updated 27-2-2021
 */
public class ModItemModelProvider extends ItemModelProvider {

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TemplarsOre.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
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
        String[] alloys = {
                "brass",
                "bronze",
                "steel",
        };
        Arrays.stream(alloys).forEach(this::registerAlloy);
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
     * Registers every item model that comes with one type of metal with ore
     * @param name - Name of the metal
     */
    private void registerOre(String name) {
        withExistingParent(name + "_ore", modLoc("block/" + name + "_ore"));
        getBuilder(name + "_pickaxe").parent(itemGenerated).texture("layer0", "item/" + name + "_pickaxe");
        getBuilder(name + "_nugget").parent(itemGenerated).texture("layer0", "item/" + name + "_nugget");
        getBuilder(name + "_ingot").parent(itemGenerated).texture("layer0", "item/" + name + "_ingot");
        getBuilder(name + "_chunk").parent(itemGenerated).texture("layer0", "item/" + name + "_chunk");
    }

    /**
     * Registers every item model that comes with one type of metal without ore
     * @param name - Name of the metal
     */
    private void registerAlloy(String name) {
        getBuilder(name + "_pickaxe").parent(itemGenerated).texture("layer0", "item/" + name + "_pickaxe");
        getBuilder(name + "_nugget").parent(itemGenerated).texture("layer0", "item/" + name + "_nugget");
        getBuilder(name + "_ingot").parent(itemGenerated).texture("layer0", "item/" + name + "_ingot");
    }

    /**
     * Registers every item model that comes with a type of stone
     * @param name - Name of the stone
     */
    private void registerStone(String name) {
        withExistingParent(name, modLoc("block/" + name));
    }
}
