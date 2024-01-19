package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.EtauiMapMenu;
import net.mcreator.far_out.procedures.EtauosReadoutProcedure;
import net.mcreator.far_out.procedures.EtauiReadoutProcedure;
import net.mcreator.far_out.network.EtauiMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EtauiMapScreen extends AbstractContainerScreen<EtauiMapMenu> {
	private final static HashMap<String, Object> guistate = EtauiMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_zoom_out;
	ImageButton imagebutton_etauipixelcenter;
	ImageButton imagebutton_etauos;

	public EtauiMapScreen(EtauiMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/etaui_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 54 && mouseX < leftPos + 120 && mouseY > topPos + 66 && mouseY < topPos + 132)
			guiGraphics.renderTooltip(font, Component.literal(EtauiReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 296 && mouseX < leftPos + 330 && mouseY > topPos + 83 && mouseY < topPos + 118)
			guiGraphics.renderTooltip(font, Component.literal(EtauosReadoutProcedure.execute(entity)), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.etaui_map.label_star_system_viewer"), 160, -3, -54228, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_zoom_out = new ImageButton(this.leftPos + 414, this.topPos + 175, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_zoom_out.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new EtauiMapButtonMessage(0, x, y, z));
				EtauiMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_out", imagebutton_zoom_out);
		this.addRenderableWidget(imagebutton_zoom_out);
		imagebutton_etauipixelcenter = new ImageButton(this.leftPos + 54, this.topPos + 67, 64, 64, 0, 0, 64, new ResourceLocation("farout:textures/screens/atlas/imagebutton_etauipixelcenter.png"), 64, 128, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new EtauiMapButtonMessage(1, x, y, z));
				EtauiMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_etauipixelcenter", imagebutton_etauipixelcenter);
		this.addRenderableWidget(imagebutton_etauipixelcenter);
		imagebutton_etauos = new ImageButton(this.leftPos + 297, this.topPos + 85, 32, 32, 0, 0, 32, new ResourceLocation("farout:textures/screens/atlas/imagebutton_etauos.png"), 32, 64, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new EtauiMapButtonMessage(2, x, y, z));
				EtauiMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_etauos", imagebutton_etauos);
		this.addRenderableWidget(imagebutton_etauos);
	}
}
