package net.lonely.storm.util;

import net.lonely.storm.StormMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType BOGBIRCH = WoodType.register(new WoodType(StormMod.MOD_ID + ":bogbirch", BlockSetType.OAK));
    public static final WoodType MURIAR = WoodType.register(new WoodType(StormMod.MOD_ID + ":muriar", BlockSetType.OAK));
    public static final WoodType GRIMWOOD = WoodType.register(new WoodType(StormMod.MOD_ID + ":grimwood", BlockSetType.OAK));
    public static final WoodType POPLAR = WoodType.register(new WoodType(StormMod.MOD_ID + ":poplar", BlockSetType.OAK));
    public static final WoodType WEATHERED_SPRUCE = WoodType.register(new WoodType(StormMod.MOD_ID + ":weathered_spruce", BlockSetType.OAK));
}
