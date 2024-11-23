
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.far_out.client.renderer.TrihassianSolderRenderer;
import net.mcreator.far_out.client.renderer.TrihassianRenderer;
import net.mcreator.far_out.client.renderer.SentinelRenderer;
import net.mcreator.far_out.client.renderer.LaunchVehicleRenderer;
import net.mcreator.far_out.client.renderer.LanderRenderer;
import net.mcreator.far_out.client.renderer.KarvonWarpshipRenderer;
import net.mcreator.far_out.client.renderer.HapoliteRenderer;
import net.mcreator.far_out.client.renderer.CargoSSTORenderer;
import net.mcreator.far_out.client.renderer.BulletRenderer;
import net.mcreator.far_out.client.renderer.AstralDragonRenderer;
import net.mcreator.far_out.client.renderer.AncientDroneRenderer;
import net.mcreator.far_out.client.renderer.AetherianConquerorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FaroutModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FaroutModEntities.LAUNCH_VEHICLE.get(), LaunchVehicleRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.LANDER.get(), LanderRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.CARGO_SSTO.get(), CargoSSTORenderer::new);
		event.registerEntityRenderer(FaroutModEntities.AETHERIAN_CONQUEROR.get(), AetherianConquerorRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.RAILGUN_ROD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.ASTRAL_DRAGON.get(), AstralDragonRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.KARVON_WARPSHIP.get(), KarvonWarpshipRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.ANCIENT_DRONE.get(), AncientDroneRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.SENTINEL.get(), SentinelRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.TRIHASSIAN.get(), TrihassianRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.BULLET.get(), BulletRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.TRIHASSIAN_SOLDER.get(), TrihassianSolderRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.ATOMIC_BOMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FaroutModEntities.HAPOLITE.get(), HapoliteRenderer::new);
	}
}
