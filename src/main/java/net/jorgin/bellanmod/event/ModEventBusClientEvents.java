package net.jorgin.bellanmod.event;


import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.entity.client.BolinhaModel;
import net.jorgin.bellanmod.entity.client.ModModelLayers;
import net.jorgin.bellanmod.entity.client.PhantomModModel;
import net.minecraft.client.model.PhantomModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BellAnMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.BOLINHA_LAYER, BolinhaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.PHANTOMMOD_LAYER, PhantomModModel::createBodyLayer);
    }
}
