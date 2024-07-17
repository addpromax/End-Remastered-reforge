package com.teamremastered.endrem.registers;

import com.teamremastered.endrem.EndRemastered;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ERTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndRemastered.MOD_ID);

    public static void initRegister(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }

    public static final RegistryObject<CreativeModeTab> EYES_TAB = TABS.register("endrem_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.endrem.endrem_tab"))
                    .icon(() -> new ItemStack(ERItems.BLACK_EYE.get()))
                    .displayItems((featureFlags, output) -> {
                        // Register normal eye
                        output.accept(ERItems.BLACK_EYE.get());
                        output.accept(ERItems.NETHER_EYE.get());
                        output.accept(ERItems.OLD_EYE.get());
                        output.accept(ERItems.ROGUE_EYE.get());
                        output.accept(ERItems.CURSED_EYE.get());
                        output.accept(ERItems.EVIL_EYE.get());
                        output.accept(ERItems.WITHER_EYE.get());
                        output.accept(ERItems.WITCH_PUPIL.get());
                        output.accept(ERItems.UNDEAD_SOUL.get());
                        // Register extra eye
                        output.accept(ERItems.SHANDIAN_EYE.get());
                        output.accept(ERItems.YANJIANG_EYE.get());
                        output.accept(ERItems.XIAOCHOU_EYE.get());
                        output.accept(ERItems.LVHEI_EYE.get());
                        output.accept(ERItems.SHANYAO_EYE.get());
                        output.accept(ERItems.ZONGHEI_EYE.get());
                        output.accept(ERItems.JIXIE_EYE.get());
                        output.accept(ERItems.ZUANSHI_EYE.get());
                        output.accept(ERItems.FANGXING_EYE.get());
                        output.accept(ERItems.HUANGJING_EYE.get());
                        output.accept(ERItems.LVBAOSHI_EYE.get());
                        output.accept(ERItems.YUANGU_EYE.get());
                        output.accept(ERItems.FENGMI_EYE.get());
                        System.out.println("Items Registered");
                    } )
                    .build()
    );
}