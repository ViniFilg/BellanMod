package net.jorgin.bellanmod.recipe;

import net.jorgin.bellanmod.BellAnMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BellAnRecipes {
    // this class just works on the 1.20.1 version

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, BellAnMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<LavaSmelterRecipe>> LAVA_SMELTER_SERIALIZER =
            SERIALIZERS.register("lava_smeltering", () -> LavaSmelterRecipe.Serializer.INSTANCE);



    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}
