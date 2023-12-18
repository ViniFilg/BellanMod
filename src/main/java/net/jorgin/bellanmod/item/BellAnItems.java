package net.jorgin.bellanmod.item;

import net.jorgin.bellanmod.BellAnMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BellAnItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BellAnMod.MOD_ID);

    public static final RegistryObject<Item> Goggles = ITEMS.register("goggles",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Limbo_Staff = ITEMS.register("limbo_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Limbo_Essence = ITEMS.register("limbo_essence",
            () -> new Item(new Item.Properties().food(BellAnFoods.LIMBO_ESSENCE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
