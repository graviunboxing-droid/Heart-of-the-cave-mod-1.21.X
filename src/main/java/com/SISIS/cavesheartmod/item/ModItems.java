package com.SISIS.cavesheartmod.item;

import com.SISIS.cavesheartmod.CavesHeart;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CavesHeart.MOD_ID);

    public static final DeferredItem<Item> CAVEKILLERSFANG = ITEMS.register("fang",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLOODBOTTLE = ITEMS.register("bloodbottle",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
