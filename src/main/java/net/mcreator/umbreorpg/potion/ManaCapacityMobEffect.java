
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.umbreorpg.procedures.ManaCapacityEndEffectProcedure;
import net.mcreator.umbreorpg.procedures.ManaCapacityEffectProcedure;

public class ManaCapacityMobEffect extends MobEffect {
	public ManaCapacityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -14797066);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.mana_capacity";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ManaCapacityEffectProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ManaCapacityEndEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
