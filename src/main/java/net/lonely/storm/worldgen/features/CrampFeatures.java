package net.lonely.storm.worldgen.features;

import com.google.common.collect.ImmutableList;
import net.lonely.storm.worldgen.ModConfiguredFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class CrampFeatures {

    public static final ResourceKey<PlacedFeature> CRYSTAL_PILE = PlacementUtils.createKey("crystal_pile");


    public static void bootstrap(BootstapContext<PlacedFeature> pContext) {
        //HolderGetter<ConfiguredFeature<?, ?>> holdergetter = pContext.lookup(ModConfiguredFeatures.CRYSTAL_PILE_BLUE_KEY);
        //Holder<ConfiguredFeature<?, ?>> holder = holdergetter.getOrThrow(CrampFeatures.CRYSTAL_PILE);
        //PlacementUtils.register(pContext, CRYSTAL_PILE, holder, CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    }



}
