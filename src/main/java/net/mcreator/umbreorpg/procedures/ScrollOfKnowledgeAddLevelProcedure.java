package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class ScrollOfKnowledgeAddLevelProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 1) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgCombatLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 2) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgMiningLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 3) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgFarmingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 4) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgCookingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 5) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAlchemyLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAlchemyLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgAlchemyLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 6) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgSmithingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 7) {
			if (!((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel >= 10)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgFletchingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		(itemstack).shrink(1);
	}
}
