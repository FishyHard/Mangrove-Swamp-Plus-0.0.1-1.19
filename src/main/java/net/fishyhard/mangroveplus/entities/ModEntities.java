package net.fishyhard.mangroveplus.entities;

import net.fishyhard.mangroveplus.MangroveSwampPlus;
import net.fishyhard.mangroveplus.entities.custom.KingFrog;
import net.minecraft.ResourceLocationException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MangroveSwampPlus.MOD_ID);

    public static final RegistryObject<EntityType<KingFrog>> KING_FROG =
            ENTITIES.register("king_frog",
            () -> EntityType.Builder.<KingFrog>of(KingFrog::new, MobCategory.CREATURE)
                    .sized(2F, 2F)
                    .build(new ResourceLocation(MangroveSwampPlus.MOD_ID, "king_frog").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
