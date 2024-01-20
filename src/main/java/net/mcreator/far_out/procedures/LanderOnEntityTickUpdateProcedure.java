package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
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
				entity.setDeltaMovement(new Vec3(((entity.getFirstPassenger()).getDeltaMovement().x()), ((entity.getFirstPassenger()).getDeltaMovement().y() - FaroutModVariables.MapVariables.get(world).Gravity / 100),
						((entity.getFirstPassenger()).getDeltaMovement().z())));
			} else if (((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch == 1) {
				if (entity instanceof LanderEntity) {
					((LanderEntity) entity).setAnimation("animation.Lander.RotateWest");
				}
			} else if (((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch == -1) {
				if (entity instanceof LanderEntity) {
					((LanderEntity) entity).setAnimation("animation.Lander.RotateEast");
				}
			} else if (((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Yaw == 1) {
				if (entity instanceof LanderEntity) {
					((LanderEntity) entity).setAnimation("animation.Lander.RotateNorth");
				}
			} else if (((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Yaw == -1) {
				if (entity instanceof LanderEntity) {
					((LanderEntity) entity).setAnimation("animation.Lander.RotateSouth");
				}
			} else {
				entity.setDeltaMovement(new Vec3(((entity.getFirstPassenger()).getDeltaMovement().x()), ((entity.getFirstPassenger()).getDeltaMovement().y() - FaroutModVariables.MapVariables.get(world).Gravity / 100),
						((entity.getFirstPassenger()).getDeltaMovement().z())));
			}
		}
	}
}
