
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.far_out.client.renderer.LaunchVehicleRenderer;
import net.mcreator.far_out.client.renderer.LanderRenderer;
import net.mcreator.far_out.client.renderer.CapsuleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FaroutModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FaroutModEntities.CAPSULE.get(), CapsuleRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.LAUNCH_VEHICLE.get(), LaunchVehicleRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.LANDER.get(), LanderRenderer::new);
	}
}
