package com.teamremastered.endrem.registers;

import com.teamremastered.endrem.EndRemastered;
import com.teamremastered.endrem.items.EREnderEye;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ERItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndRemastered.MOD_ID);

    public static void initRegister(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    // ==== Eyes ====


    // Normal eye
    public static final RegistryObject<Item> BLACK_EYE = ITEMS.register("black_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.COMMON).stacksTo(16)));
    public static final RegistryObject<Item> NETHER_EYE = ITEMS.register("nether_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> OLD_EYE = ITEMS.register("old_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.COMMON).stacksTo(16)));
    public static final RegistryObject<Item> ROGUE_EYE = ITEMS.register("rogue_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> CURSED_EYE = ITEMS.register("cursed_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.COMMON).stacksTo(16)));
    public static final RegistryObject<Item> EVIL_EYE = ITEMS.register("evil_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> WITHER_EYE = ITEMS.register("wither_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.COMMON).stacksTo(16)));
    // ALL extra eye
    public static final RegistryObject<Item> SHANDIAN_EYE = ITEMS.register("shandian_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> YANJIANG_EYE = ITEMS.register("yanjiang_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> XIAOCHOU_EYE = ITEMS.register("xiaochou_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> LVHEI_EYE = ITEMS.register("lvhei_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> SHANYAO_EYE = ITEMS.register("shanyao_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> ZONGHEI_EYE = ITEMS.register("zonghei_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> JIXIE_EYE = ITEMS.register("jixie_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> ZUANSHI_EYE = ITEMS.register("zuanshi_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> FANGXING_EYE = ITEMS.register("fangxing_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> HUANGJING_EYE = ITEMS.register("huangjing_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> LVBAOSHI_EYE = ITEMS.register("lvbaoshi_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> YUANGU_EYE = ITEMS.register("yuangu_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    public static final RegistryObject<Item> FENGMI_EYE = ITEMS.register("fengmi_eye", () -> new EREnderEye(new Item.Properties().fireResistant().rarity(Rarity.RARE).stacksTo(16)));
    // ==== Other Items ====
    public static final RegistryObject<Item> WITCH_PUPIL = ITEMS.register("witch_pupil", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNDEAD_SOUL = ITEMS.register("undead_soul", () -> new Item(new Item.Properties()));
}
