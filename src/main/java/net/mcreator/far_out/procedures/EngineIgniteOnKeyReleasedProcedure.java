package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LanderEntity;

public class EngineIgniteOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double PitchRad = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double YawRad = 0;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof LanderEntity) {
				PitchRad = (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch * 0.0174532778;
				YawRad = (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Yaw * 0.0174532778;
				X = Math.sin(YawRad);
				Y = Math.cos(YawRad);
				Z = Math.sin(PitchRad);
				{
					double _setval = X;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Xvel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Z;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Yvel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Y;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Zvel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
