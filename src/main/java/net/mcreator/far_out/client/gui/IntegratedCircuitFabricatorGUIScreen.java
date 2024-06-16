package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.IntegratedCircuitFabricatorGUIMenu;
import net.mcreator.far_out.network.IntegratedCircuitFabricatorGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class IntegratedCircuitFabricatorGUIScreen extends AbstractContainerScreen<IntegratedCircuitFabricatorGUIMenu> {
	private final static HashMap<String, Object> guistate = IntegratedCircuitFabricatorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_medium_capacity_memory;
	ImageButton imagebutton_mf_chip;
	ImageButton imagebutton_inertialnavigationsystem;
	ImageButton imagebutton_photovoltaicwafer;

	public IntegratedCircuitFabricatorGUIScreen(IntegratedCircuitFabricatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 208;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/integrated_circuit_fabricator_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow.png"), this.leftPos + 85, this.topPos + 25, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.integrated_circuit_fabricator_gui.label_integrated_circuit_fabricator"), 40, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_medium_capacity_memory = new ImageButton(this.leftPos + 67, this.topPos + 61, 32, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_medium_capacity_memory.png"), 32, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IntegratedCircuitFabricatorGUIButtonMessage(0, x, y, z));
				IntegratedCircuitFabricatorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_medium_capacity_memory", imagebutton_medium_capacity_memory);
		this.addRenderableWidget(imagebutton_medium_capacity_memory);
		imagebutton_mf_chip = new ImageButton(this.leftPos + 40, this.topPos + 61, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_mf_chip.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IntegratedCircuitFabricatorGUIButtonMessage(1, x, y, z));
				IntegratedCircuitFabricatorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mf_chip", imagebutton_mf_chip);
		this.addRenderableWidget(imagebutton_mf_chip);
		imagebutton_inertialnavigationsystem = new ImageButton(this.leftPos + 103, this.topPos + 61, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_inertialnavigationsystem.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IntegratedCircuitFabricatorGUIButtonMessage(2, x, y, z));
				IntegratedCircuitFabricatorGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_inertialnavigationsystem", imagebutton_inertialnavigationsystem);
		this.addRenderableWidget(imagebutton_inertialnavigationsystem);
		imagebutton_photovoltaicwafer = new ImageButton(this.leftPos + 121, this.topPos + 61, 18, 18, 0, 0, 18, new ResourceLocation("farout:textures/screens/atlas/imagebutton_photovoltaicwafer.png"), 18, 36, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IntegratedCircuitFabricatorGUIButtonMessage(3, x, y, z));
				IntegratedCircuitFabricatorGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_photovoltaicwafer", imagebutton_photovoltaicwafer);
		this.addRenderableWidget(imagebutton_photovoltaicwafer);
	}
}
