package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class CarbosReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		Entity TargetEntity = null;
		boolean Interplanetry = false;
		boolean Result = false;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja"))) {
			Interplanetry = true;
			DeltaV = 54000;
			OrbitalPeriod = 13.6;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona"))) {
			Interplanetry = true;
			DeltaV = 90000;
			OrbitalPeriod = 40;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"))) {
			Interplanetry = true;
			DeltaV = 90000;
			OrbitalPeriod = 40;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus"))) {
			Interplanetry = true;
			DeltaV = 100000;
			OrbitalPeriod = 80;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax"))) {
			Interplanetry = true;
			DeltaV = 11000;
			OrbitalPeriod = 250;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))) {
			Interplanetry = true;
			DeltaV = 11000;
			OrbitalPeriod = 250;
		}
		return "Carbos: " + "\u0394V: " + DeltaV + " Hab time:" + OrbitalPeriod;
	}
}
