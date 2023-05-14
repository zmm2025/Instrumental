package com.zmm2025.instrumental.datagen;

import com.zmm2025.instrumental.Instrumental;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateGenerator extends BlockStateProvider {

    public BlockStateGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Instrumental.MOD_ID, helper);
    }


    @Override
    protected void registerStatesAndModels() {
//        simpleBlock(Registration.BLOCK_OF_EXAMPLE.get());
    }
}
