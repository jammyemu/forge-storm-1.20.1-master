package net.lonely.storm;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.entity.ModBlockEntities;
import net.lonely.storm.entity.ModEntities;
import net.lonely.storm.entity.client.CrampCrabRenderer;
import net.lonely.storm.entity.client.CrystalSkeletonRenderer;
import net.lonely.storm.event.ModEventClientBusEvents;
import net.lonely.storm.fluid.ModFluidTypes;
import net.lonely.storm.fluid.ModFluids;
import net.lonely.storm.item.ModCreativeModTabs;
import net.lonely.storm.item.ModItems;
//import net.lonely.storm.worldgen.biome.ModTerraBlenderAPI;
//import net.lonely.storm.worldgen.biome.surface.ModSurfaceRules;
import net.lonely.storm.loot.ModLootModifiers;
import net.lonely.storm.particles.ModParticles;
import net.lonely.storm.recipes.ModRecipes;
import net.lonely.storm.screen.AlchemizingStationScreen;
import net.lonely.storm.screen.ModMenuTypes;
import net.lonely.storm.sound.ModSounds;
import net.lonely.storm.util.ModWoodTypes;
import net.lonely.storm.worldgen.ModBiomeModifiers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

@Mod(StormMod.MOD_ID)
public class StormMod
{
    public static final String MOD_ID = "storm";
    public static final Logger LOGGER = LogUtils.getLogger();

    //static DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            //DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, "yourmodid");

    //static RegistryObject<Codec<ModBiomeModifiers>> EXAMPLE_CODEC = BIOME_MODIFIER_SERIALIZERS.register("example", () ->
            //RecordCodecBuilder.create(builder -> builder.group(
                    // declare fields
                    //Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifiers::biomes),
                    //PlacedFeature.CODEC.fieldOf("feature").forGetter(ModBiomeModifiers::feature)
                    // declare constructor
            //).apply(builder, ModBiomeModifiers::new)));

    public StormMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntities.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModParticles.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModRecipes.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        ModSounds.register(modEventBus);



        //ModTerraBlenderAPI.registerRegions();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        //SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRules.makeRules());
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ARCTIC_POPPY.getId(), ModBlocks.POTTED_ARCTIC_POPPY);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_FORGET_ME_NOT.getId(), ModBlocks.POTTED_BLUE_FORGET_ME_NOT);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_HIBISCUS.getId(), ModBlocks.POTTED_BLUE_HIBISCUS);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RED_HIBISCUS.getId(), ModBlocks.POTTED_RED_HIBISCUS);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VOID_FLAT_CAP.getId(), ModBlocks.POTTED_VOID_FLAT_CAP);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VOID_MOREL.getId(), ModBlocks.POTTED_VOID_MOREL);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_FORGET_ME_NOT.getId(), ModBlocks.POTTED_WHITE_FORGET_ME_NOT);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.YELLOW_HIBISCUS.getId(), ModBlocks.POTTED_YELLOW_HIBISCUS);
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CRAMP_PLANT.getId(), ModBlocks.POTTED_CRAMP_PLANT);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ATHETITE_CLUMP);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                Sheets.addWoodType(ModWoodTypes.GRIMWOOD);
                Sheets.addWoodType(ModWoodTypes.BOGBIRCH);
                Sheets.addWoodType(ModWoodTypes.POPLAR);
                Sheets.addWoodType(ModWoodTypes.MURIAR);
                Sheets.addWoodType(ModWoodTypes.WEATHERED_SPRUCE);


                EntityRenderers.register(ModEntities.CRYSTAL_SKELETON.get(), CrystalSkeletonRenderer::new);
                EntityRenderers.register(ModEntities.CRAMP_CRAB.get(), CrampCrabRenderer::new);
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_PURE_WATER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_PURE_WATER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_VOID_LIQUID.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_VOID_LIQUID.get(), RenderType.translucent());

                MenuScreens.register(ModMenuTypes.ALCHEMIZING_STATION_MENU.get(), AlchemizingStationScreen::new);
            });
        }
    }
}
