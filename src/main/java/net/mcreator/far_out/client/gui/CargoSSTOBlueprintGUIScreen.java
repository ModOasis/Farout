package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.CargoSSTOBlueprintGUIMenu;
import net.mcreator.far_out.network.CargoSSTOBlueprintGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CargoSSTOBlueprintGUIScreen extends AbstractContainerScreen<CargoSSTOBlueprintGUIMenu> {
	private final static HashMap<String, Object> guistate = CargoSSTOBlueprintGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow_left3;
	ImageButton imagebutton_approve_blueprint;

	public CargoSSTOBlueprintGUIScreen(CargoSSTOBlueprintGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 320;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/cargo_ssto_blueprint_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/canvas.png"), this.leftPos + -18, this.topPos + 0, 0, 0, 360, 240, 360, 240);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/cargossto.png"), this.leftPos + 69, this.topPos + 62, 0, 0, 64, 128, 64, 128);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.cargo_ssto_blueprint_gui.label_cargo_ssto"), 78, 17, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow_left3 = new ImageButton(this.leftPos + 24, this.topPos + 215, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CargoSSTOBlueprintGUIButtonMessage(0, x, y, z));
				CargoSSTOBlueprintGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left3", imagebutton_arrow_left3);
		this.addRenderableWidget(imagebutton_arrow_left3);
		imagebutton_approve_blueprint = new ImageButton(this.leftPos + 159, this.topPos + 197, 32, 32, 0, 0, 32, new ResourceLocation("farout:textures/screens/atlas/imagebutton_approve_blueprint.png"), 32, 64, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CargoSSTOBlueprintGUIButtonMessage(1, x, y, z));
				CargoSSTOBlueprintGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_approve_blueprint", imagebutton_approve_blueprint);
		this.addRenderableWidget(imagebutton_approve_blueprint);
	}
}
