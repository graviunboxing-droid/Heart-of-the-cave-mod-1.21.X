package com.SISIS.cavesheartmod.block;

import com.SISIS.cavesheartmod.CavesHeart;
import com.SISIS.cavesheartmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(CavesHeart.MOD_ID);
public static final DeferredBlock<Block> ALTAR_ACTIVATOR = registerBlock("altar_activator_block",
        ()->new Block(BlockBehaviour.Properties.of()
                .strength(6f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)

        ));
private static<T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
    DeferredBlock<T> toReturn =BLOCKS.register(name,block);
    registerBlockItem(name, toReturn);
    return toReturn;
}

private static<T extends Block> void registerBlockItem(String name, DeferredBlock<T>){
    ModItems.ITEMS.register(name,()-> new BlockItem(new Block().get(),new Item.Properties()))
}

public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
}
}
