package com.zmm2025.instrumental.setup;

import com.zmm2025.instrumental.items.MusicalInstrumentItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.zmm2025.instrumental.Instrumental.MOD_ID;

public class Registration {

    ////////////////////////////////////////////////////// SETUP ///////////////////////////////////////////////////////

    // Create DeferredRegisters
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MOD_ID);

    // Register EventBus in DeferredRegisters
    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        SOUND_EVENTS.register(bus);
    }

    // Registration helper methods
    public static RegistryObject<Item> registerItem(String itemName) {
        return ITEMS.register(itemName, () -> new Item(ITEM_PROPERTIES));
    }
    public static <B extends Block> RegistryObject<Item> registerItem(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
    public static RegistryObject<Item> registerMusicalInstrumentItem(String itemName) {
        return ITEMS.register(itemName, () -> new MusicalInstrumentItem(MUSICAL_INSTRUMENT_ITEM_PROPERTIES));
    }
    public static RegistryObject<SoundEvent> registerSoundEvent(String eventName) {
        return SOUND_EVENTS.register(eventName, () -> new SoundEvent(new ResourceLocation(MOD_ID, eventName)));
    }

    // Properties
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
            .tab(ModSetup.ITEM_GROUP);
    public static final Item.Properties MUSICAL_INSTRUMENT_ITEM_PROPERTIES = new Item.Properties()
            .tab(ModSetup.ITEM_GROUP)
            .stacksTo(1);



    /////////////////////////////////////////////////// REGISTRATION ///////////////////////////////////////////////////

    // Items
    public static final RegistryObject<Item> SAXOPHONE = registerMusicalInstrumentItem("saxophone");

    // Sound events
    public static final RegistryObject<SoundEvent> TEST_SOUND_EVENT = registerSoundEvent("test_sound_event");
}
