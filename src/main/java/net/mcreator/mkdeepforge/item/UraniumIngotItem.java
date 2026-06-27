package net.mcreator.mkdeepforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UraniumIngotItem extends Item {
	public UraniumIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}