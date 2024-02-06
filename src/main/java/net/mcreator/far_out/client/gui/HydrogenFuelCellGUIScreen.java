package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.HydrogenFuelCellGUIMenu;
import net.mcreator.far_out.procedures.Arrow9Procedure;
import net.mcreator.far_out.procedures.Arrow8Procedure;
import net.mcreator.far_out.procedures.Arrow7Procedure;
import net.mcreator.far_out.procedures.Arrow6Procedure;
import net.mcreator.far_out.procedures.Arrow5Procedure;
import net.mcreator.far_out.procedures.Arrow4Procedure;
import net.mcreator.far_out.procedures.Arrow3Procedure;
import net.mcreator.far_out.procedures.Arrow2Procedure;
import net.mcreator.far_out.procedures.Arrow1Procedure;
import net.mcreator.far_out.procedures.Arrow10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HydrogenFuelCellGUIScreen extends AbstractContainerScreen<HydrogenFuelCellGUIMenu> {
	private final static HashMap<String, Object> guistate = HydrogenFuelCellGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public HydrogenFuelCellGUIScreen(HydrogenFuelCellGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/hydrogen_fuel_cell_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow0.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);

		if (Arrow1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow1.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow2.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow3.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow4.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow5.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow6.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow7.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow8.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow9.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow10.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.hydrogen_fuel_cell_gui.label_hydrogen_fuel_cell"), 42, 7, -12829636, false);
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
