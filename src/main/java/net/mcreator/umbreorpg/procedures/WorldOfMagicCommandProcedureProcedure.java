package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class WorldOfMagicCommandProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgWorldOfMagicEnabled == false) {
			UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgWorldOfMagicEnabled = true;
			UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("The Astral Mana is flowing into this Dimension"), (false));
		} else if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgWorldOfMagicEnabled == true) {
			{
				double _setval = 0;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgMagicLevel = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgWorldOfMagicEnabled = false;
			UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("The Astral Mana is receding"), (false));
		}
	}
}
