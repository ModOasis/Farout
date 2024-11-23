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

import net.mcreator.far_out.world.inventory.AvionicsProgrammingGUIMenu;
import net.mcreator.far_out.procedures.LeavingOceanicPlanetProcedure;
import net.mcreator.far_out.procedures.LeavingATerraConditionProcedure;
import net.mcreator.far_out.procedures.LeavingALacustrinePlanetConditionProcedure;
import net.mcreator.far_out.procedures.LeavingAAirlessPlanetProcedure;
import net.mcreator.far_out.procedures.ArrivingAtATerraConditionProcedure;
import net.mcreator.far_out.procedures.ArrivingAtAOceanicPlanetProcedure;
import net.mcreator.far_out.procedures.ArrivingAtALacustrinePlanetConditionProcedure;
import net.mcreator.far_out.procedures.ArrivingAtAAirlessPlanetProcedure;
import net.mcreator.far_out.network.AvionicsProgrammingGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AvionicsProgrammingGUIScreen extends AbstractContainerScreen<AvionicsProgrammingGUIMenu> {
	private final static HashMap<String, Object> guistate = AvionicsProgrammingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_set_trajectory;

	public AvionicsProgrammingGUIScreen(AvionicsProgrammingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 190;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/avionics_programming_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/planetary_transfer_summary.png"), this.leftPos + 19, this.topPos + 37, 0, 0, 150, 50, 150, 50);

		if (LeavingATerraConditionProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/terra.png"), this.leftPos + 27, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (LeavingALacustrinePlanetConditionProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/desert.png"), this.leftPos + 27, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (LeavingAAirlessPlanetProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/moonlike.png"), this.leftPos + 27, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (LeavingOceanicPlanetProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/oceanic.png"), this.leftPos + 27, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (ArrivingAtATerraConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/terra.png"), this.leftPos + 134, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (ArrivingAtALacustrinePlanetConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/desert.png"), this.leftPos + 134, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (ArrivingAtAAirlessPlanetProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/moonlike.png"), this.leftPos + 134, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
		if (ArrivingAtAOceanicPlanetProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/oceanic.png"), this.leftPos + 134, this.topPos + 47, 0, 0, 32, 32, 32, 32);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.avionics_programming_gui.label_empty"), 84, 57, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_set_trajectory = new PlainTextButton(this.leftPos + 59, this.topPos + 69, 98, 20, Component.translatable("gui.farout.avionics_programming_gui.button_set_trajectory"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new AvionicsProgrammingGUIButtonMessage(0, x, y, z));
				AvionicsProgrammingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_set_trajectory", button_set_trajectory);
		this.addRenderableWidget(button_set_trajectory);
	}
}
