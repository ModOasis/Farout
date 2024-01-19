package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.OraxMapMenu;
import net.mcreator.far_out.procedures.ZevReadoutProcedure;
import net.mcreator.far_out.procedures.OraxReadoutProcedure;
import net.mcreator.far_out.network.OraxMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OraxMapScreen extends AbstractContainerScreen<OraxMapMenu> {
	private final static HashMap<String, Object> guistate = OraxMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_zoom_out;
	ImageButton imagebutton_1712134285;

	public OraxMapScreen(OraxMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/orax_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 51 && mouseX < leftPos + 159 && mouseY > topPos + 47 && mouseY < topPos + 156)
			guiGraphics.renderTooltip(font, Component.literal(OraxReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 259 && mouseX < leftPos + 312 && mouseY > topPos + 82 && mouseY < topPos + 134)
			guiGraphics.renderTooltip(font, Component.literal(ZevReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 2, this.topPos + -4, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 199, this.topPos + -4, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 396, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/fixed_glitch_moon.png"), this.leftPos + 261, this.topPos + 83, 0, 0, 50, 50, 50, 50);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.orax_map.label_star_system_viewer"), 160, -3, -54228, false);
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
				FaroutMod.PACKET_HANDLER.sendToServer(new OraxMapButtonMessage(0, x, y, z));
				OraxMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_out", imagebutton_zoom_out);
		this.addRenderableWidget(imagebutton_zoom_out);
		imagebutton_1712134285 = new ImageButton(this.leftPos + 9, this.topPos + 3, 200, 200, 0, 0, 200, new ResourceLocation("farout:textures/screens/atlas/imagebutton_1712134285.png"), 200, 400, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new OraxMapButtonMessage(1, x, y, z));
				OraxMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_1712134285", imagebutton_1712134285);
		this.addRenderableWidget(imagebutton_1712134285);
	}
}
