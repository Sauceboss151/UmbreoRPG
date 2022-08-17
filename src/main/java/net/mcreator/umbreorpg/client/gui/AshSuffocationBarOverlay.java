
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

import net.mcreator.umbreorpg.procedures.AshDamagingDisplayProcedure;
import net.mcreator.umbreorpg.procedures.AshBaseDisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash90DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash80DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash70DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash60DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash50DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash40DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash30DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash20DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash10DisplayProcedure;
import net.mcreator.umbreorpg.procedures.Ash100DisplayProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AshSuffocationBarOverlay {
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
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.enableBlend();
			RenderSystem.setShader(GameRenderer::getPositionTexShader);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.setShaderColor(1, 1, 1, 1);
			if (true) {
				if (AshBaseDisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_base_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash10DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_10_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash20DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_20_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash30DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_30_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash40DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_40_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash50DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_50_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash60DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_60_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash70DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_70_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash80DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_80_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash90DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_90_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (Ash100DisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_100_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				if (AshDamagingDisplayProcedure.execute(entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/ash_damaging_bar_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 10, posY + 61, 0, 0, 81, 9, 81, 9);
				}
				Minecraft.getInstance().font
						.draw(event.getMatrixStack(),
								"" + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp) + "",
								posX + -22, posY + -93, -16737793);
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
