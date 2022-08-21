package net.fishyhard.mangroveplus.entities.client;

import net.fishyhard.mangroveplus.MangroveSwampPlus;
import net.fishyhard.mangroveplus.entities.custom.Beaver;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BeaverModel extends AnimatedGeoModel<Beaver> {
    @Override
    public ResourceLocation getModelResource(Beaver object) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID,"geo/beaver.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Beaver object) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID,"textures/entity/beaver/beaver.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Beaver animatable) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID,"animations/beaver.animation.json");
    }
}
