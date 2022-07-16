
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
	public static final RegistryObject<ParticleType<?>> ASTRAL_LIGHT_PARTICLE = REGISTRY.register("astral_light_particle",
			() -> new SimpleParticleType(false));
}
