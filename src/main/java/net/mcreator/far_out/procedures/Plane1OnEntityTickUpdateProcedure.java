package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Speed;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class Plane1OnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double X = 0;
		double Y = 0;
		double Speed = 0;
		double Z = 0;
		if (entity.isVehicle()) {
			X = (entity.getControllingPassenger()).getLookAngle().x;
			Y = (entity.getControllingPassenger()).getLookAngle().y;
			Z = (entity.getControllingPassenger()).getLookAngle().z;
			entity.setDeltaMovement(new Vec3((10 * Math.cos(X)), (10 * Math.sin(Y)), (10 * Math.cos(Z))));
			{
				Entity _ent = entity;
				_ent.setYRot((float) X);
				_ent.setXRot((float) Y);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
		}
	}
}
