package net.mcreator.far_out.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.far_out.world.inventory.DesigningWorkbenchGUIMenu;
import net.mcreator.far_out.procedures.SolidCoreNuclearThermalRocketVisibilityProcedure;
import net.mcreator.far_out.procedures.SolarPanelsVisibilityProcedure;
import net.mcreator.far_out.procedures.ReturnPropulsionModuleProcedure;
import net.mcreator.far_out.procedures.ReturnPowerSourceProcedure;
import net.mcreator.far_out.procedures.ReturnHabitationModuleProcedure;
import net.mcreator.far_out.procedures.ReturnControlModuleProcedure;
import net.mcreator.far_out.procedures.NuclearSaltWaterRocketVisibilityProcedure;
import net.mcreator.far_out.procedures.NuclearReactorVisibilityProcedure;
import net.mcreator.far_out.procedures.MirrorCellRocketVisibilityProcedure;
import net.mcreator.far_out.procedures.MicrowaveElectrothermalVisibilityProcedure;
import net.mcreator.far_out.procedures.MagnetoplasmaThrusterProcedure;
import net.mcreator.far_out.procedures.InflatableHabitatVisiblityProcedure;
import net.mcreator.far_out.procedures.InflatableCentrifugeVisibilityProcedure;
import net.mcreator.far_out.procedures.GasCoreNuclearThermalRocketVisibilityProcedure;
import net.mcreator.far_out.procedures.FairingWattageProcedure;
import net.mcreator.far_out.procedures.FairingHabProcedure;
import net.mcreator.far_out.procedures.FairingDeltaVProcedure;
import net.mcreator.far_out.procedures.ChemicalRocketVisibilityProcedure;
import net.mcreator.far_out.procedures.BasicHabVisibiltyConditionProcedure;
import net.mcreator.far_out.procedures.AntimatterPlasmaEngineVisibilityProcedure;
import net.mcreator.far_out.network.DesigningWorkbenchGUIButtonMessage;
import net.mcreator.far_out.FaroutMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DesigningWorkbenchGUIScreen extends AbstractContainerScreen<DesigningWorkbenchGUIMenu> {
	private final static HashMap<String, Object> guistate = DesigningWorkbenchGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Name;
	ImageButton imagebutton_arrow;
	ImageButton imagebutton_arrow_left;
	ImageButton imagebutton_arrow_left1;
	ImageButton imagebutton_arrow1;
	ImageButton imagebutton_arrow3;
	ImageButton imagebutton_arrow_left3;
	ImageButton imagebutton_arrow2;
	ImageButton imagebutton_arrow_left2;
	ImageButton imagebutton_approve_blueprint;

	public DesigningWorkbenchGUIScreen(DesigningWorkbenchGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 358;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("farout:textures/screens/designing_workbench_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Name.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("farout:textures/screens/canvas.png"), this.leftPos + 1, this.topPos + -1, 0, 0, 360, 240, 360, 240);

		if (ChemicalRocketVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/chemical_propulsion_small.png"), this.leftPos + 44, this.topPos + 53, 0, 0, 32, 64, 32, 64);
		}
		if (SolarPanelsVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/solar_generator.png"), this.leftPos + 28, this.topPos + 39, 0, 0, 64, 32, 64, 32);
		}
		if (BasicHabVisibiltyConditionProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/basic_habitation.png"), this.leftPos + 44, this.topPos + 25, 0, 0, 32, 32, 32, 32);
		}
		if (InflatableHabitatVisiblityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/inflatable_habitat.png"), this.leftPos + 43, this.topPos + -8, 0, 0, 32, 64, 32, 64);
		}
		if (InflatableCentrifugeVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/inflatable_centrifuge.png"), this.leftPos + 27, this.topPos + 24, 0, 0, 64, 32, 64, 32);
		}
		if (SolidCoreNuclearThermalRocketVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/solid_core_nuclear_thermal_propulsion_small.png"), this.leftPos + 44, this.topPos + 64, 0, 0, 32, 80, 32, 80);
		}
		if (GasCoreNuclearThermalRocketVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/gas_core_nuclear_thermal_propulsion.png"), this.leftPos + 44, this.topPos + 64, 0, 0, 32, 80, 32, 80);
		}
		if (NuclearReactorVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/nuclear_reactor.png"), this.leftPos + 31, this.topPos + 37, 0, 0, 64, 32, 64, 32);
		}
		if (MagnetoplasmaThrusterProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/magnetoplasma_thruster.png"), this.leftPos + 43, this.topPos + 50, 0, 0, 32, 64, 32, 64);
		}
		if (MicrowaveElectrothermalVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/hall_efffect_thruster.png"), this.leftPos + 44, this.topPos + 45, 0, 0, 32, 64, 32, 64);
		}
		if (NuclearSaltWaterRocketVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/nuclear_salt_water_rocket.png"), this.leftPos + 44, this.topPos + 53, 0, 0, 32, 64, 32, 64);
		}
		if (MirrorCellRocketVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/mirror_cell_fusion_rocket.png"), this.leftPos + 43, this.topPos + 48, 0, 0, 32, 100, 32, 100);
		}
		if (AntimatterPlasmaEngineVisibilityProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("farout:textures/screens/antimatter_engine.png"), this.leftPos + 44, this.topPos + 54, 0, 0, 32, 64, 32, 64);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (Name.isFocused())
			return Name.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Name.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_habitation_module"), 115, 17, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_control_unit"), 115, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_electric_generator"), 115, 71, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_propulsion_system"), 115, 107, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_surplus_wattage"), 133, 136, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_habitation_time"), 133, 160, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.farout.designing_workbench_gui.label_dv"), 133, 185, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnHabitationModuleProcedure.execute(world, x, y, z), 96, 28, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnPropulsionModuleProcedure.execute(world, x, y, z), 91, 119, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnControlModuleProcedure.execute(world, x, y, z), 99, 57, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingDeltaVProcedure.execute(world, x, y, z, entity), 133, 194, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingHabProcedure.execute(world, x, y, z, entity), 133, 169, -12829636, false);
		guiGraphics.drawString(this.font,

				FairingWattageProcedure.execute(world, x, y, z, entity), 133, 145, -12829636, false);
		guiGraphics.drawString(this.font,

				ReturnPowerSourceProcedure.execute(world, x, y, z), 91, 83, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		Name = new EditBox(this.font, this.leftPos + 68, this.topPos + 207, 118, 18, Component.translatable("gui.farout.designing_workbench_gui.Name")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.designing_workbench_gui.Name").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.farout.designing_workbench_gui.Name").getString());
				else
					setSuggestion(null);
			}
		};
		Name.setSuggestion(Component.translatable("gui.farout.designing_workbench_gui.Name").getString());
		Name.setMaxLength(32767);
		guistate.put("text:Name", Name);
		this.addWidget(this.Name);
		imagebutton_arrow = new ImageButton(this.leftPos + 209, this.topPos + 26, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(0, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow", imagebutton_arrow);
		this.addRenderableWidget(imagebutton_arrow);
		imagebutton_arrow_left = new ImageButton(this.leftPos + 84, this.topPos + 26, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(1, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left", imagebutton_arrow_left);
		this.addRenderableWidget(imagebutton_arrow_left);
		imagebutton_arrow_left1 = new ImageButton(this.leftPos + 88, this.topPos + 53, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(2, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left1", imagebutton_arrow_left1);
		this.addRenderableWidget(imagebutton_arrow_left1);
		imagebutton_arrow1 = new ImageButton(this.leftPos + 211, this.topPos + 52, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow1.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(3, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow1", imagebutton_arrow1);
		this.addRenderableWidget(imagebutton_arrow1);
		imagebutton_arrow3 = new ImageButton(this.leftPos + 212, this.topPos + 115, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(4, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow3", imagebutton_arrow3);
		this.addRenderableWidget(imagebutton_arrow3);
		imagebutton_arrow_left3 = new ImageButton(this.leftPos + 79, this.topPos + 116, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left3.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(5, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left3", imagebutton_arrow_left3);
		this.addRenderableWidget(imagebutton_arrow_left3);
		imagebutton_arrow2 = new ImageButton(this.leftPos + 211, this.topPos + 80, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(6, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow2", imagebutton_arrow2);
		this.addRenderableWidget(imagebutton_arrow2);
		imagebutton_arrow_left2 = new ImageButton(this.leftPos + 79, this.topPos + 80, 16, 16, 0, 0, 16, new ResourceLocation("farout:textures/screens/atlas/imagebutton_arrow_left2.png"), 16, 32, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(7, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		});
		guistate.put("button:imagebutton_arrow_left2", imagebutton_arrow_left2);
		this.addRenderableWidget(imagebutton_arrow_left2);
		imagebutton_approve_blueprint = new ImageButton(this.leftPos + 27, this.topPos + 199, 32, 32, 0, 0, 32, new ResourceLocation("farout:textures/screens/atlas/imagebutton_approve_blueprint.png"), 32, 64, e -> {
			if (true) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DesigningWorkbenchGUIButtonMessage(8, x, y, z));
				DesigningWorkbenchGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		});
		guistate.put("button:imagebutton_approve_blueprint", imagebutton_approve_blueprint);
		this.addRenderableWidget(imagebutton_approve_blueprint);
	}
}
