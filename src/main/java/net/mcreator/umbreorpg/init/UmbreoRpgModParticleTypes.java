
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.umbreorpg.UmbreoRpgMod;

public class UmbreoRpgModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, UmbreoRpgMod.MODID);
	public static final RegistryObject<ParticleType<?>> LIGHT_PARTICLE = REGISTRY.register("light_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> MANA_TWINKLE = REGISTRY.register("mana_twinkle", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> MOSSY_PARTICLE = REGISTRY.register("mossy_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> FROST_TWINKLE = REGISTRY.register("frost_twinkle", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> TWILIGHT_PARTICLE = REGISTRY.register("twilight_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> BLAST_TWINKLE = REGISTRY.register("blast_twinkle", () -> new SimpleParticleType(false));
}
