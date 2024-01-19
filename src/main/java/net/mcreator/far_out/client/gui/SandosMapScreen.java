package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.SandosMapMenu;
import net.mcreator.far_out.procedures.ProxmaiReadoutProcedure;
import net.mcreator.far_out.procedures.OceanusReadoutProcedure;
import net.mcreator.far_out.procedures.InfinatosReadoutProcedure;
import net.mcreator.far_out.procedures.EtauiReadoutProcedure;
import net.mcreator.far_out.network.SandosMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SandosMapScreen extends AbstractContainerScreen<SandosMapMenu> {
	private final static HashMap<String, Object> guistate = SandosMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_proxmaipixel1;
	ImageButton imagebutton_oceanus;
	ImageButton imagebutton_etauipixel;
	ImageButton imagebutton_infinatos;
	ImageButton imagebutton_massivo_zoomed_up;

	public SandosMapScreen(SandosMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/sandos_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 215 && mouseX < leftPos + 239 && mouseY > topPos + 83 && mouseY < topPos + 107)
			guiGraphics.renderTooltip(font, Component.literal(EtauiReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 144 && mouseX < leftPos + 180 && mouseY > topPos + 76 && mouseY < topPos + 112)
			guiGraphics.renderTooltip(font, Component.literal(OceanusReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 81 && mouseX < leftPos + 126 && mouseY > topPos + 76 && mouseY < topPos + 121)
			guiGraphics.renderTooltip(font, Component.literal(ProxmaiReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 396 && mouseX < leftPos + 420 && mouseY > topPos + 85 && mouseY < topPos + 109)
			guiGraphics.renderTooltip(font, Component.literal(InfinatosReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 2, this.topPos + -4, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 201, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/sandos.png"), this.leftPos + -55, this.topPos + 37, 0, 0, 128, 128, 128, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.sandos_map.label_star_system_viewer"), 160, -3, -54228, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_proxmaipixel1 = new ImageButton(this.leftPos + 72, this.topPos + 65, 64, 64, 0, 0, 64, new ResourceLocation("farout:textures/screens/atlas/imagebutton_proxmaipixel1.png"), 64, 128, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMapButtonMessage(0, x, y, z));
				SandosMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_proxmaipixel1", imagebutton_proxmaipixel1);
		this.addRenderableWidget(imagebutton_proxmaipixel1);
		imagebutton_oceanus = new ImageButton(this.leftPos + 117, this.topPos + 42, 100, 100, 0, 0, 100, new ResourceLocation("farout:textures/screens/atlas/imagebutton_oceanus.png"), 100, 200, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMapButtonMessage(1, x, y, z));
				SandosMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_oceanus", imagebutton_oceanus);
		this.addRenderableWidget(imagebutton_oceanus);
		imagebutton_etauipixel = new ImageButton(this.leftPos + 197, this.topPos + 64, 64, 64, 0, 0, 64, new ResourceLocation("farout:textures/screens/atlas/imagebutton_etauipixel.png"), 64, 128, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMapButtonMessage(2, x, y, z));
				SandosMapButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_etauipixel", imagebutton_etauipixel);
		this.addRenderableWidget(imagebutton_etauipixel);
		imagebutton_infinatos = new ImageButton(this.leftPos + 396, this.topPos + 85, 25, 25, 0, 0, 25, new ResourceLocation("farout:textures/screens/atlas/imagebutton_infinatos.png"), 25, 50, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMapButtonMessage(3, x, y, z));
				SandosMapButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_infinatos", imagebutton_infinatos);
		this.addRenderableWidget(imagebutton_infinatos);
		imagebutton_massivo_zoomed_up = new ImageButton(this.leftPos + 225, this.topPos + -5, 192, 192, 0, 0, 192, new ResourceLocation("farout:textures/screens/atlas/imagebutton_massivo_zoomed_up.png"), 192, 384, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SandosMapButtonMessage(4, x, y, z));
				SandosMapButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_massivo_zoomed_up", imagebutton_massivo_zoomed_up);
		this.addRenderableWidget(imagebutton_massivo_zoomed_up);
	}
}
