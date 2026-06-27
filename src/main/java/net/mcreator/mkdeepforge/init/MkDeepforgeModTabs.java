/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mkdeepforge.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MkDeepforgeModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(tabData -> {
			tabData.accept(MkDeepforgeModItems.URANIUM_INGOT);
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(tabData -> {
			tabData.accept(MkDeepforgeModBlocks.DEESPSLATE_URANIUM_ORE.asItem());
		});
	}
}