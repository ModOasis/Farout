package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.StarshipComponentsGUIMenu;
import net.mcreator.far_out.procedures.StarshipCoreDisplayProcedure;
import net.mcreator.far_out.procedures.SpacecraftConstructionMaterialsDisplayProcedure;
import net.mcreator.far_out.procedures.LanderBayDisplayProcedure;
import net.mcreator.far_out.procedures.InterstellarHabitationModuleDisplayProcedure;
import net.mcreator.far_out.procedures.HighHeatLoadGraphineRadiatorsDisplayProcedure;
import net.mcreator.far_out.procedures.FissionFragmentFuelTankDisplayProcedure;
import net.mcreator.far_out.procedures.FissionFragmentEngineDisplayProcedure;
import net.mcreator.far_out.procedures.CargoContainerDisplayProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StarshipComponentsGUIScreen extends AbstractContainerScreen<StarshipComponentsGUIMenu> {
	private final static HashMap<String, Object> guistate = StarshipComponentsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StarshipComponentsGUIScreen(StarshipComponentsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/starship_components_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 8 && mouseX < leftPos + 64 && mouseY > topPos + 59 && mouseY < topPos + 111)
			guiGraphics.renderTooltip(font, Component.literal(FissionFragmentEngineDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 66 && mouseX < leftPos + 95 && mouseY > topPos + 68 && mouseY < topPos + 96)
			guiGraphics.renderTooltip(font, Component.literal(FissionFragmentFuelTankDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 268 && mouseX < leftPos + 308 && mouseY > topPos + 71 && mouseY < topPos + 95)
			guiGraphics.renderTooltip(font, Component.literal(StarshipCoreDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 366 && mouseX < leftPos + 410 && mouseY > topPos + 71 && mouseY < topPos + 96)
			guiGraphics.renderTooltip(font, Component.literal(InterstellarHabitationModuleDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 105 && mouseX < leftPos + 145 && mouseY > topPos + 75 && mouseY < topPos + 90)
			guiGraphics.renderTooltip(font, Component.literal(CargoContainerDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 155 && mouseX < leftPos + 193 && mouseY > topPos + 76 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.literal(CargoContainerDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 213 && mouseX < leftPos + 246 && mouseY > topPos + 77 && mouseY < topPos + 89)
			guiGraphics.renderTooltip(font, Component.literal(CargoContainerDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 96 && mouseX < leftPos + 264 && mouseY > topPos + 91 && mouseY < topPos + 125)
			guiGraphics.renderTooltip(font, Component.literal(HighHeatLoadGraphineRadiatorsDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 95 && mouseX < leftPos + 264 && mouseY > topPos + 42 && mouseY < topPos + 78)
			guiGraphics.renderTooltip(font, Component.literal(HighHeatLoadGraphineRadiatorsDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 307 && mouseX < leftPos + 362 && mouseY > topPos + 67 && mouseY < topPos + 104)
			guiGraphics.renderTooltip(font, Component.literal(LanderBayDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 394 && mouseX < leftPos + 418 && mouseY > topPos + 45 && mouseY < topPos + 69)
			guiGraphics.renderTooltip(font, Component.literal(SpacecraftConstructionMaterialsDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 397 && mouseX < leftPos + 421 && mouseY > topPos + 98 && mouseY < topPos + 122)
			guiGraphics.renderTooltip(font, Component.literal(SpacecraftConstructionMaterialsDisplayProcedure.execute(world)), mouseX, mouseY);
		if (mouseX > leftPos + 412 && mouseX < leftPos + 426 && mouseY > topPos + 46 && mouseY < topPos + 103)
			guiGraphics.renderTooltip(font, Component.literal(SpacecraftConstructionMaterialsDisplayProcedure.execute(world)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/starshipcomponents.png"), this.leftPos + -15, this.topPos + 34, 0, 0, 453, 100, 453, 100);

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
