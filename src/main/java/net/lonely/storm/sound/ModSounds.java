package net.lonely.storm.sound;

import net.lonely.storm.StormMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StormMod.MOD_ID);

    public static final RegistryObject<SoundEvent> CRAB_WALK = registerSoundEvents("crab_walk");
    public static final RegistryObject<SoundEvent> CRAB_HURT = registerSoundEvents("crab_hurt");
    public static final RegistryObject<SoundEvent> CRAB_SQUEAK = registerSoundEvents("crab_squeak");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(StormMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
