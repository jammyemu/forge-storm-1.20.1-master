package net.lonely.storm.fluid;

import net.lonely.storm.StormMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, StormMod.MOD_ID);

    public static final RegistryObject<FluidType> PURE_WATER_FLUID_TYPE = registerFluidType("pure_water_fluid",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1a1ffd6,
                    new Vector3f(2f / 255f, 230f / 255f, 169f / 255f),
                    FluidType.Properties.create().lightLevel(5).viscosity(9).density(15).canDrown(false).supportsBoating(false).canConvertToSource(false).canHydrate(false)));

    public static final RegistryObject<FluidType> VOID_LIQUID_FLUID_TYPE = registerFluidType("void_liquid_fluid",
            new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL, 0xA1000000,
                    new Vector3f(0f / 255f, 0f / 255f, 0f / 255f),
                    FluidType.Properties.create().lightLevel(1).viscosity(9).density(15).canDrown(false).supportsBoating(false).canConvertToSource(false).canHydrate(false)));


    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}