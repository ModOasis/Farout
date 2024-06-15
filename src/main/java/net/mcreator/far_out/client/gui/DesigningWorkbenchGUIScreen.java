package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.DesigningWorkbenchGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DesigningWorkbenchGUIScreen extends AbstractContainerScreen<DesigningWorkbenchGUIMenu> {
	private final static HashMap<String, Object> guistate = DesigningWorkbenchGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow;
	ImageButton imagebutton_arrow_left;

	public DesigningWorkbenchGUIScreen(DesigningWorkbenchGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 358;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/designing_workbench_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/canvas.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 360, 240, 360, 240);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/chemical_propulsion_small.png"), this.leftPos + 52, this.topPos + 143, 0, 0, 32, 64, 32, 64);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/solar_generator.png"), this.leftPos + 36, this.topPos + 129, 0, 0, 64, 32, 64, 32);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/basic_habitation.png"), this.leftPos + 52, this.topPos + 115, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_habitation_module"), 115, 17, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_control_unit"), 115, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_electric_generator"), 115, 71, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_propulsion_system"), 115, 107, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_surplus_wattage"), 115, 161, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_habitation_time"), 115, 188, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_dv"), 115, 206, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow = new ImageButton(this.leftPos + 205, this.topPos + 26, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
		imagebutton_arrow_left = new ImageButton(this.leftPos + 97, this.topPos + 26, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
	}
}
