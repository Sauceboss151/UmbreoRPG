
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

import net.mcreator.umbreorpg.world.inventory.SkillListCombatGUIMenu;
import net.mcreator.umbreorpg.procedures.CombatLevel9DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel8DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel7DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel6DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel5DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel4DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel3DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel2DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel1DisplayProcedureProcedure;
import net.mcreator.umbreorpg.procedures.CombatLevel10DisplayProcedureProcedure;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.network.SkillListCombatGUIButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SkillListCombatGUIScreen extends AbstractContainerScreen<SkillListCombatGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillListCombatGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillListCombatGUIScreen(SkillListCombatGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/skill_list_combat_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/combat_decor_texture.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/combat_decor_texture.png"));
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
		this.font.draw(poseStack, "Combat", 105, 4, -12829636);
		this.font.draw(poseStack, "Current Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatLevel) + "", 7, 25, -12829636);
		if (CombatLevel1DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 1: +1 Total ATK", 7, 43, -12829636);
		if (CombatLevel2DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 2: 10% no weapon durability used", 7, 52, -12829636);
		if (CombatLevel3DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 3: +2 Total ATK", 7, 61, -12829636);
		if (CombatLevel4DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 4: 20% no weapon durability used", 7, 70, -12829636);
		if (CombatLevel5DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 5: +3 Total ATK", 7, 79, -12829636);
		if (CombatLevel6DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 6: 30% no weapon durability used", 7, 88, -12829636);
		if (CombatLevel7DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 7: +4 Total ATK", 7, 97, -12829636);
		if (CombatLevel8DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 8: 40% no weapon durability used", 7, 106, -12829636);
		if (CombatLevel9DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 9: +6 Total ATK", 7, 115, -12829636);
		if (CombatLevel10DisplayProcedureProcedure.execute(entity))
			this.font.draw(poseStack, "Level 10: 50% no weapon durability used", 7, 124, -12829636);
		this.font.draw(poseStack, "Exp: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatExp) + "", 61, 142, -12829636);
		this.font.draw(poseStack, "Next Level: " + (int) ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgCombatExpNextLevel) + "", 61, 151, -12829636);
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
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListCombatGUIButtonMessage(0, x, y, z));
				SkillListCombatGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 142, 45, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new SkillListCombatGUIButtonMessage(1, x, y, z));
				SkillListCombatGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
