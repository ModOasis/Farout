package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RocketryPg5Menu;
import net.mcreator.far_out.network.RocketryPg5ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RocketryPg5Screen extends AbstractContainerScreen<RocketryPg5Menu> {
	private final static HashMap<String, Object> guistate = RocketryPg5Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_left;
	ImageButton imagebutton_arrow;

	public RocketryPg5Screen(RocketryPg5Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 189;
		this.imageHeight = 242;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rocketry_pg_5.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_rocketry"), 76, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_to_increase_your_dv_you_can"), 13, 27, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_increase_your_ratio_of_massfuel"), 13, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_or_raise_your_exhaust"), 13, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_the_second_is_more_pratical_in_t"), 13, 63, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_in_this_mod"), 13, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_now_you_need_to_make_a_rocket"), 13, 108, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_5.label_for_this_you_need_a_launchpad"), 13, 117, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_left = new ImageButton(this.leftPos + 13, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg5ButtonMessage(0, x, y, z));
				RocketryPg5ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
		imagebutton_arrow = new ImageButton(this.leftPos + 157, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg5ButtonMessage(1, x, y, z));
				RocketryPg5ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
	}
}
