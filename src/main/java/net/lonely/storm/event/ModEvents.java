package net.lonely.storm.event;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.ModEntities;
import net.lonely.storm.entity.custom.CrampCrabEntity;
import net.lonely.storm.entity.custom.CrystalSkeletonEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = StormMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModEntities.CRYSTAL_SKELETON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Monster::checkMobSpawnRules);
            SpawnPlacements.register(ModEntities.CRAMP_CRAB.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING, Mob::checkMobSpawnRules);

        });
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CRYSTAL_SKELETON.get(), CrystalSkeletonEntity.setAttributes());
        event.put(ModEntities.CRAMP_CRAB.get(), CrampCrabEntity.setAttributes());

    }

}
