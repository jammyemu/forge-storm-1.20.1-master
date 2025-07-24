package net.lonely.storm.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ROOTED_GINGER = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties SWAMP_ROOT = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.1f).build();

    public static final FoodProperties SWAMP_LOAF = new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build();

    public static final FoodProperties COMBAT_ITEM = new FoodProperties.Builder().nutrition(0).saturationMod(0.0f).alwaysEat().build();

}