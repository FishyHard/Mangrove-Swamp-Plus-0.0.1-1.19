package net.fishyhard.mangroveplus.event;

import net.fishyhard.mangroveplus.MangroveSwampPlus;
import net.fishyhard.mangroveplus.entities.ModEntities;
import net.fishyhard.mangroveplus.entities.custom.KingFrog;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MangroveSwampPlus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KING_FROG.get(), KingFrog.setAttributes());
    }
}
