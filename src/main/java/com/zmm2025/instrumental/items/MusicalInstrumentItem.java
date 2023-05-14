package com.zmm2025.instrumental.items;

import com.zmm2025.instrumental.setup.Registration;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MusicalInstrumentItem extends Item {

    public MusicalInstrumentItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        level.playSound(player, player.blockPosition(), Registration.TEST_SOUND_EVENT.get(), SoundSource.RECORDS, 1f, 1f);

        return super.use(level, player, usedHand);
    }
}
