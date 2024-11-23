package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.FormalonMainInterstellarMenu;
import net.mcreator.far_out.network.FormalonMainInterstellarButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FormalonMainInterstellarScreen extends AbstractContainerScreen<FormalonMainInterstellarMenu> {
	private final static HashMap<String, Object> guistate = FormalonMainInterstellarMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_settrajectory;
	ImageButton imagebutton_settrajectory1;
	ImageButton imagebutton_settrajectory2;
	ImageButton imagebutton_zoom_out;

	public FormalonMainInterstellarScreen(FormalonMainInterstellarMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/formalon_main_interstellar.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/formalonx1.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 240, 240, 240, 240);

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
		imagebutton_settrajectory = new ImageButton(this.leftPos + 79, this.topPos + 131, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainInterstellarButtonMessage(0, x, y, z));
				FormalonMainInterstellarButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory", imagebutton_settrajectory);
		this.addRenderableWidget(imagebutton_settrajectory);
		imagebutton_settrajectory1 = new ImageButton(this.leftPos + 40, this.topPos + 60, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainInterstellarButtonMessage(1, x, y, z));
				FormalonMainInterstellarButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory1", imagebutton_settrajectory1);
		this.addRenderableWidget(imagebutton_settrajectory1);
		imagebutton_settrajectory2 = new ImageButton(this.leftPos + 184, this.topPos + 17, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainInterstellarButtonMessage(2, x, y, z));
				FormalonMainInterstellarButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory2", imagebutton_settrajectory2);
		this.addRenderableWidget(imagebutton_settrajectory2);
		imagebutton_zoom_out = new ImageButton(this.leftPos + 218, this.topPos + 218, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_zoom_out.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainInterstellarButtonMessage(3, x, y, z));
				FormalonMainInterstellarButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_out", imagebutton_zoom_out);
		this.addRenderableWidget(imagebutton_zoom_out);
	}
}