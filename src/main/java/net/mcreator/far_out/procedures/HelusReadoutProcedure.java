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
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")))) {
			DeltaV = 196;
			OrbitalPeriod = 80;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")))) {
			DeltaV = 89;
			OrbitalPeriod = 47;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")))) {
			DeltaV = 24;
			OrbitalPeriod = 138;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")))) {
			DeltaV = 24;
			OrbitalPeriod = 138;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")))) {
			DeltaV = 24;
			OrbitalPeriod = 372;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")))) {
			DeltaV = 24;
			OrbitalPeriod = 372;
		}
		return "Required \u0394V:" + DeltaV + "Km/s";
	}
}
