package net.lonely.storm.item;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.entity.ModEntities;
import net.lonely.storm.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StormMod.MOD_ID);

    public static final RegistryObject<Item> ATHETITE_CLUMP = ITEMS.register("athetite_clump", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROOTED_GINGER = ITEMS.register("rooted_ginger", () -> new ItemNameBlockItem(ModBlocks.ROOTED_GINGER_CROP.get(), new Item.Properties().food(ModFoods.ROOTED_GINGER)));
    public static final RegistryObject<Item> SWAMP_ROOT = ITEMS.register("swamp_root", () -> new ItemNameBlockItem(ModBlocks.SWAMP_ROOT_CROP.get(), new Item.Properties().food(ModFoods.SWAMP_ROOT)));

    public static final RegistryObject<Item> PURE_WATER_BUCKET = ITEMS.register("pure_water_bucket", () -> new BucketItem(ModFluids.SOURCE_PURE_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> VOID_LIQUID_BUCKET = ITEMS.register("void_liquid_bucket", () -> new BucketItem(ModFluids.SOURCE_VOID_LIQUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> BOGBIRCH_SIGN = ITEMS.register("bogbirch_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BOGBIRCH_SIGN.get(), ModBlocks.BOGBIRCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> GRIMWOOD_SIGN = ITEMS.register("grimwood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GRIMWOOD_SIGN.get(), ModBlocks.GRIMWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> MURIAR_SIGN = ITEMS.register("muriar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.MURIAR_SIGN.get(), ModBlocks.MURIAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> POPLAR_SIGN = ITEMS.register("poplar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.POPLAR_SIGN.get(), ModBlocks.POPLAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> WEATHERED_SPRUCE_SIGN = ITEMS.register("weathered_spruce_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WEATHERED_SPRUCE_SIGN.get(), ModBlocks.WEATHERED_SPRUCE_WALL_SIGN.get()));

    public static final RegistryObject<Item> ETHERIUM = ITEMS.register("etherium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLORIUM = ITEMS.register("florium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEOLIUM = ITEMS.register("geolium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ILLOITE = ITEMS.register("illoite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KROTEIS = ITEMS.register("kroteis", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORIBIUM = ITEMS.register("oribium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHOENITE = ITEMS.register("phoenite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RIDONEITE = ITEMS.register("ridoneite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARMEAR = ITEMS.register("starmear", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRANGERS_DIAMOND = ITEMS.register("strangers_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THE_LOST = ITEMS.register("the_lost", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THORIUM = ITEMS.register("thorium", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ABYSSAL_SWORD = ITEMS.register("abyssal_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> BEJEWELED_SWORD = ITEMS.register("bejeweled_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SWORD = ITEMS.register("black_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_GRADIENT_SWORD = ITEMS.register("blue_gradient_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SWORD = ITEMS.register("blue_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> COOKED_SWORDFISH = ITEMS.register("cooked_swordfish", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> ETHERIAL_SWORD = ITEMS.register("etherial_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> FRILL_SWORD = ITEMS.register("frill_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_SWORD = ITEMS.register("frozen_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> GILDED_SWORD = ITEMS.register("gilded_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SWORD = ITEMS.register("green_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> HYBRID_AXE = ITEMS.register("hybrid_axe", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> KHOPESH = ITEMS.register("khopesh", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> LIME_SWORD = ITEMS.register("lime_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MAGMA_SWORD = ITEMS.register("magma_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_BATTLESTAFF = ITEMS.register("manas_battlestaff", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_BRACER = ITEMS.register("manas_bracer", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_CLAWS = ITEMS.register("manas_claws", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_CLAYMORE = ITEMS.register("manas_claymore", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_DAGGER = ITEMS.register("manas_dagger", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_GLAIVE = ITEMS.register("manas_glaive", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_GREATSWORD = ITEMS.register("manas_greatsword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_HALBERD = ITEMS.register("manas_halberd", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_HAMMER = ITEMS.register("manas_hammer", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_KATANA = ITEMS.register("manas_katana", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_KNUCKLES = ITEMS.register("manas_knuckles", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_MACE = ITEMS.register("manas_mace", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_RAPIER = ITEMS.register("manas_rapier", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_SCIMITAR = ITEMS.register("manas_scimitar", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_SICKLE = ITEMS.register("manas_sickle", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_SPEAR = ITEMS.register("manas_spear", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_SWORD = ITEMS.register("manas_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> MIROS_SWORD = ITEMS.register("miros_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_HAMMER = ITEMS.register("obsidian_hammer", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SWORD = ITEMS.register("orange_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> PARROT_SWORD = ITEMS.register("parrot_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> PINK_SWORD = ITEMS.register("pink_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_SWORD = ITEMS.register("prismarine_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_BEAM_SWORD = ITEMS.register("purple_beam_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_SWORD = ITEMS.register("purple_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_GRADIENT_SWORD = ITEMS.register("rainbow_gradient_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> RED_SWORD = ITEMS.register("red_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> RUSTED_SWORD = ITEMS.register("rusted_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> SALMON_SWORD = ITEMS.register("salmon_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> SLIME_SWORD = ITEMS.register("slime_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> SWORDFISH = ITEMS.register("swordfish", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> TEMS_BATTLESTAFF = ITEMS.register("tems_battlestaff", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> TUFF_SW0RD = ITEMS.register("tuff_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SWORD = ITEMS.register("yellow_sword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));
    public static final RegistryObject<Item> ZOE_GREATSWORD = ITEMS.register("zoe_greatsword", () -> new SwordItem(Tiers.DIAMOND, 3, 0.1F, new Item.Properties()));

    public static final RegistryObject<Item> ANTIDOTE = ITEMS.register("antidote", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> BURN_SALVE = ITEMS.register("burn_salve", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> FIRE_ESSENCE = ITEMS.register("fire_essence", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> FIRE_ESSENCE_SPRAY = ITEMS.register("fire_essence_spray", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> HEALTH_POTION = ITEMS.register("health_potion", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> ICE_ESSENCE = ITEMS.register("ice_essence", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> ICE_ESSENCE_SPRAY = ITEMS.register("ice_essence_spray", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> POCKET_SAND = ITEMS.register("pocket_sand", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> POISON_ESSENCE = ITEMS.register("poison_essence", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> POISON_ESSENCE_SPRAY = ITEMS.register("poison_essence_spray", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> POPPER = ITEMS.register("popper", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> ROOTED_ESSENCE = ITEMS.register("rooted_essence", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> ROOTED_ESSENCE_SPRAY = ITEMS.register("rooted_essence_spray", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> SMOKE_BOMB = ITEMS.register("smoke_bomb", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> SPEED_POTION = ITEMS.register("speed_potion", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));

    public static final RegistryObject<Item> ATTACK_NECKLACE = ITEMS.register("attack_necklace", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ATTACK_RING = ITEMS.register("attack_ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEFENCE_NECKLACE = ITEMS.register("defence_necklace", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEFENCE_RING = ITEMS.register("defence_ring", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BASIC_KINETICS_BLUEPRINT = ITEMS.register("basic_kinetics_blueprint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INTERMEDIATE_BLUEPRINT = ITEMS.register("intermediate_blueprint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCED_BLUEPRINT = ITEMS.register("experienced_blueprint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GENIUS_BLUEPRINT = ITEMS.register("genius_blueprint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRAIN_BLUEPRINT = ITEMS.register("train_blueprint", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MANAS_AXE = ITEMS.register("manas_axe", () -> new AxeItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_HOE = ITEMS.register("manas_hoe", () -> new HoeItem(Tiers.DIAMOND, 5, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_INGOT = ITEMS.register("manas_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANAS_PICKAXE = ITEMS.register("manas_pickaxe", () -> new PickaxeItem(Tiers.DIAMOND, 5, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MANAS_SHOVEL = ITEMS.register("manas_shovel", () -> new ShovelItem(Tiers.DIAMOND, 5.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_STICK = ITEMS.register("reinforced_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROZIE_HORN = ITEMS.register("rozie_horn", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUSIC_DISC_RECLAIMED = ITEMS.register("music_disc_reclaimed", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NINETEEN_EIGHTY_FOUR = ITEMS.register("nineteen_eighty_four", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FELLO_COIN = ITEMS.register("fello_coin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FELLO_COIN_NUGGET = ITEMS.register("fello_coin_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_STEEL_INGOT = ITEMS.register("basic_steel_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADRENALINE_SYRINGE = ITEMS.register("adrenaline_syringe", () -> new ModCombatSystemItem(new Item.Properties().food(ModFoods.COMBAT_ITEM)));
    public static final RegistryObject<Item> ANCIENT_TOME = ITEMS.register("ancient_tome", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_SCALE = ITEMS.register("dark_scale", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_KEY = ITEMS.register("gold_key", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_CHALICE = ITEMS.register("old_chalice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLD_COIN = ITEMS.register("old_coin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUSTED_KEY = ITEMS.register("rusted_key", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUSTED_PENDANT = ITEMS.register("rusted_pendant", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_KEY = ITEMS.register("silver_key", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_POUCH = ITEMS.register("strange_pouch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCOVERED_POTTERY = ITEMS.register("uncovered_pottery", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MANASTEEL_HELMET = ITEMS.register("manasteel_helmet", () -> new ArmorItem(ModArmorMaterials.MANASTEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MANASTEEL_CHESTPLATE = ITEMS.register("manasteel_chestplate", () -> new ArmorItem(ModArmorMaterials.MANASTEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MANASTEEL_LEGGINGS = ITEMS.register("manasteel_leggings", () -> new ArmorItem(ModArmorMaterials.MANASTEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MANASTEEL_BOOTS = ITEMS.register("manasteel_boots", () -> new ArmorItem(ModArmorMaterials.MANASTEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GILDED_BROADSWORD = ITEMS.register("gilded_broadsword", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_CLAWS = ITEMS.register("gilded_claws", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_DAGGER = ITEMS.register("gilded_dagger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_GREATSWORD = ITEMS.register("gilded_greatsword", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_HALBERD = ITEMS.register("gilded_halberd", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_HAMMER = ITEMS.register("gilded_hammer", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_MACE = ITEMS.register("gilded_mace", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_RAPIER = ITEMS.register("gilded_rapier", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GILDED_SICKLE = ITEMS.register("gilded_sickle", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HEAVY_CROSSBOW = ITEMS.register("heavy_crossbow", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_CROSSBOW = ITEMS.register("light_crossbow", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LONGBOW = ITEMS.register("longbow", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RECURVE_BOW = ITEMS.register("recurve_bow", () -> new Item(new Item.Properties()));





    public static final RegistryObject<Item> SWAMP_LOAF = ITEMS.register("swamp_loaf", () -> new Item(new Item.Properties().food(ModFoods.SWAMP_LOAF)));

    public static final RegistryObject<Item> CRYSTAL_SKELETON_SPAWN_EGG = ITEMS.register("crystal_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.CRYSTAL_SKELETON, 0xD57E36, 0xE234A5, new Item.Properties()));
    public static final RegistryObject<Item> CRAMP_CRAB_SPAWN_EGG = ITEMS.register("cramp_crab_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.CRAMP_CRAB, 0x1d4a3f, 0x428a78, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
