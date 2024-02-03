package net.jorgin.bellanmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class BellAnFoods {
    public static final FoodProperties LIMBO_ESSENCE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS,200),1.0f )
            .build();
    public static final FoodProperties VODKA = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 400), 1.0f)
            .build();
}

