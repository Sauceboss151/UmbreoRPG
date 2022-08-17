
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.umbreorpg.procedures.ManaRegenerationEndEffectProcedure;
import net.mcreator.umbreorpg.procedures.ManaRegenerationEffectProcedure;

public class ManaRegenerationMobEffect extends MobEffect {
	public ManaRegenerationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -12466965);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.mana_regeneration";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		ManaRegenerationEffectProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ManaRegenerationEndEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
