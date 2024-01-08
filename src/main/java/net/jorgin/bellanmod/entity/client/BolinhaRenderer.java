package net.jorgin.bellanmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jorgin.bellanmod.BellAnMod;
import net.jorgin.bellanmod.entity.custom.BolinhaEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BolinhaRenderer extends MobRenderer<BolinhaEntity, BolinhaModel<BolinhaEntity>> {
    public BolinhaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BolinhaModel<>(pContext.bakeLayer(ModModelLayers.BOLINHA_LAYER)), 0.1f);
    }

    @Override
    public ResourceLocation getTextureLocation(BolinhaEntity bolinhaEntity) {
        return new ResourceLocation(BellAnMod.MOD_ID, "textures/entity/bolinha_texture.png");
    }
    public void render(BolinhaEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
