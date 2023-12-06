package io.github.pocketrice;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.registry.*;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyPrismatics implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("tinyprismatics");

	public static final Satchel SATCHEL = new Satchel();
	public static ItemGroup TINYP_ITEM_GROUP;




	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		Registry.register(Registry.ITEM, new Identifier("tinyprismatics", "satchel"), SATCHEL);
		TINYP_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("tinyprismatics", "tinyp_item_group"), (() -> new ItemStack(SATCHEL))).setName("Tiny Prismatics");

	}
}