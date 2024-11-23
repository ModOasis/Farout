package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.GravityChangerMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GravityChangerScreen extends AbstractContainerScreen<GravityChangerMenu> {
	private final static HashMap<String, Object> guistate = GravityChangerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Gravity;

	public GravityChangerScreen(GravityChangerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 157;
		this.imageHeight = 85;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/gravity_changer.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Gravity.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Gravity.isFocused())
			return Gravity.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Gravity.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		Gravity = new EditBox(this.font, this.leftPos + 19, this.topPos + 39, 118, 18, Component.translatable("gui.farout.gravity_changer.Gravity")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.gravity_changer.Gravity").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.gravity_changer.Gravity").getString());
				else
					setSuggestion(null);
			}
		};
		Gravity.setSuggestion(Component.translatable("gui.farout.gravity_changer.Gravity").getString());
		Gravity.setMaxLength(32767);
		guistate.put("text:Gravity", Gravity);
		this.addWidget(this.Gravity);
	}
}
