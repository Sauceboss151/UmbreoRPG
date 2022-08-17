
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

import net.mcreator.umbreorpg.procedures.ManaBarBaseProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar90ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar80ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar70ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar60ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar50ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar40ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar30ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar20ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar10ProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ManaBar100ProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaBarOverlay {
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
				if (ManaBarBaseProcedureProcedure.execute(world)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_base_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar10ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_10_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar20ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_20_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar30ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_30_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar40ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_40_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar50ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_50_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar60ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_60_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar70ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_70_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar80ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_80_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar90ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_90_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBar100ProcedureProcedure.execute(world, entity)) {
					RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/umbreo_rpg_mana_bar_100_texture.png"));
					Minecraft.getInstance().gui.blit(event.getMatrixStack(), posX + 171, posY + 68, 0, 0, 7, 41, 7, 41);
				}
				if (ManaBarBaseProcedureProcedure.execute(world))
					Minecraft.getInstance().font.draw(event.getMatrixStack(),
							"" + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCurrentMana) + "/"
									+ (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgManaCapacity)
									+ "",
							posX + 153, posY + 59, -13434653);
			}
			RenderSystem.depthMask(true);
			RenderSystem.defaultBlendFunc();
			RenderSystem.enableDepthTest();
			RenderSystem.disableBlend();
			RenderSystem.setShaderColor(1, 1, 1, 1);
		}
	}
}
