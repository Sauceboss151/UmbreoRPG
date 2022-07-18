
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.umbreorpg.procedures.PoisonResistanceEffectProcedure;

public class PoisonResistanceMobEffect extends MobEffect {
	public PoisonResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724890);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.poison_resistance";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonResistanceEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
