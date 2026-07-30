package com.example.trapTrapdoor.trap_trapdoor;

import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TrapCherryTrapdoorBlock extends TrapDoorBlock {
    public TrapCherryTrapdoorBlock(BlockBehaviour.Properties settings) {
        super(BlockSetType.CHERRY, settings);
    }
}



