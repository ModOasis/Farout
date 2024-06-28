package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;

public class DisplayTrajectoryProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ("" + entity.level().dimension()).substring(8, (int) (("" + entity.level().dimension()).length() - 1)) + "<->"
				+ (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).SelectedTrajectory;
	}
}
