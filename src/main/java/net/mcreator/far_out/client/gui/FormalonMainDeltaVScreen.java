package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.FormalonMainDeltaVMenu;
import net.mcreator.far_out.procedures.RejonaReadoutProcedure;
import net.mcreator.far_out.procedures.MojaReadoutProcedure;
import net.mcreator.far_out.procedures.CarbosReadoutProcedure;
import net.mcreator.far_out.network.FormalonMainDeltaVButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FormalonMainDeltaVScreen extends AbstractContainerScreen<FormalonMainDeltaVMenu> {
	private final static HashMap<String, Object> guistate = FormalonMainDeltaVMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_settrajectory;
	ImageButton imagebutton_settrajectory1;
	ImageButton imagebutton_settrajectory2;
	ImageButton imagebutton_zoom_out;
	ImageButton imagebutton_settrajectory3;
	ImageButton imagebutton_settrajectory4;
	ImageButton imagebutton_settrajectory5;

	public FormalonMainDeltaVScreen(FormalonMainDeltaVMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/formalon_main_delta_v.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 79 && mouseX < leftPos + 103 && mouseY > topPos + 128 && mouseY < topPos + 152)
			guiGraphics.renderTooltip(font, Component.literal(CarbosReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 37 && mouseX < leftPos + 61 && mouseY > topPos + 58 && mouseY < topPos + 82)
			guiGraphics.renderTooltip(font, Component.literal(MojaReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 181 && mouseX < leftPos + 205 && mouseY > topPos + 13 && mouseY < topPos + 37)
			guiGraphics.renderTooltip(font, Component.literal(RejonaReadoutProcedure.execute(entity)), mouseX, mouseY);
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
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(0, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory", imagebutton_settrajectory);
		this.addRenderableWidget(imagebutton_settrajectory);
		imagebutton_settrajectory1 = new ImageButton(this.leftPos + 40, this.topPos + 60, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(1, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory1", imagebutton_settrajectory1);
		this.addRenderableWidget(imagebutton_settrajectory1);
		imagebutton_settrajectory2 = new ImageButton(this.leftPos + 184, this.topPos + 17, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(2, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory2", imagebutton_settrajectory2);
		this.addRenderableWidget(imagebutton_settrajectory2);
		imagebutton_zoom_out = new ImageButton(this.leftPos + 218, this.topPos + 218, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_zoom_out.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(3, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_zoom_out", imagebutton_zoom_out);
		this.addRenderableWidget(imagebutton_zoom_out);
		imagebutton_settrajectory3 = new ImageButton(this.leftPos + 81, this.topPos + 132, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(4, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory3", imagebutton_settrajectory3);
		this.addRenderableWidget(imagebutton_settrajectory3);
		imagebutton_settrajectory4 = new ImageButton(this.leftPos + 39, this.topPos + 59, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory4.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(5, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory4", imagebutton_settrajectory4);
		this.addRenderableWidget(imagebutton_settrajectory4);
		imagebutton_settrajectory5 = new ImageButton(this.leftPos + 185, this.topPos + 17, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory5.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMainDeltaVButtonMessage(6, x, y, z));
				FormalonMainDeltaVButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory5", imagebutton_settrajectory5);
		this.addRenderableWidget(imagebutton_settrajectory5);
	}
}
