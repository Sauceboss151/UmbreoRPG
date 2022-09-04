package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AshBuildingUpProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
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
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp < (entity
							.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUpCapacity
					&& new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
					&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.ASH_PROTECTION.get()) : false)) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp + 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgAshBuildUp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp > 0
					&& (!new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.ASH_PROTECTION.get()) : false))) {
				{
					double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp - 1;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgAshBuildUp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
