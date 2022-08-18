
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

import net.mcreator.umbreorpg.world.inventory.CookBookPage11Menu;
import net.mcreator.umbreorpg.network.CookBookPage11ButtonMessage;
import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CookBookPage11Screen extends AbstractContainerScreen<CookBookPage11Menu> {
	private final static HashMap<String, Object> guistate = CookBookPage11Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CookBookPage11Screen(CookBookPage11Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 246;
		this.imageHeight = 174;
	}

	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/screens/cook_book_page_11.png");

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
		this.font.draw(poseStack, "Level 10 Recipes", 86, 2, -12829636);
		this.font.draw(poseStack, "11", 230, 158, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 173, 30, 20, new TextComponent("<"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new CookBookPage11ButtonMessage(0, x, y, z));
				CookBookPage11ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 212, this.topPos + 173, 30, 20, new TextComponent(">"), e -> {
			if (true) {
				UmbreoRpgMod.PACKET_HANDLER.sendToServer(new CookBookPage11ButtonMessage(1, x, y, z));
				CookBookPage11ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
