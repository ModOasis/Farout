package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.Page1Menu;
import net.mcreator.far_out.network.Page1ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Page1Screen extends AbstractContainerScreen<Page1Menu> {
	private final static HashMap<String, Object> guistate = Page1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public Page1Screen(Page1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 424;
		this.imageHeight = 300;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/page_1.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/sandos.png"), this.leftPos + 4, this.topPos + 209, 0, 0, 64, 64, 64, 64);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_i_crashed_on_an_alien_world_wi"), 4, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_i_made_a_pickaxe_using_a_long"), 13, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_lot_of_raw_materials_like_spodu"), 13, 56, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_and_watched_the_sun_go_down_and"), 13, 65, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_itself_as_the_stars_shimmered"), 13, 74, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_lot_of_stars_in_the_sky_you_cou"), 13, 83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_the_milky_way_galaxy_in_its_enti"), 13, 92, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_i_must_be_in_a_globular_cluster"), 13, 101, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_day_2_i_woke_up_and_got_to_work"), 4, 137, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_and_i_placed_the_raw_iron_into_a"), 13, 146, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_nobody_is_coming_here_anytime_so"), 13, 155, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_escape_pod_is_running_out_of_pow"), 13, 164, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_generator_there_and_hooked_it_u"), 13, 173, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_materials_from_the_raw_ores_i_co"), 13, 182, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_1.label_minerals_in_it_to_separate"), 13, 191, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.farout.page_1.button_empty"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Page1ButtonMessage(0, x, y, z));
				Page1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 409, this.topPos + 245, 9, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
