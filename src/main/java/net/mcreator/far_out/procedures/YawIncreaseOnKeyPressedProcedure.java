package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LanderEntity;

public class YawIncreaseOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		Entity LanderEntity = null;
		double PitchRad = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Normalization = 0;
		double YawRad = 0;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof LanderEntity) {
				{
					double _setval = 1;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Yaw = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
