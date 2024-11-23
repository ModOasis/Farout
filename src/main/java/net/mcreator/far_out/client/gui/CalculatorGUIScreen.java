package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.CalculatorGUIMenu;
import net.mcreator.far_out.procedures.ReturnCalculationProcedure;
import net.mcreator.far_out.network.CalculatorGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CalculatorGUIScreen extends AbstractContainerScreen<CalculatorGUIMenu> {
	private final static HashMap<String, Object> guistate = CalculatorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_settrajectory;
	ImageButton imagebutton_settrajectory1;
	ImageButton imagebutton_settrajectory2;
	ImageButton imagebutton_settrajectory3;
	ImageButton imagebutton_settrajectory4;
	ImageButton imagebutton_settrajectory5;
	ImageButton imagebutton_settrajectory6;
	ImageButton imagebutton_settrajectory7;
	ImageButton imagebutton_settrajectory8;
	ImageButton imagebutton_settrajectory9;
	ImageButton imagebutton_settrajectory10;
	ImageButton imagebutton_settrajectory11;
	ImageButton imagebutton_settrajectory12;
	ImageButton imagebutton_settrajectory13;
	ImageButton imagebutton_settrajectory14;
	ImageButton imagebutton_settrajectory15;

	public CalculatorGUIScreen(CalculatorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 120;
		this.imageHeight = 160;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/calculator_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/calculator.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 120, 160, 120, 160);

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
		guiGraphics.drawString(this.font,

				ReturnCalculationProcedure.execute(entity), 20, 30, -12517632, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_settrajectory = new ImageButton(this.leftPos + 19, this.topPos + 60, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(0, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory", imagebutton_settrajectory);
		this.addRenderableWidget(imagebutton_settrajectory);
		imagebutton_settrajectory1 = new ImageButton(this.leftPos + 42, this.topPos + 59, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(1, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory1", imagebutton_settrajectory1);
		this.addRenderableWidget(imagebutton_settrajectory1);
		imagebutton_settrajectory2 = new ImageButton(this.leftPos + 64, this.topPos + 60, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(2, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory2", imagebutton_settrajectory2);
		this.addRenderableWidget(imagebutton_settrajectory2);
		imagebutton_settrajectory3 = new ImageButton(this.leftPos + 19, this.topPos + 82, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(3, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory3", imagebutton_settrajectory3);
		this.addRenderableWidget(imagebutton_settrajectory3);
		imagebutton_settrajectory4 = new ImageButton(this.leftPos + 42, this.topPos + 82, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory4.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(4, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory4", imagebutton_settrajectory4);
		this.addRenderableWidget(imagebutton_settrajectory4);
		imagebutton_settrajectory5 = new ImageButton(this.leftPos + 64, this.topPos + 83, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory5.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(5, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory5", imagebutton_settrajectory5);
		this.addRenderableWidget(imagebutton_settrajectory5);
		imagebutton_settrajectory6 = new ImageButton(this.leftPos + 20, this.topPos + 105, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory6.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(6, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory6", imagebutton_settrajectory6);
		this.addRenderableWidget(imagebutton_settrajectory6);
		imagebutton_settrajectory7 = new ImageButton(this.leftPos + 42, this.topPos + 104, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory7.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(7, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory7", imagebutton_settrajectory7);
		this.addRenderableWidget(imagebutton_settrajectory7);
		imagebutton_settrajectory8 = new ImageButton(this.leftPos + 64, this.topPos + 104, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory8.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(8, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory8", imagebutton_settrajectory8);
		this.addRenderableWidget(imagebutton_settrajectory8);
		imagebutton_settrajectory9 = new ImageButton(this.leftPos + 42, this.topPos + 125, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory9.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(9, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory9", imagebutton_settrajectory9);
		this.addRenderableWidget(imagebutton_settrajectory9);
		imagebutton_settrajectory10 = new ImageButton(this.leftPos + 85, this.topPos + 59, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory10.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(10, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory10", imagebutton_settrajectory10);
		this.addRenderableWidget(imagebutton_settrajectory10);
		imagebutton_settrajectory11 = new ImageButton(this.leftPos + 86, this.topPos + 82, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory11.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(11, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory11", imagebutton_settrajectory11);
		this.addRenderableWidget(imagebutton_settrajectory11);
		imagebutton_settrajectory12 = new ImageButton(this.leftPos + 85, this.topPos + 105, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory12.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(12, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory12", imagebutton_settrajectory12);
		this.addRenderableWidget(imagebutton_settrajectory12);
		imagebutton_settrajectory13 = new ImageButton(this.leftPos + 86, this.topPos + 125, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory13.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(13, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory13", imagebutton_settrajectory13);
		this.addRenderableWidget(imagebutton_settrajectory13);
		imagebutton_settrajectory14 = new ImageButton(this.leftPos + 64, this.topPos + 125, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory14.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(14, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory14", imagebutton_settrajectory14);
		this.addRenderableWidget(imagebutton_settrajectory14);
		imagebutton_settrajectory15 = new ImageButton(this.leftPos + 20, this.topPos + 124, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory15.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new CalculatorGUIButtonMessage(15, x, y, z));
				CalculatorGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory15", imagebutton_settrajectory15);
		this.addRenderableWidget(imagebutton_settrajectory15);
	}
}
