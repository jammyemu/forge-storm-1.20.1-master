package net.lonely.storm.datagen;

import net.lonely.storm.StormMod;
import net.lonely.storm.fluid.ModFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModFluidTagsProvider extends FluidTagsProvider {
    public ModFluidTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, StormMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void  addTags(HolderLookup.Provider pProvider) {
        tag(FluidTags.WATER)
                .add(ModFluids.SOURCE_PURE_WATER.get())
                .add(ModFluids.FLOWING_PURE_WATER.get())
                .add(ModFluids.SOURCE_VOID_LIQUID.get())
                .add(ModFluids.FLOWING_VOID_LIQUID.get());
    }
}
