package com.teamremastered.endrem.mixin.compat;

import com.teamremastered.endrem.config.ERConfig;
import com.teamremastered.endrem.registers.ERItems;
import com.teamremastered.endrem.utils.CrypticEyeDistribution;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.violetmoon.quark.addons.oddities.inventory.MatrixEnchantingMenu;

import java.util.Random;

@Mixin(MatrixEnchantingMenu.class)
public class MatrixEnchantingMenuMixin {
    @Inject(method = "finish", at = @At("TAIL"), remap = false)
    private void endrem$finishEnchantingAtMatrixTable(Player player, ItemStack stack, CallbackInfo ci){
        CrypticEyeDistribution.rollForCrypticEye(player);
    }
}
