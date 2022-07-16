package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KnowledgeEffectProcedureProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.KNOWLEDGE_EFFECT.get()) : false) {
			if (sourceentity instanceof Player _player)
				_player.giveExperiencePoints(
						(int) ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(UmbreoRpgModMobEffects.KNOWLEDGE_EFFECT.get())
								? _livEnt.getEffect(UmbreoRpgModMobEffects.KNOWLEDGE_EFFECT.get()).getAmplifier()
								: 0) + 2));
		}
	}
}
