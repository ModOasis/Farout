package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

public class StartingLanderPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!entity.onGround()) {
			sourceentity.startRiding(entity);
		}
	}
}
