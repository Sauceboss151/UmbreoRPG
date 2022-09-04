
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.umbreorpg.UmbreoRpgMod;

public class UmbreoRpgModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, UmbreoRpgMod.MODID);
	public static final RegistryObject<Potion> POTION_OF_VOID_PROTECTION = REGISTRY.register("potion_of_void_protection",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.VOID_PROTECTION.get(), 18000, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_KNOWLEDGE = REGISTRY.register("potion_of_knowledge",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.KNOWLEDGE_EFFECT.get(), 6000, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_STALKING = REGISTRY.register("potion_of_stalking",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.STALKER.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_ASH_PROTECTION = REGISTRY.register("potion_of_ash_protection",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.ASH_PROTECTION.get(), 4800, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_POISON_RESISTANCE = REGISTRY.register("potion_of_poison_resistance",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.POISON_RESISTANCE.get(), 4800, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_LIFESTEAL = REGISTRY.register("potion_of_lifesteal",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.LIFESTEAL.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_MANA_REGENERATION = REGISTRY.register("potion_of_mana_regeneration",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.MANA_REGENERATION.get(), 12000, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_MANA_CAPACITY = REGISTRY.register("potion_of_mana_capacity",
			() -> new Potion(new MobEffectInstance(UmbreoRpgModMobEffects.MANA_CAPACITY.get(), 12000, 0, false, true)));
}
