package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class MojaReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")))) {
			DeltaV = 108;
			OrbitalPeriod = 13.6;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")))) {
			DeltaV = 69;
			OrbitalPeriod = 26;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")))) {
			DeltaV = 69;
			OrbitalPeriod = 26;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")))) {
			DeltaV = 89;
			OrbitalPeriod = 47;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")))) {
			DeltaV = 113;
			OrbitalPeriod = 119;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")))) {
			DeltaV = 113;
			OrbitalPeriod = 119;
		}
		return "Required \u0394V:" + DeltaV + "Km/s";
	}
}
