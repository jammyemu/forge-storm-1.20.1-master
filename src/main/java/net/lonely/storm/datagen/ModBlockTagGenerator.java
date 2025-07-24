package net.lonely.storm.datagen;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, StormMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                //.add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ATHETITE_BLOCK.get(),
                        ModBlocks.PHYLLITE.get(),
                        ModBlocks.PHYLLITE_BRICKS.get(),
                        ModBlocks.PHYLLITE_SLAB.get(),
                        ModBlocks.PHYLLITE_STAIRS.get(),
                        ModBlocks.PHYLLITE_BRICK_SLAB.get(),
                        ModBlocks.PHYLLITE_BRICK_STAIRS.get(),
                        ModBlocks.PHYLLITE_PILLAR.get(),
                        ModBlocks.PHYLLITE_TILES.get(),
                        ModBlocks.CRACKED_PHYLLITE_BRICKS.get(),
                        ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB.get(),
                        ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS.get(),
                        ModBlocks.MOSSY_PHYLLITE_BRICKS.get(),
                        ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB.get(),
                        ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS.get(),
                        ModBlocks.CRAMPED_STONE.get(),
                        ModBlocks.CRAMP_CRYSTAL_BLUE.get(),
                        ModBlocks.CRAMP_CRYSTAL_GREEN.get(),
                        ModBlocks.CRAMP_CRYSTAL_PURPLE.get(),
                        ModBlocks.CRAMP_STONE_BRICKS.get(),
                        ModBlocks.CRAMP_STONE_TILES.get(),
                        ModBlocks.CRAMP_MUD_BRICKS.get(),
                        ModBlocks.CRAMP_STONE_FRACTAL.get(),
                        ModBlocks.CRAMP_STONE_CHECKERS.get(),
                        ModBlocks.CRAMP_STONE_PILLAR.get(),

                        ModBlocks.CRAMP_ATHETITE_ORE.get(),
                        ModBlocks.CRAMP_ETHERIUM_ORE.get(),
                        ModBlocks.CRAMP_FLORIUM_ORE.get(),
                        ModBlocks.CRAMP_GEOLIUM_ORE.get(),
                        ModBlocks.CRAMP_ILLOITE_ORE.get(),
                        ModBlocks.CRAMP_KROTEIS_ORE.get(),
                        ModBlocks.CRAMP_ORIBIUM_ORE.get(),
                        ModBlocks.CRAMP_PHOENITE_ORE.get(),
                        ModBlocks.CRAMP_RIDONEITE_ORE.get(),
                        ModBlocks.CRAMP_STARMEAR_ORE.get(),
                        ModBlocks.CRAMP_LOST_ORE.get(),
                        ModBlocks.CRAMP_THORIUM_ORE.get()
                                                );

                        //ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        //ModBlocks.SAPPHIRE_ORE.get(),
                        //ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        //ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        //ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        //ModBlocks.SOUND_BLOCK.get());


        //this.tag(BlockTags.NEEDS_IRON_TOOL)
                //.add(ModBlocks.SAPPHIRE_BLOCK.get());

        //this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                //.add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

        //this.tag(BlockTags.NEEDS_STONE_TOOL)
                //.add(ModBlocks.NETHER_SAPPHIRE_ORE.get());

        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                //.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.GRIMWOOD_LOG.get())
                .add(ModBlocks.GRIMWOOD_WOOD.get())
                .add(ModBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(ModBlocks.STRIPPED_GRIMWOOD_WOOD.get())

                .add(ModBlocks.BOGBIRCH_LOG.get())
                .add(ModBlocks.BOGBIRCH_WOOD.get())
                .add(ModBlocks.STRIPPED_BOGBIRCH_LOG.get())
                .add(ModBlocks.STRIPPED_BOGBIRCH_WOOD.get())

                .add(ModBlocks.POPLAR_LOG.get())
                .add(ModBlocks.POPLAR_WOOD.get())
                .add(ModBlocks.STRIPPED_POPLAR_LOG.get())
                .add(ModBlocks.STRIPPED_POPLAR_WOOD.get())

                .add(ModBlocks.MURIAR_LOG.get())
                .add(ModBlocks.MURIAR_WOOD.get())
                .add(ModBlocks.STRIPPED_MURIAR_LOG.get())
                .add(ModBlocks.STRIPPED_MURIAR_WOOD.get())

                .add(ModBlocks.WEATHERED_SPRUCE_LOG.get())
                .add(ModBlocks.WEATHERED_SPRUCE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.GRIMWOOD_PLANKS.get())
                .add(ModBlocks.BOGBIRCH_PLANKS.get())
                .add(ModBlocks.MURIAR_PLANKS.get())
                .add(ModBlocks.POPLAR_PLANKS.get())
                .add(ModBlocks.WEATHERED_SPRUCE_PLANKS.get());

    }
}
