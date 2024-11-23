package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class OceanusReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		Entity TargetEntity = null;
		boolean Interplanetry = false;
		boolean Result = false;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 8.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			Interplanetry = true;
			DeltaV = 10000;
			OrbitalPeriod = 25;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			Interplanetry = true;
			DeltaV = 10000;
			OrbitalPeriod = 25;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			Interplanetry = true;
			DeltaV = 22000;
			OrbitalPeriod = 41;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			Interplanetry = true;
			DeltaV = 22000;
			OrbitalPeriod = 41;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			Interplanetry = true;
			DeltaV = 22000;
			OrbitalPeriod = 41;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			Interplanetry = true;
			DeltaV = 29000;
			OrbitalPeriod = 55;
		}
		return "Oceanus: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
