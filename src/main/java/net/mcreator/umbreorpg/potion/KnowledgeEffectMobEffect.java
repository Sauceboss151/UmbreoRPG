
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class KnowledgeEffectMobEffect extends MobEffect {
	public KnowledgeEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16482571);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.knowledge_effect";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
