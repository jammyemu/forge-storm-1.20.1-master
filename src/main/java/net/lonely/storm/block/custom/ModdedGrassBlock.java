package net.lonely.storm.block.custom;

import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.particles.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.NetherFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.lighting.LightEngine;
import org.apache.logging.log4j.core.jmx.Server;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ModdedGrassBlock extends Block implements BonemealableBlock {
    public ModdedGrassBlock(BlockBehaviour.Properties p_53685_) {
        super(p_53685_);
    }

    /**
     * @return whether bonemeal can be used on this block
     */
    private static boolean canBeCrampedGrass(BlockState pState, LevelReader pReader, BlockPos pPos) {
        BlockPos blockpos = pPos.above();
        BlockState blockstate = pReader.getBlockState(blockpos);
        int i = LightEngine.getLightBlockInto(pReader, pState, pPos, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(pReader, blockpos));
        return i < pReader.getMaxLightLevel();
    }

    /**
     * Performs a random tick on a block.
     */
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!canBeCrampedGrass(pState, pLevel, pPos)) {
            pLevel.setBlockAndUpdate(pPos, ModBlocks.CRAMPED_EARTH.get().defaultBlockState());
        }

    }

    /**
     * @return whether bonemeal can be used on this block
     */
    public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return pLevel.getBlockState(pPos.above()).isAir();
    }

    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true;
    }

    public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        BlockState blockstate = pLevel.getBlockState(pPos);
        BlockPos blockpos = pPos.above();
        ChunkGenerator chunkgenerator = pLevel.getChunkSource().getGenerator();
        Registry<ConfiguredFeature<?, ?>> registry = pLevel.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE);
        if (blockstate.is(ModBlocks.CRAMPED_GRASS.get())) {
            this.place(registry, NetherFeatures.CRIMSON_FOREST_VEGETATION_BONEMEAL, pLevel, chunkgenerator, pRandom, blockpos);
            this.place(registry, NetherFeatures.WARPED_FOREST_VEGETATION_BONEMEAL, pLevel, chunkgenerator, pRandom, blockpos);
            this.place(registry, NetherFeatures.NETHER_SPROUTS_BONEMEAL, pLevel, chunkgenerator, pRandom, blockpos);
            if (pRandom.nextInt(8) == 0) {
                this.place(registry, NetherFeatures.TWISTING_VINES_BONEMEAL, pLevel, chunkgenerator, pRandom, blockpos);
            }
        }

    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.relative(facing));
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));

        if (plant.getBlock() == Blocks.CACTUS)
            return state.is(Blocks.CACTUS) || state.is(BlockTags.SAND);

        if (plant.getBlock() == Blocks.SUGAR_CANE && this == Blocks.SUGAR_CANE)
            return true;

        if (plant.getBlock() == ModBlocks.CRAMP_FERN_TALL.get())
            return true;

        //if (plantable instanceof BushBlock && ((BushBlock)plantable).mayPlaceOn(state, world, pos))
            //return true;

        if (net.minecraftforge.common.PlantType.DESERT.equals(type)) {
            return false;
        } else if (net.minecraftforge.common.PlantType.NETHER.equals(type)) {
            return true;
        } else if (net.minecraftforge.common.PlantType.CROP.equals(type)) {
            return false;
        } else if (net.minecraftforge.common.PlantType.CAVE.equals(type)) {
            return state.isFaceSturdy(world, pos, Direction.UP);
        } else if (net.minecraftforge.common.PlantType.PLAINS.equals(type)) {
            return true;
        } else if (net.minecraftforge.common.PlantType.WATER.equals(type)) {
            return (state.is(Blocks.WATER)) && world.getFluidState(pos.relative(facing)).isEmpty();
        } else if (net.minecraftforge.common.PlantType.BEACH.equals(type)) {
            return false;
        }
        return false;
    }

    private void place(Registry<ConfiguredFeature<?, ?>> pFeatureRegistry, ResourceKey<ConfiguredFeature<?, ?>> pFeatureKey, ServerLevel pLevel, ChunkGenerator pChunkGenerator, RandomSource pRandom, BlockPos pPos) {
        pFeatureRegistry.getHolder(pFeatureKey).ifPresent((p_255920_) -> {
            p_255920_.value().place(pLevel, pChunkGenerator, pRandom, pPos);
        });
    }


    /*@Override
    public void animateTick(BlockState stateIn, Level level, BlockPos pos, RandomSource rand) {
        float chance = 0.35f;
        if(chance < rand.nextFloat()) {
            level.addParticle(ModParticles.CRAMP_STONE_PARTICLES.get(), pos.getX() + rand.nextDouble(),
                    pos.getY() + 0.5D, pos.getZ() + rand.nextDouble(),
                    0d,0.05d,0d);
        }

        super.animateTick(stateIn, level, pos, rand);
    }*/
}

