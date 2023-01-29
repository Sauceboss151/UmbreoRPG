
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.client.particle.TwilightParticleParticle;
import net.mcreator.umbreorpg.client.particle.MossyParticleParticle;
import net.mcreator.umbreorpg.client.particle.ManaTwinkleParticle;
import net.mcreator.umbreorpg.client.particle.LightParticleParticle;
import net.mcreator.umbreorpg.client.particle.FrostTwinkleParticle;
import net.mcreator.umbreorpg.client.particle.BlastTwinkleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UmbreoRpgModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) UmbreoRpgModParticleTypes.LIGHT_PARTICLE.get(),
				LightParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) UmbreoRpgModParticleTypes.MANA_TWINKLE.get(),
				ManaTwinkleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) UmbreoRpgModParticleTypes.MOSSY_PARTICLE.get(),
				MossyParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) UmbreoRpgModParticleTypes.FROST_TWINKLE.get(),
				FrostTwinkleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) UmbreoRpgModParticleTypes.TWILIGHT_PARTICLE.get(),
				TwilightParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) UmbreoRpgModParticleTypes.BLAST_TWINKLE.get(),
				BlastTwinkleParticle::provider);
	}
}
