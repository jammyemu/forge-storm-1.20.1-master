package net.lonely.storm.event;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.ModBlockEntities;
import net.lonely.storm.entity.custom.AlchemizingStationBlockEntity;
import net.lonely.storm.particles.CrampStoneParticles;
import net.lonely.storm.particles.ModParticles;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StormMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.CRAMP_STONE_PARTICLES.get(), CrampStoneParticles.Provider::new);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {


        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
    }

}
