package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class ZevReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")))) {
			DeltaV = 216;
			OrbitalPeriod = 250;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")))) {
			DeltaV = 113;
			OrbitalPeriod = 119;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")))) {
			DeltaV = 52;
			OrbitalPeriod = 300;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")))) {
			DeltaV = 52;
			OrbitalPeriod = 300;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")))) {
			DeltaV = 24;
			OrbitalPeriod = 372;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")))) {
			DeltaV = 24;
			OrbitalPeriod = 1.6;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
		}
		return "Required \u0394V:" + DeltaV + "Km/s";
	}
}
