package net.lonely.storm.item;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StormMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEM_TAB = CREATIVE_MODE_TABS.register("item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THORIUM.get()))
                    .title(Component.translatable("creativetab.item_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.ABYSSAL_SWORD.get());
                        pOutput.accept(ModItems.BEJEWELED_SWORD.get());
                        pOutput.accept(ModItems.BLACK_SWORD.get());
                        pOutput.accept(ModItems.BLAZE_SWORD.get());
                        pOutput.accept(ModItems.BLUE_GRADIENT_SWORD.get());
                        pOutput.accept(ModItems.BLUE_SWORD.get());
                        pOutput.accept(ModItems.COOKED_SWORDFISH.get());
                        pOutput.accept(ModItems.ETHERIAL_SWORD.get());
                        pOutput.accept(ModItems.FRILL_SWORD.get());
                        pOutput.accept(ModItems.FROZEN_SWORD.get());
                        pOutput.accept(ModItems.GILDED_SWORD.get());
                        pOutput.accept(ModItems.GREEN_SWORD.get());
                        pOutput.accept(ModItems.HYBRID_AXE.get());
                        pOutput.accept(ModItems.KHOPESH.get());
                        pOutput.accept(ModItems.LIME_SWORD.get());
                        pOutput.accept(ModItems.MAGMA_SWORD.get());
                        pOutput.accept(ModItems.MIROS_SWORD.get());
                        pOutput.accept(ModItems.OBSIDIAN_HAMMER.get());
                        pOutput.accept(ModItems.ORANGE_SWORD.get());
                        pOutput.accept(ModItems.PARROT_SWORD.get());
                        pOutput.accept(ModItems.PINK_SWORD.get());
                        pOutput.accept(ModItems.PRISMARINE_SWORD.get());
                        pOutput.accept(ModItems.PURPLE_BEAM_SWORD.get());
                        pOutput.accept(ModItems.PURPLE_SWORD.get());
                        pOutput.accept(ModItems.RAINBOW_GRADIENT_SWORD.get());
                        pOutput.accept(ModItems.RED_SWORD.get());
                        pOutput.accept(ModItems.RUSTED_SWORD.get());
                        pOutput.accept(ModItems.SALMON_SWORD.get());
                        pOutput.accept(ModItems.SLIME_SWORD.get());
                        pOutput.accept(ModItems.SWORDFISH.get());
                        pOutput.accept(ModItems.TEMS_BATTLESTAFF.get());
                        pOutput.accept(ModItems.TUFF_SW0RD.get());
                        pOutput.accept(ModItems.YELLOW_SWORD.get());
                        pOutput.accept(ModItems.ZOE_GREATSWORD.get());

                        pOutput.accept(ModItems.ATTACK_NECKLACE.get());
                        pOutput.accept(ModItems.ATTACK_RING.get());
                        pOutput.accept(ModItems.DEFENCE_NECKLACE.get());
                        pOutput.accept(ModItems.DEFENCE_RING.get());

                        pOutput.accept(ModItems.MANAS_INGOT.get());
                        pOutput.accept(ModItems.MANAS_AXE.get());
                        pOutput.accept(ModItems.MANAS_HOE.get());
                        pOutput.accept(ModItems.MANAS_PICKAXE.get());
                        pOutput.accept(ModItems.MANAS_SHOVEL.get());
                        pOutput.accept(ModItems.MANAS_BATTLESTAFF.get());
                        pOutput.accept(ModItems.MANAS_BRACER.get());
                        pOutput.accept(ModItems.MANAS_CLAWS.get());
                        pOutput.accept(ModItems.MANAS_CLAYMORE.get());
                        pOutput.accept(ModItems.MANAS_DAGGER.get());
                        pOutput.accept(ModItems.MANAS_GLAIVE.get());
                        pOutput.accept(ModItems.MANAS_GREATSWORD.get());
                        pOutput.accept(ModItems.MANAS_HALBERD.get());
                        pOutput.accept(ModItems.MANAS_HAMMER.get());
                        pOutput.accept(ModItems.MANAS_KATANA.get());
                        pOutput.accept(ModItems.MANAS_KNUCKLES.get());
                        pOutput.accept(ModItems.MANAS_MACE.get());
                        pOutput.accept(ModItems.MANAS_RAPIER.get());
                        pOutput.accept(ModItems.MANAS_SCIMITAR.get());
                        pOutput.accept(ModItems.MANAS_SICKLE.get());
                        pOutput.accept(ModItems.MANAS_SPEAR.get());
                        pOutput.accept(ModItems.MANAS_SWORD.get());

                        pOutput.accept(ModItems.ATHETITE_CLUMP.get());
                        pOutput.accept(ModItems.ETHERIUM.get());
                        pOutput.accept(ModItems.FLORIUM.get());
                        pOutput.accept(ModItems.GEOLIUM.get());
                        pOutput.accept(ModItems.ILLOITE.get());
                        pOutput.accept(ModItems.KROTEIS.get());
                        pOutput.accept(ModItems.ORIBIUM.get());
                        pOutput.accept(ModItems.PHOENITE.get());
                        pOutput.accept(ModItems.RIDONEITE.get());
                        pOutput.accept(ModItems.STARMEAR.get());
                        pOutput.accept(ModItems.STRANGERS_DIAMOND.get());
                        pOutput.accept(ModItems.THE_LOST.get());
                        pOutput.accept(ModItems.THORIUM.get());
                        pOutput.accept(ModItems.CRYSTAL_SKELETON_SPAWN_EGG.get());
                        pOutput.accept(ModItems.CRAMP_CRAB_SPAWN_EGG.get());


                        pOutput.accept(ModItems.ANTIDOTE.get());
                        pOutput.accept(ModItems.BURN_SALVE.get());
                        pOutput.accept(ModItems.COFFEE.get());
                        pOutput.accept(ModItems.FIRE_ESSENCE.get());
                        pOutput.accept(ModItems.FIRE_ESSENCE_SPRAY.get());
                        pOutput.accept(ModItems.HEALTH_POTION.get());
                        pOutput.accept(ModItems.ICE_ESSENCE.get());
                        pOutput.accept(ModItems.ICE_ESSENCE_SPRAY.get());
                        pOutput.accept(ModItems.POCKET_SAND.get());
                        pOutput.accept(ModItems.POISON_ESSENCE.get());
                        pOutput.accept(ModItems.POISON_ESSENCE_SPRAY.get());
                        pOutput.accept(ModItems.POPPER.get());
                        pOutput.accept(ModItems.ROOTED_ESSENCE.get());
                        pOutput.accept(ModItems.ROOTED_ESSENCE_SPRAY.get());
                        pOutput.accept(ModItems.SMOKE_BOMB.get());
                        pOutput.accept(ModItems.SPEED_POTION.get());

                        pOutput.accept(ModItems.FELLO_COIN_NUGGET.get());
                        pOutput.accept(ModItems.FELLO_COIN.get());
                        pOutput.accept(ModItems.NINETEEN_EIGHTY_FOUR.get());
                        pOutput.accept(ModItems.MUSIC_DISC_RECLAIMED.get());
                        pOutput.accept(ModItems.ROZIE_HORN.get());
                        pOutput.accept(ModItems.REINFORCED_STICK.get());
                        pOutput.accept(ModItems.BASIC_STEEL_INGOT.get());


                        pOutput.accept(ModItems.PURE_WATER_BUCKET.get());
                        pOutput.accept(ModItems.VOID_LIQUID_BUCKET.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BLOCK_TAB = CREATIVE_MODE_TABS.register("block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PHYLLITE.get()))
                    .title(Component.translatable("creativetab.block_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.ATHETITE_BLOCK.get());

                        pOutput.accept(ModBlocks.CRAMP_CRYSTAL_BLUE.get());
                        pOutput.accept(ModBlocks.CRAMP_CRYSTAL_GREEN.get());
                        pOutput.accept(ModBlocks.CRAMP_CRYSTAL_PURPLE.get());

                        pOutput.accept(ModBlocks.PHYLLITE.get());
                        pOutput.accept(ModBlocks.PHYLLITE_STAIRS.get());
                        pOutput.accept(ModBlocks.PHYLLITE_SLAB.get());
                        pOutput.accept(ModBlocks.PHYLLITE_BRICKS.get());
                        pOutput.accept(ModBlocks.PHYLLITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.PHYLLITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.PHYLLITE_TILES.get());
                        pOutput.accept(ModBlocks.PHYLLITE_PILLAR.get());
                        pOutput.accept(ModBlocks.CHISELED_PHYLLITE.get());
                        pOutput.accept(ModBlocks.CRACKED_PHYLLITE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_PHYLLITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_PHYLLITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MOSSY_PHYLLITE_BRICKS.get());
                        pOutput.accept(ModBlocks.MOSSY_PHYLLITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MOSSY_PHYLLITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MOSSY_PHYLLITE_TILES.get());

                        pOutput.accept(ModBlocks.GRIMWOOD_LOG.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_GRIMWOOD_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_GRIMWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_STAIRS.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_SLAB.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_SAPLING.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_BUTTON.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_FENCE.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_WALL.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_DOOR.get());
                        pOutput.accept(ModBlocks.GRIMWOOD_TRAPDOOR.get());
                        //pOutput.accept(ModBlocks.GRIMWOOD_SIGN.get());

                        pOutput.accept(ModBlocks.BOGBIRCH_LOG.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_BOGBIRCH_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_BOGBIRCH_WOOD.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_PLANKS.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_STAIRS.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_SLAB.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_SAPLING.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_LEAVES.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_BUTTON.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_FENCE.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_WALL.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_DOOR.get());
                        pOutput.accept(ModBlocks.BOGBIRCH_TRAPDOOR.get());
                        //pOutput.accept(ModBlocks.BOGBIRCH_SIGN.get());

                        pOutput.accept(ModBlocks.POPLAR_LOG.get());
                        pOutput.accept(ModBlocks.POPLAR_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_POPLAR_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_POPLAR_WOOD.get());
                        pOutput.accept(ModBlocks.POPLAR_PLANKS.get());
                        pOutput.accept(ModBlocks.POPLAR_STAIRS.get());
                        pOutput.accept(ModBlocks.POPLAR_SLAB.get());
                        pOutput.accept(ModBlocks.POPLAR_SAPLING.get());
                        pOutput.accept(ModBlocks.POPLAR_LEAVES.get());
                        pOutput.accept(ModBlocks.POPLAR_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.POPLAR_BUTTON.get());
                        pOutput.accept(ModBlocks.POPLAR_FENCE.get());
                        pOutput.accept(ModBlocks.POPLAR_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.POPLAR_WALL.get());
                        pOutput.accept(ModBlocks.POPLAR_DOOR.get());
                        pOutput.accept(ModBlocks.POPLAR_TRAPDOOR.get());
                        //pOutput.accept(ModBlocks.POPLAR_SIGN.get());

                        pOutput.accept(ModBlocks.MURIAR_LOG.get());
                        pOutput.accept(ModBlocks.MURIAR_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MURIAR_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MURIAR_WOOD.get());
                        pOutput.accept(ModBlocks.MURIAR_PLANKS.get());
                        pOutput.accept(ModBlocks.MURIAR_STAIRS.get());
                        pOutput.accept(ModBlocks.MURIAR_SLAB.get());
                        pOutput.accept(ModBlocks.MURIAR_LEAVES.get());
                        pOutput.accept(ModBlocks.MURIAR_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.MURIAR_BUTTON.get());
                        pOutput.accept(ModBlocks.MURIAR_FENCE.get());
                        pOutput.accept(ModBlocks.MURIAR_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.MURIAR_WALL.get());
                        pOutput.accept(ModBlocks.MURIAR_DOOR.get());
                        pOutput.accept(ModBlocks.MURIAR_TRAPDOOR.get());
                        //pOutput.accept(ModBlocks.MURIAR_SIGN.get());

                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_LOG.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_WOOD.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_PLANKS.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_STAIRS.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_SLAB.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_BUTTON.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_FENCE.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_WALL.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_DOOR.get());
                        pOutput.accept(ModBlocks.WEATHERED_SPRUCE_TRAPDOOR.get());
                        //pOutput.accept(ModBlocks.WEATHERED_SPRUCE_SIGN.get());

                        pOutput.accept(ModBlocks.AMETHYST_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.AMETHYST_GILDED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.AMETHYST_GILDED_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.GILDED_AMETHYST_BRICKS.get());
                        pOutput.accept(ModBlocks.DIAMOND_BRICKS.get());
                        pOutput.accept(ModBlocks.DIAMOND_CHISELED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.DIAMOND_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.DIAMOND_GILDED_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.DIAMOND_GILDED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.GOLD_BRICKS.get());
                        pOutput.accept(ModBlocks.GOLD_CHISELED_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.GOLD_GILDED_DEEPSLATE_BRICKS.get());
                        pOutput.accept(ModBlocks.GOLD_GILDED_STONE_BRICKS.get());

                        pOutput.accept(ModBlocks.CRAMPED_EARTH.get());
                        pOutput.accept(ModBlocks.CRAMPED_GRASS.get());
                        pOutput.accept(ModBlocks.DARK_CRAMPED_GRASS.get());
                        pOutput.accept(ModBlocks.CRAMPED_STONE.get());
                        pOutput.accept(ModBlocks.CRAMPED_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.CRAMPED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_CHECKERS.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_FRACTAL.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_PILLAR.get());
                        pOutput.accept(ModBlocks.CRAMP_STONE_TILES.get());
                        pOutput.accept(ModBlocks.POLISHED_CRAMP_STONE.get());
                        pOutput.accept(ModBlocks.SMALL_CRAMP_STONE_TILE.get());
                        pOutput.accept(ModBlocks.CRAMP_PORTAL.get());
                        pOutput.accept(ModBlocks.CRAMP_MUD_BRICKS.get());
                        pOutput.accept(ModBlocks.CRAMP_MUD_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRAMP_MUD_BRICK_SLAB.get());

                        pOutput.accept(ModBlocks.ENDSTONE_TILE.get());
                        pOutput.accept(ModBlocks.ENDSTONE_TILE_PEARL.get());
                        pOutput.accept(ModBlocks.DECAYED_ENDSTONE.get());
                        pOutput.accept(ModBlocks.DECAYED_ENDSTONE_TILE.get());
                        pOutput.accept(ModBlocks.DECAYED_ENDSTONE_TILE_PEARL.get());
                        pOutput.accept(ModBlocks.MOSSY_DECAYED_ENDSTONE.get());
                        pOutput.accept(ModBlocks.CHISELED_ENDSTONE_TILE.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_ANCIENT_CARVING.get());
                        pOutput.accept(ModBlocks.ENDSTONE_ANCIENT_CARVING.get());
                        pOutput.accept(ModBlocks.ENDSTONE_ANCIENT_CARVING_2.get());
                        pOutput.accept(ModBlocks.GILDED_ANCIENT_CARVING.get());
                        pOutput.accept(ModBlocks.GILDED_ANCIENT_CARVING_2.get());
                        pOutput.accept(ModBlocks.GILDED_DEEPSLATE_ANCIENT_CARVING.get());
                        pOutput.accept(ModBlocks.STONE_ANCIENT_CARVING.get());
                        pOutput.accept(ModBlocks.STONE_ANCIENT_CARVING_2.get());

                        pOutput.accept(ModBlocks.ANDESITE_BRICKS.get());
                        pOutput.accept(ModBlocks.ANDESITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.ANDESITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.ANDESITE_BRICKS_HEAVY.get());
                        pOutput.accept(ModBlocks.GREEN_BRICKS.get());

                        //pOutput.accept(ModBlocks.PHYLLITE_BRICK_BOOKSHELF.get());
                        //pOutput.accept(ModBlocks.EMPTY_PHYLLITE_BRICK_BOOKSHELF.get());
                        //pOutput.accept(ModBlocks.SANDSTONE_BOOKSHELF.get());
                        //pOutput.accept(ModBlocks.EMPTY_SANDSTONE_BOOKSHELF.get());
                        //pOutput.accept(ModBlocks.STONE_BRICK_BOOKSHELF.get());
                        //pOutput.accept(ModBlocks.EMPTY_STONE_BRICK_BOOKSHELF.get());

                        pOutput.accept(ModBlocks.CRAMP_ATHETITE_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_ETHERIUM_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_FLORIUM_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_GEOLIUM_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_ILLOITE_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_KROTEIS_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_ORIBIUM_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_PHOENITE_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_RIDONEITE_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_STARMEAR_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_LOST_ORE.get());
                        pOutput.accept(ModBlocks.CRAMP_THORIUM_ORE.get());

                        pOutput.accept(ModBlocks.ALCHEMIZING_STATION.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FLORA_TAB = CREATIVE_MODE_TABS.register("flora_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RED_HIBISCUS.get()))
                    .title(Component.translatable("creativetab.flora_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.ARCTIC_POPPY.get());

                        pOutput.accept(ModBlocks.BLUE_FORGET_ME_NOT.get());
                        pOutput.accept(ModBlocks.WHITE_FORGET_ME_NOT.get());

                        pOutput.accept(ModBlocks.BLUE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.RED_HIBISCUS.get());
                        pOutput.accept(ModBlocks.YELLOW_HIBISCUS.get());

                        pOutput.accept(ModBlocks.VOID_FLAT_CAP.get());
                        pOutput.accept(ModBlocks.VOID_LICHEN.get());
                        pOutput.accept(ModBlocks.VOID_MOREL.get());
                        pOutput.accept(ModBlocks.VOID_VINES.get());

                        pOutput.accept(ModBlocks.CRAMP_VINES.get());
                        pOutput.accept(ModBlocks.GREEN_IVY.get());
                        pOutput.accept(ModBlocks.RED_IVY.get());
                        pOutput.accept(ModBlocks.YELLOW_IVY.get());
                        pOutput.accept(ModBlocks.YELLOW_VINE.get());

                        //pOutput.accept(ModBlocks.TALL_CRAMP_FLORA.get());
                        pOutput.accept(ModBlocks.CRAMP_FERN_TALL.get());
                        pOutput.accept(ModBlocks.TALL_DARK_CRAMP_GRASS.get());
                        pOutput.accept(ModBlocks.SHORT_DARK_CRAMPED_GRASS.get());
                        pOutput.accept(ModBlocks.SHORT_CRAMPED_GRASS.get());
                        pOutput.accept(ModBlocks.CRAMP_PLANT.get());
                        pOutput.accept(ModItems.SWAMP_ROOT.get());
                        pOutput.accept(ModItems.ROOTED_GINGER.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
