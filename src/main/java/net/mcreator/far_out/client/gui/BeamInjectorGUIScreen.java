package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.BeamInjectorGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BeamInjectorGUIScreen extends AbstractContainerScreen<BeamInjectorGUIMenu> {
	private final static HashMap<String, Object> guistate = BeamInjectorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_protom_beam;
	Button button_electron_beam;
	Button button_fire_beam;

	public BeamInjectorGUIScreen(BeamInjectorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 202;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/beam_injector_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/protonbeam.png"), this.leftPos + 10, this.topPos + 70, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/electronbeam.png"), this.leftPos + 100, this.topPos + 70, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.beam_injector_gui.label_linear_accelerator_beam_configur"), 3, 14, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_protom_beam = Button.builder(Component.translatable("gui.farout.beam_injector_gui.button_protom_beam"), e -> {
		}).bounds(this.leftPos + 10, this.topPos + 52, 82, 20).build();
		guistate.put("button:button_protom_beam", button_protom_beam);
		this.addRenderableWidget(button_protom_beam);
		button_electron_beam = Button.builder(Component.translatable("gui.farout.beam_injector_gui.button_electron_beam"), e -> {
		}).bounds(this.leftPos + 100, this.topPos + 52, 93, 20).build();
		guistate.put("button:button_electron_beam", button_electron_beam);
		this.addRenderableWidget(button_electron_beam);
		button_fire_beam = Button.builder(Component.translatable("gui.farout.beam_injector_gui.button_fire_beam"), e -> {
		}).bounds(this.leftPos + 55, this.topPos + 106, 77, 20).build();
		guistate.put("button:button_fire_beam", button_fire_beam);
		this.addRenderableWidget(button_fire_beam);
	}
}
