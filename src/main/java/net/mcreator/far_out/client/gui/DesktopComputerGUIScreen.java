package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.DesktopComputerGUIMenu;
import net.mcreator.far_out.network.DesktopComputerGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DesktopComputerGUIScreen extends AbstractContainerScreen<DesktopComputerGUIMenu> {
	private final static HashMap<String, Object> guistate = DesktopComputerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_starship_button;
	ImageButton imagebutton_missioncontrol;

	public DesktopComputerGUIScreen(DesktopComputerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 199;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/desktop_computer_gui.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/wallpaper1blurred.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 200, 200, 200, 200);

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
		imagebutton_starship_button = new ImageButton(this.leftPos + 9, this.topPos + 157, 32, 32, 0, 0, 32, new ResourceLocation("farout:textures/screens/atlas/imagebutton_starship_button.png"), 32, 64, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesktopComputerGUIButtonMessage(0, x, y, z));
				DesktopComputerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_starship_button", imagebutton_starship_button);
		this.addRenderableWidget(imagebutton_starship_button);
		imagebutton_missioncontrol = new ImageButton(this.leftPos + 45, this.topPos + 157, 32, 32, 0, 0, 32, new ResourceLocation("farout:textures/screens/atlas/imagebutton_missioncontrol.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_missioncontrol", imagebutton_missioncontrol);
		this.addRenderableWidget(imagebutton_missioncontrol);
	}
}
