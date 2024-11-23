package net.mcreator.far_out.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.entity.CargoSSTOEntity;

public class CargoSSTOOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) <= 10 && entity.getDeltaMovement().y() <= 0) {
			if (entity instanceof CargoSSTOEntity) {
				((CargoSSTOEntity) entity).setAnimation("animation.model.CargoLand");
			}
		} else if (entity.getY() - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) <= 10 && entity.getDeltaMovement().y() >= 0) {
			if (entity instanceof CargoSSTOEntity) {
				((CargoSSTOEntity) entity).setAnimation("animation.model.CargoLiftoff");
			}
		} else {
			if (entity instanceof CargoSSTOEntity) {
				((CargoSSTOEntity) entity).setAnimation("empty");
			}
		}
	}
}
