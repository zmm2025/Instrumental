package com.zmm2025.instrumental.datagen;

import com.zmm2025.instrumental.Instrumental;
import com.zmm2025.instrumental.setup.ModSetup;
import com.zmm2025.instrumental.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider {

    public LanguageGenerator(DataGenerator generator, String locale) {
        super(generator, Instrumental.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        // Creative Mode Tabs
        add("itemGroup." + ModSetup.TAB_NAME, "Instrumental");

        // Blocks

        // Items
        add(Registration.SAXOPHONE.get(), "Saxophone");
    }
}
