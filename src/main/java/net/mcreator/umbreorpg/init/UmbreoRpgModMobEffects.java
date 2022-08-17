
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.umbreorpg.potion.VoidProtectionMobEffect;
import net.mcreator.umbreorpg.potion.StalkerMobEffect;
import net.mcreator.umbreorpg.potion.SpelunkerMobEffect;
import net.mcreator.umbreorpg.potion.PoisonResistanceMobEffect;
import net.mcreator.umbreorpg.potion.ManaRegenerationMobEffect;
import net.mcreator.umbreorpg.potion.ManaCapacityMobEffect;
import net.mcreator.umbreorpg.potion.LifestealMobEffect;
import net.mcreator.umbreorpg.potion.KnowledgeEffectMobEffect;
import net.mcreator.umbreorpg.potion.AshProtectionMobEffect;
import net.mcreator.umbreorpg.UmbreoRpgMod;

public class UmbreoRpgModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UmbreoRpgMod.MODID);
	public static final RegistryObject<MobEffect> KNOWLEDGE_EFFECT = REGISTRY.register("knowledge_effect", () -> new KnowledgeEffectMobEffect());
	public static final RegistryObject<MobEffect> VOID_PROTECTION = REGISTRY.register("void_protection", () -> new VoidProtectionMobEffect());
	public static final RegistryObject<MobEffect> POISON_RESISTANCE = REGISTRY.register("poison_resistance", () -> new PoisonResistanceMobEffect());
	public static final RegistryObject<MobEffect> STALKER = REGISTRY.register("stalker", () -> new StalkerMobEffect());
	public static final RegistryObject<MobEffect> ASH_PROTECTION = REGISTRY.register("ash_protection", () -> new AshProtectionMobEffect());
	public static final RegistryObject<MobEffect> LIFESTEAL = REGISTRY.register("lifesteal", () -> new LifestealMobEffect());
	public static final RegistryObject<MobEffect> SPELUNKER = REGISTRY.register("spelunker", () -> new SpelunkerMobEffect());
	public static final RegistryObject<MobEffect> MANA_REGENERATION = REGISTRY.register("mana_regeneration", () -> new ManaRegenerationMobEffect());
	public static final RegistryObject<MobEffect> MANA_CAPACITY = REGISTRY.register("mana_capacity", () -> new ManaCapacityMobEffect());
}
