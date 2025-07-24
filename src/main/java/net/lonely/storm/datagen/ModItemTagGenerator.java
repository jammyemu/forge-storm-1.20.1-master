package net.lonely.storm.datagen;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, StormMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.GRIMWOOD_LOG.get().asItem())
                .add(ModBlocks.GRIMWOOD_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_GRIMWOOD_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_GRIMWOOD_WOOD.get().asItem())
                .add(ModBlocks.BOGBIRCH_LOG.get().asItem())
                .add(ModBlocks.BOGBIRCH_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BOGBIRCH_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BOGBIRCH_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.GRIMWOOD_PLANKS.get().asItem())
                .add(ModBlocks.BOGBIRCH_PLANKS.get().asItem());
    }
}
