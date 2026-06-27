package net.mcreator.mkdeepforge.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class UraniumOreBlock extends Block {
	public UraniumOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(5f, 4f).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).instrument(NoteBlockInstrument.BASEDRUM));
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.tag(TagKey.create(Registries.BIOME, ResourceLocation.parse("is_overworld")));

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}