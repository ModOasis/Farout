package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

public class RocketOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Delta-V", 0);
		entity.getPersistentData().putBoolean("OrbitCapable", false);
		entity.getPersistentData().putBoolean("ConfigDone", false);
	}
}
