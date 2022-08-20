package net.fishyhard.mangroveplus.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fishyhard.mangroveplus.MangroveSwampPlus;
import net.fishyhard.mangroveplus.entities.custom.KingFrog;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class KingFrogRenderer extends GeoEntityRenderer<KingFrog> {
    public KingFrogRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KingFrogModel());
        this.shadowRadius = 0.7f;
    }
    @Override
    public ResourceLocation getTextureLocation(KingFrog instance) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID, "textures/entity/kingfrog/kingfrog.png");
    }

    @Override
    public RenderType getRenderType(KingFrog animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
