package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CheckLevel5RecipeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel >= 5) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.PUMPKIN.asItem()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.EGG
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
							.getItem() == UmbreoRpgModItems.DOUGH.get()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.PUMPKIN_PIE);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("umbreoRpgLevel5CookingRange", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("umbreoRpgCookingExpGain", 2);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.PUMPKIN.asItem()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.SUGAR
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.EGG
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.COCOA_BEANS) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(UmbreoRpgModItems.PUMPKIN_COOKIES.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("umbreoRpgLevel5CookingRange", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("umbreoRpgCookingExpGain", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.PUMPKIN.asItem()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == Blocks.PUMPKIN.asItem()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.BOWL) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(UmbreoRpgModItems.BEETKIN_SOUP.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("umbreoRpgLevel5CookingRange", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("umbreoRpgCookingExpGain", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.PORKCHOP
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == UmbreoRpgModItems.OIL.get()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == (ItemStack.EMPTY).getItem()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
							.getItem() == (ItemStack.EMPTY).getItem()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(UmbreoRpgModItems.BACON.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("umbreoRpgLevel5CookingRange", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("umbreoRpgCookingExpGain", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("umbreoRpgLevel5CookingRange", (false));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
							(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("umbreoRpgCookingExpGain", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
