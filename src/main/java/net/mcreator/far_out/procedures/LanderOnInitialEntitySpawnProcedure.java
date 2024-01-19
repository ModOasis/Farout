package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

public class LanderOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Pitch", 0);
		entity.getPersistentData().putDouble("Yaw", 0);
		entity.getPersistentData().putDouble("RotationSpeed", 5);
		entity.getPersistentData().putDouble("Acceleration", 20);
		entity.getPersistentData().putBoolean("EngineOn", false);
	}
}
