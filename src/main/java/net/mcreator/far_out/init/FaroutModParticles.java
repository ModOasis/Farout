
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.far_out.client.particle.SulfuricAcidRainParticle;
import net.mcreator.far_out.client.particle.HydrogenFluorideMistParticle;
import net.mcreator.far_out.client.particle.CopperWireParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FaroutModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FaroutModParticleTypes.SULFURIC_ACID_RAIN.get(), SulfuricAcidRainParticle::provider);
		event.registerSpriteSet(FaroutModParticleTypes.HYDROGEN_FLUORIDE_MIST.get(), HydrogenFluorideMistParticle::provider);
		event.registerSpriteSet(FaroutModParticleTypes.COPPER_WIRE_PARTICLE.get(), CopperWireParticleParticle::provider);
	}
}
