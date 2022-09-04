package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class UmbelliumOreAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double yposadd = 0;
		yposadd = 0;
		for (int index0 = 0; index0 < (int) (384 - y); index0++) {
			if (new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y + yposadd, z)).value().getRegistryName())) {
				return true;
			}
			yposadd = yposadd + 1;
		}
		return false;
	}
}
