package net.jorgin.bellanmod.event;


import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.entity.BellAnEntities;
import net.jorgin.bellanmod.entity.custom.BolinhaEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BellAnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BellAnEntities.BOLINNHA.get(), BolinhaEntity.createAttributes().build());
    }


}
