package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class FactionWarSystemProcedure {
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
		if (world.dayTime() == 0) {
			if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarBoreal == false) {
				if (Mth.nextInt(new Random(), 1, 100) == 50) {
					UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarBoreal = true;
					UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Umbreon Kingdom and Boreal Kingdom Have Gone to War"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			} else if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarBoreal == true) {
				if (Mth.nextInt(new Random(), 1, 100) == 50) {
					UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarBoreal = false;
					UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Umbreon Kingdom and Boreal Kingdom Have Made Peace"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			}
			if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarVorash == false) {
				if (Mth.nextInt(new Random(), 1, 100) == 50) {
					UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarVorash = true;
					UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Umbreon Kingdom and Vorash Empire Have Gone to War"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			} else if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarVorash == true) {
				if (Mth.nextInt(new Random(), 1, 100) == 50) {
					UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarVorash = false;
					UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Umbreon Kingdom and Vorash Empire Have Made Peace"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			}
			if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgBorealWarVorash == false) {
				if (Mth.nextInt(new Random(), 1, 100) == 50) {
					UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgBorealWarVorash = true;
					UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Boreal Kingdom and Vorash Empire Have Gone to War"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			} else if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgBorealWarVorash == true) {
				if (Mth.nextInt(new Random(), 1, 100) == 50) {
					UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgBorealWarVorash = false;
					UmbreoRpgModVariables.WorldVariables.get(world).syncData(world);
					if (!world.isClientSide()) {
						MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
						if (_mcserv != null)
							_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Boreal Kingdom and Vorash Empire Have Made Peace"),
									ChatType.SYSTEM, Util.NIL_UUID);
					}
				}
			}
		}
	}
}
