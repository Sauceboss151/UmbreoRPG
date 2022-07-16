package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

public class VorashianGreensGrowthProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomgrowth = 0;
		VorashianGreensNoFarmlandProcedureProcedure.execute(world, x, y, z);
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("umbreoRpgGrowth", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "umbreoRpgGrowth") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_4.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "umbreoRpgGrowth") >= 3000 && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			randomgrowth = Math.random();
			if (randomgrowth <= 0.005) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_5.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_3.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "umbreoRpgGrowth") >= 3000 && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			randomgrowth = Math.random();
			if (randomgrowth <= 0.005) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_4.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_2.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "umbreoRpgGrowth") >= 3000 && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			randomgrowth = Math.random();
			if (randomgrowth <= 0.005) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_3.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_1.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "umbreoRpgGrowth") >= 3000 && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			randomgrowth = Math.random();
			if (randomgrowth <= 0.005) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_2.get().defaultBlockState(), 3);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_0.get() && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "umbreoRpgGrowth") >= 3000 && world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7) {
			randomgrowth = Math.random();
			if (randomgrowth <= 0.005) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_1.get().defaultBlockState(), 3);
			}
		}
	}
}
