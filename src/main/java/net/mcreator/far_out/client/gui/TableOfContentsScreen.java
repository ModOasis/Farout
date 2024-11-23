package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.TableOfContentsMenu;
import net.mcreator.far_out.network.TableOfContentsButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TableOfContentsScreen extends AbstractContainerScreen<TableOfContentsMenu> {
	private final static HashMap<String, Object> guistate = TableOfContentsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_rocketry_and_space_travel;

	public TableOfContentsScreen(TableOfContentsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 233;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/table_of_contents.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/book_and_quill_writing.png"), this.leftPos + -3, this.topPos + -5, 0, 0, 176, 242, 176, 242);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.table_of_contents.label_table_of_contents"), 13, 13, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_rocketry_and_space_travel = new PlainTextButton(this.leftPos + 13, this.topPos + 31, 155, 20, Component.translatable("gui.farout.table_of_contents.button_rocketry_and_space_travel"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new TableOfContentsButtonMessage(0, x, y, z));
				TableOfContentsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_rocketry_and_space_travel", button_rocketry_and_space_travel);
		this.addRenderableWidget(button_rocketry_and_space_travel);
	}
}
