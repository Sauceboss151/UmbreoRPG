package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UmbreoModGamerulesProcedureProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_REDUCEDDEBUGINFO) == false) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_REDUCEDDEBUGINFO).set((true), _level.getServer());
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("Reduced Debug Info will always be set TRUE with this Mod Installed"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DO_TRADER_SPAWNING) == true) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_DO_TRADER_SPAWNING).set((false), _level.getServer());
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("Do Trader Spawning will always be set FALSE with this Mod Installed"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DO_PATROL_SPAWNING) == true) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_DO_PATROL_SPAWNING).set((false), _level.getServer());
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("Do Patrol Spawning will always be set FALSE with this Mod Installed"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_LIMITED_CRAFTING) == false) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_LIMITED_CRAFTING).set((true), _level.getServer());
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("Do Limited Crafting will always be set TRUE with this Mod Installed"),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
	}
}
