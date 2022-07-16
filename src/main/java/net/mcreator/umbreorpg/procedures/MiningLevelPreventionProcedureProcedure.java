package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MiningLevelPreventionProcedureProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld().getBlockState(event.getPos()), event.getPlayer());
	}

	public static void execute(BlockState blockstate, Entity entity) {
		execute(null, blockstate, entity);
	}

	private static void execute(@Nullable Event event, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_type_block_tag"))) && !(new Object() {
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
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 0
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_0_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 1
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_1_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 2
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_2_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 3
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_3_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 4
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_4_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 5
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_5_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 6
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_6_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 7
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_7_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 8
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_8_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			} else if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel == 9
					&& !blockstate.is(BlockTags.create(new ResourceLocation("forge:mining_level_8_tag")))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You Need a Higher Mining Level to Mine this block"), (true));
			}
		}
	}
}
