package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class LanderBayDisplayProcedure {
	public static String execute(LevelAccessor world) {
		double ArrayLocation = 0;
		String StarLocation = "";
		String ComponentStatus = "";
		String ComponentName = "";
		ComponentName = "Lander bay";
		ArrayLocation = 3;
		if ((FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.substring((int) (ArrayLocation - 1), (int) (ArrayLocation + 1))).contains("0")) {
			ComponentStatus = ComponentName + ": Component has been launched";
		} else {
			ComponentStatus = ComponentName + ": Component has not been launched";
		}
		return ComponentStatus;
	}
}
