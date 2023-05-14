package com.zmm2025.instrumental.datagen;

import com.zmm2025.instrumental.Instrumental;
import com.zmm2025.instrumental.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelGenerator extends ItemModelProvider {

    public ItemModelGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Instrumental.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
//        withExistingParent(Registration.BLOCK_OF_EXAMPLE_ITEM.get().getRegistryName().getPath(), modLoc("block/block_of_example"));

        singleTexture(Registration.SAXOPHONE.getKey().toString(), // Verify "getKey().toString()"
                mcLoc("item/generated"),
                "layer0", modLoc("item/saxophone"));
    }
}
