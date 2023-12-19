package net.jorgin.bellanmod.item;

import net.jorgin.bellanmod.BellAnMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BellAnItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BellAnMod.MOD_ID);

    public static final RegistryObject<Item> Goggles = ITEMS.register("goggles",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Limbo_Essence = ITEMS.register("limbo_essence",
            () -> new Item(new Item.Properties().food(BellAnFoods.LIMBO_ESSENCE)));

    // armas e ferramentas
    public static final RegistryObject<Item> Limbo_Staff = ITEMS.register("limbo_staff",
            () -> new SwordItem(Tiers.DIAMOND,7,4, new Item.Properties()));
    public static final RegistryObject<Item> Elektra_Dagger = ITEMS.register("elektra_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 8, 2, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
