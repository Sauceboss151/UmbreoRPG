package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TreantSpawnConditionProcedureProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("umbreo_rpg:deleted_mod_element").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				&& world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) >= y) {
			return true;
		}
		return false;
	}
}
