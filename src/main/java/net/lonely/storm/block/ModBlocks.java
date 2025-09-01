package net.lonely.storm.block;

import com.mojang.blaze3d.shaders.Effect;
import net.lonely.storm.StormMod;
import net.lonely.storm.block.custom.*;
import net.lonely.storm.fluid.ModFluids;
import net.lonely.storm.item.ModItems;
import net.lonely.storm.util.ModWoodTypes;
import net.lonely.storm.worldgen.tree.BogbirchTreeGrower;
import net.lonely.storm.worldgen.tree.GrimwoodTreeGrower;
import net.lonely.storm.worldgen.tree.PoplarTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StormMod.MOD_ID);

    public static final RegistryObject<Block> CRAMP_PORTAL = registerBlock("cramp_portal",
                () -> new CrampPortalBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_PORTAL).noLootTable().noOcclusion().noCollission()));

    public static final RegistryObject<Block> ATHETITE_BLOCK = registerBlock("athetite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> ALCHEMIZING_STATION = registerBlock("alchemizing_station",
            () -> new AlchemizingStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.STONE).noOcclusion()));

    public static final RegistryObject<LiquidBlock> PURE_WATER_BLOCK = BLOCKS.register("pure_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PURE_WATER, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> VOID_LIQUID_BLOCK = BLOCKS.register("void_liquid_block",
            () -> new LiquidBlock(ModFluids.SOURCE_VOID_LIQUID, BlockBehaviour.Properties.copy(Blocks.WATER).noLootTable()));

    public static final RegistryObject<Block> ARCTIC_POPPY = registerBlock("arctic_poppy",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_ARCTIC_POPPY = BLOCKS.register("potted_arctic_poppy",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), ARCTIC_POPPY, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> BLUE_FORGET_ME_NOT = registerBlock("blue_forget_me_not",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_BLUE_FORGET_ME_NOT = BLOCKS.register("potted_blue_forget_me_not",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_FORGET_ME_NOT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> BLUE_HIBISCUS = registerBlock("blue_hibiscus",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_BLUE_HIBISCUS = BLOCKS.register("potted_blue_hibiscus",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLUE_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> RED_HIBISCUS = registerBlock("red_hibiscus",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_RED_HIBISCUS = BLOCKS.register("potted_red_hibiscus",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), RED_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> VOID_FLAT_CAP = registerBlock("void_flat_cap",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_VOID_FLAT_CAP = BLOCKS.register("potted_void_flat_cap",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), VOID_FLAT_CAP, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> VOID_MOREL = registerBlock("void_morel",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_VOID_MOREL = BLOCKS.register("potted_void_morel",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), VOID_MOREL, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> WHITE_FORGET_ME_NOT = registerBlock("white_forget_me_not",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_WHITE_FORGET_ME_NOT = BLOCKS.register("potted_white_forget_me_not",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), WHITE_FORGET_ME_NOT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));

    public static final RegistryObject<Block> YELLOW_HIBISCUS = registerBlock("yellow_hibiscus",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY)));
    public static final RegistryObject<Block> POTTED_YELLOW_HIBISCUS = BLOCKS.register("potted_yellow_hibiscus",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), YELLOW_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY)));


    public static final RegistryObject<Block> CRAMP_VINES = registerBlock("cramp_vines",
            () -> new CrampVinesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CRAMP_VINES_PLANT = registerBlock("cramp_vines_plant",
            () -> new CrampVinesPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GREEN_IVY = registerBlock("green_ivy",
            () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));
    public static final RegistryObject<Block> RED_IVY = registerBlock("red_ivy",
            () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));
    public static final RegistryObject<Block> SWAMP_ROOT_CROP = registerBlock("swamp_root_crop",
            () -> new SwampRootCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));
    public static final RegistryObject<Block> VOID_LICHEN = registerBlock("void_lichen",
            () -> new GlowLichenBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN)));
    public static final RegistryObject<Block> VOID_VINES = registerBlock("void_vines",
            () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));
    public static final RegistryObject<Block> YELLOW_IVY = registerBlock("yellow_ivy",
            () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));
    public static final RegistryObject<Block> YELLOW_VINE = registerBlock("yellow_vine",
            () -> new VineBlock(BlockBehaviour.Properties.copy(Blocks.VINE)));

    public static final RegistryObject<Block> ROOTED_GINGER_CROP = BLOCKS.register("rooted_ginger_crop",
            () -> new RootedGingerCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission().noOcclusion()));

    public static final RegistryObject<Block> CRAMPED_GRASS = registerBlock("cramped_grass",
            () -> new ModdedGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> DARK_CRAMPED_GRASS = registerBlock("dark_cramped_grass",
            () -> new ModdedGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.GRASS)));

    public static final RegistryObject<Block> TALL_DARK_CRAMP_GRASS = registerBlock("tall_dark_cramp_grass",
            () -> new CrampFernBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHORT_DARK_CRAMPED_GRASS = registerBlock("short_dark_cramped_grass",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 2, BlockBehaviour.Properties.copy(Blocks.GRASS)));
    public static final RegistryObject<Block> SHORT_CRAMPED_GRASS = registerBlock("short_cramped_grass",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 2, BlockBehaviour.Properties.copy(Blocks.GRASS)));

    public static final RegistryObject<Block> CRAMP_PLANT = registerBlock("cramp_plant",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.POPPY).lightLevel((p_152688_) -> {
                return 4;
            })));
    public static final RegistryObject<Block> POTTED_CRAMP_PLANT = BLOCKS.register("potted_cramp_plant",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), CRAMP_PLANT, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).lightLevel((p_152688_) -> {
                return 4;
            })));

    public static final RegistryObject<Block> CRAMPED_EARTH = registerBlock("cramped_earth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> CRAMPED_STONE = registerBlock("cramped_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GRIMWOOD_LOG = registerBlock("grimwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GRIMWOOD_WOOD = registerBlock("grimwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_GRIMWOOD_LOG = registerBlock("stripped_grimwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_GRIMWOOD_WOOD = registerBlock("stripped_grimwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> GRIMWOOD_PLANKS = registerBlock("grimwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> GRIMWOOD_LEAVES = registerBlock("grimwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> GRIMWOOD_SAPLING = registerBlock("grimwood_sapling",
            () -> new SaplingBlock(new GrimwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> GRIMWOOD_PRESSURE_PLATE = registerBlock("grimwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.BIRCH));
    public static final RegistryObject<Block> GRIMWOOD_BUTTON = registerBlock("grimwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).sound(SoundType.WOOD), BlockSetType.BIRCH, 10, true));

    public static final RegistryObject<Block> GRIMWOOD_FENCE = registerBlock("grimwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<Block> GRIMWOOD_FENCE_GATE = registerBlock("grimwood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> GRIMWOOD_WALL = registerBlock("grimwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> GRIMWOOD_DOOR = registerBlock("grimwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> GRIMWOOD_TRAPDOOR = registerBlock("grimwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> GRIMWOOD_SIGN = BLOCKS.register("grimwood_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.GRIMWOOD));
    public static final RegistryObject<Block> GRIMWOOD_WALL_SIGN = BLOCKS.register("grimwood_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.GRIMWOOD));


    public static final RegistryObject<Block> BOGBIRCH_LOG = registerBlock("bogbirch_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BOGBIRCH_WOOD = registerBlock("bogbirch_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BOGBIRCH_LOG = registerBlock("stripped_bogbirch_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BOGBIRCH_WOOD = registerBlock("stripped_bogbirch_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BOGBIRCH_PLANKS = registerBlock("bogbirch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> BOGBIRCH_LEAVES = registerBlock("bogbirch_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> BOGBIRCH_SAPLING = registerBlock("bogbirch_sapling",
            () -> new SaplingBlock(new BogbirchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> BOGBIRCH_PRESSURE_PLATE = registerBlock("bogbirch_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.BIRCH));
    public static final RegistryObject<Block> BOGBIRCH_BUTTON = registerBlock("bogbirch_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).sound(SoundType.WOOD), BlockSetType.BIRCH, 10, true));

    public static final RegistryObject<Block> BOGBIRCH_FENCE = registerBlock("bogbirch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<Block> BOGBIRCH_FENCE_GATE = registerBlock("bogbirch_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> BOGBIRCH_WALL = registerBlock("bogbirch_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> BOGBIRCH_DOOR = registerBlock("bogbirch_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> BOGBIRCH_TRAPDOOR = registerBlock("bogbirch_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> BOGBIRCH_SIGN = BLOCKS.register("bogbirch_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SIGN), ModWoodTypes.BOGBIRCH));
    public static final RegistryObject<Block> BOGBIRCH_WALL_SIGN = BLOCKS.register("bogbirch_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BOGBIRCH));



    public static final RegistryObject<Block> POPLAR_LOG = registerBlock("poplar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> POPLAR_PLANKS = registerBlock("poplar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> POPLAR_LEAVES = registerBlock("poplar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> POPLAR_SAPLING = registerBlock("poplar_sapling",
            () -> new SaplingBlock(new PoplarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.BIRCH));
    public static final RegistryObject<Block> POPLAR_BUTTON = registerBlock("poplar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).sound(SoundType.WOOD), BlockSetType.BIRCH, 10, true));

    public static final RegistryObject<Block> POPLAR_FENCE = registerBlock("poplar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> POPLAR_WALL = registerBlock("poplar_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> POPLAR_DOOR = registerBlock("poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> POPLAR_SIGN = BLOCKS.register("poplar_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SIGN), ModWoodTypes.POPLAR));
    public static final RegistryObject<Block> POPLAR_WALL_SIGN = BLOCKS.register("poplar_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.POPLAR));



    public static final RegistryObject<Block> MURIAR_LOG = registerBlock("muriar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MURIAR_WOOD = registerBlock("muriar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MURIAR_LOG = registerBlock("stripped_muriar_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MURIAR_WOOD = registerBlock("stripped_muriar_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> MURIAR_PLANKS = registerBlock("muriar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MURIAR_LEAVES = registerBlock("muriar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> MURIAR_PRESSURE_PLATE = registerBlock("muriar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.BIRCH));
    public static final RegistryObject<Block> MURIAR_BUTTON = registerBlock("muriar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).sound(SoundType.WOOD), BlockSetType.BIRCH, 10, true));

    public static final RegistryObject<Block> MURIAR_FENCE = registerBlock("muriar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<Block> MURIAR_FENCE_GATE = registerBlock("muriar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> MURIAR_WALL = registerBlock("muriar_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> MURIAR_DOOR = registerBlock("muriar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> MURIAR_TRAPDOOR = registerBlock("muriar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> MURIAR_SIGN = BLOCKS.register("muriar_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SIGN), ModWoodTypes.MURIAR));
    public static final RegistryObject<Block> MURIAR_WALL_SIGN = BLOCKS.register("muriar_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.MURIAR));



    public static final RegistryObject<Block> WEATHERED_SPRUCE_LOG = registerBlock("weathered_spruce_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_WOOD = registerBlock("weathered_spruce_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_PLANKS = registerBlock("weathered_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEATHERED_SPRUCE_PRESSURE_PLATE = registerBlock("weathered_spruce_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE).sound(SoundType.WOOD), BlockSetType.BIRCH));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_BUTTON = registerBlock("weathered_spruce_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).sound(SoundType.WOOD), BlockSetType.BIRCH, 10, true));

    public static final RegistryObject<Block> WEATHERED_SPRUCE_FENCE = registerBlock("weathered_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE)));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_FENCE_GATE = registerBlock("weathered_spruce_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_WALL = registerBlock("weathered_spruce_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));

    public static final RegistryObject<Block> WEATHERED_SPRUCE_DOOR = registerBlock("weathered_spruce_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_TRAPDOOR = registerBlock("weathered_spruce_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> WEATHERED_SPRUCE_SIGN = BLOCKS.register("weathered_spruce_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SIGN), ModWoodTypes.WEATHERED_SPRUCE));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_WALL_SIGN = BLOCKS.register("weathered_spruce_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WEATHERED_SPRUCE));


    public static final RegistryObject<Block> PHYLLITE = registerBlock("phyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PHYLLITE_BRICKS = registerBlock("phyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PHYLLITE_PILLAR = registerBlock("phyllite_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PHYLLITE_TILES = registerBlock("phyllite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_PHYLLITE = registerBlock("chiseled_phyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRAMP_CRYSTAL_BLUE = registerBlock("cramp_crystal_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).sound(SoundType.AMETHYST).lightLevel((p_152688_) -> {
                return 15;
            })));
    public static final RegistryObject<Block> CRAMP_CRYSTAL_GREEN = registerBlock("cramp_crystal_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).sound(SoundType.AMETHYST).lightLevel((p_152688_) -> {
                return 15;
            })));
    public static final RegistryObject<Block> CRAMP_CRYSTAL_PURPLE = registerBlock("cramp_crystal_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLOWSTONE).sound(SoundType.AMETHYST).lightLevel((p_152688_) -> {
                return 15;
            })));

    public static final RegistryObject<Block> CRAMP_ATHETITE_ORE = registerBlock("cramp_athetite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_ETHERIUM_ORE = registerBlock("cramp_etherium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_FLORIUM_ORE = registerBlock("cramp_florium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_GEOLIUM_ORE = registerBlock("cramp_geolium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_ILLOITE_ORE = registerBlock("cramp_illoite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_KROTEIS_ORE = registerBlock("cramp_kroteis_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_ORIBIUM_ORE = registerBlock("cramp_oribium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_PHOENITE_ORE = registerBlock("cramp_phoenite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_RIDONEITE_ORE = registerBlock("cramp_ridoneite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_STARMEAR_ORE = registerBlock("cramp_starmear_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_LOST_ORE = registerBlock("cramp_lost_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRAMP_THORIUM_ORE = registerBlock("cramp_thorium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRAMP_FERN_TALL = registerBlock("cramp_fern_tall",
            () -> new CrampFernBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PHYLLITE_BRICK_BOOKSHELF = registerBlock("phyllite_brick_bookshelf",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> EMPTY_PHYLLITE_BRICK_BOOKSHELF = registerBlock("empty_phyllite_brick_bookshelf",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BOOKSHELF = registerBlock("sandstone_bookshelf",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> EMPTY_SANDSTONE_BOOKSHELF = registerBlock("empty_sandstone_bookshelf",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_BRICK_BOOKSHELF = registerBlock("stone_brick_bookshelf",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> EMPTY_STONE_BRICK_BOOKSHELF = registerBlock("empty_stone_brick_bookshelf",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> AMETHYST_CHISELED_STONE_BRICKS = registerBlock("amethyst_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> AMETHYST_GILDED_DEEPSLATE_BRICKS = registerBlock("amethyst_gilded_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> AMETHYST_GILDED_STONE_BRICKS = registerBlock("amethyst_gilded_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ANDESITE_BRICKS_HEAVY = registerBlock("andesite_bricks_heavy",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_ENDSTONE_TILE = registerBlock("chiseled_endstone_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).sound(SoundType.MUD_BRICKS)));
    public static final RegistryObject<Block> CRAMP_MUD_BRICKS = registerBlock("cramp_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> CRAMP_STONE_BRICKS = registerBlock("cramp_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRAMP_STONE_CHECKERS = registerBlock("cramp_stone_checkers",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRAMP_STONE_FRACTAL = registerBlock("cramp_stone_fractal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRAMP_STONE_PILLAR = registerBlock("cramp_stone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRAMP_STONE_TILES = registerBlock("cramp_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DECAYED_ENDSTONE = registerBlock("decayed_endstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> DECAYED_ENDSTONE_TILE = registerBlock("decayed_endstone_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> DECAYED_ENDSTONE_TILE_PEARL = registerBlock("decayed_endstone_tile_pearl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> DEEPSLATE_ANCIENT_CARVING = registerBlock("deepslate_ancient_carving",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> DIAMOND_BRICKS = registerBlock("diamond_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> DIAMOND_CHISELED_DEEPSLATE_BRICKS = registerBlock("diamond_chiseled_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> DIAMOND_CHISELED_STONE_BRICKS = registerBlock("diamond_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DIAMOND_GILDED_STONE_BRICKS = registerBlock("diamond_gilded_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> DIAMOND_GILDED_DEEPSLATE_BRICKS = registerBlock("diamond_gilded_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> ENDSTONE_ANCIENT_CARVING = registerBlock("endstone_ancient_carving",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> ENDSTONE_ANCIENT_CARVING_2 = registerBlock("endstone_ancient_carving_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> ENDSTONE_TILE = registerBlock("endstone_tile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> ENDSTONE_TILE_PEARL = registerBlock("endstone_tile_pearl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> GILDED_AMETHYST_BRICKS = registerBlock("gilded_amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GILDED_ANCIENT_CARVING = registerBlock("gilded_ancient_carving",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GILDED_ANCIENT_CARVING_2 = registerBlock("gilded_ancient_carving_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GILDED_DEEPSLATE_ANCIENT_CARVING = registerBlock("gilded_deepslate_ancient_carving",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GOLD_BRICKS = registerBlock("gold_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GOLD_CHISELED_STONE_BRICKS = registerBlock("gold_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GOLD_GILDED_DEEPSLATE_BRICKS = registerBlock("gold_gilded_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));
    public static final RegistryObject<Block> GOLD_GILDED_STONE_BRICKS = registerBlock("gold_gilded_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MOSSY_DECAYED_ENDSTONE = registerBlock("mossy_decayed_endstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));
    public static final RegistryObject<Block> POLISHED_CRAMP_STONE = registerBlock("polished_cramp_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SMALL_CRAMP_STONE_TILE = registerBlock("small_cramp_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_ANCIENT_CARVING = registerBlock("stone_ancient_carving",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STONE_ANCIENT_CARVING_2 = registerBlock("stone_ancient_carving_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> THIN_STONE_BRICKS = registerBlock("thin_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistryObject<Block> CRACKED_PHYLLITE_BRICKS = registerBlock("cracked_phyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICKS = registerBlock("mossy_phyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MOSSY_PHYLLITE_TILES = registerBlock("mossy_phyllite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));


    public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICK_STAIRS = registerBlock("mossy_phyllite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_PHYLLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICK_SLAB = registerBlock("mossy_phyllite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> PHYLLITE_BRICK_STAIRS = registerBlock("phyllite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PHYLLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> PHYLLITE_BRICK_SLAB = registerBlock("phyllite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> CRACKED_PHYLLITE_BRICK_STAIRS = registerBlock("cracked_phyllite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_PHYLLITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> CRACKED_PHYLLITE_BRICK_SLAB = registerBlock("cracked_phyllite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> PHYLLITE_STAIRS = registerBlock("phyllite_stairs",
            () -> new StairBlock(() -> ModBlocks.PHYLLITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> PHYLLITE_SLAB = registerBlock("phyllite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> CRAMPED_STONE_STAIRS = registerBlock("cramped_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.CRAMPED_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> CRAMPED_STONE_SLAB = registerBlock("cramped_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> CRAMP_STONE_BRICK_STAIRS = registerBlock("cramp_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRAMP_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> CRAMP_STONE_BRICK_SLAB = registerBlock("cramp_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> CRAMP_MUD_BRICK_STAIRS = registerBlock("cramp_mud_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRAMP_MUD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> CRAMP_MUD_BRICK_SLAB = registerBlock("cramp_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ANDESITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS)));
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> BOGBIRCH_STAIRS = registerBlock("bogbirch_stairs",
            () -> new StairBlock(() -> ModBlocks.BOGBIRCH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)));
    public static final RegistryObject<Block> BOGBIRCH_SLAB = registerBlock("bogbirch_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_STAIRS = registerBlock("weathered_spruce_stairs",
            () -> new StairBlock(() -> ModBlocks.WEATHERED_SPRUCE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)));
    public static final RegistryObject<Block> WEATHERED_SPRUCE_SLAB = registerBlock("weathered_spruce_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> MURIAR_STAIRS = registerBlock("muriar_stairs",
            () -> new StairBlock(() -> ModBlocks.MURIAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)));
    public static final RegistryObject<Block> MURIAR_SLAB = registerBlock("muriar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> GRIMWOOD_STAIRS = registerBlock("grimwood_stairs",
            () -> new StairBlock(() -> ModBlocks.GRIMWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)));
    public static final RegistryObject<Block> GRIMWOOD_SLAB = registerBlock("grimwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> POPLAR_STAIRS = registerBlock("poplar_stairs",
            () -> new StairBlock(() -> ModBlocks.POPLAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS)));
    public static final RegistryObject<Block> POPLAR_SLAB = registerBlock("poplar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static BlockState blockstate(RegistryObject<Block> block) {
        return block.get().defaultBlockState();
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}