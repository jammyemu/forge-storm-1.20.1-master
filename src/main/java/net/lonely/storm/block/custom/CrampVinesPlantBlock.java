package net.lonely.storm.block.custom;

import net.lonely.storm.block.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CrampVinesPlantBlock extends GrowingPlantBodyBlock implements CrampVines {
    public CrampVinesPlantBlock(BlockBehaviour.Properties p_153000_) {
        super(p_153000_, Direction.DOWN, SHAPE, false);
        this.registerDefaultState(this.stateDefinition.any());
    }

    protected GrowingPlantHeadBlock getHeadBlock() {
        return (GrowingPlantHeadBlock) ModBlocks.CRAMP_VINES.get();
    }


}