package com.example.trapTrapdoor.trap_trapdoor;

import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TrapWarpedTrapdoorBlock extends TrapDoorBlock {
    public TrapWarpedTrapdoorBlock(BlockBehaviour.Properties settings) {
        super(BlockSetType.WARPED, settings);
    }
}



