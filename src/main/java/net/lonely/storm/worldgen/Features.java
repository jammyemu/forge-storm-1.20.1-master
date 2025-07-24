package net.lonely.storm.worldgen;

import com.mojang.serialization.Codec;
import net.lonely.storm.worldgen.config.CrampVegetationConfig;
//import net.lonely.storm.worldgen.features.CrampVegetationFeature;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.LevelWriter;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.NetherForestVegetationFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NetherForestVegetationConfig;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Features<FC extends FeatureConfiguration> {

    //public static final Feature<CrampVegetationConfig> CRAMP_VEGETATION = register("cramp_vegetation", new CrampVegetationFeature(CrampVegetationConfig.CODEC));


    private static <C extends FeatureConfiguration, F extends Feature<C>> F register(String pKey, F pValue) {
        return Registry.register(BuiltInRegistries.FEATURE, pKey, pValue);
    }

    public Features(Codec<FC> pCodec) {
    }

    protected void setBlock(LevelWriter pLevel, BlockPos pPos, BlockState pState) {
        pLevel.setBlock(pPos, pState, 3);
    }

    public static Predicate<BlockState> isReplaceable(TagKey<Block> pBlockTag) {
        return (p_204739_) -> {
            return !p_204739_.is(pBlockTag);
        };
    }

    protected void safeSetBlock(WorldGenLevel pLevel, BlockPos pPos, BlockState pState, Predicate<BlockState> pOldState) {
        if (pOldState.test(pLevel.getBlockState(pPos))) {
            pLevel.setBlock(pPos, pState, 2);
        }

    }

    /**
     * Places the given feature at the given location.
     * During world generation, features are provided with a 3x3 region of chunks, centered on the chunk being generated,
     * that they can safely generate into.
     * @param pContext A context object with a reference to the level and the position the feature is being placed at
     */
    public abstract boolean place(FeaturePlaceContext<FC> pContext);

    public boolean place(FC pConfig, WorldGenLevel pLevel, ChunkGenerator pChunkGenerator, RandomSource pRandom, BlockPos pOrigin) {
        return pLevel.ensureCanWrite(pOrigin) ? this.place(new FeaturePlaceContext<>(Optional.empty(), pLevel, pChunkGenerator, pRandom, pOrigin, pConfig)) : false;
    }

    protected static boolean isStone(BlockState pState) {
        return pState.is(net.minecraftforge.common.Tags.Blocks.STONE);
    }

    public static boolean isDirt(BlockState p_159760_) {
        return p_159760_.is(BlockTags.DIRT);
    }

    public static boolean isGrassOrDirt(LevelSimulatedReader pLevel, BlockPos pPos) {
        return pLevel.isStateAtPosition(pPos, Feature::isDirt);
    }

    /**
     * @return {@code true} if any of the six adjacent blocks to the block at {@code pos} return {@code true} to the
     * given filter.
     * @param pAdjacentStateAccessor An accessor for the adjacent blocks. Essentially {@code level::getBlockState}.
     */
    public static boolean checkNeighbors(Function<BlockPos, BlockState> pAdjacentStateAccessor, BlockPos pPos, Predicate<BlockState> pFilter) {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for(Direction direction : Direction.values()) {
            blockpos$mutableblockpos.setWithOffset(pPos, direction);
            if (pFilter.test(pAdjacentStateAccessor.apply(blockpos$mutableblockpos))) {
                return true;
            }
        }

        return false;
    }

    /**
     * @return {@code true} if any of the six adjacent blocks to the block at {@code pos} are air.
     * @param pAdjacentStateAccessor An accessor for the adjacent blocks. Essentially {@code level::getBlockState}.
     */
    public static boolean isAdjacentToAir(Function<BlockPos, BlockState> pAdjacentStateAccessor, BlockPos pPos) {
        return checkNeighbors(pAdjacentStateAccessor, pPos, BlockBehaviour.BlockStateBase::isAir);
    }

    /**
     * If the above two blocks are not air, marks them for post-processing.
     * This is used to prevent floating grass during the generation of features that carve blocks out of the terrain,
     * after other plant-like blocks have generated (such as lake features).
     */
    protected void markAboveForPostProcessing(WorldGenLevel pLevel, BlockPos pBasePos) {
        BlockPos.MutableBlockPos blockpos$mutableblockpos = pBasePos.mutable();

        for(int i = 0; i < 2; ++i) {
            blockpos$mutableblockpos.move(Direction.UP);
            if (pLevel.getBlockState(blockpos$mutableblockpos).isAir()) {
                return;
            }

            pLevel.getChunk(blockpos$mutableblockpos).markPosForPostprocessing(blockpos$mutableblockpos);
        }

    }
}
