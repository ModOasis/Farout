package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.IntgratedCircuitFabricatorRecipesGUIMenu;
import net.mcreator.far_out.procedures.ItemPlaceholderIngotVisibilityProcedure;
import net.mcreator.far_out.procedures.Arrow9Procedure;
import net.mcreator.far_out.procedures.Arrow8Procedure;
import net.mcreator.far_out.procedures.Arrow7Procedure;
import net.mcreator.far_out.procedures.Arrow6Procedure;
import net.mcreator.far_out.procedures.Arrow5Procedure;
import net.mcreator.far_out.procedures.Arrow4Procedure;
import net.mcreator.far_out.procedures.Arrow3Procedure;
import net.mcreator.far_out.procedures.Arrow2Procedure;
import net.mcreator.far_out.procedures.Arrow1Procedure;
import net.mcreator.far_out.procedures.Arrow10Procedure;
import net.mcreator.far_out.network.IntgratedCircuitFabricatorRecipesGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class IntgratedCircuitFabricatorRecipesGUIScreen extends AbstractContainerScreen<IntgratedCircuitFabricatorRecipesGUIMenu> {
	private final static HashMap<String, Object> guistate = IntgratedCircuitFabricatorRecipesGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow;
	ImageButton imagebutton_arrow_left;

	public IntgratedCircuitFabricatorRecipesGUIScreen(IntgratedCircuitFabricatorRecipesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 208;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/intgrated_circuit_fabricator_recipes_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow0.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		if (Arrow1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow1.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow2.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow3.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow4.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow5.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow6.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow7.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow8.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow9.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Arrow10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow10.png"), this.leftPos + 94, this.topPos + 34, 0, 0, 16, 16, 16, 16);
		}
		if (ItemPlaceholderIngotVisibilityProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/low_frequency_integrated_circuit_photomask.png"), this.leftPos + 40, this.topPos + 25, 0, 0, 16, 16, 16, 16);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.intgrated_circuit_fabricator_recipes_gui.label_integrated_circuit_fabricator"), 40, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_arrow = new ImageButton(this.leftPos + 139, this.topPos + 61, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IntgratedCircuitFabricatorRecipesGUIButtonMessage(0, x, y, z));
				IntgratedCircuitFabricatorRecipesGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
		imagebutton_arrow_left = new ImageButton(this.leftPos + 67, this.topPos + 61, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IntgratedCircuitFabricatorRecipesGUIButtonMessage(1, x, y, z));
				IntgratedCircuitFabricatorRecipesGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
	}
}
