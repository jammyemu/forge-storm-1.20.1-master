package net.lonely.storm.block.custom;

import net.lonely.storm.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class SwampRootCropBlock extends ModCropBlock {
    public static final int MAX_AGE = 2;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 2);

    public SwampRootCropBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemLike getBaseSeedId() {
        return ModItems.SWAMP_ROOT.get();
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

}