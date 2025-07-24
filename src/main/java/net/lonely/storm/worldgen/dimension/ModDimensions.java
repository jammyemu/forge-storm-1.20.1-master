package net.lonely.storm.worldgen.dimension;
import com.mojang.datafixers.util.Pair;
import net.lonely.storm.StormMod;
import net.lonely.storm.worldgen.biome.ModBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.util.List;
import java.util.OptionalLong;

public class ModDimensions {
    public static final ResourceKey<LevelStem> CRAMP_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(StormMod.MOD_ID, "cramp"));
    public static final ResourceKey<Level> CRAMP_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(StormMod.MOD_ID, "cramp"));
    public static final ResourceKey<DimensionType> CRAMP_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(StormMod.MOD_ID, "cramp_type"));


    public static void bootstrapType(BootstapContext<DimensionType> context) {
        /*context.register(CRAMP_TYPE, new DimensionType(
                OptionalLong.of(24000), // fixedTime
                false, // hasSkylight
                true, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                false, // bedWorks
                false, // respawnAnchorWorks
                16, // minY
                256, // height
                180, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.NETHER_EFFECTS, // effectsLocation
                0.4f, // ambientLight
                new DimensionType.MonsterSettings(true, false, ConstantInt.of(0), 0)));
         */
    }

    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        /*
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(Biomes.WINDSWEPT_HILLS)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.FLOATING_ISLANDS));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(Pair.of(
                                Climate.parameters(0.4F, 0.4F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F), biomeRegistry.getOrThrow(ModBiomes.TEST_BIOME)),
                                Pair.of(Climate.parameters(0.1F, 0.2F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(Biomes.DEEP_DARK))
                                //.of(Climate.parameters(0.3F, 0.6F, 0.1F, 0.1F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(Biomes.OCEAN)),
                                //Pair.of(Climate.parameters(0.4F, 0.3F, 0.2F, 0.1F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(Biomes.DARK_FOREST))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.CAVES));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.CRAMP_TYPE), noiseBasedChunkGenerator);

        context.register(CRAMP_KEY, stem);
         */
    }
}
