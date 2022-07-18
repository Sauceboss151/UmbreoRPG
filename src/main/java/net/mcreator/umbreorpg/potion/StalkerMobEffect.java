
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.umbreorpg.procedures.StalkerEffectProcedureProcedure;

public class StalkerMobEffect extends MobEffect {
	public StalkerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3355648);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.stalker";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StalkerEffectProcedureProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
