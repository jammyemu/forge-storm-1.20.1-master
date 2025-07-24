package net.lonely.storm.datagen;

import com.google.gson.JsonElement;
import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.block.custom.ModCropBlock;
import net.lonely.storm.block.custom.RootedGingerCropBlock;
import net.lonely.storm.block.custom.SwampRootCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlockStateProvider extends BlockStateProvider {

    public static Consumer<BlockStateGenerator> blockStateOutput = null;
    public static BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput = null;
    public static Consumer<Item> skippedAutoModelsOutput = null;

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, StormMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ATHETITE_BLOCK);

        blockWithItem(ModBlocks.CRAMP_PORTAL);

        makeCrop(((SwampRootCropBlock) ModBlocks.SWAMP_ROOT_CROP.get()), "swamp_root_stage_", "swamp_root_stage_");

        simpleBlock(ModBlocks.ARCTIC_POPPY.get(),
                models().cross(blockTexture(ModBlocks.ARCTIC_POPPY.get()).getPath(), blockTexture(ModBlocks.ARCTIC_POPPY.get())).renderType("cutout"));
        simpleBlock(ModBlocks.BLUE_FORGET_ME_NOT.get(),
                models().cross(blockTexture(ModBlocks.BLUE_FORGET_ME_NOT.get()).getPath(), blockTexture(ModBlocks.BLUE_FORGET_ME_NOT.get())).renderType("cutout"));
        simpleBlock(ModBlocks.BLUE_HIBISCUS.get(),
                models().cross(blockTexture(ModBlocks.BLUE_HIBISCUS.get()).getPath(), blockTexture(ModBlocks.BLUE_HIBISCUS.get())).renderType("cutout"));
        simpleBlock(ModBlocks.RED_HIBISCUS.get(),
                models().cross(blockTexture(ModBlocks.RED_HIBISCUS.get()).getPath(), blockTexture(ModBlocks.RED_HIBISCUS.get())).renderType("cutout"));
        simpleBlock(ModBlocks.VOID_FLAT_CAP.get(),
                models().cross(blockTexture(ModBlocks.VOID_FLAT_CAP.get()).getPath(), blockTexture(ModBlocks.VOID_FLAT_CAP.get())).renderType("cutout"));
        simpleBlock(ModBlocks.VOID_MOREL.get(),
                models().cross(blockTexture(ModBlocks.VOID_MOREL.get()).getPath(), blockTexture(ModBlocks.VOID_MOREL.get())).renderType("cutout"));
        simpleBlock(ModBlocks.WHITE_FORGET_ME_NOT.get(),
                models().cross(blockTexture(ModBlocks.WHITE_FORGET_ME_NOT.get()).getPath(), blockTexture(ModBlocks.WHITE_FORGET_ME_NOT.get())).renderType("cutout"));
        simpleBlock(ModBlocks.YELLOW_HIBISCUS.get(),
                models().cross(blockTexture(ModBlocks.YELLOW_HIBISCUS.get()).getPath(), blockTexture(ModBlocks.YELLOW_HIBISCUS.get())).renderType("cutout"));

        simpleBlock(ModBlocks.CRAMP_PLANT.get(),
                models().cross(blockTexture(ModBlocks.CRAMP_PLANT.get()).getPath(), blockTexture(ModBlocks.CRAMP_PLANT.get())).renderType("cutout"));
        simpleBlock(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get(),
                models().cross(blockTexture(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get()).getPath(), blockTexture(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get())).renderType("cutout"));
        simpleBlock(ModBlocks.SHORT_CRAMPED_GRASS.get(),
                models().cross(blockTexture(ModBlocks.SHORT_CRAMPED_GRASS.get()).getPath(), blockTexture(ModBlocks.SHORT_CRAMPED_GRASS.get())).renderType("cutout"));


        blockWithItem(ModBlocks.CRAMPED_STONE);
        blockWithItem(ModBlocks.CRAMPED_EARTH);

        blockWithItem(ModBlocks.CRAMP_CRYSTAL_BLUE);
        blockWithItem(ModBlocks.CRAMP_CRYSTAL_GREEN);
        blockWithItem(ModBlocks.CRAMP_CRYSTAL_PURPLE);

        blockWithItem(ModBlocks.PHYLLITE);
        blockWithItem(ModBlocks.PHYLLITE_BRICKS);
        blockWithItem(ModBlocks.PHYLLITE_TILES);
        blockWithItem(ModBlocks.CHISELED_PHYLLITE);
        axisBlock((RotatedPillarBlock) ModBlocks.PHYLLITE_PILLAR.get(), new ResourceLocation(StormMod.MOD_ID, "block/phyllite_pillar"),
                new ResourceLocation(StormMod.MOD_ID, "block/phyllite_pillar_top"));
        blockItem(ModBlocks.PHYLLITE_PILLAR);

        blockWithItem(ModBlocks.AMETHYST_CHISELED_STONE_BRICKS);
        blockWithItem(ModBlocks.AMETHYST_GILDED_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.AMETHYST_GILDED_STONE_BRICKS);
        blockWithItem(ModBlocks.ANDESITE_BRICKS);
        axisBlock((RotatedPillarBlock) ModBlocks.ANDESITE_BRICKS_HEAVY.get(), new ResourceLocation(StormMod.MOD_ID, "block/andesite_bricks_heavy"),
                new ResourceLocation(StormMod.MOD_ID, "block/andesite_bricks_heavy_top"));
        blockItem(ModBlocks.ANDESITE_BRICKS_HEAVY);
        blockWithItem(ModBlocks.CHISELED_ENDSTONE_TILE);
        blockWithItem(ModBlocks.CRAMP_MUD_BRICKS);
        blockWithItem(ModBlocks.CRAMP_STONE_BRICKS);
        blockWithItem(ModBlocks.CRAMP_STONE_CHECKERS);
        blockWithItem(ModBlocks.CRAMP_STONE_FRACTAL);
        axisBlock((RotatedPillarBlock) ModBlocks.CRAMP_STONE_PILLAR.get(), new ResourceLocation(StormMod.MOD_ID, "block/cramp_stone_pillar"),
                new ResourceLocation(StormMod.MOD_ID, "block/cramp_stone_pillar_top"));
        blockItem(ModBlocks.CRAMP_STONE_PILLAR);
        blockWithItem(ModBlocks.CRAMP_STONE_TILES);
        blockWithItem(ModBlocks.DECAYED_ENDSTONE);
        blockWithItem(ModBlocks.DECAYED_ENDSTONE_TILE);
        blockWithItem(ModBlocks.DECAYED_ENDSTONE_TILE_PEARL);
        blockWithItem(ModBlocks.DEEPSLATE_ANCIENT_CARVING);
        blockWithItem(ModBlocks.DIAMOND_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_CHISELED_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_CHISELED_STONE_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_GILDED_STONE_BRICKS);
        blockWithItem(ModBlocks.DIAMOND_GILDED_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.ENDSTONE_ANCIENT_CARVING);
        blockWithItem(ModBlocks.ENDSTONE_ANCIENT_CARVING_2);
        blockWithItem(ModBlocks.ENDSTONE_TILE);
        blockWithItem(ModBlocks.ENDSTONE_TILE_PEARL);
        blockWithItem(ModBlocks.GILDED_AMETHYST_BRICKS);
        blockWithItem(ModBlocks.GILDED_ANCIENT_CARVING);
        blockWithItem(ModBlocks.GILDED_ANCIENT_CARVING_2);
        blockWithItem(ModBlocks.GILDED_DEEPSLATE_ANCIENT_CARVING);
        blockWithItem(ModBlocks.GOLD_BRICKS);
        blockWithItem(ModBlocks.GOLD_CHISELED_STONE_BRICKS);
        blockWithItem(ModBlocks.GOLD_GILDED_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.GOLD_GILDED_STONE_BRICKS);
        blockWithItem(ModBlocks.GREEN_BRICKS);
        blockWithItem(ModBlocks.MOSSY_DECAYED_ENDSTONE);
        blockWithItem(ModBlocks.POLISHED_CRAMP_STONE);
        blockWithItem(ModBlocks.SMALL_CRAMP_STONE_TILE);
        blockWithItem(ModBlocks.STONE_ANCIENT_CARVING);
        blockWithItem(ModBlocks.STONE_ANCIENT_CARVING_2);
        blockWithItem(ModBlocks.THIN_STONE_BRICKS);

        blockWithItem(ModBlocks.CRAMP_ATHETITE_ORE);
        blockWithItem(ModBlocks.CRAMP_ETHERIUM_ORE);
        blockWithItem(ModBlocks.CRAMP_FLORIUM_ORE);
        blockWithItem(ModBlocks.CRAMP_GEOLIUM_ORE);
        blockWithItem(ModBlocks.CRAMP_ILLOITE_ORE);
        blockWithItem(ModBlocks.CRAMP_KROTEIS_ORE);
        blockWithItem(ModBlocks.CRAMP_ORIBIUM_ORE);
        blockWithItem(ModBlocks.CRAMP_PHOENITE_ORE);
        blockWithItem(ModBlocks.CRAMP_RIDONEITE_ORE);
        blockWithItem(ModBlocks.CRAMP_STARMEAR_ORE);
        blockWithItem(ModBlocks.CRAMP_LOST_ORE);
        blockWithItem(ModBlocks.CRAMP_THORIUM_ORE);


        //blockWithItem(ModBlocks.RAW_ALEXANDRITE_BLOCK);

        //blockWithItem(ModBlocks.ALEXANDRITE_ORE);
        //blockWithItem(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE);
        //blockWithItem(ModBlocks.END_STONE_ALEXANDRITE_ORE);
        //blockWithItem(ModBlocks.NETHER_ALEXANDRITE_ORE);

        //blockWithItem(ModBlocks.SOUND_BLOCK);

        makeCrop(((RootedGingerCropBlock) ModBlocks.ROOTED_GINGER_CROP.get()), "rooted_ginger_stage", "rooted_ginger_stage");

        logBlock(((RotatedPillarBlock) ModBlocks.GRIMWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GRIMWOOD_WOOD.get()), blockTexture(ModBlocks.GRIMWOOD_LOG.get()), blockTexture(ModBlocks.GRIMWOOD_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_GRIMWOOD_LOG.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_grimwood_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_grimwood_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_GRIMWOOD_WOOD.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_grimwood_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_grimwood_log"));
        blockItem(ModBlocks.GRIMWOOD_LOG);
        blockItem(ModBlocks.GRIMWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_GRIMWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_GRIMWOOD_WOOD);
        blockWithItem(ModBlocks.GRIMWOOD_PLANKS);
        leavesBlock(ModBlocks.GRIMWOOD_LEAVES);
        saplingBlock(ModBlocks.GRIMWOOD_SAPLING);

        buttonBlock((ButtonBlock) ModBlocks.GRIMWOOD_BUTTON.get(), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.GRIMWOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.GRIMWOOD_FENCE.get(), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.GRIMWOOD_FENCE_GATE.get(), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));
        wallBlock((WallBlock) ModBlocks.GRIMWOOD_WALL.get(), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.GRIMWOOD_DOOR.get(), modLoc("block/grimwood_door_bottom"), modLoc("block/grimwood_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.GRIMWOOD_TRAPDOOR.get(), modLoc("block/grimwood_trapdoor"), true, "cutout");

        blockItem(ModBlocks.GRIMWOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.GRIMWOOD_FENCE_GATE);
        blockItem(ModBlocks.GRIMWOOD_TRAPDOOR, "_bottom");
        signBlock(((StandingSignBlock) ModBlocks.GRIMWOOD_SIGN.get()), ((WallSignBlock) ModBlocks.GRIMWOOD_WALL_SIGN.get()),
                blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));



        logBlock(((RotatedPillarBlock) ModBlocks.POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.POPLAR_WOOD.get()), blockTexture(ModBlocks.POPLAR_LOG.get()), blockTexture(ModBlocks.POPLAR_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_POPLAR_LOG.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_poplar_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_poplar_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_POPLAR_WOOD.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_poplar_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_poplar_log"));
        blockItem(ModBlocks.POPLAR_LOG);
        blockItem(ModBlocks.POPLAR_WOOD);
        blockItem(ModBlocks.STRIPPED_POPLAR_LOG);
        blockItem(ModBlocks.STRIPPED_POPLAR_WOOD);
        blockWithItem(ModBlocks.POPLAR_PLANKS);
        leavesBlock(ModBlocks.POPLAR_LEAVES);
        saplingBlock(ModBlocks.POPLAR_SAPLING);

        buttonBlock((ButtonBlock) ModBlocks.POPLAR_BUTTON.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.POPLAR_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.POPLAR_FENCE.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.POPLAR_FENCE_GATE.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        wallBlock((WallBlock) ModBlocks.POPLAR_WALL.get(), blockTexture(ModBlocks.POPLAR_PLANKS.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.POPLAR_DOOR.get(), modLoc("block/poplar_door_bottom"), modLoc("block/poplar_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.POPLAR_TRAPDOOR.get(), modLoc("block/poplar_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POPLAR_PRESSURE_PLATE);
        blockItem(ModBlocks.POPLAR_FENCE_GATE);
        blockItem(ModBlocks.POPLAR_TRAPDOOR, "_bottom");
        signBlock(((StandingSignBlock) ModBlocks.POPLAR_SIGN.get()), ((WallSignBlock) ModBlocks.POPLAR_WALL_SIGN.get()),
                blockTexture(ModBlocks.POPLAR_PLANKS.get()));


        logBlock(((RotatedPillarBlock) ModBlocks.BOGBIRCH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.BOGBIRCH_WOOD.get()), blockTexture(ModBlocks.BOGBIRCH_LOG.get()), blockTexture(ModBlocks.BOGBIRCH_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BOGBIRCH_LOG.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_bogbirch_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_bogbirch_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_BOGBIRCH_WOOD.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_bogbirch_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_bogbirch_log"));
        blockItem(ModBlocks.BOGBIRCH_LOG);
        blockItem(ModBlocks.BOGBIRCH_WOOD);
        blockItem(ModBlocks.STRIPPED_BOGBIRCH_LOG);
        blockItem(ModBlocks.STRIPPED_BOGBIRCH_WOOD);
        blockWithItem(ModBlocks.BOGBIRCH_PLANKS);
        leavesBlock(ModBlocks.BOGBIRCH_LEAVES);
        saplingBlock(ModBlocks.BOGBIRCH_SAPLING);

        buttonBlock((ButtonBlock) ModBlocks.BOGBIRCH_BUTTON.get(), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.BOGBIRCH_PRESSURE_PLATE.get(), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.BOGBIRCH_FENCE.get(), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.BOGBIRCH_FENCE_GATE.get(), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));
        wallBlock((WallBlock) ModBlocks.BOGBIRCH_WALL.get(), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.BOGBIRCH_DOOR.get(), modLoc("block/bogbirch_door_bottom"), modLoc("block/bogbirch_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.BOGBIRCH_TRAPDOOR.get(), modLoc("block/bogbirch_trapdoor"), true, "cutout");

        blockItem(ModBlocks.BOGBIRCH_PRESSURE_PLATE);
        blockItem(ModBlocks.BOGBIRCH_FENCE_GATE);
        blockItem(ModBlocks.BOGBIRCH_TRAPDOOR, "_bottom");

        signBlock(((StandingSignBlock) ModBlocks.BOGBIRCH_SIGN.get()), ((WallSignBlock) ModBlocks.BOGBIRCH_WALL_SIGN.get()),
                blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));



        logBlock(((RotatedPillarBlock) ModBlocks.MURIAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MURIAR_WOOD.get()), blockTexture(ModBlocks.MURIAR_LOG.get()), blockTexture(ModBlocks.MURIAR_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MURIAR_LOG.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_muriar_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_muriar_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_MURIAR_WOOD.get(), new ResourceLocation(StormMod.MOD_ID, "block/stripped_muriar_log"),
                new ResourceLocation(StormMod.MOD_ID, "block/stripped_muriar_log"));
        blockItem(ModBlocks.MURIAR_LOG);
        blockItem(ModBlocks.MURIAR_WOOD);
        blockItem(ModBlocks.STRIPPED_MURIAR_LOG);
        blockItem(ModBlocks.STRIPPED_MURIAR_WOOD);
        blockWithItem(ModBlocks.MURIAR_PLANKS);
        leavesBlock(ModBlocks.MURIAR_LEAVES);

        buttonBlock((ButtonBlock) ModBlocks.MURIAR_BUTTON.get(), blockTexture(ModBlocks.MURIAR_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.MURIAR_PRESSURE_PLATE.get(), blockTexture(ModBlocks.MURIAR_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.MURIAR_FENCE.get(), blockTexture(ModBlocks.MURIAR_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.MURIAR_FENCE_GATE.get(), blockTexture(ModBlocks.MURIAR_PLANKS.get()));
        wallBlock((WallBlock) ModBlocks.MURIAR_WALL.get(), blockTexture(ModBlocks.MURIAR_PLANKS.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.MURIAR_DOOR.get(), modLoc("block/muriar_door_bottom"), modLoc("block/muriar_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.MURIAR_TRAPDOOR.get(), modLoc("block/muriar_trapdoor"), true, "cutout");

        blockItem(ModBlocks.MURIAR_PRESSURE_PLATE);
        blockItem(ModBlocks.MURIAR_FENCE_GATE);
        blockItem(ModBlocks.MURIAR_TRAPDOOR, "_bottom");
        signBlock(((StandingSignBlock) ModBlocks.MURIAR_SIGN.get()), ((WallSignBlock) ModBlocks.MURIAR_WALL_SIGN.get()),
                blockTexture(ModBlocks.MURIAR_PLANKS.get()));



        logBlock(((RotatedPillarBlock) ModBlocks.WEATHERED_SPRUCE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WEATHERED_SPRUCE_WOOD.get()), blockTexture(ModBlocks.WEATHERED_SPRUCE_LOG.get()), blockTexture(ModBlocks.WEATHERED_SPRUCE_LOG.get()));
        blockItem(ModBlocks.WEATHERED_SPRUCE_LOG);
        blockItem(ModBlocks.WEATHERED_SPRUCE_WOOD);
        blockWithItem(ModBlocks.WEATHERED_SPRUCE_PLANKS);

        buttonBlock((ButtonBlock) ModBlocks.WEATHERED_SPRUCE_BUTTON.get(), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WEATHERED_SPRUCE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.WEATHERED_SPRUCE_FENCE.get(), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WEATHERED_SPRUCE_FENCE_GATE.get(), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));
        wallBlock((WallBlock) ModBlocks.WEATHERED_SPRUCE_WALL.get(), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.WEATHERED_SPRUCE_DOOR.get(), modLoc("block/weathered_spruce_door_bottom"), modLoc("block/weathered_spruce_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.WEATHERED_SPRUCE_TRAPDOOR.get(), modLoc("block/weathered_spruce_trapdoor"), true, "cutout");

        blockItem(ModBlocks.WEATHERED_SPRUCE_PRESSURE_PLATE);
        blockItem(ModBlocks.WEATHERED_SPRUCE_FENCE_GATE);
        blockItem(ModBlocks.WEATHERED_SPRUCE_TRAPDOOR, "_bottom");
        signBlock(((StandingSignBlock) ModBlocks.WEATHERED_SPRUCE_SIGN.get()), ((WallSignBlock) ModBlocks.WEATHERED_SPRUCE_WALL_SIGN.get()),
                blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));



        blockWithItem(ModBlocks.CRACKED_PHYLLITE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_PHYLLITE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_PHYLLITE_TILES);

        stairsBlock(((StairBlock) ModBlocks.PHYLLITE_STAIRS.get()), blockTexture(ModBlocks.PHYLLITE.get()));
        blockItem(ModBlocks.PHYLLITE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.PHYLLITE_SLAB.get()), blockTexture(ModBlocks.PHYLLITE.get()), blockTexture(ModBlocks.PHYLLITE.get()));
        blockItem(ModBlocks.PHYLLITE_SLAB);

        stairsBlock(((StairBlock) ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS.get()), blockTexture(ModBlocks.MOSSY_PHYLLITE_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB.get()), blockTexture(ModBlocks.MOSSY_PHYLLITE_BRICKS.get()), blockTexture(ModBlocks.MOSSY_PHYLLITE_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB);

        stairsBlock(((StairBlock) ModBlocks.PHYLLITE_BRICK_STAIRS.get()), blockTexture(ModBlocks.PHYLLITE_BRICKS.get()));
        blockItem(ModBlocks.PHYLLITE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.PHYLLITE_BRICK_SLAB.get()), blockTexture(ModBlocks.PHYLLITE_BRICKS.get()), blockTexture(ModBlocks.PHYLLITE_BRICKS.get()));
        blockItem(ModBlocks.PHYLLITE_BRICK_SLAB);

        stairsBlock(((StairBlock) ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_PHYLLITE_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_PHYLLITE_BRICKS.get()), blockTexture(ModBlocks.CRACKED_PHYLLITE_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB);

        stairsBlock(((StairBlock) ModBlocks.CRAMPED_STONE_STAIRS.get()), blockTexture(ModBlocks.CRAMPED_STONE.get()));
        blockItem(ModBlocks.CRAMPED_STONE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRAMPED_STONE_SLAB.get()), blockTexture(ModBlocks.CRAMPED_STONE.get()), blockTexture(ModBlocks.CRAMPED_STONE.get()));
        blockItem(ModBlocks.CRAMPED_STONE_SLAB);

        stairsBlock(((StairBlock) ModBlocks.CRAMP_STONE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRAMP_STONE_BRICKS.get()));
        blockItem(ModBlocks.CRAMP_STONE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRAMP_STONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRAMP_STONE_BRICKS.get()), blockTexture(ModBlocks.CRAMP_STONE_BRICKS.get()));
        blockItem(ModBlocks.CRAMP_STONE_BRICK_SLAB);

        stairsBlock(((StairBlock) ModBlocks.CRAMP_MUD_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRAMP_MUD_BRICKS.get()));
        blockItem(ModBlocks.CRAMP_MUD_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRAMP_MUD_BRICK_SLAB.get()), blockTexture(ModBlocks.CRAMP_MUD_BRICKS.get()), blockTexture(ModBlocks.CRAMP_MUD_BRICKS.get()));
        blockItem(ModBlocks.CRAMP_MUD_BRICK_SLAB);

        stairsBlock(((StairBlock) ModBlocks.ANDESITE_BRICK_STAIRS.get()), blockTexture(ModBlocks.ANDESITE_BRICKS.get()));
        blockItem(ModBlocks.ANDESITE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.ANDESITE_BRICK_SLAB.get()), blockTexture(ModBlocks.ANDESITE_BRICKS.get()), blockTexture(ModBlocks.ANDESITE_BRICKS.get()));
        blockItem(ModBlocks.ANDESITE_BRICK_SLAB);

        stairsBlock(((StairBlock) ModBlocks.BOGBIRCH_STAIRS.get()), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));
        blockItem(ModBlocks.BOGBIRCH_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.BOGBIRCH_SLAB.get()), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()), blockTexture(ModBlocks.BOGBIRCH_PLANKS.get()));
        blockItem(ModBlocks.BOGBIRCH_SLAB);

        stairsBlock(((StairBlock) ModBlocks.WEATHERED_SPRUCE_STAIRS.get()), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));
        blockItem(ModBlocks.WEATHERED_SPRUCE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.WEATHERED_SPRUCE_SLAB.get()), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()), blockTexture(ModBlocks.WEATHERED_SPRUCE_PLANKS.get()));
        blockItem(ModBlocks.WEATHERED_SPRUCE_SLAB);

        stairsBlock(((StairBlock) ModBlocks.MURIAR_STAIRS.get()), blockTexture(ModBlocks.MURIAR_PLANKS.get()));
        blockItem(ModBlocks.MURIAR_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.MURIAR_SLAB.get()), blockTexture(ModBlocks.MURIAR_PLANKS.get()), blockTexture(ModBlocks.MURIAR_PLANKS.get()));
        blockItem(ModBlocks.MURIAR_SLAB);

        stairsBlock(((StairBlock) ModBlocks.GRIMWOOD_STAIRS.get()), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));
        blockItem(ModBlocks.GRIMWOOD_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.GRIMWOOD_SLAB.get()), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()), blockTexture(ModBlocks.GRIMWOOD_PLANKS.get()));
        blockItem(ModBlocks.GRIMWOOD_SLAB);

        stairsBlock(((StairBlock) ModBlocks.POPLAR_STAIRS.get()), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        blockItem(ModBlocks.POPLAR_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.POPLAR_SLAB.get()), blockTexture(ModBlocks.POPLAR_PLANKS.get()), blockTexture(ModBlocks.POPLAR_PLANKS.get()));
        blockItem(ModBlocks.POPLAR_SLAB);



        blockWithItem(ModBlocks.PHYLLITE_BRICK_BOOKSHELF);
        blockWithItem(ModBlocks.EMPTY_PHYLLITE_BRICK_BOOKSHELF);
        blockWithItem(ModBlocks.SANDSTONE_BOOKSHELF);
        blockWithItem(ModBlocks.EMPTY_SANDSTONE_BOOKSHELF);
        blockWithItem(ModBlocks.STONE_BRICK_BOOKSHELF);
        blockWithItem(ModBlocks.EMPTY_STONE_BRICK_BOOKSHELF);

        horizontalBlock(ModBlocks.ALCHEMIZING_STATION.get(), new ModelFile.UncheckedModelFile(modLoc("block/alchemizing_station")));


    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((ModCropBlock) block).getAgeProperty()),
                new ResourceLocation(StormMod.MOD_ID, "block/" + textureName + state.getValue(((ModCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("storm:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("storm:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    public void signBlock(StandingSignBlock signBlock, WallSignBlock wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        signBlock(signBlock, wallSignBlock, sign);
    }

    public void signBlock(StandingSignBlock signBlock, WallSignBlock wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    /*
    private void createSimpleFlatItemModel(Block pFlatBlock, String pLayerZeroTextureSuffix) {
        Item item = pFlatBlock.asItem();
        ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(TextureMapping.getBlockTexture(pFlatBlock, pLayerZeroTextureSuffix)), this.modelOutput);
    }

    private ResourceLocation createSuffixedVariant(Block pBlock, String pSuffix, ModelTemplate pModelTemplate, Function<ResourceLocation, TextureMapping> pTextureMappingGetter) {
        return pModelTemplate.createWithSuffix(pBlock, pSuffix, pTextureMappingGetter.apply(TextureMapping.getBlockTexture(pBlock, pSuffix)), this.modelOutput);
    }

    private void createDoubleBlock(Block pDoubleBlock, ResourceLocation pTopHalfModelLocation, ResourceLocation pBottomHalfModelLocation) {
        this.blockStateOutput.accept(MultiVariantGenerator.multiVariant(pDoubleBlock).with(PropertyDispatch.property(BlockStateProperties.DOUBLE_BLOCK_HALF).select(DoubleBlockHalf.LOWER, Variant.variant().with(VariantProperties.MODEL, pBottomHalfModelLocation)).select(DoubleBlockHalf.UPPER, Variant.variant().with(VariantProperties.MODEL, pTopHalfModelLocation))));
    }

    private void createDoublePlant(Block pDoublePlantBlock, ModBlockStateProvider.TintState pTintState) {
        this.createSimpleFlatItemModel(pDoublePlantBlock, "_top");
        ResourceLocation resourcelocation = this.createSuffixedVariant(pDoublePlantBlock, "_top", pTintState.getCross(), TextureMapping::cross);
        ResourceLocation resourcelocation1 = this.createSuffixedVariant(pDoublePlantBlock, "_bottom", pTintState.getCross(), TextureMapping::cross);
        this.createDoubleBlock(pDoublePlantBlock, resourcelocation, resourcelocation1);
    }

    static enum TintState {
        TINTED,
        NOT_TINTED;

        public ModelTemplate getCross() {
            return this == TINTED ? ModelTemplates.TINTED_CROSS : ModelTemplates.CROSS;
        }

        public ModelTemplate getCrossPot() {
            return this == TINTED ? ModelTemplates.TINTED_FLOWER_POT_CROSS : ModelTemplates.FLOWER_POT_CROSS;
        }
    }

    public void ModBlockStateProvider(Consumer<BlockStateGenerator> pBlockStateOutput, BiConsumer<ResourceLocation, Supplier<JsonElement>> pModelOutput, Consumer<Item> pSkippedAutoModelsOutput) {
        this.blockStateOutput = pBlockStateOutput;
        this.modelOutput = pModelOutput;
        this.skippedAutoModelsOutput = pSkippedAutoModelsOutput;
    }

     */



}
