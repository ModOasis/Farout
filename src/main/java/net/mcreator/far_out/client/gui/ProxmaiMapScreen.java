package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.ProxmaiMapMenu;
import net.mcreator.far_out.procedures.VulcanReadoutProcedure;
import net.mcreator.far_out.procedures.ProxmaiReadoutProcedure;
import net.mcreator.far_out.network.ProxmaiMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ProxmaiMapScreen extends AbstractContainerScreen<ProxmaiMapMenu> {
	private final static HashMap<String, Object> guistate = ProxmaiMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_zoom_out;
	ImageButton imagebutton_proxmai_center;
	ImageButton imagebutton_vulcan;

	public ProxmaiMapScreen(ProxmaiMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/proxmai_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 45 && mouseX < leftPos + 108 && mouseY > topPos + 58 && mouseY < topPos + 121)
			guiGraphics.renderTooltip(font, Component.literal(ProxmaiReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 189 && mouseX < leftPos + 213 && mouseY > topPos + 76 && mouseY < topPos + 100)
			guiGraphics.renderTooltip(font, Component.literal(VulcanReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 2, this.topPos + -4, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 201, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 396, this.topPos + -5, 0, 0, 200, 200, 200, 200);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.proxmai_map.label_star_system_viewer"), 160, -3, -54228, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_zoom_out = new ImageButton(this.leftPos + 405, this.topPos + 166, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_zoom_out.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new ProxmaiMapButtonMessage(0, x, y, z));
				ProxmaiMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_out", imagebutton_zoom_out);
		this.addRenderableWidget(imagebutton_zoom_out);
		imagebutton_proxmai_center = new ImageButton(this.leftPos + 45, this.topPos + 58, 64, 64, 0, 0, 64, new ResourceLocation("farout:textures/screens/atlas/imagebutton_proxmai_center.png"), 64, 128, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new ProxmaiMapButtonMessage(1, x, y, z));
				ProxmaiMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_proxmai_center", imagebutton_proxmai_center);
		this.addRenderableWidget(imagebutton_proxmai_center);
		imagebutton_vulcan = new ImageButton(this.leftPos + 189, this.topPos + 76, 25, 25, 0, 0, 25, new ResourceLocation("farout:textures/screens/atlas/imagebutton_vulcan.png"), 25, 50, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new ProxmaiMapButtonMessage(2, x, y, z));
				ProxmaiMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_vulcan", imagebutton_vulcan);
		this.addRenderableWidget(imagebutton_vulcan);
	}
}
