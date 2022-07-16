package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class CookingRangeUpdateTickProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CheckLevel0RecipesRangeProcedureProcedure.execute(world, entity);
		CheckLevel1RecipeProcedureProcedure.execute(world, entity);
		CheckLevel2RecipeListProcedureProcedure.execute(world, entity);
		CheckLevel3RecipeListProcedureProcedure.execute(world, entity);
		CheckLevel4RecipesProcedure.execute(world, entity);
		CheckLevel5RecipeProcedure.execute(world, entity);
		CheckLevel6RecipesProcedure.execute(world, entity);
		CheckLevel7RecipesProcedure.execute(world, entity);
		CheckLevel8RecipesProcedure.execute(world, entity);
		CheckLevel9RecipesProcedure.execute(world, entity);
		CheckLevel10RecipesProcedure.execute(world, entity);
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel0CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel1CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel2CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel3CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel4CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel5CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel6CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel7CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel8CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel9CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgLevel10CookingRange")) == true) {
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (true));
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
					_blockEntity.getTileData().putBoolean("umbreoRpgCookingRangeNoRecipe", (false));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world,
				new BlockPos(
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeXPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeYPos,
						(entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingRangeZPos),
				"umbreoRpgCookingRangeNoRecipe")) == false) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
