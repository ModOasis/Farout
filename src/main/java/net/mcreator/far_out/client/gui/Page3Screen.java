package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.Page3Menu;
import net.mcreator.far_out.network.Page3ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Page3Screen extends AbstractContainerScreen<Page3Menu> {
	private final static HashMap<String, Object> guistate = Page3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty1;

	public Page3Screen(Page3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 424;
		this.imageHeight = 300;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/page_3.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/etauoszoomedin.png"), this.leftPos + 285, this.topPos + 144, 0, 0, 64, 64, 64, 64);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_day_22_t021300_i_have_gott"), 13, 38, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_was_a_bit_tricky_as_the_engine"), 4, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_own_thrusters_were_used_to_push"), 4, 56, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_i_glanced_at_the_beautiful_calci"), 4, 65, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_muddy_shores_and_blue_plantlif"), 4, 74, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_atmosphere_i_undocked_with_the"), 4, 83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_the_fiery_red_plasma_enveloped_t"), 4, 92, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_deployed_a_couple_thousand_meter"), 4, 101, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_hopped_out_planted_my_flag_and"), 4, 110, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_a_spacious_common_area_and_an_a"), 4, 119, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.page_3.label_ad_astra"), 4, 164, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty1 = Button.builder(Component.translatable("gui.farout.page_3.button_empty1"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new Page3ButtonMessage(0, x, y, z));
				Page3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 245, 9, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
