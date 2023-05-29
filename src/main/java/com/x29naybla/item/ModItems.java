package com.x29naybla.item;

import com.x29naybla.PaleoLib;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    // PaleoLib Items Here
    public static final Item CHISEL = registerItem("chisel",
            new Item(new FabricItemSettings()));

    // PaleoLib Item Group (will be revised and probably removed)
    private static final ItemGroup PALEOLIB_ITEM_GROUP = FabricItemGroup.builder(new Identifier("paleolib", "paleolib_dev_group"))
            .icon(() -> new ItemStack(CHISEL))
            .build();

    // register items
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(PaleoLib.MOD_ID, name), item);
    }

    // Handle adding items to item group logic
    public static void addItemsToItemGroup(){

        addToItemGroup(PALEOLIB_ITEM_GROUP, CHISEL);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    // registry function
    public static void registerModItems(){
        PaleoLib.LOGGER.info("registering Mod Items for " + PaleoLib.MOD_ID);
        addItemsToItemGroup();
    }
}
