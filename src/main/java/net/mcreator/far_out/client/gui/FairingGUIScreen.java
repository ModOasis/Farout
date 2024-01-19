package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.FairingGUIMenu;
import net.mcreator.far_out.procedures.FairingWattageProcedure;
import net.mcreator.far_out.procedures.FairingHabProcedure;
import net.mcreator.far_out.procedures.FairingDeltaVProcedure;
import net.mcreator.far_out.network.FairingGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FairingGUIScreen extends AbstractContainerScreen<FairingGUIMenu> {
	private final static HashMap<String, Object> guistate = FairingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_load_fairing;
	Button button_refresh;

	public FairingGUIScreen(FairingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 309;
		this.imageHeight = 194;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/fairing_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/fairing.png"), this.leftPos + -35, this.topPos + 30, 0, 0, 128, 128, 128, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_engine"), 82, 156, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_fuel_tanks"), 82, 129, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_habitation"), 82, 75, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_control_unit"), 82, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_electric"), 82, 102, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_generator"), 82, 111, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_warning_fairing_cannot_be"), 100, 3, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_modifed_when_the_load_fairing"), 100, 12, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.fairing_gui.label_button_is_pressed"), 100, 21, -65536, false);
		guiGraphics.drawString(this.font,

				FairingHabProcedure.execute(world), 154, 48, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingDeltaVProcedure.execute(world), 154, 39, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingWattageProcedure.execute(world), 154, 57, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_load_fairing = Button.builder(Component.translatable("gui.farout.fairing_gui.button_load_fairing"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FairingGUIButtonMessage(0, x, y, z));
				FairingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 19, this.topPos + 12, 72, 20).build();
		guistate.put("button:button_load_fairing", button_load_fairing);
		this.addRenderableWidget(button_load_fairing);
		button_refresh = Button.builder(Component.translatable("gui.farout.fairing_gui.button_refresh"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new FairingGUIButtonMessage(1, x, y, z));
				FairingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 163, this.topPos + 75, 72, 20).build();
		guistate.put("button:button_refresh", button_refresh);
		this.addRenderableWidget(button_refresh);
	}
}
