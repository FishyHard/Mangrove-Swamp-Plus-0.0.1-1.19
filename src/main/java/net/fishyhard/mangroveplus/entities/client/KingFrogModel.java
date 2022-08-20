package net.fishyhard.mangroveplus.entities.client;

import net.fishyhard.mangroveplus.MangroveSwampPlus;
import net.fishyhard.mangroveplus.entities.custom.KingFrog;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class KingFrogModel extends AnimatedGeoModel<KingFrog> {
    @Override
    public ResourceLocation getModelResource(KingFrog object) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID,"geo/kingfrog.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KingFrog object) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID,"textures/entity/kingfrog/kingfrog.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KingFrog animatable) {
        return new ResourceLocation(MangroveSwampPlus.MOD_ID,"animations/kingfrog.animation.json");
    }
}
