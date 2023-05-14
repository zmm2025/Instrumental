package com.zmm2025.instrumental.datagen;

import com.zmm2025.instrumental.Instrumental;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsGenerator extends BlockTagsProvider {

    public BlockTagsGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Instrumental.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(Registration.BLOCK_OF_EXAMPLE.get());
//        tag(Tags.Blocks.ORES)
//                .add(Registration.BLOCK_OF_EXAMPLE.get());
    }

    @Override
    public String getName() {
        return "Instrumental Tags";
    }
}
