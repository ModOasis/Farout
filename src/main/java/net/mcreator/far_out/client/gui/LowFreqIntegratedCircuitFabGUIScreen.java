package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.LowFreqIntegratedCircuitFabGUIMenu;
import net.mcreator.far_out.procedures.ProcessingOffProcedure;
import net.mcreator.far_out.procedures.Processing4Procedure;
import net.mcreator.far_out.procedures.Processing3Procedure;
import net.mcreator.far_out.procedures.Processing2Procedure;
import net.mcreator.far_out.procedures.Processing1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LowFreqIntegratedCircuitFabGUIScreen extends AbstractContainerScreen<LowFreqIntegratedCircuitFabGUIMenu> {
	private final static HashMap<String, Object> guistate = LowFreqIntegratedCircuitFabGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LowFreqIntegratedCircuitFabGUIScreen(LowFreqIntegratedCircuitFabGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 208;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/low_freq_integrated_circuit_fab_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/low_frequency_integrated_circuit_photomask.png"), this.leftPos + 59, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		if (ProcessingOffProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/0000.png"), this.leftPos + 94, this.topPos + 36, 0, 0, 32, 32, 32, 32);
		}
		if (Processing1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/0001.png"), this.leftPos + 94, this.topPos + 36, 0, 0, 32, 32, 32, 32);
		}
		if (Processing2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/0002.png"), this.leftPos + 94, this.topPos + 36, 0, 0, 32, 32, 32, 32);
		}
		if (Processing3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/0003.png"), this.leftPos + 94, this.topPos + 36, 0, 0, 32, 32, 32, 32);
		}
		if (Processing4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/0004.png"), this.leftPos + 94, this.topPos + 36, 0, 0, 32, 32, 32, 32);
		}
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
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
