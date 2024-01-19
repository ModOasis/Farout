package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.MassivoMapMenu;
import net.mcreator.far_out.procedures.VarasReadoutProcedure;
import net.mcreator.far_out.procedures.SilicanReadoutProcedure;
import net.mcreator.far_out.procedures.GlacieoReadoutProcedure;
import net.mcreator.far_out.network.MassivoMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MassivoMapScreen extends AbstractContainerScreen<MassivoMapMenu> {
	private final static HashMap<String, Object> guistate = MassivoMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_zoom_in;
	ImageButton imagebutton_glacieo;
	ImageButton imagebutton_silican;
	ImageButton imagebutton_varas;

	public MassivoMapScreen(MassivoMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/massivo_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 198 && mouseX < leftPos + 225 && mouseY > topPos + 85 && mouseY < topPos + 112)
			guiGraphics.renderTooltip(font, Component.literal(VarasReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 378 && mouseX < leftPos + 414 && mouseY > topPos + 85 && mouseY < topPos + 121)
			guiGraphics.renderTooltip(font, Component.literal(GlacieoReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 297 && mouseX < leftPos + 333 && mouseY > topPos + 85 && mouseY < topPos + 121)
			guiGraphics.renderTooltip(font, Component.literal(SilicanReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 2, this.topPos + -4, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 198, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 396, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/massivo_zoomed_up.png"), this.leftPos + 0, this.topPos + 4, 0, 0, 192, 192, 192, 192);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.massivo_map.label_star_system_viewer"), 160, -3, -54228, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_zoom_in = new ImageButton(this.leftPos + 414, this.topPos + 175, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_zoom_in.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new MassivoMapButtonMessage(0, x, y, z));
				MassivoMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_in", imagebutton_zoom_in);
		this.addRenderableWidget(imagebutton_zoom_in);
		imagebutton_glacieo = new ImageButton(this.leftPos + 387, this.topPos + 85, 30, 30, 0, 0, 30, new ResourceLocation("farout:textures/screens/atlas/imagebutton_glacieo.png"), 30, 60, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new MassivoMapButtonMessage(1, x, y, z));
				MassivoMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_glacieo", imagebutton_glacieo);
		this.addRenderableWidget(imagebutton_glacieo);
		imagebutton_silican = new ImageButton(this.leftPos + 297, this.topPos + 85, 30, 30, 0, 0, 30, new ResourceLocation("farout:textures/screens/atlas/imagebutton_silican.png"), 30, 60, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new MassivoMapButtonMessage(2, x, y, z));
				MassivoMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_silican", imagebutton_silican);
		this.addRenderableWidget(imagebutton_silican);
		imagebutton_varas = new ImageButton(this.leftPos + 198, this.topPos + 87, 25, 25, 0, 0, 25, new ResourceLocation("farout:textures/screens/atlas/imagebutton_varas.png"), 25, 50, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new MassivoMapButtonMessage(3, x, y, z));
				MassivoMapButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_varas", imagebutton_varas);
		this.addRenderableWidget(imagebutton_varas);
	}
}
