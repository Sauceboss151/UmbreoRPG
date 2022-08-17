
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LifestealMobEffect extends MobEffect {
	public LifestealMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3600882);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.lifesteal";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
