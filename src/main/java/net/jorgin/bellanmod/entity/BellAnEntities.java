package net.jorgin.bellanmod.entity;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.entity.custom.BolinhaEntity;
import net.jorgin.bellanmod.entity.custom.PhantomModEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BellAnEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BellAnMod.MOD_ID);

    public static final RegistryObject<EntityType<BolinhaEntity>> BOLINNHA =
            ENTITY_TYPES.register("bolinha", () -> EntityType.Builder.of(BolinhaEntity::new, MobCategory.CREATURE)
                            .sized(1.0f,1.0f).build("bolinha"));

    public static final RegistryObject<EntityType<PhantomModEntity>> PHANTOMMOD =
            ENTITY_TYPES.register("phantommod", () -> EntityType.Builder.of(PhantomModEntity::new, MobCategory.CREATURE)
                    .sized(0.6f,2.0f).build("phantommod"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
