
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

import net.mcreator.umbreorpg.world.inventory.SkillListFarmingGUIMenu;
import net.mcreator.umbreorpg.procedures.FarmingLevel9DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel8DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel7DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel6DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel5DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel4DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel3DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel2DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel1DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FarmingLevel10DisplayProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.network.SkillListFarmingGUIButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillListFarmingGUIScreen extends AbstractContainerScreen<SkillListFarmingGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillListFarmingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillListFarmingGUIScreen(SkillListFarmingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/skill_list_farming_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/farming_decor_texture.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/farming_decor_texture.png"));
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
		this.font.draw(poseStack, "Farming", 105, 4, -12829636);
		this.font.draw(poseStack, "Current Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel) + "", 7, 25, -12829636);
		if (FarmingLevel1DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 1: Beetroot", 7, 43, -12829636);
		if (FarmingLevel2DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 2: Carrot", 7, 52, -12829636);
		if (FarmingLevel3DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 3: Potato", 7, 61, -12829636);
		if (FarmingLevel4DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 4: Melon", 7, 70, -12829636);
		if (FarmingLevel5DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 5: Pumpkin", 7, 79, -12829636);
		if (FarmingLevel6DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 6: Boreal Sweet Potato", 7, 88, -12829636);
		if (FarmingLevel7DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 7: Vorashian Desert Greens", 7, 97, -12829636);
		if (FarmingLevel8DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 8: Umbreon Garlic", 7, 106, -12829636);
		if (FarmingLevel9DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 9: Marshland Rice", 7, 115, -12829636);
		if (FarmingLevel10DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 10: Mystro Corn", 7, 124, -12829636);
		this.font.draw(poseStack, "Exp: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingExp) + "", 61, 142, -12829636);
		this.font.draw(poseStack, "Next Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingExpNextLevel) + "", 61, 151, -12829636);
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
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListFarmingGUIButtonMessage(0, x, y, z));
				SkillListFarmingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 142, 45, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListFarmingGUIButtonMessage(1, x, y, z));
				SkillListFarmingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
