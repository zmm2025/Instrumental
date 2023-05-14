package com.zmm2025.instrumental.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Config {

    public static void register() {
        registerClientConfigs();
        registerCommonConfigs();
        registerServerConfigs();
    }

    private static void registerClientConfigs() {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        // ...

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_BUILDER.build());
    }

    private static void registerCommonConfigs() {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        // ... (Should only be used for worldgen)

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CLIENT_BUILDER.build());
    }

    private static void registerServerConfigs() {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        // ...

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CLIENT_BUILDER.build());
    }
}
