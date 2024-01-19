package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.Page2Menu;
import net.mcreator.far_out.network.Page2ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Page2Screen extends AbstractContainerScreen<Page2Menu> {
	private final static HashMap<String, Object> guistate = Page2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;

	public Page2Screen(Page2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 422;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/page_2.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/etauipixelcenter.png"), this.leftPos + 368, this.topPos + 77, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_day_7_so_far_these_last_few_da"), 12, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_somewhere_a_bit_more_permanent"), 3, 17, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_habitable_conditions_only_thing"), 3, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_atmosphere_but_that_should_be_m"), 3, 35, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_now_the_food_problem_i_need_it"), 3, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_so_i_made_a_5x5_glass_dome"), 3, 53, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_chlorella_is_like_a_miracle_food"), 3, 62, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_and_can_grow_provided_that_there"), 3, 71, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_the_goal_is_this_going_to_the_h"), 3, 89, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_day_21_today_is_the_day_i_am_h"), 12, 116, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_have_been_fabricating_microchips"), 3, 125, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_power_generation_fuel_tanks_a"), 3, 134, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_assembly_into_orbit_i_am_curren"), 3, 143, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_day_21_t000500_the_journey"), 3, 170, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_that_if_you_can_get_your_ship_in"), 3, 179, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_2.label_translunar_injection_will_begin"), 3, 188, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.farout.page_2.button_empty"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Page2ButtonMessage(0, x, y, z));
				Page2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 408, this.topPos + 215, 9, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.farout.page_2.button_empty1"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Page2ButtonMessage(1, x, y, z));
				Page2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 3, this.topPos + 215, 9, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
