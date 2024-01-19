package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Mass;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class ProxmaiReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		boolean InterplanatryCapable = false;
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		double Mass = 0;
		double FuelCapacity = 0;
		double FuelFraction = 0;
		double WetMass = 0;
		double ISP = 0;
		double TotalWatts = 0;
		double ExhaustVelocity = 0;
		double Watts = 0;
		double HabitationTime = 0;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")))) {
			DeltaV = 10;
			OrbitalPeriod = 0.5;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")))) {
			DeltaV = 88;
			OrbitalPeriod = 8;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))) {
			DeltaV = 112;
			OrbitalPeriod = 16;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
			DeltaV = 112;
			OrbitalPeriod = 16;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")))) {
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")))) {
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")))) {
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")))) {
			DeltaV = 136;
			OrbitalPeriod = 56;
		}
		return "Required \u0394V:" + DeltaV + "Km/s" + ",," + "Proxmai/, a airless superearth/, is rich in resources/,, and is accompanied by one moon/, Vulcan. ";
	}
}
