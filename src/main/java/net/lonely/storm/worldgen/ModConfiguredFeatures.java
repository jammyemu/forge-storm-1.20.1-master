package net.lonely.storm.worldgen;

import com.google.common.collect.ImmutableList;
import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.CherryTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRIMWOOD_KEY = registerKey("grimwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BOGBIRCH_KEY = registerKey("bogbirch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_KEY = registerKey("poplar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_PILE_BLUE = registerKey("crystal_pile_blue");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_PILE_PURPLE = registerKey("crystal_pile_purple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_PILE_GREEN = registerKey("crystal_pile_green");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PHYLLITE_KEY = registerKey("phyllite");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_ATHETITE_KEY = registerKey("athetite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_ETHERIUM_KEY = registerKey("etherium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_FLORIUM_KEY = registerKey("florium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_GEOLIUM_KEY = registerKey("geolium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_ILLOITE_KEY = registerKey("illoite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_KROTEIS_KEY = registerKey("kroteis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_ORIBIUM_KEY = registerKey("oribium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_PHOENITE_KEY = registerKey("phoenite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_RIDONEITE_KEY = registerKey("ridoneite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_STARMEAR_KEY = registerKey("starmear_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_LOST_KEY = registerKey("lost_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAMP_THORIUM_KEY = registerKey("thorium_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest crampReplaceable = new BlockMatchTest(ModBlocks.CRAMPED_STONE.get());

        List<OreConfiguration.TargetBlockState> crampAthetiteOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_ATHETITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampEtheriumOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_ETHERIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampFloriumOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_FLORIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampGeoliumOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_GEOLIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampIlloiteOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_ILLOITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampKroteisOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_KROTEIS_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampOribiumOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_ORIBIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampPhoeniteOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_PHOENITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampRidoneiteOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_RIDONEITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampStarmearOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_STARMEAR_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampLostOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_LOST_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> crampThoriumOre = List.of(OreConfiguration.target(crampReplaceable,
                ModBlocks.CRAMP_THORIUM_ORE.get().defaultBlockState()));

        register(context, CRAMP_ATHETITE_KEY, Feature.ORE, new OreConfiguration(crampAthetiteOre, 5));
        register(context, CRAMP_ETHERIUM_KEY, Feature.ORE, new OreConfiguration(crampEtheriumOre, 5));
        register(context, CRAMP_FLORIUM_KEY, Feature.ORE, new OreConfiguration(crampFloriumOre, 5));
        register(context, CRAMP_GEOLIUM_KEY, Feature.ORE, new OreConfiguration(crampGeoliumOre, 5));
        register(context, CRAMP_KROTEIS_KEY, Feature.ORE, new OreConfiguration(crampKroteisOre, 5));
        register(context, CRAMP_ILLOITE_KEY, Feature.ORE, new OreConfiguration(crampIlloiteOre, 5));
        register(context, CRAMP_ORIBIUM_KEY, Feature.ORE, new OreConfiguration(crampOribiumOre, 5));
        register(context, CRAMP_PHOENITE_KEY, Feature.ORE, new OreConfiguration(crampPhoeniteOre, 5));
        register(context, CRAMP_RIDONEITE_KEY, Feature.ORE, new OreConfiguration(crampRidoneiteOre, 5));
        register(context, CRAMP_STARMEAR_KEY, Feature.ORE, new OreConfiguration(crampStarmearOre, 5));
        register(context, CRAMP_LOST_KEY, Feature.ORE, new OreConfiguration(crampLostOre, 5));
        register(context, CRAMP_THORIUM_KEY, Feature.ORE, new OreConfiguration(crampThoriumOre, 5));


        List<OreConfiguration.TargetBlockState> overworldPhyllite = List.of(OreConfiguration.target(stoneReplaceable,
                 ModBlocks.PHYLLITE.get().defaultBlockState()));

        register(context, OVERWORLD_PHYLLITE_KEY, Feature.ORE, new OreConfiguration(overworldPhyllite, 40));


        register(context, GRIMWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GRIMWOOD_LOG.get()),
                new StraightTrunkPlacer(8, 3, 0),
                BlockStateProvider.simple(ModBlocks.GRIMWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(5), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, BOGBIRCH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.BOGBIRCH_LOG.get()),
                new CherryTrunkPlacer(3, 2, 2, ConstantInt.of(1), ConstantInt.of(2), UniformInt.of(-1, 0), ConstantInt.of(0)),
                BlockStateProvider.simple(ModBlocks.BOGBIRCH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(4, 1, 3))
                .decorators(ImmutableList.of(TrunkVineDecorator.INSTANCE, new LeaveVineDecorator(0.5F))).build());

        register(context, POPLAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POPLAR_LOG.get()),
                new StraightTrunkPlacer(7, 2, 7),
                BlockStateProvider.simple(ModBlocks.POPLAR_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 6),
                new TwoLayersFeatureSize(4, 2, 3)).build());

        register(context, CRYSTAL_PILE_BLUE, Feature.BLOCK_PILE, new BlockPileConfiguration(BlockStateProvider.simple(ModBlocks.CRAMP_CRYSTAL_BLUE.get())));
        register(context, CRYSTAL_PILE_PURPLE, Feature.BLOCK_PILE, new BlockPileConfiguration(BlockStateProvider.simple(ModBlocks.CRAMP_CRYSTAL_PURPLE.get())));
        register(context, CRYSTAL_PILE_GREEN, Feature.BLOCK_PILE, new BlockPileConfiguration(BlockStateProvider.simple(ModBlocks.CRAMP_CRYSTAL_GREEN.get())));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(StormMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}