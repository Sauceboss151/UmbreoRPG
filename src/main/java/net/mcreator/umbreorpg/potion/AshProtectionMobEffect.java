
package net.mcreator.umbreorpg.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AshProtectionMobEffect extends MobEffect {
	public AshProtectionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066330);
	}

	@Override
	public String getDescriptionId() {
		return "effect.umbreo_rpg.ash_protection";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
