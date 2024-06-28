package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.EtauiMapMenu;
import net.mcreator.far_out.procedures.EtauosReadoutProcedure;
import net.mcreator.far_out.procedures.EtauiReadoutProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EtauiMapScreen extends AbstractContainerScreen<EtauiMapMenu> {
	private final static HashMap<String, Object> guistate = EtauiMapMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_arrow;
	ImageButton imagebutton_settrajectory;

	public EtauiMapScreen(EtauiMapMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/etaui_map.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 107 && mouseX < leftPos + 133 && mouseY > topPos + 105 && mouseY < topPos + 135)
			guiGraphics.renderTooltip(font, Component.literal(EtauiReadoutProcedure.execute(entity)), mouseX, mouseY);
		if (mouseX > leftPos + 79 && mouseX < leftPos + 93 && mouseY > topPos + 16 && mouseY < topPos + 31)
			guiGraphics.renderTooltip(font, Component.literal(EtauosReadoutProcedure.execute(entity)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/etauimap.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 240, 240, 240, 240);

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
		imagebutton_arrow = new ImageButton(this.leftPos + 274, this.topPos + 164, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
		imagebutton_settrajectory = new ImageButton(this.leftPos + 77, this.topPos + 18, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_settrajectory.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_settrajectory", imagebutton_settrajectory);
		this.addRenderableWidget(imagebutton_settrajectory);
	}
}
