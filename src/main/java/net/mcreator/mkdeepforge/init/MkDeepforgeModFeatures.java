/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mkdeepforge.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.mkdeepforge.block.UraniumOreBlock;
import net.mcreator.mkdeepforge.MkDeepforgeMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class MkDeepforgeModFeatures {
	public static void load() {
		register("deespslate_uranium_ore", new OreFeature(OreConfiguration.CODEC), UraniumOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryname, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		register(registryname, feature);
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MkDeepforgeMod.MODID, registryname)));
	}

	private static void register(String registryname, Feature feature) {
		Registry.register(BuiltInRegistries.FEATURE, ResourceLocation.fromNamespaceAndPath(MkDeepforgeMod.MODID, registryname), feature);
	}
}