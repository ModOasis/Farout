package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class HelusReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		Entity TargetEntity = null;
		boolean Interplanetry = false;
		boolean Result = false;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos"))) {
			Interplanetry = true;
			DeltaV = 100000;
			OrbitalPeriod = 80;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja"))) {
			Interplanetry = true;
			DeltaV = 45000;
			OrbitalPeriod = 47;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 138;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 138;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus"))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 372;
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))) {
			Interplanetry = true;
			DeltaV = 24000;
			OrbitalPeriod = 372;
		}
		return "Helus: " + "\u0394V: " + DeltaV / 2 + " Hab time:" + OrbitalPeriod;
	}
}
