package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SmithingNextLevelExpSetProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 0) {
			{
				double _setval = 2;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 1) {
			{
				double _setval = 25;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 2) {
			{
				double _setval = 75;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 3) {
			{
				double _setval = 160;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 4) {
			{
				double _setval = 280;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 5) {
			{
				double _setval = 425;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 6) {
			{
				double _setval = 675;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 7) {
			{
				double _setval = 850;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 8) {
			{
				double _setval = 1100;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel == 9) {
			{
				double _setval = 2000;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 0;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgSmithingExpNextLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
