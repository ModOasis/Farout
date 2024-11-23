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

import net.mcreator.far_out.world.inventory.ZanavosMapMenu;
import net.mcreator.far_out.network.ZanavosMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ZanavosMapScreen extends AbstractContainerScreen<ZanavosMapMenu> {
	private final static HashMap<String, Object> guistate = ZanavosMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_oceanus;

	public ZanavosMapScreen(ZanavosMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 420;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/zanavos_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 155 && mouseX < leftPos + 189 && mouseY > topPos + 0 && mouseY < topPos + 32)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.zanavos_map.tooltip_vulcan"), mouseX, mouseY);
		if (mouseX > leftPos + 147 && mouseX < leftPos + 256 && mouseY > topPos + 67 && mouseY < topPos + 178)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.zanavos_map.tooltip_proxmai"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/zanavos.png"), this.leftPos + 0, this.topPos + 1, 0, 0, 430, 240, 430, 240);

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
	}

	@Override
	public void init() {
		super.init();
		button_oceanus = new PlainTextButton(this.leftPos + 27, this.topPos + 29, 61, 20, Component.translatable("gui.farout.zanavos_map.button_oceanus"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new ZanavosMapButtonMessage(0, x, y, z));
				ZanavosMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_oceanus", button_oceanus);
		this.addRenderableWidget(button_oceanus);
	}
}