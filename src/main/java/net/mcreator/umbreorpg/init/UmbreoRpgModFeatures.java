
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.umbreorpg.world.features.ores.ZoraliumOreFeature;
import net.mcreator.umbreorpg.world.features.ores.ZoraliumDeepslateOreFeature;
import net.mcreator.umbreorpg.world.features.ores.VulcorOreFeature;
import net.mcreator.umbreorpg.world.features.ores.UmbelliumOreFeature;
import net.mcreator.umbreorpg.world.features.ores.TetriumOreFeature;
import net.mcreator.umbreorpg.world.features.ores.TetriumDeepslateOreFeature;
import net.mcreator.umbreorpg.world.features.ores.SkoriumDeepslateOreFeature;
import net.mcreator.umbreorpg.world.features.ores.PureGoldOreFeature;
import net.mcreator.umbreorpg.world.features.ores.PureGoldDeepslateOreFeature;
import net.mcreator.umbreorpg.world.features.ores.LathiumOreFeature;
import net.mcreator.umbreorpg.world.features.ores.LathiumDeepslateOreFeature;
import net.mcreator.umbreorpg.world.features.ores.DarkiumOreFeature;
import net.mcreator.umbreorpg.world.features.ores.CobiumOreFeature;
import net.mcreator.umbreorpg.world.features.ores.CobiumDeepslateOreFeature;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class UmbreoRpgModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, UmbreoRpgMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> TETRIUM_ORE = register("tetrium_ore", TetriumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TetriumOreFeature.GENERATE_BIOMES, TetriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VULCOR_ORE = register("vulcor_ore", VulcorOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VulcorOreFeature.GENERATE_BIOMES, VulcorOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURE_GOLD_ORE = register("pure_gold_ore", PureGoldOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, PureGoldOreFeature.GENERATE_BIOMES, PureGoldOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZORALIUM_ORE = register("zoralium_ore", ZoraliumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ZoraliumOreFeature.GENERATE_BIOMES, ZoraliumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LATHIUM_ORE = register("lathium_ore", LathiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LathiumOreFeature.GENERATE_BIOMES, LathiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COBIUM_ORE = register("cobium_ore", CobiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CobiumOreFeature.GENERATE_BIOMES, CobiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TETRIUM_DEEPSLATE_ORE = register("tetrium_deepslate_ore", TetriumDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TetriumDeepslateOreFeature.GENERATE_BIOMES,
					TetriumDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURE_GOLD_DEEPSLATE_ORE = register("pure_gold_deepslate_ore", PureGoldDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PureGoldDeepslateOreFeature.GENERATE_BIOMES,
					PureGoldDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZORALIUM_DEEPSLATE_ORE = register("zoralium_deepslate_ore", ZoraliumDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZoraliumDeepslateOreFeature.GENERATE_BIOMES,
					ZoraliumDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LATHIUM_DEEPSLATE_ORE = register("lathium_deepslate_ore", LathiumDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LathiumDeepslateOreFeature.GENERATE_BIOMES,
					LathiumDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COBIUM_DEEPSLATE_ORE = register("cobium_deepslate_ore", CobiumDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CobiumDeepslateOreFeature.GENERATE_BIOMES,
					CobiumDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SKORIUM_DEEPSLATE_ORE = register("skorium_deepslate_ore", SkoriumDeepslateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SkoriumDeepslateOreFeature.GENERATE_BIOMES,
					SkoriumDeepslateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> UMBELLIUM_ORE = register("umbellium_ore", UmbelliumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, UmbelliumOreFeature.GENERATE_BIOMES, UmbelliumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DARKIUM_ORE = register("darkium_ore", DarkiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DarkiumOreFeature.GENERATE_BIOMES, DarkiumOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
