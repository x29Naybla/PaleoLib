package com.x29naybla;

import com.x29naybla.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaleoLib implements ModInitializer {
    public static String MOD_ID = "paleolib";
    public static final Logger LOGGER = LoggerFactory.getLogger("paleolib");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}