package com.x29naybla.block;

import com.x29naybla.PaleoLib;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SUS_DEEPSLATE = new Block(AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).pistonBehavior(PistonBehavior.NORMAL).hardness(2.5f).resistance(6.5f));

    private static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(PaleoLib.MOD_ID, name), block);
    }

    public static void addBlocksToItemGroup(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.DEEPSLATE, SUS_DEEPSLATE);
        });
    }

    public static void registerModBlocks(){
        PaleoLib.LOGGER.info("registering Mod Blocks for " + PaleoLib.MOD_ID);
        addBlocksToItemGroup();
    }
}
