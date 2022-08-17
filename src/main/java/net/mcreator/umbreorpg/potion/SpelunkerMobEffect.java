
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.umbreorpg.procedures.SpelunkerEndProcedureProcedure;
import net.mcreator.umbreorpg.procedures.SpelunkerEffectProcedureProcedure;

public class SpelunkerMobEffect extends MobEffect {
	public SpelunkerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -660841);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.spelunker";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SpelunkerEffectProcedureProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpelunkerEndProcedureProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
