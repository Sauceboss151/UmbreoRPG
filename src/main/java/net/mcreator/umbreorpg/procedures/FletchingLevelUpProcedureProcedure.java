package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FletchingLevelUpProcedureProcedure {
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
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingExp >= (entity
						.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingExpNextLevel
				&& (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel < 10) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingExp
						- (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingExpNextLevel;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFletchingExp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Your Fletching Skill Has Increased"), (true));
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
}
