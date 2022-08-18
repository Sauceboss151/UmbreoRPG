
package net.mcreator.umbreorpg.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.world.inventory.WorldStateBorderMenu;
import net.mcreator.umbreorpg.procedures.UmbreoWarVorashProcedure;
import net.mcreator.umbreorpg.procedures.UmbreoWarBorealProcedure;
import net.mcreator.umbreorpg.procedures.BorealWarVorashProcedure;
import net.mcreator.umbreorpg.procedures.AlliedWithVorashProcedure;
import net.mcreator.umbreorpg.procedures.AlliedWithUmbreonKingdomProcedure;
import net.mcreator.umbreorpg.procedures.AlliedWithNoneProcedure;
import net.mcreator.umbreorpg.procedures.AlliedWithBorealProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WorldStateBorderScreen extends AbstractContainerScreen<WorldStateBorderMenu> {
	private final static HashMap<String, Object> guistate = WorldStateBorderMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WorldStateBorderScreen(WorldStateBorderMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 201;
		this.imageHeight = 139;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/world_state_border.png");

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
		this.font.draw(poseStack, "Umbreo Kingdom At War With:", 10, 47, -6736897);
		if (AlliedWithUmbreonKingdomProcedure.execute(entity))
			this.font.draw(poseStack, "Allied With: Umbreon Kingdom", 28, 29, -12829636);
		this.font.draw(poseStack, "World State", 73, 11, -12829636);
		this.font.draw(poseStack, "Boreal Kingdom At War With:", 10, 74, -10076403);
		this.font.draw(poseStack, "Vorash Empire At War With:", 10, 101, -33280);
		if (AlliedWithBorealProcedure.execute(entity))
			this.font.draw(poseStack, "Allied With: Boreal Kingdom", 28, 29, -12829636);
		if (AlliedWithVorashProcedure.execute(entity))
			this.font.draw(poseStack, "Allied With: Vorash Empire", 28, 29, -12829636);
		if (AlliedWithNoneProcedure.execute(entity))
			this.font.draw(poseStack, "Allied With: None", 28, 29, -12829636);
		if (UmbreoWarBorealProcedure.execute(world))
			this.font.draw(poseStack, "Boreal", 10, 56, -12829636);
		if (UmbreoWarVorashProcedure.execute(world))
			this.font.draw(poseStack, "Vorash", 55, 56, -12829636);
		if (UmbreoWarBorealProcedure.execute(world))
			this.font.draw(poseStack, "Umbreo", 10, 83, -12829636);
		if (BorealWarVorashProcedure.execute(world))
			this.font.draw(poseStack, "Vorash", 55, 83, -12829636);
		if (UmbreoWarVorashProcedure.execute(world))
			this.font.draw(poseStack, "Umbreo", 10, 110, -12829636);
		if (BorealWarVorashProcedure.execute(world))
			this.font.draw(poseStack, "Boreal", 55, 110, -12829636);
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
	}
}
