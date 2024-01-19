package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class VulcanReadoutProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")))) {
			DeltaV = 10;
			OrbitalPeriod = 0.5;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")))) {
			DeltaV = 88;
			OrbitalPeriod = 8;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))) {
			DeltaV = 112;
			OrbitalPeriod = 16;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
			DeltaV = 112;
			OrbitalPeriod = 16;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")))) {
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")))) {
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")))) {
			DeltaV = 128;
			OrbitalPeriod = 36;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")))) {
			DeltaV = 136;
			OrbitalPeriod = 56;
		}
		return "Required \u0394V:" + DeltaV + "Km/s";
	}
}
