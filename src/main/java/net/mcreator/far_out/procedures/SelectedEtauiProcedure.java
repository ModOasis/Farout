package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;

public class SelectedEtauiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "etaui";
			entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.SelectedTrajectory = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
