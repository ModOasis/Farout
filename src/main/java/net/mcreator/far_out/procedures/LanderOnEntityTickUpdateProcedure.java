package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LanderEntity;

public class LanderOnEntityTickUpdateProcedure {
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
		if (entity.isVehicle()) {
			if (((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Zvel > 0) {
				PitchRad = ((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch * 0.0174532778;
				YawRad = ((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Yaw * 0.0174532778;
				X = Math.sin(YawRad);
				Y = Math.cos(PitchRad);
				Z = Math.sin(YawRad);
				entity.setDeltaMovement(new Vec3(((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Xvel + entity.getDeltaMovement().x()),
						(((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Zvel + entity.getDeltaMovement().y()) - FaroutModVariables.MapVariables.get(world).Gravity / 100),
						((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Yvel + entity.getDeltaMovement().z())));
				{
					Entity _ent = entity;
					_ent.setYRot((float) ((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Yaw);
					_ent.setXRot((float) ((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			} else {
				entity.setDeltaMovement(new Vec3(((entity.getFirstPassenger()).getDeltaMovement().x()), ((entity.getFirstPassenger()).getDeltaMovement().y() - FaroutModVariables.MapVariables.get(world).Gravity / 100),
						((entity.getFirstPassenger()).getDeltaMovement().z())));
			}
		}
	}
}
