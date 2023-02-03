package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DarkiumSpawnProcedureProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean noAir = false;
		if (world.isEmptyBlock(new BlockPos(x + 1, y, z)) || world.isEmptyBlock(new BlockPos(x - 1, y, z))
				|| world.isEmptyBlock(new BlockPos(x, y + 1, z)) || world.isEmptyBlock(new BlockPos(x, y - 1, z))
				|| world.isEmptyBlock(new BlockPos(x, y, z + 1)) || world.isEmptyBlock(new BlockPos(x, y, z - 1))) {
			return true;
		}
		return false;
	}
}
