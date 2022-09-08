package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

public class ImpSpawnConditionProcedureProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				&& (world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.ASH_BLOCK.get()) {
			return true;
		}
		return false;
	}
}
