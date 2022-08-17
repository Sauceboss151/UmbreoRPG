package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class ManaCapacityEndEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 100;
			entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.umbreoRpgManaCapacity = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
