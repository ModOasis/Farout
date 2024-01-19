package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

public class InflatableGreenhouseOnInitialEntitySpawnProcedure {
	public static void execute(double x, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("X", x);
		entity.getPersistentData().putDouble("Z", z);
	}
}
