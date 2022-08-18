
package net.mcreator.umbreorpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.world.inventory.SkillListCookingGUIMenu;
import net.mcreator.umbreorpg.procedures.CookingLevel9DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel8DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel7DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel6DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel5DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel4DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel3DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel2DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel1DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CookingLevel10DisplayProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.network.SkillListCookingGUIButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillListCookingGUIScreen extends AbstractContainerScreen<SkillListCookingGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillListCookingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillListCookingGUIScreen(SkillListCookingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/skill_list_cooking_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/cooking_decor_texture.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/cooking_decor_texture.png"));
		this.blit(ms, this.leftPos + 228, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Cooking", 106, 4, -12829636);
		this.font.draw(poseStack, "Current Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel) + "", 7, 25, -12829636);
		if (CookingLevel1DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 1: Level 1 Recipes", 7, 43, -12829636);
		this.font.draw(poseStack, "(Craft Cookbook to see recipe lists)", 34, 16, -12829636);
		if (CookingLevel2DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 2: Level 2 Recipes", 7, 52, -12829636);
		if (CookingLevel3DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 3: Level 3 Recipes", 7, 61, -12829636);
		if (CookingLevel4DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 4: Level 4 Recipes", 7, 70, -12829636);
		if (CookingLevel5DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 5: Level 5 Recipes", 7, 79, -12829636);
		if (CookingLevel6DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 6: Level 6 Recipes", 7, 88, -12829636);
		if (CookingLevel7DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 7: Level 7 Recipes", 7, 97, -12829636);
		if (CookingLevel8DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 8: Level 8 Recipes", 7, 106, -12829636);
		if (CookingLevel9DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 9: Level 9 Recipes", 7, 115, -12829636);
		if (CookingLevel10DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 10: Level 10 Recipes", 7, 124, -12829636);
		this.font.draw(poseStack, "Exp: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingExp) + "", 61, 142, -12829636);
		this.font.draw(poseStack, "Next Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingExpNextLevel) + "", 61, 151, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 196, this.topPos + 142, 45, 20, new TextComponent("Next"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListCookingGUIButtonMessage(0, x, y, z));
				SkillListCookingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 142, 45, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListCookingGUIButtonMessage(1, x, y, z));
				SkillListCookingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
