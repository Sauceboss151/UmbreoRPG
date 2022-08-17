package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class UmbreoWarVorashProcedure {
	public static boolean execute(LevelAccessor world) {
		if (UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgUmbreoWarVorash == true) {
			return true;
		}
		return false;
	}
}
