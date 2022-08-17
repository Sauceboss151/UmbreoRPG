package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

public class ManaRegenerationEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(UmbreoRpgModMobEffects.MANA_REGENERATION.get())
					? _livEnt.getEffect(UmbreoRpgModMobEffects.MANA_REGENERATION.get()).getAmplifier()
					: 0) + 1;
			entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.umbreoRpgManaRegenRate = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
