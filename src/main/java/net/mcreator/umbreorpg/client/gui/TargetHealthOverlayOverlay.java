
package net.mcreator.umbreorpg.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.procedures.DisplayEnemyOvelayProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TargetHealthOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (DisplayEnemyOvelayProcedureProcedure.execute(world)) {
				if (DisplayEnemyOvelayProcedureProcedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/target_overlay_box_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + -50, posY + -119, 0, 0, 100, 30, 100, 30);
				}
				if (DisplayEnemyOvelayProcedureProcedure.execute(world))
					Minecraft.getInstance().font.draw(event.getMatrixStack(),
							"" + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgTargetOverlayHealth) + "/"
									+ (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgTargetOverlayMaxHealth)
									+ "",
							posX + -45, posY + -103, -12829636);
				if (DisplayEnemyOvelayProcedureProcedure.execute(world))
					Minecraft.getInstance().font.draw(event.getMatrixStack(),
							"" + ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgTargetOverlayName) + "",
							posX + -45, posY + -114, -12829636);
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
