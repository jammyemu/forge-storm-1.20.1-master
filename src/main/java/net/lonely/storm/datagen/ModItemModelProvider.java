package net.lonely.storm.datagen;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StonecutterBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, StormMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ATHETITE_CLUMP);
        simpleItem(ModItems.ROOTED_GINGER);
        simpleItem(ModItems.PURE_WATER_BUCKET);
        simpleItem(ModItems.VOID_LIQUID_BUCKET);


        simpleItem(ModItems.ETHERIUM);
        simpleItem(ModItems.FLORIUM);
        simpleItem(ModItems.GEOLIUM);
        simpleItem(ModItems.ILLOITE);
        simpleItem(ModItems.KROTEIS);
        simpleItem(ModItems.ORIBIUM);
        simpleItem(ModItems.PHOENITE);
        simpleItem(ModItems.RIDONEITE);
        simpleItem(ModItems.STARMEAR);
        simpleItem(ModItems.STRANGERS_DIAMOND);
        simpleItem(ModItems.THE_LOST);
        simpleItem(ModItems.THORIUM);

        saplingItem(ModBlocks.GRIMWOOD_SAPLING);
        buttonItem(ModBlocks.GRIMWOOD_BUTTON, ModBlocks.GRIMWOOD_PLANKS);
        fenceItem(ModBlocks.GRIMWOOD_FENCE, ModBlocks.GRIMWOOD_PLANKS);
        wallItem(ModBlocks.GRIMWOOD_WALL, ModBlocks.GRIMWOOD_PLANKS);
        simpleBlockItem(ModBlocks.GRIMWOOD_DOOR);
        simpleItem(ModItems.GRIMWOOD_SIGN);

        saplingItem(ModBlocks.BOGBIRCH_SAPLING);
        buttonItem(ModBlocks.BOGBIRCH_BUTTON, ModBlocks.BOGBIRCH_PLANKS);
        fenceItem(ModBlocks.BOGBIRCH_FENCE, ModBlocks.BOGBIRCH_PLANKS);
        wallItem(ModBlocks.BOGBIRCH_WALL, ModBlocks.BOGBIRCH_PLANKS);
        simpleBlockItem(ModBlocks.BOGBIRCH_DOOR);
        simpleItem(ModItems.BOGBIRCH_SIGN);

        saplingItem(ModBlocks.POPLAR_SAPLING);
        buttonItem(ModBlocks.POPLAR_BUTTON, ModBlocks.POPLAR_PLANKS);
        fenceItem(ModBlocks.POPLAR_FENCE, ModBlocks.POPLAR_PLANKS);
        wallItem(ModBlocks.POPLAR_WALL, ModBlocks.POPLAR_PLANKS);
        simpleBlockItem(ModBlocks.POPLAR_DOOR);
        simpleItem(ModItems.POPLAR_SIGN);

        buttonItem(ModBlocks.MURIAR_BUTTON, ModBlocks.MURIAR_PLANKS);
        fenceItem(ModBlocks.MURIAR_FENCE, ModBlocks.MURIAR_PLANKS);
        wallItem(ModBlocks.MURIAR_WALL, ModBlocks.MURIAR_PLANKS);
        simpleBlockItem(ModBlocks.MURIAR_DOOR);
        simpleItem(ModItems.MURIAR_SIGN);

        buttonItem(ModBlocks.WEATHERED_SPRUCE_BUTTON, ModBlocks.WEATHERED_SPRUCE_PLANKS);
        fenceItem(ModBlocks.WEATHERED_SPRUCE_FENCE, ModBlocks.WEATHERED_SPRUCE_PLANKS);
        wallItem(ModBlocks.WEATHERED_SPRUCE_WALL, ModBlocks.WEATHERED_SPRUCE_PLANKS);
        simpleBlockItem(ModBlocks.WEATHERED_SPRUCE_DOOR);
        simpleItem(ModItems.WEATHERED_SPRUCE_SIGN);




        simpleItem(ModItems.SWAMP_ROOT);

        simpleBlockItem(ModBlocks.ARCTIC_POPPY);
        simpleBlockItem(ModBlocks.BLUE_FORGET_ME_NOT);
        simpleBlockItem(ModBlocks.BLUE_HIBISCUS);
        simpleBlockItem(ModBlocks.RED_HIBISCUS);
        simpleBlockItem(ModBlocks.VOID_FLAT_CAP);
        simpleBlockItem(ModBlocks.VOID_MOREL);
        simpleBlockItem(ModBlocks.WHITE_FORGET_ME_NOT);
        simpleBlockItem(ModBlocks.YELLOW_HIBISCUS);

        simpleBlockItem(ModBlocks.CRAMP_PLANT);
        simpleBlockItem(ModBlocks.SHORT_CRAMPED_GRASS);
        simpleBlockItem(ModBlocks.SHORT_DARK_CRAMPED_GRASS);

        simpleItem(ModItems.ANTIDOTE);
        simpleItem(ModItems.BURN_SALVE);
        simpleItem(ModItems.COFFEE);
        simpleItem(ModItems.FIRE_ESSENCE);
        simpleItem(ModItems.FIRE_ESSENCE_SPRAY);
        simpleItem(ModItems.HEALTH_POTION);
        simpleItem(ModItems.ICE_ESSENCE);
        simpleItem(ModItems.ICE_ESSENCE_SPRAY);
        simpleItem(ModItems.POCKET_SAND);
        simpleItem(ModItems.POISON_ESSENCE);
        simpleItem(ModItems.POISON_ESSENCE_SPRAY);
        simpleItem(ModItems.POPPER);
        simpleItem(ModItems.ROOTED_ESSENCE);
        simpleItem(ModItems.ROOTED_ESSENCE_SPRAY);
        simpleItem(ModItems.SMOKE_BOMB);
        simpleItem(ModItems.SPEED_POTION);


        withExistingParent(ModItems.CRYSTAL_SKELETON_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.CRAMP_CRAB_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        complexBlock(ModBlocks.ALCHEMIZING_STATION.get());


    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StormMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(StormMod.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StormMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(StormMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(StormMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(StormMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(StormMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(StormMod.MOD_ID,"item/" + item.getId().getPath()));
    }

}