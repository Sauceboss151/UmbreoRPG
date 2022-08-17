package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class DisplayEnemyOvelayProcedureProcedure {
	public static boolean execute(LevelAccessor world) {
		if (UmbreoRpgModVariables.MapVariables.get(world).umbreoRpgTargetOverlayDisplayStat == true) {
			return true;
		}
		return false;
	}
}
