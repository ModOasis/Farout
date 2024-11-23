package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RocketryPg8Menu;
import net.mcreator.far_out.network.RocketryPg8ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RocketryPg8Screen extends AbstractContainerScreen<RocketryPg8Menu> {
	private final static HashMap<String, Object> guistate = RocketryPg8Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_left;

	public RocketryPg8Screen(RocketryPg8Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 208;
		this.imageHeight = 242;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rocketry_pg_8.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/screenshot_2024-07-18_154034.png"), this.leftPos + 31, this.topPos + 45, 0, 0, 125, 67, 125, 67);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_rocketry"), 85, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_now_you_must_craft_a_lander"), 22, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_using_the_recipe_below"), 22, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_place_your_lander_down_and_righ"), 22, 117, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_click_on_it_a_menu_will_appear"), 22, 126, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_showing_your_crafts_in_order"), 22, 135, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_of_whitch_was_usedlaunched"), 22, 144, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_the_most_recently"), 22, 153, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_click_the_button_next_to_your"), 22, 171, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_spacecraft_and"), 22, 180, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_transported_to_your_planet"), 22, 189, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_is_in_the_bottom_line_that_is_no"), 22, 198, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_8.label_the_planet_you_are_on"), 22, 207, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_left = new ImageButton(this.leftPos + 22, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg8ButtonMessage(0, x, y, z));
				RocketryPg8ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
	}
}
