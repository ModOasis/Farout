package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.LanderGUIMenu;
import net.mcreator.far_out.network.LanderGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LanderGUIScreen extends AbstractContainerScreen<LanderGUIMenu> {
	private final static HashMap<String, Object> guistate = LanderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_rendezvous_with_transfer_stage;
	Button button_starship;

	public LanderGUIScreen(LanderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/lander_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 69 && mouseX < leftPos + 150 && mouseY > topPos + 61 && mouseY < topPos + 79)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.lander_gui.tooltip_sends_you_back_to_where_you_laun"), mouseX, mouseY);
		if (mouseX > leftPos + 69 && mouseX < leftPos + 132 && mouseY > topPos + 88 && mouseY < topPos + 106)
			guiGraphics.renderTooltip(font, Component.translatable("gui.farout.lander_gui.tooltip_sends_you_to_to_the_other_star_s"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/smallatmosphericlander.png"), this.leftPos + -3, this.topPos + 43, 0, 0, 64, 64, 64, 64);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.lander_gui.label_docking_options"), 69, 43, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_rendezvous_with_transfer_stage = Button.builder(Component.translatable("gui.farout.lander_gui.button_rendezvous_with_transfer_stage"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new LanderGUIButtonMessage(0, x, y, z));
				LanderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 61, 81, 20).build();
		guistate.put("button:button_rendezvous_with_transfer_stage", button_rendezvous_with_transfer_stage);
		this.addRenderableWidget(button_rendezvous_with_transfer_stage);
		button_starship = Button.builder(Component.translatable("gui.farout.lander_gui.button_starship"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new LanderGUIButtonMessage(1, x, y, z));
				LanderGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 69, this.topPos + 88, 67, 20).build();
		guistate.put("button:button_starship", button_starship);
		this.addRenderableWidget(button_starship);
	}
}
