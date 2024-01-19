package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.StarshipControlGUIMenu;
import net.mcreator.far_out.procedures.DialHalfProcedure;
import net.mcreator.far_out.procedures.DialFullProcedure;
import net.mcreator.far_out.procedures.DialEmptyProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StarshipControlGUIScreen extends AbstractContainerScreen<StarshipControlGUIMenu> {
	private final static HashMap<String, Object> guistate = StarshipControlGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StarshipControlGUIScreen(StarshipControlGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 292;
		this.imageHeight = 181;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/starship_control_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/starshipcomponents.png"), this.leftPos + 64, this.topPos + 5, 0, 0, 226, 50, 226, 50);

		if (DialFullProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/dial.png"), this.leftPos + 10, this.topPos + 5, 0, 0, 64, 64, 64, 64);
		}
		if (DialHalfProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/dialhalf.png"), this.leftPos + 10, this.topPos + 5, 0, 0, 64, 64, 64, 64);
		}
		if (DialEmptyProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/dialempty.png"), this.leftPos + 10, this.topPos + 5, 0, 0, 64, 64, 64, 64);
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
