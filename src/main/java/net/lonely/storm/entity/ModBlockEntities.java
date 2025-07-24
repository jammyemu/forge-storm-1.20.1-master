package net.lonely.storm.entity;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.entity.custom.AlchemizingStationBlockEntity;
import net.lonely.storm.entity.custom.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StormMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<AlchemizingStationBlockEntity>> ALCHEMIZING_STATION_BE =
            BLOCK_ENTITIES.register("alchemizing_station_block_entity", () ->
                    BlockEntityType.Builder.of(AlchemizingStationBlockEntity::new,
                            ModBlocks.ALCHEMIZING_STATION.get()).build(null));


    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.GRIMWOOD_SIGN.get(), ModBlocks.GRIMWOOD_WALL_SIGN.get(),
                            ModBlocks.BOGBIRCH_SIGN.get(), ModBlocks.BOGBIRCH_WALL_SIGN.get(),
                            ModBlocks.POPLAR_SIGN.get(), ModBlocks.POPLAR_WALL_SIGN.get(),
                            ModBlocks.MURIAR_SIGN.get(), ModBlocks.MURIAR_WALL_SIGN.get(),
                            ModBlocks.WEATHERED_SPRUCE_SIGN.get(), ModBlocks.WEATHERED_SPRUCE_WALL_SIGN.get()
                    ).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}