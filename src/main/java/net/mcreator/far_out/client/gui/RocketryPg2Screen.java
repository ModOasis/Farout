package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RocketryPg2Menu;
import net.mcreator.far_out.network.RocketryPg2ButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RocketryPg2Screen extends AbstractContainerScreen<RocketryPg2Menu> {
	private final static HashMap<String, Object> guistate = RocketryPg2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow;
	ImageButton imagebutton_arrow_left;

	public RocketryPg2Screen(RocketryPg2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 189;
		this.imageHeight = 242;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rocketry_pg_2.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/screenshot_2024-07-14_163017.png"), this.leftPos + 49, this.topPos + 27, 0, 0, 98, 113, 98, 113);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_table_of_contents"), 76, 9, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_you_will_need_a_blueprint_to_ope"), 13, 144, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_it_but_once_you_do_you_may_be"), 13, 153, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_confused_by_the_metrics_of_the"), 13, 162, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_spacecraft_lets_explain_them"), 13, 171, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_dv_is_the_total_velocity"), 13, 180, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocketry_pg_2.label_that_can_be_made_by_a"), 13, 189, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow = new ImageButton(this.leftPos + 166, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg2ButtonMessage(0, x, y, z));
				RocketryPg2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
		imagebutton_arrow_left = new ImageButton(this.leftPos + 13, this.topPos + 216, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketryPg2ButtonMessage(1, x, y, z));
				RocketryPg2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
	}
}
