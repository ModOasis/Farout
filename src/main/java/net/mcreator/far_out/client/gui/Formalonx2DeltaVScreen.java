package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.Formalonx2DeltaVMenu;
import net.mcreator.far_out.procedures.OraxReadoutProcedure;
import net.mcreator.far_out.procedures.HelusReadoutProcedure;
import net.mcreator.far_out.network.Formalonx2DeltaVButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Formalonx2DeltaVScreen extends AbstractContainerScreen<Formalonx2DeltaVMenu> {
	private final static HashMap<String, Object> guistate = Formalonx2DeltaVMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_zoom_in;
	ImageButton imagebutton_settrajectory;
	ImageButton imagebutton_settrajectory2;
	ImageButton imagebutton_settrajectory1;
	ImageButton imagebutton_settrajectory3;

	public Formalonx2DeltaVScreen(Formalonx2DeltaVMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/formalonx_2_delta_v.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 128 && mouseX < leftPos + 139 && mouseY > topPos + 24 && mouseY < topPos + 37)
			guiGraphics.renderTooltip(font, Component.literal(HelusReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 218 && mouseX < leftPos + 242 && mouseY > topPos + 67 && mouseY < topPos + 91)
			guiGraphics.renderTooltip(font, Component.literal(OraxReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/formalonx2.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 240, 240, 240, 240);

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
		imagebutton_zoom_in = new ImageButton(this.leftPos + 221, this.topPos + 221, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_zoom_in.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Formalonx2DeltaVButtonMessage(0, x, y, z));
				Formalonx2DeltaVButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_in", imagebutton_zoom_in);
		this.addRenderableWidget(imagebutton_zoom_in);
		imagebutton_settrajectory = new ImageButton(this.leftPos + 127, this.topPos + 23, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Formalonx2DeltaVButtonMessage(1, x, y, z));
				Formalonx2DeltaVButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory", imagebutton_settrajectory);
		this.addRenderableWidget(imagebutton_settrajectory);
		imagebutton_settrajectory2 = new ImageButton(this.leftPos + 219, this.topPos + 68, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Formalonx2DeltaVButtonMessage(2, x, y, z));
				Formalonx2DeltaVButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory2", imagebutton_settrajectory2);
		this.addRenderableWidget(imagebutton_settrajectory2);
		imagebutton_settrajectory1 = new ImageButton(this.leftPos + 127, this.topPos + 25, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Formalonx2DeltaVButtonMessage(3, x, y, z));
				Formalonx2DeltaVButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory1", imagebutton_settrajectory1);
		this.addRenderableWidget(imagebutton_settrajectory1);
		imagebutton_settrajectory3 = new ImageButton(this.leftPos + 222, this.topPos + 70, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Formalonx2DeltaVButtonMessage(4, x, y, z));
				Formalonx2DeltaVButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory3", imagebutton_settrajectory3);
		this.addRenderableWidget(imagebutton_settrajectory3);
	}
}
