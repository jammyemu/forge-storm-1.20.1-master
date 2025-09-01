package net.lonely.storm.datagen;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.datagen.custom.AlchemizingRecipeBuilder;
import net.lonely.storm.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //private static final List<ItemLike> ATHETITE_SMELTABLES = List.of(ModItems.ATHETITE_CLUMP.get(),
            //ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
            //ModBlocks.END_STONE_SAPPHIRE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        /*oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        */
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_SLAB.get(), ModBlocks.PHYLLITE.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_SLAB.get(), ModBlocks.PHYLLITE.get());
        stairs(ModBlocks.PHYLLITE_STAIRS.get(), ModBlocks.PHYLLITE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_STAIRS.get(), ModBlocks.PHYLLITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PHYLLITE_BRICKS.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.PHYLLITE.get())
                .unlockedBy(getHasName(ModBlocks.PHYLLITE.get()), has(ModBlocks.PHYLLITE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_BRICKS.get(), ModBlocks.PHYLLITE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_BRICK_SLAB.get(), ModBlocks.PHYLLITE_BRICKS.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_BRICK_SLAB.get(), ModBlocks.PHYLLITE.get());
        stairs(ModBlocks.PHYLLITE_BRICK_STAIRS.get(), ModBlocks.PHYLLITE_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_BRICK_STAIRS.get(), ModBlocks.PHYLLITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PHYLLITE_PILLAR.get(), 2)
                .pattern("S")
                .pattern("S")
                .define('S', ModBlocks.PHYLLITE.get())
                .unlockedBy(getHasName(ModBlocks.PHYLLITE.get()), has(ModBlocks.PHYLLITE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_PILLAR.get(), ModBlocks.PHYLLITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PHYLLITE_TILES.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.PHYLLITE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.PHYLLITE.get()), has(ModBlocks.PHYLLITE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_TILES.get(), ModBlocks.PHYLLITE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.PHYLLITE_TILES.get(), ModBlocks.PHYLLITE_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CHISELED_PHYLLITE.get(), ModBlocks.PHYLLITE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.EMPTY_PHYLLITE_BRICK_BOOKSHELF.get(), ModBlocks.PHYLLITE.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PHYLLITE_BRICK_BOOKSHELF.get(), 1)
                .requires(Items.BOOK, 3)
                .requires(ModBlocks.EMPTY_PHYLLITE_BRICK_BOOKSHELF.get(), 1)
                .unlockedBy(getHasName(ModBlocks.PHYLLITE.get()), has(ModBlocks.PHYLLITE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRACKED_PHYLLITE_BRICKS.get(), ModBlocks.PHYLLITE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB.get(), ModBlocks.CRACKED_PHYLLITE_BRICKS.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB.get(), ModBlocks.PHYLLITE.get());
        stairs(ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS.get(), ModBlocks.CRACKED_PHYLLITE_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS.get(), ModBlocks.PHYLLITE.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MOSSY_PHYLLITE_BRICKS.get(), 4)
                .requires(ModBlocks.PHYLLITE_BRICKS.get(), 4)
                .requires(Blocks.MOSS_BLOCK, 1)
                .unlockedBy(getHasName(ModBlocks.PHYLLITE.get()), has(ModBlocks.PHYLLITE.get()))
                .save(pWriter);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB.get(), ModBlocks.MOSSY_PHYLLITE_BRICKS.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB.get(), ModBlocks.MOSSY_PHYLLITE_BRICKS.get());
        stairs(ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS.get(), ModBlocks.MOSSY_PHYLLITE_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS.get(), ModBlocks.MOSSY_PHYLLITE_BRICKS.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MOSSY_PHYLLITE_TILES.get(), 4)
                .requires(ModBlocks.PHYLLITE_TILES.get(), 4)
                .requires(Blocks.MOSS_BLOCK, 1)
                .unlockedBy(getHasName(ModBlocks.PHYLLITE.get()), has(ModBlocks.PHYLLITE.get()))
                .save(pWriter);


        slab(pWriter, RecipeCategory.MISC, ModBlocks.CRAMPED_STONE_SLAB.get(), ModBlocks.CRAMPED_STONE.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.CRAMPED_STONE_SLAB.get(), ModBlocks.CRAMPED_STONE.get());
        stairs(ModBlocks.CRAMPED_STONE_STAIRS.get(), ModBlocks.CRAMPED_STONE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMPED_STONE_STAIRS.get(), ModBlocks.CRAMPED_STONE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRAMP_STONE_BRICKS.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.CRAMPED_STONE.get())
                .unlockedBy(getHasName(ModBlocks.CRAMPED_STONE.get()), has(ModBlocks.CRAMPED_STONE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_BRICKS.get(), ModBlocks.CRAMPED_STONE.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_BRICK_SLAB.get(), ModBlocks.CRAMP_STONE_BRICKS.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_BRICK_SLAB.get(), ModBlocks.CRAMPED_STONE.get());
        stairs(ModBlocks.CRAMP_STONE_BRICK_STAIRS.get(), ModBlocks.CRAMP_STONE_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_BRICK_STAIRS.get(), ModBlocks.CRAMPED_STONE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRAMP_STONE_PILLAR.get(), 2)
                .pattern("S")
                .pattern("S")
                .define('S', ModBlocks.CRAMPED_STONE.get())
                .unlockedBy(getHasName(ModBlocks.CRAMPED_STONE.get()), has(ModBlocks.CRAMPED_STONE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_PILLAR.get(), ModBlocks.CRAMPED_STONE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRAMP_STONE_TILES.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.CRAMP_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.CRAMPED_STONE.get()), has(ModBlocks.CRAMPED_STONE.get()))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_TILES.get(), ModBlocks.CRAMPED_STONE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_TILES.get(), ModBlocks.CRAMP_STONE_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.POLISHED_CRAMP_STONE.get(), ModBlocks.CRAMPED_STONE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_CHECKERS.get(), ModBlocks.CRAMPED_STONE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_STONE_FRACTAL.get(), ModBlocks.CRAMPED_STONE.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.SMALL_CRAMP_STONE_TILE.get(), ModBlocks.CRAMPED_STONE.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CRAMP_MUD_BRICKS.get(), 8)
                .requires(ModBlocks.CRAMPED_STONE.get(), 4)
                .requires(Items.WATER_BUCKET, 1)
                .unlockedBy(getHasName(ModBlocks.CRAMPED_STONE.get()), has(ModBlocks.CRAMPED_STONE.get()))
                .save(pWriter);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_MUD_BRICK_SLAB.get(), ModBlocks.CRAMP_MUD_BRICKS.get());
        stonecutterSlab(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_MUD_BRICK_SLAB.get(), ModBlocks.CRAMP_MUD_BRICKS.get());
        stairs(ModBlocks.CRAMP_MUD_BRICK_STAIRS.get(), ModBlocks.CRAMP_MUD_BRICKS.get());
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CRAMP_MUD_BRICK_STAIRS.get(), ModBlocks.CRAMP_MUD_BRICKS.get());


        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.CHISELED_ENDSTONE_TILE.get(), Blocks.END_STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.DECAYED_ENDSTONE.get(), Blocks.END_STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.DECAYED_ENDSTONE_TILE.get(), Blocks.END_STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.DECAYED_ENDSTONE_TILE_PEARL.get(), Blocks.END_STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.ENDSTONE_TILE.get(), Blocks.END_STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.ENDSTONE_TILE_PEARL.get(), Blocks.END_STONE);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.MOSSY_DECAYED_ENDSTONE.get(), 4)
                .requires(ModBlocks.DECAYED_ENDSTONE.get(), 4)
                .requires(Blocks.MOSS_BLOCK, 1)
                .unlockedBy(getHasName(ModBlocks.DECAYED_ENDSTONE.get()), has(ModBlocks.DECAYED_ENDSTONE.get()))
                .save(pWriter);


        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.AMETHYST_GILDED_STONE_BRICKS.get(), Blocks.AMETHYST_BLOCK);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.AMETHYST_GILDED_DEEPSLATE_BRICKS.get(), Blocks.AMETHYST_BLOCK);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.AMETHYST_CHISELED_STONE_BRICKS.get(), Blocks.AMETHYST_BLOCK);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.GILDED_AMETHYST_BRICKS.get(), Blocks.AMETHYST_BLOCK);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_BRICKS.get(), 5)
                .pattern(" S ")
                .pattern("S#S")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.DIAMOND)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_CHISELED_DEEPSLATE_BRICKS.get(), 5)
                .pattern(" S ")
                .pattern("SSS")
                .pattern(" # ")
                .define('S', Blocks.DEEPSLATE)
                .define('#', Items.DIAMOND)
                .unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_CHISELED_STONE_BRICKS.get(), 5)
                .pattern(" S ")
                .pattern("SSS")
                .pattern(" # ")
                .define('S', Blocks.STONE)
                .define('#', Items.DIAMOND)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_GILDED_DEEPSLATE_BRICKS.get(), 5)
                .pattern(" # ")
                .pattern("SSS")
                .pattern(" S ")
                .define('S', Blocks.DEEPSLATE)
                .define('#', Items.DIAMOND)
                .unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIAMOND_GILDED_STONE_BRICKS.get(), 5)
                .pattern(" # ")
                .pattern("SSS")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.DIAMOND)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_BRICKS.get(), 5)
                .pattern(" S ")
                .pattern("S#S")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_CHISELED_STONE_BRICKS.get(), 5)
                .pattern(" S ")
                .pattern("SSS")
                .pattern(" # ")
                .define('S', Blocks.STONE)
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_GILDED_DEEPSLATE_BRICKS.get(), 5)
                .pattern(" # ")
                .pattern("SSS")
                .pattern(" S ")
                .define('S', Blocks.DEEPSLATE)
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Blocks.DEEPSLATE), has(Blocks.DEEPSLATE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GOLD_GILDED_STONE_BRICKS.get(), 5)
                .pattern(" # ")
                .pattern("SSS")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);

        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.THIN_STONE_BRICKS.get(), Blocks.STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.GREEN_BRICKS.get(), Blocks.STONE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICKS.get(), Blocks.ANDESITE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICKS_HEAVY.get(), Blocks.ANDESITE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_STAIRS.get(), Blocks.ANDESITE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_SLAB.get(), Blocks.ANDESITE);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_SLAB.get(), Blocks.ANDESITE);
        stairs(ModBlocks.ANDESITE_BRICK_STAIRS.get(), Blocks.ANDESITE);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.EMPTY_SANDSTONE_BOOKSHELF.get(), Blocks.SANDSTONE);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SANDSTONE_BOOKSHELF.get(), 1)
                .requires(Items.BOOK, 3)
                .requires(ModBlocks.EMPTY_SANDSTONE_BOOKSHELF.get(), 1)
                .unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE))
                .save(pWriter);
        stonecutter(pWriter, RecipeCategory.MISC, ModBlocks.EMPTY_STONE_BRICK_BOOKSHELF.get(), Blocks.STONE);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.STONE_BRICK_BOOKSHELF.get(), 1)
                .requires(Items.BOOK, 3)
                .requires(ModBlocks.EMPTY_STONE_BRICK_BOOKSHELF.get(), 1)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEATHERED_SPRUCE_WOOD.get(), 4)
                .requires(Blocks.SPRUCE_WOOD, 4)
                .requires(Blocks.MOSS_BLOCK, 1)
                .unlockedBy(getHasName(Blocks.SPRUCE_WOOD), has(Blocks.SPRUCE_WOOD))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEATHERED_SPRUCE_LOG.get(), 4)
                .requires(Blocks.SPRUCE_LOG, 4)
                .requires(Blocks.MOSS_BLOCK, 1)
                .unlockedBy(getHasName(Blocks.SPRUCE_LOG), has(Blocks.SPRUCE_LOG))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEATHERED_SPRUCE_PLANKS.get(), 4)
                .requires(Blocks.SPRUCE_PLANKS, 4)
                .requires(Blocks.MOSS_BLOCK, 1)
                .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS))
                .save(pWriter);
        slab(pWriter, RecipeCategory.MISC, ModBlocks.WEATHERED_SPRUCE_SLAB.get(), ModBlocks.WEATHERED_SPRUCE_PLANKS.get());
        stairs(ModBlocks.WEATHERED_SPRUCE_STAIRS.get(), ModBlocks.WEATHERED_SPRUCE_PLANKS.get());


        woodFromLogs(pWriter, ModBlocks.BOGBIRCH_WOOD.get(), ModBlocks.BOGBIRCH_LOG.get());
        planksFromLogs(pWriter, ModBlocks.BOGBIRCH_PLANKS.get(), ModBlocks.BOGBIRCH_LOG.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.BOGBIRCH_SLAB.get(), ModBlocks.BOGBIRCH_PLANKS.get());
        stairs(ModBlocks.BOGBIRCH_STAIRS.get(), ModBlocks.BOGBIRCH_PLANKS.get());

        woodFromLogs(pWriter, ModBlocks.MURIAR_WOOD.get(), ModBlocks.MURIAR_LOG.get());
        planksFromLogs(pWriter, ModBlocks.MURIAR_PLANKS.get(), ModBlocks.MURIAR_LOG.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.MURIAR_SLAB.get(), ModBlocks.MURIAR_PLANKS.get());
        stairs(ModBlocks.MURIAR_STAIRS.get(), ModBlocks.MURIAR_PLANKS.get());

        woodFromLogs(pWriter, ModBlocks.GRIMWOOD_WOOD.get(), ModBlocks.GRIMWOOD_LOG.get());
        planksFromLogs(pWriter, ModBlocks.GRIMWOOD_PLANKS.get(), ModBlocks.GRIMWOOD_LOG.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.GRIMWOOD_SLAB.get(), ModBlocks.GRIMWOOD_PLANKS.get());
        stairs(ModBlocks.GRIMWOOD_STAIRS.get(), ModBlocks.GRIMWOOD_PLANKS.get());

        woodFromLogs(pWriter, ModBlocks.POPLAR_WOOD.get(), ModBlocks.POPLAR_LOG.get());
        planksFromLogs(pWriter, ModBlocks.POPLAR_PLANKS.get(), ModBlocks.POPLAR_LOG.get());
        slab(pWriter, RecipeCategory.MISC, ModBlocks.POPLAR_SLAB.get(), ModBlocks.POPLAR_PLANKS.get());
        stairs(ModBlocks.POPLAR_STAIRS.get(), ModBlocks.POPLAR_PLANKS.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SWAMP_LOAF.get(), 1)
                .pattern("SSS")
                .define('S', ModItems.SWAMP_ROOT.get())
                .unlockedBy(getHasName(ModItems.SWAMP_ROOT.get()), has(ModItems.SWAMP_ROOT.get()))
                .save(pWriter);

        new AlchemizingRecipeBuilder(ModItems.ETHERIUM.get(), ModItems.POISON_ESSENCE.get(), 1).unlockedBy("has_etherium", has(ModItems.ETHERIUM.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.FLORIUM.get(), ModItems.ANTIDOTE.get(), 1).unlockedBy("has_florium", has(ModItems.FLORIUM.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.GEOLIUM.get(), ModItems.POCKET_SAND.get(), 1).unlockedBy("has_geolium", has(ModItems.GEOLIUM.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.ILLOITE.get(), ModItems.BURN_SALVE.get(), 1).unlockedBy("has_illoite", has(ModItems.ILLOITE.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.KROTEIS.get(), ModItems.ROOTED_ESSENCE.get(), 1).unlockedBy("has_kroteis", has(ModItems.KROTEIS.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.ORIBIUM.get(), ModItems.POPPER.get(), 1).unlockedBy("has_oribium", has(ModItems.ORIBIUM.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.PHOENITE.get(), ModItems.SPEED_POTION.get(), 1).unlockedBy("has_phoenite", has(ModItems.PHOENITE.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.RIDONEITE.get(), ModItems.SMOKE_BOMB.get(), 1).unlockedBy("has_ridoneite", has(ModItems.RIDONEITE.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.STARMEAR.get(), ModItems.ICE_ESSENCE.get(), 1).unlockedBy("has_starmear", has(ModItems.STARMEAR.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.STRANGERS_DIAMOND.get(), ModItems.HEALTH_POTION.get(), 1).unlockedBy("has_strangers_diamond", has(ModItems.STRANGERS_DIAMOND.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.THE_LOST.get(), ModItems.FIRE_ESSENCE.get(), 1).unlockedBy("has_the_lost", has(ModItems.THE_LOST.get())).save(pWriter);
        new AlchemizingRecipeBuilder(ModItems.THORIUM.get(), ModItems.COFFEE.get(), 1).unlockedBy("has_thorium", has(ModItems.THORIUM.get())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POISON_ESSENCE_SPRAY.get(), 1)
                .requires(Items.GLASS_BOTTLE, 1)
                .requires(Items.GUNPOWDER, 1)
                .requires(ModItems.POISON_ESSENCE.get(), 1)
                .unlockedBy("has_etherium", has(ModItems.ETHERIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ROOTED_ESSENCE_SPRAY.get(), 1)
                .requires(Items.GLASS_BOTTLE, 1)
                .requires(Items.GUNPOWDER, 1)
                .requires(ModItems.ROOTED_ESSENCE.get(), 1)
                .unlockedBy("has_kroteis", has(ModItems.KROTEIS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ICE_ESSENCE_SPRAY.get(), 1)
                .requires(Items.GLASS_BOTTLE, 1)
                .requires(Items.GUNPOWDER, 1)
                .requires(ModItems.ICE_ESSENCE.get(), 1)
                .unlockedBy("has_starmear", has(ModItems.STARMEAR.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FIRE_ESSENCE_SPRAY.get(), 1)
                .requires(Items.GLASS_BOTTLE, 1)
                .requires(Items.GUNPOWDER, 1)
                .requires(ModItems.FIRE_ESSENCE.get(), 1)
                .unlockedBy("has_the_lost", has(ModItems.THE_LOST.get()))
                .save(pWriter);
    }

    protected static void stonecutter(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial) {
        stonecutterResultFromBase(pFinishedRecipeConsumer, pCategory, pResult, pMaterial, 1);
    }
    protected static void stonecutterSlab(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial) {
        stonecutterResultFromBase(pFinishedRecipeConsumer, pCategory, pResult, pMaterial, 2);
    }

    protected static RecipeBuilder stairs(ItemLike pStairs, ItemLike pMaterial) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pStairs, 4).define('#', pMaterial).pattern("#  ").pattern("## ").pattern("###");
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void planksFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pPlanks, ItemLike pLogs) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pPlanks, 4).requires(pLogs).group("planks").unlockedBy("has_logs", has(pLogs)).save(pFinishedRecipeConsumer);
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, StormMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
