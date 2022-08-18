
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

import net.mcreator.umbreorpg.world.inventory.SkillListFletchingGUIMenu;
import net.mcreator.umbreorpg.procedures.FletchingLevel9DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel8DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel7DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel6DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel5DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel4DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel3DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel2DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel1DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.FletchingLevel10DisplayProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.network.SkillListFletchingGUIButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillListFletchingGUIScreen extends AbstractContainerScreen<SkillListFletchingGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillListFletchingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillListFletchingGUIScreen(SkillListFletchingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/skill_list_fletching_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/fletching_decore_texture.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/fletching_decore_texture.png"));
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
		this.font.draw(poseStack, "Fletching", 103, 4, -12829636);
		this.font.draw(poseStack, "Current Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel) + "", 7, 25, -12829636);
		if (FletchingLevel1DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 1: Iron Bow", 7, 43, -12829636);
		if (FletchingLevel2DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 2: Reinforced Iron Bow", 7, 52, -12829636);
		if (FletchingLevel3DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 3: Diamond Bow", 7, 61, -12829636);
		if (FletchingLevel4DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 4: Zoralium, Lathium, Cobium Bow", 7, 70, -12829636);
		if (FletchingLevel5DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 5: Netherite Bow", 7, 79, -12829636);
		if (FletchingLevel6DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 6: Skorium Bow", 7, 88, -12829636);
		if (FletchingLevel7DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 7: Umbellium Bow", 7, 97, -12829636);
		if (FletchingLevel8DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 8: Mystalium Bow", 7, 106, -12829636);
		if (FletchingLevel9DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 9: Osnium Bow, Duilium Bow", 7, 115, -12829636);
		if (FletchingLevel10DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 10: Ultrium Bow", 7, 124, -12829636);
		this.font.draw(poseStack, "Exp: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingExp) + "", 61, 142, -12829636);
		this.font.draw(poseStack, "Next Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingExpNextLevel) + "", 61, 151, -12829636);
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
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListFletchingGUIButtonMessage(0, x, y, z));
				SkillListFletchingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 142, 45, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListFletchingGUIButtonMessage(1, x, y, z));
				SkillListFletchingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
