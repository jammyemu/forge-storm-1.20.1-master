package net.lonely.storm.worldgen;

import com.mojang.serialization.Codec;
import net.lonely.storm.StormMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_GRIMWOOD = registerKey("add_tree_grimwood");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BOGBIRCH = registerKey("add_tree_bogbirch");
    public static final ResourceKey<BiomeModifier> ADD_TREE_POPLAR = registerKey("add_tree_poplar");
    public static final ResourceKey<BiomeModifier> ADD_CRYSTAL_PILE_BLUE = registerKey("add_crystal_pile_blue");
    public static final ResourceKey<BiomeModifier> ADD_CRYSTAL_PILE_GREEN = registerKey("add_crystal_pile_green");
    public static final ResourceKey<BiomeModifier> ADD_CRYSTAL_PILE_PURPLE = registerKey("add_crystal_pile_purple");

    public static final ResourceKey<BiomeModifier> ADD_PHYLLITE = registerKey("add_phyllite");

    public static final ResourceKey<BiomeModifier> EXAMPLE_MODIFIER = ResourceKey.create(
            ForgeRegistries.Keys.BIOME_MODIFIERS, // The registry this key is for
            new ResourceLocation(StormMod.MOD_ID, "cramp_crystals") // The registry name
    );

    public static final TagKey<Biome> CRAMP_CRYSTALS = TagKey.create(Registries.BIOME, new ResourceLocation(StormMod.MOD_ID, "cramp_crystals"));

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_PHYLLITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PHYLLITE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        /* context.register(ADD_CRYSTAL_PILE_BLUE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(CRAMP_CRYSTALS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CRYSTAL_PILE_BLUE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CRYSTAL_PILE_GREEN, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(CRAMP_CRYSTALS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CRYSTAL_PILE_GREEN_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_CRYSTAL_PILE_PURPLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(CRAMP_CRYSTALS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CRYSTAL_PILE_PURPLE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

           context.register(ADD_TREE_GRIMWOOD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_UNDERGROUND),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.GRIMWOOD_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_BOGBIRCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.BOGBIRCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_TREE_POPLAR, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.POPLAR_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
         */

    }

    public Codec<? extends BiomeModifier> codec()
    {
        return null;
        // This must return a registered Codec, see Biome Modifier Serializers below.
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(StormMod.MOD_ID, name));
    }
}
