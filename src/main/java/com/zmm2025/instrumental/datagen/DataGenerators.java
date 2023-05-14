package com.zmm2025.instrumental.datagen;

import com.zmm2025.instrumental.Instrumental;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Instrumental.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            BlockTagsGenerator blockTags = new BlockTagsGenerator(generator, event.getExistingFileHelper());

            generator.addProvider(true, new RecipesGenerator(generator));
            generator.addProvider(true, new LootTablesGenerator(generator));
            generator.addProvider(true, blockTags);
            generator.addProvider(true, new ItemTagsGenerator(generator, blockTags, event.getExistingFileHelper()));
        }
        if (event.includeClient()) {
            generator.addProvider(true, new BlockStateGenerator(generator, event.getExistingFileHelper()));
            generator.addProvider(true, new ItemModelGenerator(generator, event.getExistingFileHelper()));
//            generator.addProvider(true, new LanguageGenerator(generator, "en_us"));
        }
    }
}
