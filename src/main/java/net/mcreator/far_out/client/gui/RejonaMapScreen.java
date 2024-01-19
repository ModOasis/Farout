package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RejonaMapMenu;
import net.mcreator.far_out.procedures.RejonaReadoutProcedure;
import net.mcreator.far_out.procedures.MeluReadoutProcedure;
import net.mcreator.far_out.network.RejonaMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RejonaMapScreen extends AbstractContainerScreen<RejonaMapMenu> {
	private final static HashMap<String, Object> guistate = RejonaMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_zoom_out;
	ImageButton imagebutton_rejona_zoomed_in;
	ImageButton imagebutton_melu;

	public RejonaMapScreen(RejonaMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rejona_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 45 && mouseX < leftPos + 117 && mouseY > topPos + 57 && mouseY < topPos + 128)
			guiGraphics.renderTooltip(font, Component.literal(RejonaReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 332 && mouseX < leftPos + 374 && mouseY > topPos + 74 && mouseY < topPos + 117)
			guiGraphics.renderTooltip(font, Component.literal(MeluReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 1, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 201, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 394, this.topPos + -5, 0, 0, 200, 200, 200, 200);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rejona_map.label_star_system_viewer"), 160, -3, -54228, false);
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
				FaroutMod.PACKET_HANDLER.sendToServer(new RejonaMapButtonMessage(0, x, y, z));
				RejonaMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_out", imagebutton_zoom_out);
		this.addRenderableWidget(imagebutton_zoom_out);
		imagebutton_rejona_zoomed_in = new ImageButton(this.leftPos + 45, this.topPos + 58, 70, 70, 0, 0, 70, new ResourceLocation("farout:textures/screens/atlas/imagebutton_rejona_zoomed_in.png"), 70, 140, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RejonaMapButtonMessage(1, x, y, z));
				RejonaMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rejona_zoomed_in", imagebutton_rejona_zoomed_in);
		this.addRenderableWidget(imagebutton_rejona_zoomed_in);
		imagebutton_melu = new ImageButton(this.leftPos + 333, this.topPos + 76, 40, 40, 0, 0, 40, new ResourceLocation("farout:textures/screens/atlas/imagebutton_melu.png"), 40, 80, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RejonaMapButtonMessage(2, x, y, z));
				RejonaMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_melu", imagebutton_melu);
		this.addRenderableWidget(imagebutton_melu);
	}
}
