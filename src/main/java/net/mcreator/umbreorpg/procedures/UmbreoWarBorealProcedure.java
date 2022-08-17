package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class UmbreoWarBorealProcedure {
	public static boolean execute(LevelAccessor world) {
		if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarBoreal == true) {
			return true;
		}
		return false;
	}
}
