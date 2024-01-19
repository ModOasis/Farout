package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LanderEntity;

public class PitchIncreaseOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof LanderEntity) {
				{
					double _setval = 1;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Pitch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
