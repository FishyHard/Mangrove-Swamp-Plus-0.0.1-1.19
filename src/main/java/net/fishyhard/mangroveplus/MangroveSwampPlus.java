package net.fishyhard.mangroveplus;

import com.mojang.logging.LogUtils;
import net.fishyhard.mangroveplus.entities.ModEntities;
import net.fishyhard.mangroveplus.entities.client.KingFrogRenderer;
import net.fishyhard.mangroveplus.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MangroveSwampPlus.MOD_ID)
public class MangroveSwampPlus
{
    public static final String MOD_ID = "mangroveplus";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MangroveSwampPlus()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        //Entities Register
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);


        GeckoLib.initialize();

        //register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
    private void clientSetup(final FMLCommonSetupEvent event) {
        EntityRenderers.register(ModEntities.KING_FROG.get(), KingFrogRenderer::new);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.KING_FROG.get(), KingFrogRenderer::new);
        }
    }
}
