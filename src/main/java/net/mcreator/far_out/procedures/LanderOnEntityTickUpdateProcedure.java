package net.mcreator.far_out.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.entity.LanderEntity;

public class LanderOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		Entity LanderEntity = null;
		double PitchRad = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Normalization = 0;
		double YawRad = 0;
		if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) <= 10) {
			if (entity instanceof LanderEntity) {
				((LanderEntity) entity).setAnimation("animation.Lander.Liftoff");
			}
			if (entity instanceof LanderEntity) {
				((LanderEntity) entity).setAnimation("empty");
			}
		}
	}
}
