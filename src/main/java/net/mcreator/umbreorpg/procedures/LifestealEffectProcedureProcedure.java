package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;

import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class LifestealEffectProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
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
		double rand = 0;
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.LIFESTEAL.get()) : false) {
			rand = Mth.nextInt(new Random(), 1, 100);
			if (rand >= 67) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
							+ (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(UmbreoRpgModMobEffects.LIFESTEAL.get())
									? _livEnt.getEffect(UmbreoRpgModMobEffects.LIFESTEAL.get()).getAmplifier()
									: 0)
							+ 1));
			}
		}
	}
}
