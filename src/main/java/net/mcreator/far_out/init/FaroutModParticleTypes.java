
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.far_out.FaroutMod;

public class FaroutModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, FaroutMod.MODID);
	public static final RegistryObject<SimpleParticleType> SULFURIC_ACID_RAIN = REGISTRY.register("sulfuric_acid_rain", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> HYDROGEN_FLUORIDE_MIST = REGISTRY.register("hydrogen_fluoride_mist", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> COPPER_WIRE_PARTICLE = REGISTRY.register("copper_wire_particle", () -> new SimpleParticleType(true));
}
