package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;

public class IsNightTimeProcedureProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.dayTime() >= 13000) {
			return true;
		}
		return false;
	}
}
