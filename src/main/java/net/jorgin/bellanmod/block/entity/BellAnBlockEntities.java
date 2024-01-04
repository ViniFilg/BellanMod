package net.jorgin.bellanmod.block.entity;

import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.block.BellAnBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BellAnBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BellAnMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<LavaSmelterBlockEntity>> LAVA_SMELTER_BE =
            BLOCK_ENTITIES.register("lava_smelter_be",
                    () -> BlockEntityType.Builder.of(LavaSmelterBlockEntity::new, BellAnBlocks.LAVA_SMELTER.get())
                            .build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
