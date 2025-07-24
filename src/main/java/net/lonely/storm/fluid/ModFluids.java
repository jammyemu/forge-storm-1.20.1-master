package net.lonely.storm.fluid;

import net.lonely.storm.StormMod;
import net.lonely.storm.block.ModBlocks;
import net.lonely.storm.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, StormMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_PURE_WATER = FLUIDS.register("pure_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.PURE_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PURE_WATER = FLUIDS.register("flowing_pure_water_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PURE_WATER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SOURCE_VOID_LIQUID = FLUIDS.register("void_liquid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.VOID_LIQUID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_VOID_LIQUID = FLUIDS.register("flowing_void_liquid_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.VOID_LIQUID_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties PURE_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.PURE_WATER_FLUID_TYPE, SOURCE_PURE_WATER, FLOWING_PURE_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.PURE_WATER_BLOCK)
            .bucket(ModItems.PURE_WATER_BUCKET);

    public static final ForgeFlowingFluid.Properties VOID_LIQUID_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.VOID_LIQUID_FLUID_TYPE, SOURCE_VOID_LIQUID, FLOWING_VOID_LIQUID)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.VOID_LIQUID_BLOCK)
            .bucket(ModItems.VOID_LIQUID_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}