package com.example.trapTrapdoor.trap_trapdoor;

import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TrapBirchTrapdoorBlock extends TrapDoorBlock {
    public TrapBirchTrapdoorBlock(BlockBehaviour.Properties settings) {
        super(BlockSetType.BIRCH, settings);
    }
}

