package net.lonely.storm.worldgen;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> GRIMWOOD_PLACED_KEY = registerKey("grimwood_placed");
    public static final ResourceKey<PlacedFeature> BOGBIRCH_PLACED_KEY = registerKey("bogbirch_placed");
    public static final ResourceKey<PlacedFeature> POPLAR_PLACED_KEY = registerKey("poplar_placed");
    public static final ResourceKey<PlacedFeature> CRYSTAL_PILE_BLUE_PLACED_KEY = registerKey("crystal_pile_blue_placed");
    public static final ResourceKey<PlacedFeature> CRYSTAL_PILE_PURPLE_PLACED_KEY = registerKey("crystal_pile_purple_placed");
    public static final ResourceKey<PlacedFeature> CRYSTAL_PILE_GREEN_PLACED_KEY = registerKey("crystal_pile_green_placed");
    public static final ResourceKey<PlacedFeature> PHYLLITE_PLACED_KEY = registerKey("phyllite_placed");

    public static final ResourceKey<PlacedFeature> CRAMP_ATHETITE_PLACED_KEY = registerKey("athetite_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_ETHERIUM_PLACED_KEY = registerKey("etherium_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_FLORIUM_PLACED_KEY = registerKey("florium_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_GEOLIUM_PLACED_KEY = registerKey("geolium_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_ILLOITE_PLACED_KEY = registerKey("illoite_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_KROTEIS_PLACED_KEY = registerKey("kroteis_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_ORIBIUM_PLACED_KEY = registerKey("oribium_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_PHOENITE_PLACED_KEY = registerKey("phoenite_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_RIDONEITE_PLACED_KEY = registerKey("ridoneite_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_STARMEAR_PLACED_KEY = registerKey("starmear_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_LOST_PLACED_KEY = registerKey("lost_ore_placed");
    public static final ResourceKey<PlacedFeature> CRAMP_THORIUM_PLACED_KEY = registerKey("thorium_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CRAMP_ATHETITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_ATHETITE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_ETHERIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_ETHERIUM_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_FLORIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_FLORIUM_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_GEOLIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_GEOLIUM_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_ILLOITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_ILLOITE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_KROTEIS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_KROTEIS_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_ORIBIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_ORIBIUM_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_PHOENITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_PHOENITE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_RIDONEITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_RIDONEITE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_STARMEAR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_STARMEAR_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_LOST_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_LOST_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));
        register(context, CRAMP_THORIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAMP_THORIUM_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(192))));





        register(context, PHYLLITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PHYLLITE_KEY),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));

        register(context, GRIMWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRIMWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.GRIMWOOD_SAPLING.get()));

        register(context, BOGBIRCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BOGBIRCH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.BOGBIRCH_SAPLING.get()));

        register(context, POPLAR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POPLAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.POPLAR_SAPLING.get()));

        register(context, CRYSTAL_PILE_BLUE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRYSTAL_PILE_BLUE),
                List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP));

        register(context, CRYSTAL_PILE_GREEN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRYSTAL_PILE_GREEN),
                List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP));

        register(context, CRYSTAL_PILE_PURPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRYSTAL_PILE_PURPLE),
                List.of(InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(StormMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}