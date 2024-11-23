package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.SandosMassivoMapMenu;
import net.mcreator.far_out.network.SandosMassivoMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SandosMassivoMapScreen extends AbstractContainerScreen<SandosMassivoMapMenu> {
	private final static HashMap<String, Object> guistate = SandosMassivoMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_proxmai;
	Button button_oceanus;
	Button button_silican;

	public SandosMassivoMapScreen(SandosMassivoMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 420;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/sandos_massivo_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 326 && mouseX < leftPos + 350 && mouseY > topPos + 123 && mouseY < topPos + 147)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.sandos_massivo_map.tooltip_vulcan"), mouseX, mouseY);
		if (mouseX > leftPos + 263 && mouseX < leftPos + 312 && mouseY > topPos + 101 && mouseY < topPos + 152)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.sandos_massivo_map.tooltip_proxmai"), mouseX, mouseY);
		if (mouseX > leftPos + 354 && mouseX < leftPos + 378 && mouseY > topPos + 73 && mouseY < topPos + 97)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.sandos_massivo_map.tooltip_glacieo"), mouseX, mouseY);
		if (mouseX > leftPos + 383 && mouseX < leftPos + 407 && mouseY > topPos + 101 && mouseY < topPos + 125)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.sandos_massivo_map.tooltip_silican"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/massivomap.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 430, 240, 430, 240);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/selectionscreen.png"), this.leftPos + 0, this.topPos + 3, 0, 0, 100, 240, 100, 240);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.sandos_massivo_map.label_massivo"), 24, 31, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_proxmai = new PlainTextButton(this.leftPos + 24, this.topPos + 64, 61, 20, Component.translatable("gui.farout.sandos_massivo_map.button_proxmai"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMassivoMapButtonMessage(0, x, y, z));
				SandosMassivoMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_proxmai", button_proxmai);
		this.addRenderableWidget(button_proxmai);
		button_oceanus = new PlainTextButton(this.leftPos + 24, this.topPos + 111, 61, 20, Component.translatable("gui.farout.sandos_massivo_map.button_oceanus"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMassivoMapButtonMessage(1, x, y, z));
				SandosMassivoMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_oceanus", button_oceanus);
		this.addRenderableWidget(button_oceanus);
		button_silican = new PlainTextButton(this.leftPos + 24, this.topPos + 151, 61, 20, Component.translatable("gui.farout.sandos_massivo_map.button_silican"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMassivoMapButtonMessage(2, x, y, z));
				SandosMassivoMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_silican", button_silican);
		this.addRenderableWidget(button_silican);
	}
}
