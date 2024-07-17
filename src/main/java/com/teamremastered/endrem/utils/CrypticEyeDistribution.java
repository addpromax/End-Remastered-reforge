package com.teamremastered.endrem.utils;

import com.teamremastered.endrem.config.ERConfig;
import com.teamremastered.endrem.registers.ERItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class CrypticEyeDistribution {
    public static void rollForCrypticEye(Player player){
        Random random = new Random();
        int maxValue = 120;
        int randomNumber = random.nextInt(maxValue);
        if (ERConfig.IS_CRYPTIC_EYE_OBTAINABLE.getRaw() && !player.level().isClientSide && player != null) {
            if (randomNumber == maxValue - 1) {
                player.getInventory().add(new ItemStack(ERItems.BLACK_EYE.get()));
            }
        }
    }
}
