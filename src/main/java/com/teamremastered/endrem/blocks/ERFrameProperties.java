package com.teamremastered.endrem.blocks;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

@MethodsReturnNonnullByDefault
public enum ERFrameProperties implements StringRepresentable {
    EMPTY,
    OLD_EYE,
    ROGUE_EYE,
    NETHER_EYE,
    BLACK_EYE,
    WITHER_EYE,
    CURSED_EYE,
    EVIL_EYE,
    UNDEAD_EYE,
    SHANDIAN,
    YANJIANG,
    XIAOCHOU,
    LVHEI,
    SHANYAO,
    ZONGHEI,
    JIXIE,
    ZUANSHI,
    FANGXING,
    LVBAOSHI,
    HUANGJING,
    YUANGU,
    FENGMI;

    public String toString() {
        return this.getSerializedName();
    }

    public String getSerializedName() {
        return switch (this) {
            case EMPTY -> "empty";
            case OLD_EYE -> "old_eye";
            case ROGUE_EYE -> "rogue_eye";
            case NETHER_EYE -> "nether_eye";
            case BLACK_EYE -> "black_eye";
            case WITHER_EYE -> "wither_eye";
            case CURSED_EYE -> "cursed_eye";
            case EVIL_EYE -> "evil_eye";
            case UNDEAD_EYE -> "undead_eye";
            case SHANDIAN -> "shandian_eye";
            case YANJIANG -> "yanjiang_eye";
            case XIAOCHOU -> "xiaochou_eye";
            case LVBAOSHI -> "lvbaoshi_eye";
            case SHANYAO -> "shanyao_eye";
            case LVHEI -> "lvhei_eye";
            case ZONGHEI -> "zonghei_eye";
            case JIXIE -> "jixie_eye";
            case ZUANSHI -> "zuanshi_eye";
            case FANGXING -> "fangxing_eye";
            case HUANGJING -> "huangjing_eye";
            case YUANGU -> "yuangu_eye";
            case FENGMI -> "fengmi_eye";

        };
    }

    public static ERFrameProperties getFramePropertyFromEye(Item eye) {

        for (ERFrameProperties property : ERFrameProperties.values()) {
            // match the serialized name of the property to the item name of the eye
            ResourceLocation eyeRegistryName = ForgeRegistries.ITEMS.getKey(eye);
            assert eyeRegistryName != null;
            if (property.toString().equals(eyeRegistryName.toString().split(":")[1])) {
                return property;
            }
        }

        return EMPTY;
    }
}
