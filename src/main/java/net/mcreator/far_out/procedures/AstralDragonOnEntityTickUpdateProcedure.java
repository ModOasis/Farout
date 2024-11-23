package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class AstralDragonOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double TrackingDistance = 0;
		double distanceX = 0;
		double disatanceY = 0;
		double distanceZ = 0;
		Entity PlayerEntity = null;
		TrackingDistance = 64;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty()) {
			PlayerEntity = (Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null);
			distanceX = x - PlayerEntity.getX();
			disatanceY = y - PlayerEntity.getY();
			distanceZ = z - PlayerEntity.getZ();
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo((PlayerEntity.getX()), (PlayerEntity.getY()), (PlayerEntity.getZ()), 1);
		}
	}
}
