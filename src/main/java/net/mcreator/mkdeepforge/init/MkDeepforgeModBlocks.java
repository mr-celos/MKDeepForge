/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mkdeepforge.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mkdeepforge.block.UraniumOreBlock;
import net.mcreator.mkdeepforge.block.DeepslateUraniumOreBlock;
import net.mcreator.mkdeepforge.MkDeepforgeMod;

import java.util.function.Function;

public class MkDeepforgeModBlocks {
	public static Block URANIUM_ORE;
	public static Block DEEPSLATE_URANIUM_ORE;

	public static void load() {
		URANIUM_ORE = register("uranium_ore", UraniumOreBlock::new);
		DEEPSLATE_URANIUM_ORE = register("deepslate_uranium_ore", DeepslateUraniumOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MkDeepforgeMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}