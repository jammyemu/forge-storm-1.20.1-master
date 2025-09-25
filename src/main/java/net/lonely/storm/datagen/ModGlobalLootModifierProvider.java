package net.lonely.storm.datagen;

import net.lonely.storm.StormMod;
import net.lonely.storm.item.ModItems;
import net.lonely.storm.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, StormMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("rooted_ginger_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build() }, ModItems.ROOTED_GINGER.get()));
        add("rooted_ginger_from_fern", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build() }, ModItems.ROOTED_GINGER.get()));

        add("basic_steel_ingot_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
                },
                ModItems.BASIC_STEEL_INGOT.get()));

        add("basic_steel_ingot_from_underwater_ruin_small", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        },
                ModItems.BASIC_STEEL_INGOT.get()));

        add("basic_steel_ingot_from_shipwreck_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()
        },
                ModItems.BASIC_STEEL_INGOT.get()));
    }
}
