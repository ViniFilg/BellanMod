package net.jorgin.bellanmod.item;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.entity.BellAnEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BellAnItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BellAnMod.MOD_ID);
    public static final RegistryObject<Item> Goggles = ITEMS.register("goggles",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Brasadil = ITEMS.register("brasadil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Brasell = ITEMS.register("brasell",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Matrix_Gold = ITEMS.register("matrix_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Aquarel = ITEMS.register("aquarel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Silver = ITEMS.register("silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Lead = ITEMS.register("lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Gear = ITEMS.register("gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Bolinha_Spawn_Egg = ITEMS.register("bolinha_spawn_egg",
            () -> new ForgeSpawnEggItem(BellAnEntities.BOLINNHA, 0x2ECC71, 0x0E6655, new Item.Properties()));
    public static final RegistryObject<Item> PhantomMod_Spawn_Egg = ITEMS.register("phantommod_spawn_egg",
            () -> new ForgeSpawnEggItem(BellAnEntities.PHANTOMMOD, 0x865F1D, 0x400062, new Item.Properties()));


    public static final RegistryObject<Item> Limbo_Essence = ITEMS.register("limbo_essence",
            () -> new Item(new Item.Properties().food(BellAnFoods.LIMBO_ESSENCE)));
    public static final RegistryObject<Item> Vodka = ITEMS.register("vodka",
            () -> new Item(new Item.Properties().food(BellAnFoods.VODKA)));


    // armas e ferramentas
    public static final RegistryObject<Item> Wrench = ITEMS.register("wrench",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Limbo_Staff = ITEMS.register("limbo_staff",
            () -> new SwordItem(Tiers.DIAMOND,7,4, new Item.Properties()));
    public static final RegistryObject<Item> Elektra_Dagger = ITEMS.register("elektra_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 8, 2, new Item.Properties()));

    // matrix gold tools
    public static final RegistryObject<Item> Matrix_Gold_Sword = ITEMS.register("matrix_gold_sword",
            () -> new SwordItem(BellAnToolTiers.MATRIX_GOLD, 6, 4, new Item.Properties()));
    public static final RegistryObject<Item> Matrix_Gold_Pickaxe = ITEMS.register("matrix_gold_pickaxe",
            () -> new PickaxeItem(BellAnToolTiers.MATRIX_GOLD, 4, 5, new Item.Properties()));
    public static final RegistryObject<Item> Matrix_Gold_Axe = ITEMS.register("matrix_gold_axe",
            () -> new AxeItem(BellAnToolTiers.MATRIX_GOLD, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> Matrix_Gold_Shovel = ITEMS.register("matrix_gold_shovel",
            () -> new ShovelItem(BellAnToolTiers.MATRIX_GOLD, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> Matrix_Gold_Hoe = ITEMS.register("matrix_gold_hoe",
            () -> new HoeItem(BellAnToolTiers.MATRIX_GOLD, 0, 0, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
