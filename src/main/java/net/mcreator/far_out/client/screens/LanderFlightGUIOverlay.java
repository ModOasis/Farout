
package net.mcreator.far_out.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.far_out.procedures.VerticalSpeedProcedure;
import net.mcreator.far_out.procedures.ReturnSelectedSpacecraftProcedure;
import net.mcreator.far_out.procedures.LanderFlightGUIDisplayOverlayIngameProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class LanderFlightGUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (LanderFlightGUIDisplayOverlayIngameProcedure.execute(entity)) {
			event.getGuiGraphics().blit(new ResourceLocation("farout:textures/screens/landerui.png"), 0, 0, 0, 0, w, h, w, h);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.farout.lander_flight_gui.label_h_speed"), w / 2 + -140, h - 26, -6710887, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.farout.lander_flight_gui.label_target_spacecraft"), w / 2 + -38, 3, -6710887, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.farout.lander_flight_gui.label_target_speed"), w / 2 + 49, h - 27, -6710887, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					VerticalSpeedProcedure.execute(entity), w / 2 + -140, h - 14, -14638336, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					ReturnSelectedSpacecraftProcedure.execute(entity), w / 2 + -49, h / 2 + -105, -16142592, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
