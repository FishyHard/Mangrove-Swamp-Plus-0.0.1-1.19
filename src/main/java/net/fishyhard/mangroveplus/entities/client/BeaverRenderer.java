package net.fishyhard.mangroveplus.entities.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fishyhard.mangroveplus.MangroveSwampPlus;
import net.fishyhard.mangroveplus.entities.custom.Beaver;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BeaverRenderer extends GeoEntityRenderer<Beaver> {
    public BeaverRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BeaverModel());
        this.shadowRadius = 0.2f;
    }
    @Override
    public ResourceLocation getTextureLocation(Beaver instance) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID, "textures/entity/beaver/beaver.png");
    }

    @Override
    public RenderType getRenderType(Beaver animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}