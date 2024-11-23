package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.OraxGUIInterstellarMenu;
import net.mcreator.far_out.network.OraxGUIInterstellarButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OraxGUIInterstellarScreen extends AbstractContainerScreen<OraxGUIInterstellarMenu> {
	private final static HashMap<String, Object> guistate = OraxGUIInterstellarMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_settrajectory3;
	ImageButton imagebutton_settrajectory2;

	public OraxGUIInterstellarScreen(OraxGUIInterstellarMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/orax_gui_interstellar.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/orax.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 240, 240, 240, 240);

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
		imagebutton_settrajectory3 = new ImageButton(this.leftPos + 48, this.topPos + 57, 128, 128, 0, 0, 128, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory3.png"), 128, 256, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new OraxGUIInterstellarButtonMessage(0, x, y, z));
				OraxGUIInterstellarButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory3", imagebutton_settrajectory3);
		this.addRenderableWidget(imagebutton_settrajectory3);
		imagebutton_settrajectory2 = new ImageButton(this.leftPos + 94, this.topPos + 2, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new OraxGUIInterstellarButtonMessage(1, x, y, z));
				OraxGUIInterstellarButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory2", imagebutton_settrajectory2);
		this.addRenderableWidget(imagebutton_settrajectory2);
	}
}
