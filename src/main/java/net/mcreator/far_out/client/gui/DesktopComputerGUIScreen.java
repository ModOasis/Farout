package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.DesktopComputerGUIMenu;
import net.mcreator.far_out.procedures.DesktopComputerTextLine9Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine8Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine7Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine6Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine5Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine4Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine3Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine2Procedure;
import net.mcreator.far_out.procedures.DesktopComputerTextLine1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DesktopComputerGUIScreen extends AbstractContainerScreen<DesktopComputerGUIMenu> {
	private final static HashMap<String, Object> guistate = DesktopComputerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox input;

	public DesktopComputerGUIScreen(DesktopComputerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 199;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/desktop_computer_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		input.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/wallpaper1.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 200, 200, 200, 200);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (input.isFocused())
			return input.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		input.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine1Procedure.execute(world, x, y, z), 0, 13, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine2Procedure.execute(world, x, y, z), 0, 31, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine3Procedure.execute(world, x, y, z), 0, 49, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine4Procedure.execute(world, x, y, z), 0, 67, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine5Procedure.execute(world, x, y, z), 0, 85, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine6Procedure.execute(world, x, y, z), 0, 103, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine7Procedure.execute(world, x, y, z), 0, 121, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine8Procedure.execute(world, x, y, z), 0, 139, -1, false);
		guiGraphics.drawString(this.font,

				DesktopComputerTextLine9Procedure.execute(world, x, y, z), 0, 157, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		input = new EditBox(this.font, this.leftPos + 37, this.topPos + 176, 118, 18, Component.translatable("gui.farout.desktop_computer_gui.input")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.desktop_computer_gui.input").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.desktop_computer_gui.input").getString());
				else
					setSuggestion(null);
			}
		};
		input.setSuggestion(Component.translatable("gui.farout.desktop_computer_gui.input").getString());
		input.setMaxLength(32767);
		guistate.put("text:input", input);
		this.addWidget(this.input);
	}
}
