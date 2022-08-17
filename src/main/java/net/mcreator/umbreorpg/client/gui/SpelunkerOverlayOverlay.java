
package net.mcreator.umbreorpg.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.procedures.DisplayUltraTierProcedure;
import net.mcreator.umbreorpg.procedures.DisplayOtherTierProcedure;
import net.mcreator.umbreorpg.procedures.DisplayIronTierProcedure;
import net.mcreator.umbreorpg.procedures.DisplayHighTierProcedure;
import net.mcreator.umbreorpg.procedures.DisplayGodTierProcedure;
import net.mcreator.umbreorpg.procedures.DisplayDiamondTierProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SpelunkerOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (true) {
				if (DisplayDiamondTierProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), "Diamond Tier Found", posX + -207, posY + 68, -16449562);
				if (DisplayIronTierProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), "Iron Tier Found", posX + -207, posY + 59, -8027004);
				if (DisplayOtherTierProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), "Other Tier Found", posX + -207, posY + 104, -14221057);
				if (DisplayHighTierProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), "High Tier Found", posX + -207, posY + 77, -558026);
				if (DisplayUltraTierProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), "Ultra Tier Found", posX + -207, posY + 86, -7077633);
				if (DisplayGodTierProcedure.execute(entity))
					Minecraft.getInstance().font.draw(event.getMatrixStack(), "God  Tier Found", posX + -207, posY + 95, -65536);
			}
		}
	}
}
