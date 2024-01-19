package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.FormalonMapMenu;
import net.mcreator.far_out.procedures.RejonaReadoutProcedure;
import net.mcreator.far_out.procedures.OraxReadoutProcedure;
import net.mcreator.far_out.procedures.MojaReadoutProcedure;
import net.mcreator.far_out.procedures.HelusReadoutProcedure;
import net.mcreator.far_out.procedures.CarbosReadoutProcedure;
import net.mcreator.far_out.network.FormalonMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FormalonMapScreen extends AbstractContainerScreen<FormalonMapMenu> {
	private final static HashMap<String, Object> guistate = FormalonMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_carbos;
	ImageButton imagebutton_moja;
	ImageButton imagebutton_rejona;
	ImageButton imagebutton_helus;
	ImageButton imagebutton_fixedglitch;

	public FormalonMapScreen(FormalonMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/formalon_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 82 && mouseX < leftPos + 132 && mouseY > topPos + 76 && mouseY < topPos + 127)
			guiGraphics.renderTooltip(font, Component.literal(CarbosReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 142 && mouseX < leftPos + 209 && mouseY > topPos + 65 && mouseY < topPos + 132)
			guiGraphics.renderTooltip(font, Component.literal(MojaReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 225 && mouseX < leftPos + 276 && mouseY > topPos + 76 && mouseY < topPos + 127)
			guiGraphics.renderTooltip(font, Component.literal(RejonaReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 294 && mouseX < leftPos + 335 && mouseY > topPos + 81 && mouseY < topPos + 121)
			guiGraphics.renderTooltip(font, Component.literal(HelusReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 366 && mouseX < leftPos + 432 && mouseY > topPos + 53 && mouseY < topPos + 157)
			guiGraphics.renderTooltip(font, Component.literal(OraxReadoutProcedure.execute(entity)), mouseX, mouseY);
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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/1712134285.png"), this.leftPos + -99, this.topPos + -5, 0, 0, 200, 200, 200, 200);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.formalon_map.label_star_system_viewer"), 160, -3, -54228, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_carbos = new ImageButton(this.leftPos + 81, this.topPos + 76, 50, 50, 0, 0, 50, new ResourceLocation("farout:textures/screens/atlas/imagebutton_carbos.png"), 50, 100, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMapButtonMessage(0, x, y, z));
				FormalonMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_carbos", imagebutton_carbos);
		this.addRenderableWidget(imagebutton_carbos);
		imagebutton_moja = new ImageButton(this.leftPos + 144, this.topPos + 67, 65, 65, 0, 0, 65, new ResourceLocation("farout:textures/screens/atlas/imagebutton_moja.png"), 65, 130, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMapButtonMessage(1, x, y, z));
				FormalonMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_moja", imagebutton_moja);
		this.addRenderableWidget(imagebutton_moja);
		imagebutton_rejona = new ImageButton(this.leftPos + 225, this.topPos + 76, 49, 49, 0, 0, 49, new ResourceLocation("farout:textures/screens/atlas/imagebutton_rejona.png"), 49, 98, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMapButtonMessage(2, x, y, z));
				FormalonMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rejona", imagebutton_rejona);
		this.addRenderableWidget(imagebutton_rejona);
		imagebutton_helus = new ImageButton(this.leftPos + 295, this.topPos + 81, 40, 40, 0, 0, 40, new ResourceLocation("farout:textures/screens/atlas/imagebutton_helus.png"), 40, 80, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMapButtonMessage(3, x, y, z));
				FormalonMapButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_helus", imagebutton_helus);
		this.addRenderableWidget(imagebutton_helus);
		imagebutton_fixedglitch = new ImageButton(this.leftPos + 315, this.topPos + 4, 200, 200, 0, 0, 200, new ResourceLocation("farout:textures/screens/atlas/imagebutton_fixedglitch.png"), 200, 400, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FormalonMapButtonMessage(4, x, y, z));
				FormalonMapButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_fixedglitch", imagebutton_fixedglitch);
		this.addRenderableWidget(imagebutton_fixedglitch);
	}
}
