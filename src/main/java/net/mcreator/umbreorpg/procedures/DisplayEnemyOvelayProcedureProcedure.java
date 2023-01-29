package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModGameRules;

public class DisplayEnemyOvelayProcedureProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(UmbreoRpgModGameRules.NOHEALTHOVERLAY) == true) {
			if (UmbreoRpgModVariables.MapVariables.get(world).umbreoRpgTargetOverlayDisplayStat == true) {
				return true;
			}
		}
		return false;
	}
}
