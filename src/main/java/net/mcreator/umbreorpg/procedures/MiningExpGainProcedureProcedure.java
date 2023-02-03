package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MiningExpGainProcedureProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel < 10 && !((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, y, z), "umbreoModPlayerPlacedBlock")) == true) && !(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft
									.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity))) {
			if (blockstate.getBlock() == Blocks.STONE || blockstate.getBlock() == Blocks.BLACKSTONE || blockstate.getBlock() == Blocks.COAL_ORE
					|| blockstate.getBlock() == Blocks.DEEPSLATE) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 0) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 1;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +1"), (true));
				}
			}
			if (blockstate.getBlock() == Blocks.ANDESITE || blockstate.getBlock() == Blocks.GRANITE || blockstate.getBlock() == Blocks.DIORITE
					|| blockstate.getBlock() == Blocks.IRON_ORE || blockstate.getBlock() == Blocks.TUFF
					|| blockstate.getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 1) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 1;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +1"), (true));
				}
			}
			if (blockstate.getBlock() == UmbreoRpgModBlocks.TETRIUM_ORE.get() || blockstate.getBlock() == Blocks.GOLD_ORE
					|| blockstate.getBlock() == Blocks.REDSTONE_ORE || blockstate.getBlock() == Blocks.LAPIS_ORE
					|| blockstate.getBlock() == UmbreoRpgModBlocks.TETRIUM_DEEPSLATE_ORE.get() || blockstate.getBlock() == Blocks.DEEPSLATE_GOLD_ORE
					|| blockstate.getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE || blockstate.getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 2) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 2;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +2"), (true));
				}
			}
			if (blockstate.getBlock() == Blocks.DIAMOND_ORE || blockstate.getBlock() == Blocks.OBSIDIAN
					|| blockstate.getBlock() == UmbreoRpgModBlocks.VULCOR_ORE.get() || blockstate.getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 3) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 2;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +2"), (true));
				}
			}
			if (blockstate.getBlock() == UmbreoRpgModBlocks.ZORALIUM_ORE.get() || blockstate.getBlock() == UmbreoRpgModBlocks.LATHIUM_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.COBIUM_ORE.get() || blockstate.getBlock() == UmbreoRpgModBlocks.PURE_GOLD_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.ZORALIUM_DEEPSLATE_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.LATHIUM_DEEPSLATE_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.COBIUM_DEEPSLATE_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.PURE_GOLD_DEEPSLATE_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.SKORIUM_DEEPSLATE_ORE.get()) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 4) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 2;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +3"), (true));
				}
			}
			if (blockstate.getBlock() == Blocks.ANCIENT_DEBRIS || blockstate.getBlock() == UmbreoRpgModBlocks.DARKIUM_ORE.get()) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 5) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 3;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +3"), (true));
				}
			}
			if (blockstate.getBlock() == UmbreoRpgModBlocks.UMBELLIUM_ORE.get()) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 6) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 4;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +4"), (true));
				}
			}
			if (blockstate.getBlock() == UmbreoRpgModBlocks.MYSTALIUM_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.MYSTALIUM_DEEPSLATE_ORE.get()) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 7) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 4;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +4"), (true));
				}
			}
			if (blockstate.getBlock() == UmbreoRpgModBlocks.OSNIUM_ORE.get() || blockstate.getBlock() == UmbreoRpgModBlocks.DUILIUM_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.OSNIUM_DEEPSLATE_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.DUILIUM_DEEPSLATE_ORE.get()) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 8) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 5;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +5"), (true));
				}
			}
			if (blockstate.getBlock() == UmbreoRpgModBlocks.ULTRIUM_ORE.get()
					|| blockstate.getBlock() == UmbreoRpgModBlocks.ULTRIUM_DEEPSLATE_ORE.get()) {
				if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel >= 10) {
					{
						double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningExp + 6;
						entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.umbreoRpgMiningExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Mining Exp +6"), (true));
				}
			}
		}
	}
}
