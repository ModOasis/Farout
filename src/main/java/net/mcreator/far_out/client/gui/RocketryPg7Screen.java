package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RocketryPg7Menu;
import net.mcreator.far_out.network.RocketryPg7ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RocketryPg7Screen extends AbstractContainerScreen<RocketryPg7Menu> {
	private final static HashMap<String, Object> guistate = RocketryPg7Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_left;
	ImageButton imagebutton_arrow;

	public RocketryPg7Screen(RocketryPg7Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 189;
		this.imageHeight = 242;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rocketry_pg_7.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_rocketry"), 76, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_when_you_construct_a_launchpad"), 13, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_rightclick_the_rocket_assembly"), 13, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_manager"), 13, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_the_blueprint_slot_and_put_the"), 13, 54, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_items_required_into_the_ingot"), 13, 63, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_slot"), 13, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_to_find_what_you_need"), 13, 81, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_to_build_the_spaceship"), 13, 90, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_once_all_of_the_materials_read"), 13, 108, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_0_close_the_gui_and_open_it"), 13, 117, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_once_more_this_is_the_part_wher"), 13, 126, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_you_put_in_the_trajectory"), 13, 135, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_spaceship_they_are_cyclic_so_t"), 13, 144, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_from_the_source_and_the"), 13, 153, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_destination"), 13, 162, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_set_trajectory_and_click"), 13, 171, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_celestial_body_hover_over_it_to"), 13, 180, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_get_its_delta_v_and_mission_tim"), 13, 189, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_if_your_spacecraft_is_good_for"), 13, 198, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_7.label_that_it_will_launch"), 13, 207, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_left = new ImageButton(this.leftPos + 13, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg7ButtonMessage(0, x, y, z));
				RocketryPg7ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
		imagebutton_arrow = new ImageButton(this.leftPos + 157, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg7ButtonMessage(1, x, y, z));
				RocketryPg7ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
	}
}
