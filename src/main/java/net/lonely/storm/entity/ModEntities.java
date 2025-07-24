package net.lonely.storm.entity;

import net.lonely.storm.StormMod;
import net.lonely.storm.entity.custom.CrampCrabEntity;
import net.lonely.storm.entity.custom.CrystalSkeletonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StormMod.MOD_ID);

    public static final RegistryObject<EntityType<CrystalSkeletonEntity>> CRYSTAL_SKELETON =
            ENTITY_TYPES.register("crystal_skeleton",
                    () -> EntityType.Builder.of(CrystalSkeletonEntity::new, MobCategory.MONSTER)
                            .sized(0.8f, 2.0f)
                            .build(new ResourceLocation(StormMod.MOD_ID, "crystal_skeleton").toString()));

    public static final RegistryObject<EntityType<CrampCrabEntity>> CRAMP_CRAB =
            ENTITY_TYPES.register("cramp_crab",
                    () -> EntityType.Builder.of(CrampCrabEntity::new, MobCategory.AMBIENT)
                            .sized(0.8f, 2.0f)
                            .build(new ResourceLocation(StormMod.MOD_ID, "cramp_crab").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
