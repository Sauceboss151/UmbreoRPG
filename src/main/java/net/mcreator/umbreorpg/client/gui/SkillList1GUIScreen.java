
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

import net.mcreator.umbreorpg.world.inventory.SkillList1GUIMenu;
import net.mcreator.umbreorpg.procedures.DisplayMagicSkillProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.network.SkillList1GUIButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillList1GUIScreen extends AbstractContainerScreen<SkillList1GUIMenu> {
	private final static HashMap<String, Object> guistate = SkillList1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillList1GUIScreen(SkillList1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/skill_list_1_gui.png");

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
		this.font.draw(poseStack, "Skills", 106, 4, -12829636);
		this.font.draw(poseStack, "Combat: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel) + "", 7, 25, -12829636);
		this.font.draw(poseStack, "Mining: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMiningLevel) + "", 7, 52, -12829636);
		this.font.draw(poseStack, "Farming: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFarmingLevel) + "", 7, 79, -12829636);
		this.font.draw(poseStack, "Cooking: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCookingLevel) + "", 7, 106, -12829636);
		this.font.draw(poseStack, "Alchemy: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAlchemyLevel) + "", 142, 25, -12829636);
		this.font.draw(poseStack, "Smithing: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgSmithingLevel) + "", 142, 52, -12829636);
		this.font.draw(poseStack, "Fletching: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgFletchingLevel) + "", 142, 79, -12829636);
		if (DisplayMagicSkillProcedureProcedure.execute(world))
			this.font.draw(poseStack, "Magic: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgMagicLevel) + "", 142, 106, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 205, this.topPos + 142, 35, 20, new TextComponent("Next"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillList1GUIButtonMessage(0, x, y, z));
				SkillList1GUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 142, 45, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillList1GUIButtonMessage(1, x, y, z));
				SkillList1GUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
