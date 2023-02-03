package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

public class DarksteelArmorEffectProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(UmbreoRpgModMobEffects.KNOWLEDGE_EFFECT.get(), 10, 3));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(UmbreoRpgModMobEffects.LIFESTEAL.get(), 10, 1));
	}
}
