package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RocketryPg6Menu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RocketryPg6Screen extends AbstractContainerScreen<RocketryPg6Menu> {
	private final static HashMap<String, Object> guistate = RocketryPg6Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_left;
	ImageButton imagebutton_arrow;

	public RocketryPg6Screen(RocketryPg6Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 189;
		this.imageHeight = 242;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rocketry_pg_6.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 148 && mouseX < leftPos + 172 && mouseY > topPos + 117 && mouseY < topPos + 141)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.rocketry_pg_6.tooltip_rocket_assembler_y_offset_2"), mouseX, mouseY);
		if (mouseX > leftPos + 22 && mouseX < leftPos + 46 && mouseY > topPos + 117 && mouseY < topPos + 141)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.rocketry_pg_6.tooltip_rocket_assembler_y_offset_21"), mouseX, mouseY);
		if (mouseX > leftPos + 49 && mouseX < leftPos + 139 && mouseY > topPos + 81 && mouseY < topPos + 171)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.rocketry_pg_6.tooltip_launchpad_y_offset_1"), mouseX, mouseY);
		if (mouseX > leftPos + 85 && mouseX < leftPos + 109 && mouseY > topPos + 171 && mouseY < topPos + 195)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.rocketry_pg_6.tooltip_rocket_assembly_manager_y_offse"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/layer2.png"), this.leftPos + 22, this.topPos + 54, 0, 0, 150, 150, 150, 150);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_6.label_rocketry"), 76, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_6.label_here_is_a_top_down_view_of_a"), 13, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_6.label_launchpad_use_the_arrows_to"), 13, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_6.label_get_their_yoffset"), 13, 45, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_left = new ImageButton(this.leftPos + 13, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
		imagebutton_arrow = new ImageButton(this.leftPos + 157, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
	}
}
