
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

import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage3Menu;
import net.mcreator.umbreorpg.network.AlchemyCodexPage3ButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AlchemyCodexPage3Screen extends AbstractContainerScreen<AlchemyCodexPage3Menu> {
	private final static HashMap<String, Object> guistate = AlchemyCodexPage3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AlchemyCodexPage3Screen(AlchemyCodexPage3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/alchemy_codex_page_3.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/line_texture.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 35, 0, 0, 170, 1, 170, 1);

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/line_texture.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 119, 0, 0, 170, 1, 170, 1);

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
		this.font.draw(poseStack, "Level 2", 69, 3, -12829636);
		this.font.draw(poseStack, "Catalyst", 126, 24, -12829636);
		this.font.draw(poseStack, "Power Supply", 53, 24, -12829636);
		this.font.draw(poseStack, "Source", 10, 24, -12829636);
		this.font.draw(poseStack, "Output", 68, 108, -12829636);
		this.font.draw(poseStack, "Rein. ", 16, 43, -12829636);
		this.font.draw(poseStack, "Jungle Core", 55, 43, -12829636);
		this.font.draw(poseStack, "Redstone", 127, 43, -12829636);
		this.font.draw(poseStack, "1.", 3, 43, -12829636);
		this.font.draw(poseStack, "1.", 50, 122, -12829636);
		this.font.draw(poseStack, "Zoralium", 72, 122, -12829636);
		this.font.draw(poseStack, "Iron", 17, 52, -12829636);
		this.font.draw(poseStack, "2.", 3, 67, -12829636);
		this.font.draw(poseStack, "Rein.", 15, 67, -12829636);
		this.font.draw(poseStack, "Iron", 17, 76, -12829636);
		this.font.draw(poseStack, "3.", 3, 89, -12829636);
		this.font.draw(poseStack, "Rein.", 14, 89, -12829636);
		this.font.draw(poseStack, "Iron", 17, 98, -12829636);
		this.font.draw(poseStack, "Frozen Core", 55, 67, -12829636);
		this.font.draw(poseStack, "Twilight Core", 49, 90, -12829636);
		this.font.draw(poseStack, "Redstone", 127, 67, -12829636);
		this.font.draw(poseStack, "Redstone", 127, 89, -12829636);
		this.font.draw(poseStack, "2.", 50, 132, -12829636);
		this.font.draw(poseStack, "3.", 51, 143, -12829636);
		this.font.draw(poseStack, "Lathium", 72, 132, -12829636);
		this.font.draw(poseStack, "Cobium", 72, 143, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 125, this.topPos + 143, 46, 20, new TextComponent("Next"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new AlchemyCodexPage3ButtonMessage(0, x, y, z));
				AlchemyCodexPage3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 142, 46, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new AlchemyCodexPage3ButtonMessage(1, x, y, z));
				AlchemyCodexPage3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
