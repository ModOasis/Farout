package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RomProgrammingStartGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RomProgrammingStartGUIScreen extends AbstractContainerScreen<RomProgrammingStartGUIMenu> {
	private final static HashMap<String, Object> guistate = RomProgrammingStartGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RomProgrammingStartGUIScreen(RomProgrammingStartGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 190;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rom_programming_start_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/planetary_transfer_summary.png"), this.leftPos + 19, this.topPos + 37, 0, 0, 150, 50, 150, 50);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rom_programming_start_gui.label_empty"), 39, 39, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rom_programming_start_gui.label_please_insert_a_programmable"), 22, 59, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rom_programming_start_gui.label_device_into_the_slot_below"), 24, 69, -1, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
