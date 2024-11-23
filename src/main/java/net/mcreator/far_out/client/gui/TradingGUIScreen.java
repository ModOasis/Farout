package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.TradingGUIMenu;
import net.mcreator.far_out.network.TradingGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TradingGUIScreen extends AbstractContainerScreen<TradingGUIMenu> {
	private final static HashMap<String, Object> guistate = TradingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_trade;
	ImageButton imagebutton_settrajectory;

	public TradingGUIScreen(TradingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 253;
		this.imageHeight = 183;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/trading_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/item_slots.png"), this.leftPos + 13, this.topPos + 17, 0, 0, 50, 150, 50, 150);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/arrow0.png"), this.leftPos + 153, this.topPos + 42, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.trading_gui.label_available_items"), 9, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.trading_gui.label_trihassian_salesman"), 114, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_trade = Button.builder(Component.translatable("gui.farout.trading_gui.button_trade"), e -> {
		}).bounds(this.leftPos + 134, this.topPos + 69, 51, 20).build();
		guistate.put("button:button_trade", button_trade);
		this.addRenderableWidget(button_trade);
		imagebutton_settrajectory = new ImageButton(this.leftPos + 30, this.topPos + 42, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new TradingGUIButtonMessage(1, x, y, z));
				TradingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_settrajectory", imagebutton_settrajectory);
		this.addRenderableWidget(imagebutton_settrajectory);
	}
}
