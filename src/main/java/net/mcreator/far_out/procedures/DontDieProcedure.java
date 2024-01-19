package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModMobEffects;
import net.mcreator.far_out.entity.LanderEntity;

public class DontDieProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity LanderEntity = null;
		double PitchRad = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Normalization = 0;
		double YawRad = 0;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 120, 2, false, false));
		if (entity.isVehicle()) {
			{
				Entity _ent = entity;
				_ent.setYRot((float) entity.getPersistentData().getDouble("Yaw"));
				_ent.setXRot((float) entity.getPersistentData().getDouble("Pitch"));
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			PitchRad = entity.getPersistentData().getDouble("Pitch") * 0.0174532778;
			YawRad = entity.getPersistentData().getDouble("Yaw") * 0.0174532778;
			X = Math.sin(YawRad);
			Y = Math.cos(YawRad);
			Z = Math.sin(PitchRad);
			Normalization = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("Acceleration") * (X / Normalization)),
					(entity.getPersistentData().getDouble("Acceleration") * (Z / Normalization) - FaroutModVariables.MapVariables.get(world).Gravity / FaroutModVariables.MapVariables.get(world).GravitationalMultiplier),
					(entity.getPersistentData().getDouble("Acceleration") * (Y / Normalization))));
		}
	}
}
