package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.client.Minecraft;
import net.minecraft.Util;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UmbreoModGamerulesProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_REDUCEDDEBUGINFO) == false
					|| world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DO_TRADER_SPAWNING) == true
					|| world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DO_PATROL_SPAWNING) == true
					|| world.getLevelData().getGameRules().getBoolean(GameRules.RULE_LIMITED_CRAFTING) == false) {
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_REDUCEDDEBUGINFO).set((true), _level.getServer());
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_DO_TRADER_SPAWNING).set((false), _level.getServer());
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_DO_PATROL_SPAWNING).set((false), _level.getServer());
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_LIMITED_CRAFTING).set((true), _level.getServer());
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(new TextComponent("Gamerules Have Been Set to Umbreo RPG Standard"), ChatType.SYSTEM,
								Util.NIL_UUID);
				}
			}
		} else {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_REDUCEDDEBUGINFO).set((false), _level.getServer());
		}
	}
}
