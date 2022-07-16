package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import java.util.HashMap;

public class SkillCommandProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		boolean umbreoModWorldOfMagic = false;
		if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgWorldOfMagicEnabled == true) {
			umbreoModWorldOfMagic = true;
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("combat")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("combat")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgCombatLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Combat Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("mining")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("mining")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgMiningLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Mining Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("farming")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("farming")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgFarmingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Farming Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("cooking")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("cooking")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgCookingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Cooking Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("alchemy")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAlchemyLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("alchemy")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAlchemyLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAlchemyLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgAlchemyLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Alchemy Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("smithing")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("smithing")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgSmithingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Smithing Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("fletching")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel >= 10) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("fletching")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel < 10) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgFletchingLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Your Fletching Skill has Increased By 1"), (true));
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("magic")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMagicLevel < 5) {
				if (umbreoModWorldOfMagic == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Magic Does Not Exist"), (true));
				}
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("magic")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMagicLevel >= 5) {
				if (umbreoModWorldOfMagic == true) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You Are At Max Level In This Skill"), (true));
				}
			}
		}
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("magic")) {
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMagicLevel < 5) {
				if (umbreoModWorldOfMagic == true) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMagicLevel + 1;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMagicLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Your Magic Skill has Increased By 1"), (true));
				}
			}
		}
	}
}
