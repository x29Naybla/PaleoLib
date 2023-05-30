package com.x29naybla.item;

import com.x29naybla.PaleoLib;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHISEL = registerItem("chisel",
            new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(PaleoLib.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.BRUSH, CHISEL);
        });
    }

    public static void registerModItems(){
        PaleoLib.LOGGER.info("registering Mod Items for " + PaleoLib.MOD_ID);
        addItemsToItemGroup();
    }
}
