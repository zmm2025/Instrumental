package com.zmm2025.instrumental.datagen;

import com.zmm2025.instrumental.Instrumental;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsGenerator extends ItemTagsProvider {

    public ItemTagsGenerator(DataGenerator generator, BlockTagsProvider provider, ExistingFileHelper helper) {
        super(generator, provider, Instrumental.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
//        tag(Tags.Items.ORES)
//                .add(Registration.BLOCK_OF_EXAMPLE_ITEM.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
