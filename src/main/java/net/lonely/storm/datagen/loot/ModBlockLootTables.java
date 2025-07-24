package net.lonely.storm.datagen.loot;

import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.block.custom.RootedGingerCropBlock;
import net.lonely.storm.block.custom.SwampRootCropBlock;
import net.lonely.storm.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ATHETITE_BLOCK.get());

        this.dropSelf(ModBlocks.ALCHEMIZING_STATION.get());

        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.SWAMP_ROOT_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SwampRootCropBlock.AGE, 2));
        this.add(ModBlocks.SWAMP_ROOT_CROP.get(), this.createCropDrops(ModBlocks.SWAMP_ROOT_CROP.get(),
                ModItems.SWAMP_ROOT.get(), ModItems.SWAMP_ROOT.get(), lootitemcondition$builder1));

        this.add(ModBlocks.CRAMP_ATHETITE_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_ATHETITE_ORE.get(), ModItems.ATHETITE_CLUMP.get()));
        this.add(ModBlocks.CRAMP_ETHERIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_ETHERIUM_ORE.get(), ModItems.ETHERIUM.get()));
        this.add(ModBlocks.CRAMP_FLORIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_FLORIUM_ORE.get(), ModItems.FLORIUM.get()));
        this.add(ModBlocks.CRAMP_GEOLIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_GEOLIUM_ORE.get(), ModItems.GEOLIUM.get()));
        this.add(ModBlocks.CRAMP_ILLOITE_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_ILLOITE_ORE.get(), ModItems.ILLOITE.get()));
        this.add(ModBlocks.CRAMP_KROTEIS_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_KROTEIS_ORE.get(), ModItems.KROTEIS.get()));
        this.add(ModBlocks.CRAMP_ORIBIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_ORIBIUM_ORE.get(), ModItems.ORIBIUM.get()));
        this.add(ModBlocks.CRAMP_PHOENITE_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_PHOENITE_ORE.get(), ModItems.PHOENITE.get()));
        this.add(ModBlocks.CRAMP_RIDONEITE_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_RIDONEITE_ORE.get(), ModItems.RIDONEITE.get()));
        this.add(ModBlocks.CRAMP_STARMEAR_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_STARMEAR_ORE.get(), ModItems.STARMEAR.get()));
        this.add(ModBlocks.CRAMP_LOST_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_LOST_ORE.get(), ModItems.THE_LOST.get()));
        this.add(ModBlocks.CRAMP_THORIUM_ORE.get(),
                block -> createOreDrops(ModBlocks.CRAMP_THORIUM_ORE.get(), ModItems.THORIUM.get()));



        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.ROOTED_GINGER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RootedGingerCropBlock.AGE, 3));
        this.add(ModBlocks.ROOTED_GINGER_CROP.get(), this.createCropDrops(ModBlocks.ROOTED_GINGER_CROP.get(),
                ModItems.ROOTED_GINGER.get(), ModItems.ROOTED_GINGER.get(), lootitemcondition$builder2));

        this.add(ModBlocks.POTTED_ARCTIC_POPPY.get(), createPotFlowerItemTable(ModBlocks.ARCTIC_POPPY.get()));
        this.add(ModBlocks.POTTED_BLUE_FORGET_ME_NOT.get(), createPotFlowerItemTable(ModBlocks.BLUE_FORGET_ME_NOT.get()));
        this.add(ModBlocks.POTTED_BLUE_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.BLUE_HIBISCUS.get()));
        this.add(ModBlocks.POTTED_RED_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.RED_HIBISCUS.get()));
        this.add(ModBlocks.POTTED_VOID_FLAT_CAP.get(), createPotFlowerItemTable(ModBlocks.VOID_FLAT_CAP.get()));
        this.add(ModBlocks.POTTED_VOID_MOREL.get(), createPotFlowerItemTable(ModBlocks.VOID_MOREL.get()));
        this.add(ModBlocks.POTTED_WHITE_FORGET_ME_NOT.get(), createPotFlowerItemTable(ModBlocks.WHITE_FORGET_ME_NOT.get()));
        this.add(ModBlocks.POTTED_YELLOW_HIBISCUS.get(), createPotFlowerItemTable(ModBlocks.YELLOW_HIBISCUS.get()));
        this.add(ModBlocks.POTTED_CRAMP_PLANT.get(), createPotFlowerItemTable(ModBlocks.CRAMP_PLANT.get()));


        //this.dropSelf(ModBlocks.CRAMPED_GRASS.get());
        //this.dropSelf(ModBlocks.DARK_CRAMPED_GRASS.get());
        //this.dropSelf(ModBlocks.TALL_DARK_CRAMP_GRASS.get());
        //this.dropSelf(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get());
        //this.dropSelf(ModBlocks.SHORT_CRAMPED_GRASS.get());
        //this.dropSelf(ModBlocks.CRAMP_FERN_TALL.get());
        this.add(ModBlocks.CRAMP_VINES_PLANT.get(), block -> createLeavesDrops(block, ModBlocks.CRAMP_VINES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.CRAMP_FERN_TALL.get(), createDoublePlantShearsDrop(ModBlocks.CRAMP_FERN_TALL.get()));
        this.add(ModBlocks.TALL_DARK_CRAMP_GRASS.get(), createDoublePlantShearsDrop(ModBlocks.TALL_DARK_CRAMP_GRASS.get()));

        this.add(ModBlocks.SHORT_CRAMPED_GRASS.get(), createShearsOnlyDrop(ModBlocks.SHORT_CRAMPED_GRASS.get()));
        this.add(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get(), createShearsOnlyDrop(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get()));

        this.add(ModBlocks.CRAMPED_GRASS.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.CRAMPED_GRASS.get(), ModBlocks.CRAMPED_EARTH.get()));
        this.add(ModBlocks.DARK_CRAMPED_GRASS.get(), block -> createSingleItemTableWithSilkTouch(ModBlocks.DARK_CRAMPED_GRASS.get(), ModBlocks.CRAMPED_EARTH.get()));


        this.dropSelf(ModBlocks.ARCTIC_POPPY.get());
        this.dropSelf(ModBlocks.BLUE_FORGET_ME_NOT.get());
        this.dropSelf(ModBlocks.BLUE_HIBISCUS.get());
        this.dropSelf(ModBlocks.RED_HIBISCUS.get());
        this.dropSelf(ModBlocks.VOID_FLAT_CAP.get());
        this.dropSelf(ModBlocks.VOID_MOREL.get());
        this.dropSelf(ModBlocks.WHITE_FORGET_ME_NOT.get());
        this.dropSelf(ModBlocks.YELLOW_HIBISCUS.get());
        this.dropSelf(ModBlocks.CRAMP_VINES.get());
        this.dropSelf(ModBlocks.RED_IVY.get());
        this.dropSelf(ModBlocks.GREEN_IVY.get());
        this.dropSelf(ModBlocks.VOID_LICHEN.get());
        this.dropSelf(ModBlocks.VOID_VINES.get());
        this.dropSelf(ModBlocks.YELLOW_IVY.get());
        this.dropSelf(ModBlocks.YELLOW_VINE.get());
        this.dropSelf(ModBlocks.CRAMP_PLANT.get());
        this.dropSelf(ModBlocks.CRAMPED_EARTH.get());
        this.dropSelf(ModBlocks.CRAMPED_STONE.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_LOG.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_PLANKS.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_WOOD.get());
        this.dropSelf(ModBlocks.PHYLLITE.get());
        this.dropSelf(ModBlocks.PHYLLITE_BRICKS.get());
        this.dropSelf(ModBlocks.PHYLLITE_PILLAR.get());
        this.dropSelf(ModBlocks.PHYLLITE_TILES.get());
        this.dropSelf(ModBlocks.CHISELED_PHYLLITE.get());
        this.dropSelf(ModBlocks.CRAMP_CRYSTAL_BLUE.get());
        this.dropSelf(ModBlocks.CRAMP_CRYSTAL_GREEN.get());
        this.dropSelf(ModBlocks.CRAMP_CRYSTAL_PURPLE.get());
        this.dropSelf(ModBlocks.PHYLLITE_BRICK_BOOKSHELF.get());
        this.dropSelf(ModBlocks.EMPTY_PHYLLITE_BRICK_BOOKSHELF.get());
        this.dropSelf(ModBlocks.SANDSTONE_BOOKSHELF.get());
        this.dropSelf(ModBlocks.EMPTY_SANDSTONE_BOOKSHELF.get());
        this.dropSelf(ModBlocks.STONE_BRICK_BOOKSHELF.get());
        this.dropSelf(ModBlocks.EMPTY_STONE_BRICK_BOOKSHELF.get());
        this.dropSelf(ModBlocks.AMETHYST_CHISELED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.AMETHYST_GILDED_DEEPSLATE_BRICKS.get());
        this.dropSelf(ModBlocks.AMETHYST_GILDED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.ANDESITE_BRICKS.get());
        this.dropSelf(ModBlocks.ANDESITE_BRICKS_HEAVY.get());
        this.dropSelf(ModBlocks.CHISELED_ENDSTONE_TILE.get());
        this.dropSelf(ModBlocks.CRAMP_MUD_BRICKS.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_CHECKERS.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_FRACTAL.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_PILLAR.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_TILES.get());
        this.dropSelf(ModBlocks.DECAYED_ENDSTONE.get());
        this.dropSelf(ModBlocks.DECAYED_ENDSTONE_TILE.get());
        this.dropSelf(ModBlocks.DECAYED_ENDSTONE_TILE_PEARL.get());
        this.dropSelf(ModBlocks.DEEPSLATE_ANCIENT_CARVING.get());
        this.dropSelf(ModBlocks.DIAMOND_BRICKS.get());
        this.dropSelf(ModBlocks.DIAMOND_CHISELED_DEEPSLATE_BRICKS.get());
        this.dropSelf(ModBlocks.DIAMOND_CHISELED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.DIAMOND_GILDED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.DIAMOND_GILDED_DEEPSLATE_BRICKS.get());
        this.dropSelf(ModBlocks.ENDSTONE_ANCIENT_CARVING.get());
        this.dropSelf(ModBlocks.ENDSTONE_ANCIENT_CARVING_2.get());
        this.dropSelf(ModBlocks.ENDSTONE_TILE.get());
        this.dropSelf(ModBlocks.ENDSTONE_TILE_PEARL.get());
        this.dropSelf(ModBlocks.GILDED_AMETHYST_BRICKS.get());
        this.dropSelf(ModBlocks.GILDED_ANCIENT_CARVING.get());
        this.dropSelf(ModBlocks.GILDED_ANCIENT_CARVING_2.get());
        this.dropSelf(ModBlocks.GILDED_DEEPSLATE_ANCIENT_CARVING.get());
        this.dropSelf(ModBlocks.GOLD_BRICKS.get());
        this.dropSelf(ModBlocks.GOLD_CHISELED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.GOLD_GILDED_DEEPSLATE_BRICKS.get());
        this.dropSelf(ModBlocks.GOLD_GILDED_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.GREEN_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_DECAYED_ENDSTONE.get());
        this.dropSelf(ModBlocks.POLISHED_CRAMP_STONE.get());
        this.dropSelf(ModBlocks.SMALL_CRAMP_STONE_TILE.get());
        this.dropSelf(ModBlocks.STONE_ANCIENT_CARVING.get());
        this.dropSelf(ModBlocks.STONE_ANCIENT_CARVING_2.get());
        this.dropSelf(ModBlocks.THIN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_PHYLLITE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_PHYLLITE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_PHYLLITE_TILES .get());
        this.dropSelf(ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PHYLLITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PHYLLITE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PHYLLITE_STAIRS.get());
        this.dropSelf(ModBlocks.PHYLLITE_SLAB.get());
        this.dropSelf(ModBlocks.CRAMPED_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CRAMPED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRAMP_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CRAMP_MUD_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CRAMP_MUD_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ANDESITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ANDESITE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BOGBIRCH_STAIRS.get());
        this.dropSelf(ModBlocks.BOGBIRCH_SLAB.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_STAIRS.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_SLAB.get());
        this.dropSelf(ModBlocks.MURIAR_STAIRS.get());
        this.dropSelf(ModBlocks.MURIAR_SLAB.get());
        this.dropSelf(ModBlocks.GRIMWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.GRIMWOOD_SLAB.get());
        this.dropSelf(ModBlocks.POPLAR_STAIRS.get());
        this.dropSelf(ModBlocks.POPLAR_SLAB.get());

        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_BUTTON.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_FENCE.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_WALL.get());
        this.dropSelf(ModBlocks.WEATHERED_SPRUCE_TRAPDOOR.get());

        this.add(ModBlocks.WEATHERED_SPRUCE_DOOR.get(),
                block -> createDoorTable(ModBlocks.WEATHERED_SPRUCE_DOOR.get()));

        this.add(ModBlocks.WEATHERED_SPRUCE_SIGN.get(), block ->
                createSingleItemTable(ModItems.WEATHERED_SPRUCE_SIGN.get()));
        this.add(ModBlocks.WEATHERED_SPRUCE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.WEATHERED_SPRUCE_SIGN.get()));



        this.dropSelf(ModBlocks.GRIMWOOD_LOG.get());
        this.dropSelf(ModBlocks.GRIMWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GRIMWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GRIMWOOD_WOOD.get());
        this.dropSelf(ModBlocks.GRIMWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.GRIMWOOD_SAPLING.get());
        this.add(ModBlocks.GRIMWOOD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GRIMWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.GRIMWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GRIMWOOD_BUTTON.get());
        this.dropSelf(ModBlocks.GRIMWOOD_FENCE.get());
        this.dropSelf(ModBlocks.GRIMWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRIMWOOD_WALL.get());
        this.dropSelf(ModBlocks.GRIMWOOD_TRAPDOOR.get());

        this.add(ModBlocks.GRIMWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.GRIMWOOD_DOOR.get()));

        this.add(ModBlocks.GRIMWOOD_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRIMWOOD_SIGN.get()));
        this.add(ModBlocks.GRIMWOOD_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GRIMWOOD_SIGN.get()));


        this.dropSelf(ModBlocks.BOGBIRCH_LOG.get());
        this.dropSelf(ModBlocks.BOGBIRCH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_BOGBIRCH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_BOGBIRCH_WOOD.get());
        this.dropSelf(ModBlocks.BOGBIRCH_PLANKS.get());
        this.dropSelf(ModBlocks.BOGBIRCH_SAPLING.get());
        this.add(ModBlocks.BOGBIRCH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BOGBIRCH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.BOGBIRCH_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BOGBIRCH_BUTTON.get());
        this.dropSelf(ModBlocks.BOGBIRCH_FENCE.get());
        this.dropSelf(ModBlocks.BOGBIRCH_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BOGBIRCH_WALL.get());
        this.dropSelf(ModBlocks.BOGBIRCH_TRAPDOOR.get());

        this.add(ModBlocks.BOGBIRCH_DOOR.get(),
                block -> createDoorTable(ModBlocks.BOGBIRCH_DOOR.get()));

        this.add(ModBlocks.BOGBIRCH_SIGN.get(), block ->
                createSingleItemTable(ModItems.BOGBIRCH_SIGN.get()));
        this.add(ModBlocks.BOGBIRCH_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.BOGBIRCH_SIGN.get()));


        this.dropSelf(ModBlocks.POPLAR_LOG.get());
        this.dropSelf(ModBlocks.POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_POPLAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.POPLAR_PLANKS.get());
        this.dropSelf(ModBlocks.POPLAR_SAPLING.get());
        this.add(ModBlocks.POPLAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.POPLAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.POPLAR_BUTTON.get());
        this.dropSelf(ModBlocks.POPLAR_FENCE.get());
        this.dropSelf(ModBlocks.POPLAR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POPLAR_WALL.get());
        this.dropSelf(ModBlocks.POPLAR_TRAPDOOR.get());

        this.add(ModBlocks.POPLAR_DOOR.get(),
                block -> createDoorTable(ModBlocks.POPLAR_DOOR.get()));

        this.add(ModBlocks.POPLAR_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_SIGN.get()));
        this.add(ModBlocks.POPLAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.POPLAR_SIGN.get()));


        this.dropSelf(ModBlocks.MURIAR_LOG.get());
        this.dropSelf(ModBlocks.MURIAR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_MURIAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_MURIAR_WOOD.get());
        this.dropSelf(ModBlocks.MURIAR_PLANKS.get());
        this.add(ModBlocks.MURIAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.BOGBIRCH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.MURIAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MURIAR_BUTTON.get());
        this.dropSelf(ModBlocks.MURIAR_FENCE.get());
        this.dropSelf(ModBlocks.MURIAR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MURIAR_WALL.get());
        this.dropSelf(ModBlocks.MURIAR_TRAPDOOR.get());

        this.add(ModBlocks.MURIAR_DOOR.get(),
                block -> createDoorTable(ModBlocks.MURIAR_DOOR.get()));

        this.add(ModBlocks.MURIAR_SIGN.get(), block ->
                createSingleItemTable(ModItems.MURIAR_SIGN.get()));
        this.add(ModBlocks.MURIAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.MURIAR_SIGN.get()));

    }




    protected LootTable.Builder createOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))));
    }

    protected static LootTable.Builder createSilkTouchDispatchTable(Block pBlock, LootPoolEntryContainer.Builder<?> pBuilder) {
        return createSelfDropDispatchTable(pBlock, HAS_SILK_TOUCH, pBuilder);
    }






    protected static LootTable.Builder createDoublePlantShearsDrop(Block pSheared) {
        return LootTable.lootTable().withPool(LootPool.lootPool().when(HAS_SHEARS).add(LootItem.lootTableItem(pSheared).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}