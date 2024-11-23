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
		Entity TargetEntity = null;
		boolean InterplanatryCapable = false;
		boolean Interplanetry = false;
		boolean Result = false;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			Interplanetry = false;
			DeltaV = 10000;
			OrbitalPeriod = 0.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 8;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			Interplanetry = true;
			DeltaV = 38000;
			OrbitalPeriod = 16;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			Interplanetry = true;
			DeltaV = 38000;
			OrbitalPeriod = 16;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			Interplanetry = true;
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 56;
		}
		return "Proxmai: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
