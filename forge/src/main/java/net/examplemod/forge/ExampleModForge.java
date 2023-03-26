package net.examplemod.forge;

import net.examplemod.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MOD_ID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleModForge {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ExampleMod.LOGGER = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ExampleMod.init();
    }
}
