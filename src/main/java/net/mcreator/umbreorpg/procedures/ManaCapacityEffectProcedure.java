package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

public class ManaCapacityEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 200 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(UmbreoRpgModMobEffects.MANA_CAPACITY.get())
					? _livEnt.getEffect(UmbreoRpgModMobEffects.MANA_CAPACITY.get()).getAmplifier()
					: 0) * 100;
			entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.umbreoRpgManaCapacity = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
