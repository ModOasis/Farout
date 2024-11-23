package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.MainMapMenu;
import net.mcreator.far_out.network.MainMapButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MainMapScreen extends AbstractContainerScreen<MainMapMenu> {
	private final static HashMap<String, Object> guistate = MainMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_sandos_interstellar;
	ImageButton imagebutton_1712134285;

	public MainMapScreen(MainMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 433;
		this.imageHeight = 196;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/main_map.png");

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

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 234, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + 36, this.topPos + -5, 0, 0, 200, 200, 200, 200);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/space_background.png"), this.leftPos + -162, this.topPos + -5, 0, 0, 200, 200, 200, 200);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.main_map.label_main_map"), 189, -5, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_sandos_interstellar = new ImageButton(this.leftPos + 18, this.topPos + 67, 240, 240, 0, 0, 240, new ResourceLocation("farout:textures/screens/atlas/imagebutton_sandos_interstellar.png"), 240, 480, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new MainMapButtonMessage(0, x, y, z));
				MainMapButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_sandos_interstellar", imagebutton_sandos_interstellar);
		this.addRenderableWidget(imagebutton_sandos_interstellar);
		imagebutton_1712134285 = new ImageButton(this.leftPos + 81, this.topPos + 40, 100, 100, 0, 0, 100, new ResourceLocation("farout:textures/screens/atlas/imagebutton_1712134285.png"), 100, 200, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new MainMapButtonMessage(1, x, y, z));
				MainMapButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_1712134285", imagebutton_1712134285);
		this.addRenderableWidget(imagebutton_1712134285);
	}
}
