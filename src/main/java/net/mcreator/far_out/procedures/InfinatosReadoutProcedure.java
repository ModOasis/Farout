package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class InfinatosReadoutProcedure {
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
			DeltaV = 38000;
			OrbitalPeriod = 56;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			Interplanetry = true;
			DeltaV = 38000;
			OrbitalPeriod = 56;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			Interplanetry = true;
			DeltaV = 29000;
			OrbitalPeriod = 55;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			Interplanetry = true;
			DeltaV = 25000;
			OrbitalPeriod = 82;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			Interplanetry = true;
			DeltaV = 25000;
			OrbitalPeriod = 82;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			Interplanetry = true;
			DeltaV = 12000;
			OrbitalPeriod = 106;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			Interplanetry = true;
			DeltaV = 12000;
			OrbitalPeriod = 106;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			Interplanetry = true;
			DeltaV = 12000;
			OrbitalPeriod = 106;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		}
		return "Infinatos: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
