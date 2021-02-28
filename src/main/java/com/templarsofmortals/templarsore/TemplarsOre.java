package com.templarsofmortals.templarsore;

import com.templarsofmortals.templarscore.core.util.RegistryHelper;
import com.templarsofmortals.templarscore.core.util.loggers.LoggerUtil;
import com.templarsofmortals.templarsore.core.registries.StoneWorldTypeRegistry;
import com.templarsofmortals.templarsore.core.world.generation.OreGeneration;
import com.templarsofmortals.templarsore.core.world.generation.StoneGeneration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.templarsofmortals.templarsore.TemplarsOre.MOD_ID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MOD_ID)
public class TemplarsOre
{
    public static final String MOD_ID = "templarsore";
    public static final String Ore_Mod_Name = "Templars Ore";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public TemplarsOre() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);
        REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);

        StoneWorldTypeRegistry.setup();
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, StoneGeneration::generateStones);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LoggerUtil.info(Ore_Mod_Name, "Has Loaded Successfully");
    }

}
