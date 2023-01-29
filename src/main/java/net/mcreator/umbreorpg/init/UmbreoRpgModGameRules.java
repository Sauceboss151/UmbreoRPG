
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmbreoRpgModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> NOHEALTHOVERLAY = GameRules.register("noHealthOverlay", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(true));
}
