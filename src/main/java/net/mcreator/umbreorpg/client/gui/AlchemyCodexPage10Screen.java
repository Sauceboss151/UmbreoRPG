
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

import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage10Menu;
import net.mcreator.umbreorpg.network.AlchemyCodexPage10ButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AlchemyCodexPage10Screen extends AbstractContainerScreen<AlchemyCodexPage10Menu> {
	private final static HashMap<String, Object> guistate = AlchemyCodexPage10Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AlchemyCodexPage10Screen(AlchemyCodexPage10Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/alchemy_codex_page_10.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("umbreo_rpg:textures/screens/line_texture.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 13, 0, 0, 170, 1, 170, 1);

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
		this.font.draw(poseStack, "Level 9", 69, 3, -12829636);
		this.font.draw(poseStack, "Chromatic Core can now be used", 7, 19, -12829636);
		this.font.draw(poseStack, "as Catalyst for any alchemy", 16, 28, -12829636);
		this.font.draw(poseStack, "recipe. If used, the output", 16, 38, -12829636);
		this.font.draw(poseStack, "produced can be from 1 to 5 of", 10, 48, -12829636);
		this.font.draw(poseStack, "that item. Unactivated rods will", 4, 59, -12829636);
		this.font.draw(poseStack, "always produce only 1 output item.", 1, 69, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 126, this.topPos + 143, 46, 20, new TextComponent("Next"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new AlchemyCodexPage10ButtonMessage(0, x, y, z));
				AlchemyCodexPage10ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 142, 46, 20, new TextComponent("Prev"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new AlchemyCodexPage10ButtonMessage(1, x, y, z));
				AlchemyCodexPage10ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
