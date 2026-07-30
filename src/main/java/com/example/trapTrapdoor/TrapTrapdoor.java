package com.example.trapTrapdoor;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import com.example.trapTrapdoor.trap_trapdoor.TrapOakTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapBirchTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapSpruceTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapJungleTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapAcaciaTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapDarkOakTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapMangroveTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapCherryTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapBambooTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapCrimsonTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapWarpedTrapdoorBlock;
import com.example.trapTrapdoor.trap_trapdoor.TrapPaleOakTrapdoorBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class TrapTrapdoor implements ModInitializer {
    public static final String MOD_ID = "traptrapdoor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block OAK_TRAP_TRAPDOOR = registerBlock("oak_trap_trapdoor", (registryKey) -> new TrapOakTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block BIRCH_TRAP_TRAPDOOR = registerBlock("birch_trap_trapdoor", (registryKey) -> new TrapBirchTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block SPRUCE_TRAP_TRAPDOOR = registerBlock("spruce_trap_trapdoor", (registryKey) -> new TrapSpruceTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block JUNGLE_TRAP_TRAPDOOR = registerBlock("jungle_trap_trapdoor", (registryKey) -> new TrapJungleTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block ACACIA_TRAP_TRAPDOOR = registerBlock("acacia_trap_trapdoor", (registryKey) -> new TrapAcaciaTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block DARK_OAK_TRAP_TRAPDOOR = registerBlock("dark_oak_trap_trapdoor", (registryKey) -> new TrapDarkOakTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block MANGROVE_TRAP_TRAPDOOR = registerBlock("mangrove_trap_trapdoor", (registryKey) -> new TrapMangroveTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block CHERRY_TRAP_TRAPDOOR = registerBlock("cherry_trap_trapdoor", (registryKey) -> new TrapCherryTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block BAMBOO_TRAP_TRAPDOOR = registerBlock("bamboo_trap_trapdoor", (registryKey) -> new TrapBambooTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block CRIMSON_TRAP_TRAPDOOR = registerBlock("crimson_trap_trapdoor", (registryKey) -> new TrapCrimsonTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block WARPED_TRAP_TRAPDOOR = registerBlock("warped_trap_trapdoor", (registryKey) -> new TrapWarpedTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));
    public static final Block PALE_OAK_TRAP_TRAPDOOR = registerBlock("pale_oak_trap_trapdoor", (registryKey) -> new TrapPaleOakTrapdoorBlock(BlockBehaviour.Properties.of().strength(1.5f).setId(registryKey)));

    @Override
    public void onInitialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(OAK_TRAP_TRAPDOOR);
            output.accept(BIRCH_TRAP_TRAPDOOR);
            output.accept(SPRUCE_TRAP_TRAPDOOR);
            output.accept(JUNGLE_TRAP_TRAPDOOR);
            output.accept(ACACIA_TRAP_TRAPDOOR);
            output.accept(DARK_OAK_TRAP_TRAPDOOR);
            output.accept(MANGROVE_TRAP_TRAPDOOR);
            output.accept(CHERRY_TRAP_TRAPDOOR);
            output.accept(BAMBOO_TRAP_TRAPDOOR);
            output.accept(CRIMSON_TRAP_TRAPDOOR);
            output.accept(WARPED_TRAP_TRAPDOOR);
            output.accept(PALE_OAK_TRAP_TRAPDOOR);
        });
        LOGGER.info("Starter Mod initialized with trap trapdoors!");
    }

    private static Block registerBlock(String name, Function<ResourceKey<Block>, Block> blockFactory) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, id);
        Block block = blockFactory.apply(blockKey);
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id))));
        return block;
    }
}
