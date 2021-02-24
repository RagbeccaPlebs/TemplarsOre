package com.templarsofmortals.templarsore.data.client;

import com.templarsofmortals.templarsore.TemplarsOre;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, TemplarsOre.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        registerOre("antimony");
        registerAlloy("brass");
        registerAlloy("bronze");
        registerOre("cobalt");
        registerOre("copper");
        registerOre("lead");
        registerOre("palladium");
        registerOre("platinum");
        registerOre("silver");
        registerAlloy("steel");
        registerOre("tin");
        registerOre("titanium");
        registerOre("tungsten");
        registerOre("zinc");
    }

    private void registerOre(String name) {
        withExistingParent(name + "_ore", modLoc("block/" + name + "_ore"));
        getBuilder(name + "_nugget").parent(itemGenerated).texture("layer0", "item/" + name + "_nugget");
        getBuilder(name + "_ingot").parent(itemGenerated).texture("layer0", "item/" + name + "_ingot");
        getBuilder(name + "_chunk").parent(itemGenerated).texture("layer0", "item/" + name + "_chunk");
    }

    private void registerAlloy(String name) {
        getBuilder(name + "_nugget").parent(itemGenerated).texture("layer0", "item/" + name + "_nugget");
        getBuilder(name + "_ingot").parent(itemGenerated).texture("layer0", "item/" + name + "_ingot");
    }
}
