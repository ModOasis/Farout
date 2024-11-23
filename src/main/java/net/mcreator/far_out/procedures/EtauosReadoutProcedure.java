package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.C;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class EtauosReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		Entity TargetEntity = null;
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		double MaxDeltaV = 0;
		double FullTransfer = 0;
		boolean Interplanetry = false;
		boolean I = false;
		boolean C = false;
		boolean R = false;
		boolean Result = false;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))) {
			Interplanetry = true;
			DeltaV = 38000;
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			Interplanetry = true;
			DeltaV = 38000;
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			Interplanetry = true;
			DeltaV = 10000;
			OrbitalPeriod = 25;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			Interplanetry = false;
			DeltaV = 5000;
			OrbitalPeriod = 1;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 53;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 53;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 53;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			Interplanetry = true;
			DeltaV = 25000;
			OrbitalPeriod = 82;
		}
		return "Etauos: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
