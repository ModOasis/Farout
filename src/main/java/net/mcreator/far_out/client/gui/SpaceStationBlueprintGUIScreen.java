package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.SpaceStationBlueprintGUIMenu;
import net.mcreator.far_out.procedures.ReturnTotalPointsProcedure;
import net.mcreator.far_out.procedures.ReturnStoragePointsProcedure;
import net.mcreator.far_out.procedures.ReturnProductionPointsProcedure;
import net.mcreator.far_out.procedures.ReturnEnergyPointsProcedure;
import net.mcreator.far_out.network.SpaceStationBlueprintGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SpaceStationBlueprintGUIScreen extends AbstractContainerScreen<SpaceStationBlueprintGUIMenu> {
	private final static HashMap<String, Object> guistate = SpaceStationBlueprintGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox name;
	ImageButton imagebutton_arrow_pressed;
	ImageButton imagebutton_arrow;
	ImageButton imagebutton_arrow1;
	ImageButton imagebutton_arrow_left;
	ImageButton imagebutton_arrow_left1;
	ImageButton imagebutton_arrow_left2;
	ImageButton imagebutton_arrow_left3;
	ImageButton imagebutton_approve_blueprint;
	ImageButton imagebutton_arrow2;

	public SpaceStationBlueprintGUIScreen(SpaceStationBlueprintGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 320;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/space_station_blueprint_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		name.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/canvas.png"), this.leftPos + -18, this.topPos + 0, 0, 0, 360, 240, 360, 240);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/stationhull.png"), this.leftPos + 60, this.topPos + 89, 0, 0, 128, 64, 128, 64);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (name.isFocused())
			return name.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		name.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				ReturnProductionPointsProcedure.execute(world, x, y, z), 81, 37, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnStoragePointsProcedure.execute(world, x, y, z), 81, 55, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnEnergyPointsProcedure.execute(world, x, y, z), 81, 73, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnTotalPointsProcedure.execute(world, x, y, z), 58, 15, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		name = new EditBox(this.font, this.leftPos + 34, this.topPos + 171, 142, 18, Component.translatable("gui.farout.space_station_blueprint_gui.name")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.space_station_blueprint_gui.name").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.space_station_blueprint_gui.name").getString());
				else
					setSuggestion(null);
			}
		};
		name.setSuggestion(Component.translatable("gui.farout.space_station_blueprint_gui.name").getString());
		name.setMaxLength(32767);
		guistate.put("text:name", name);
		this.addWidget(this.name);
		imagebutton_arrow_pressed = new ImageButton(this.leftPos + 114, this.topPos + 35, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_pressed.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(0, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_pressed", imagebutton_arrow_pressed);
		this.addRenderableWidget(imagebutton_arrow_pressed);
		imagebutton_arrow = new ImageButton(this.leftPos + 114, this.topPos + 71, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(1, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
		imagebutton_arrow1 = new ImageButton(this.leftPos + 114, this.topPos + 53, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow1.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow1", imagebutton_arrow1);
		this.addRenderableWidget(imagebutton_arrow1);
		imagebutton_arrow_left = new ImageButton(this.leftPos + 69, this.topPos + 71, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(3, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
		imagebutton_arrow_left1 = new ImageButton(this.leftPos + 69, this.topPos + 53, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(4, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left1", imagebutton_arrow_left1);
		this.addRenderableWidget(imagebutton_arrow_left1);
		imagebutton_arrow_left2 = new ImageButton(this.leftPos + 69, this.topPos + 35, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(5, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left2", imagebutton_arrow_left2);
		this.addRenderableWidget(imagebutton_arrow_left2);
		imagebutton_arrow_left3 = new ImageButton(this.leftPos + 24, this.topPos + 215, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(6, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left3", imagebutton_arrow_left3);
		this.addRenderableWidget(imagebutton_arrow_left3);
		imagebutton_approve_blueprint = new ImageButton(this.leftPos + 159, this.topPos + 197, 32, 32, 0, 0, 32, new ResourceLocation("farout:textures/screens/atlas/imagebutton_approve_blueprint.png"), 32, 64, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(7, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_approve_blueprint", imagebutton_approve_blueprint);
		this.addRenderableWidget(imagebutton_approve_blueprint);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 141, this.topPos + 215, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new SpaceStationBlueprintGUIButtonMessage(8, x, y, z));
				SpaceStationBlueprintGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow2", imagebutton_arrow2);
		this.addRenderableWidget(imagebutton_arrow2);
	}
}
