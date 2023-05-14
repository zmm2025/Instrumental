package com.zmm2025.instrumental;

import com.zmm2025.instrumental.setup.ClientSetup;
import com.zmm2025.instrumental.setup.Config;
import com.zmm2025.instrumental.setup.ModSetup;
import com.zmm2025.instrumental.setup.Registration;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Instrumental.MOD_ID)
public class Instrumental {

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "instrumental";

    public Instrumental()
    {
        // Register the deferred registry
        Registration.init();
        Config.register();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}

