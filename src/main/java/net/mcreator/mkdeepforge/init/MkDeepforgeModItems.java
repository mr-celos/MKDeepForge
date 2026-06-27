/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mkdeepforge.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mkdeepforge.item.UraniumIngotItem;
import net.mcreator.mkdeepforge.MkDeepforgeMod;

import java.util.function.Function;

public class MkDeepforgeModItems {
	public static Item URANIUM_INGOT;
	public static Item URANIUM_ORE;
	public static Item DEEPSLATE_URANIUM_ORE;

	public static void load() {
		URANIUM_INGOT = register("uranium_ingot", UraniumIngotItem::new);
		URANIUM_ORE = block(MkDeepforgeModBlocks.URANIUM_ORE, "uranium_ore", new Item.Properties().rarity(Rarity.UNCOMMON));
		DEEPSLATE_URANIUM_ORE = block(MkDeepforgeModBlocks.DEEPSLATE_URANIUM_ORE, "deepslate_uranium_ore", new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MkDeepforgeMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MkDeepforgeMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}