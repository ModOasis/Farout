package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RecipesGUIMenu;
import net.mcreator.far_out.network.RecipesGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RecipesGUIScreen extends AbstractContainerScreen<RecipesGUIMenu> {
	private final static HashMap<String, Object> guistate = RecipesGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_rocketry_and_space_travel;
	Button button_recipes;
	Button button_fuel_cell_recipes;
	Button button_nuclear_reactor_recipes;
	Button button_polymerizer_recipes;
	Button button_fusion_reactor_recipes;

	public RecipesGUIScreen(RecipesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 242;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/recipes_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.recipes_gui.label_table_of_contents"), 24, 9, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_rocketry_and_space_travel = new PlainTextButton(this.leftPos + 15, this.topPos + 36, 108, 20, Component.translatable("gui.farout.recipes_gui.button_rocketry_and_space_travel"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RecipesGUIButtonMessage(0, x, y, z));
				RecipesGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_rocketry_and_space_travel", button_rocketry_and_space_travel);
		this.addRenderableWidget(button_rocketry_and_space_travel);
		button_recipes = new PlainTextButton(this.leftPos + 15, this.topPos + 63, 144, 20, Component.translatable("gui.farout.recipes_gui.button_recipes"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RecipesGUIButtonMessage(1, x, y, z));
				RecipesGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_recipes", button_recipes);
		this.addRenderableWidget(button_recipes);
		button_fuel_cell_recipes = new PlainTextButton(this.leftPos + 15, this.topPos + 117, 113, 20, Component.translatable("gui.farout.recipes_gui.button_fuel_cell_recipes"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RecipesGUIButtonMessage(2, x, y, z));
				RecipesGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_fuel_cell_recipes", button_fuel_cell_recipes);
		this.addRenderableWidget(button_fuel_cell_recipes);
		button_nuclear_reactor_recipes = new PlainTextButton(this.leftPos + 15, this.topPos + 144, 145, 20, Component.translatable("gui.farout.recipes_gui.button_nuclear_reactor_recipes"), e -> {
		}, this.font);
		guistate.put("button:button_nuclear_reactor_recipes", button_nuclear_reactor_recipes);
		this.addRenderableWidget(button_nuclear_reactor_recipes);
		button_polymerizer_recipes = new PlainTextButton(this.leftPos + 15, this.topPos + 90, 124, 20, Component.translatable("gui.farout.recipes_gui.button_polymerizer_recipes"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RecipesGUIButtonMessage(4, x, y, z));
				RecipesGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_polymerizer_recipes", button_polymerizer_recipes);
		this.addRenderableWidget(button_polymerizer_recipes);
		button_fusion_reactor_recipes = new PlainTextButton(this.leftPos + 15, this.topPos + 171, 140, 20, Component.translatable("gui.farout.recipes_gui.button_fusion_reactor_recipes"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RecipesGUIButtonMessage(5, x, y, z));
				RecipesGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_fusion_reactor_recipes", button_fusion_reactor_recipes);
		this.addRenderableWidget(button_fusion_reactor_recipes);
	}
}
