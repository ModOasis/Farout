package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class EtauiReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		Entity TargetEntity = null;
		boolean Interplanetry = false;
		boolean Result = false;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))) {
			DeltaV = 38000;
			OrbitalPeriod = 15.5;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			DeltaV = 38000;
			OrbitalPeriod = 15.5;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			DeltaV = 10000;
			OrbitalPeriod = 25;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
			Interplanetry = false;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			DeltaV = 5000;
			OrbitalPeriod = 1;
			Interplanetry = false;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			DeltaV = 24000;
			OrbitalPeriod = 53;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			DeltaV = 24000;
			OrbitalPeriod = 53;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			DeltaV = 24000;
			OrbitalPeriod = 53;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			DeltaV = 25000;
			OrbitalPeriod = 82;
			Interplanetry = true;
		}
		return "Etaui: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
