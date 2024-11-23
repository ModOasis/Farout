package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.RocketAssemblyManagerGUIMenu;
import net.mcreator.far_out.procedures.ReturnIngredient3Procedure;
import net.mcreator.far_out.procedures.ReturnIngredient2Procedure;
import net.mcreator.far_out.procedures.ReturnIngredient1Procedure;
import net.mcreator.far_out.procedures.ItemPlaceholderVisibilityProcedure;
import net.mcreator.far_out.procedures.Fraction3Procedure;
import net.mcreator.far_out.procedures.Fraction2Procedure;
import net.mcreator.far_out.procedures.Fraction1Procedure;
import net.mcreator.far_out.procedures.FairingHabProcedure;
import net.mcreator.far_out.procedures.FairingDeltaVProcedure;
import net.mcreator.far_out.network.RocketAssemblyManagerGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RocketAssemblyManagerGUIScreen extends AbstractContainerScreen<RocketAssemblyManagerGUIMenu> {
	private final static HashMap<String, Object> guistate = RocketAssemblyManagerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_launch;
	Button button_empty;
	ImageButton imagebutton_1712134285;
	ImageButton imagebutton_arrowup;

	public RocketAssemblyManagerGUIScreen(RocketAssemblyManagerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 281;
		this.imageHeight = 179;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/rocket_assembly_manager_gui.png");

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
		if (ItemPlaceholderVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/paper.png"), this.leftPos + 5, this.topPos + 22, 0, 0, 16, 16, 16, 16);
		}

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/aluminium_ingot.png"), this.leftPos + 50, this.topPos + 22, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocket_assembly_manager_gui.label_rocket_stats"), 5, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocket_assembly_manager_gui.label_dv"), 5, 40, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocket_assembly_manager_gui.label_habitation_time"), 5, 58, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingDeltaVProcedure.execute(world, x, y, z, entity), 5, 49, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingHabProcedure.execute(world, x, y, z, entity), 5, 67, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.rocket_assembly_manager_gui.label_items_needed"), 104, 22, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnIngredient1Procedure.execute(world, x, y, z), 104, 31, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnIngredient2Procedure.execute(world, x, y, z), 104, 49, -12829636, false);
		guiGraphics.drawString(this.font,

				Fraction2Procedure.execute(world, x, y, z), 104, 58, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnIngredient3Procedure.execute(world, x, y, z), 104, 67, -12829636, false);
		guiGraphics.drawString(this.font,

				Fraction1Procedure.execute(world, x, y, z), 104, 40, -12829636, false);
		guiGraphics.drawString(this.font,

				Fraction3Procedure.execute(world, x, y, z), 104, 76, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_launch = Button.builder(Component.translatable("gui.farout.rocket_assembly_manager_gui.button_launch"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketAssemblyManagerGUIButtonMessage(0, x, y, z));
				RocketAssemblyManagerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 212, this.topPos + 40, 56, 20).build();
		guistate.put("button:button_launch", button_launch);
		this.addRenderableWidget(button_launch);
		button_empty = new PlainTextButton(this.leftPos + 122, this.topPos + 4, 36, 20, Component.translatable("gui.farout.rocket_assembly_manager_gui.button_empty"), e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketAssemblyManagerGUIButtonMessage(1, x, y, z));
				RocketAssemblyManagerGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		imagebutton_1712134285 = new ImageButton(this.leftPos + 194, this.topPos + 85, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_1712134285.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketAssemblyManagerGUIButtonMessage(2, x, y, z));
				RocketAssemblyManagerGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_1712134285", imagebutton_1712134285);
		this.addRenderableWidget(imagebutton_1712134285);
		imagebutton_arrowup = new ImageButton(this.leftPos + 194, this.topPos + 22, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrowup.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new RocketAssemblyManagerGUIButtonMessage(3, x, y, z));
				RocketAssemblyManagerGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrowup", imagebutton_arrowup);
		this.addRenderableWidget(imagebutton_arrowup);
	}
}
