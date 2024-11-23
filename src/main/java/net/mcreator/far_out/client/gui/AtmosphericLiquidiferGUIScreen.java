package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.AtmosphericLiquidiferGUIMenu;
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
import net.mcreator.far_out.procedures.AlwaysTrueProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AtmosphericLiquidiferGUIScreen extends AbstractContainerScreen<AtmosphericLiquidiferGUIMenu> {
	private final static HashMap<String, Object> guistate = AtmosphericLiquidiferGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AtmosphericLiquidiferGUIScreen(AtmosphericLiquidiferGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/atmospheric_liquidifer_gui.png");

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
		if (AlwaysTrueProcedure.execute()) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0001.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0002.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0003.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0003.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0004.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0005.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0006.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0007.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0008.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0009.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/atmosphericdistalation0010.png"), this.leftPos + 78, this.topPos + 43, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.atmospheric_liquidifer_gui.label_atmospheric_liquidifer"), 33, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
