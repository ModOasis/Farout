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
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")))) {
			DeltaV = 76;
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")))) {
			DeltaV = 76;
			OrbitalPeriod = 15.5;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")))) {
			DeltaV = 20;
			OrbitalPeriod = 25;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))) {
			DeltaV = 20;
			OrbitalPeriod = 53;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
			DeltaV = 20;
			OrbitalPeriod = 1;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")))) {
			DeltaV = 14;
			OrbitalPeriod = 0.7;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")))) {
			DeltaV = 4;
			OrbitalPeriod = 1.83;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")))) {
			DeltaV = 12;
			OrbitalPeriod = 106;
		}
		return "Required \u0394V:" + DeltaV + "Km/s";
	}
}
