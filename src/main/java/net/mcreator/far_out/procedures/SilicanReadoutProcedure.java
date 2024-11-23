package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class SilicanReadoutProcedure {
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
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			Interplanetry = true;
			DeltaV = 36000;
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			Interplanetry = true;
			DeltaV = 22000;
			OrbitalPeriod = 41;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 53;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 53;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			Interplanetry = false;
			DeltaV = 8000;
			OrbitalPeriod = 1.34;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			Interplanetry = false;
			DeltaV = 4000;
			OrbitalPeriod = 1.83;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			Interplanetry = true;
			DeltaV = 12000;
			OrbitalPeriod = 106;
		}
		return "Silican: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
