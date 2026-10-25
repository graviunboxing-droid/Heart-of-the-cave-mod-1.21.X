package com.SISIS.cavesheartmod.item;

import com.SISIS.cavesheartmod.CavesHeart;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CavesHeart.MOD_ID);
    public static final Supplier<CreativeModeTab> CAVES_HEART_ITEMS_TAB = CREATIVE_MODE_TAB.register("caves_heart_items_tab",
            ()-> CreativeModeTab.builder() .icon(()-> new ItemStack(ModItems.CAVEKILLERSFANG.get()))
                    .title(Component.translatable("creativetab.cavesheart.cavesheart_items"))
                    .displayItems((itemDisplayParameters,output)->{
                        output.accept(ModItems.CAVEKILLERSFANG);
                        output.accept(ModItems.BLOODBOTTLE);

                    }).build() );
    public static void register(IEventBus eventBus){
      CREATIVE_MODE_TAB.register(eventBus);
    }
}
