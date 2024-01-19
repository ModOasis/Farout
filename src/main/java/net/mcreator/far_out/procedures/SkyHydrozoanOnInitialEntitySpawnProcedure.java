package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

public class SkyHydrozoanOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
		}
	}
}
