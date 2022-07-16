package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ImpSpawnConditionProcedureProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				|| new ResourceLocation("umbreo_rpg:volcanic_ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		return false;
	}
}
