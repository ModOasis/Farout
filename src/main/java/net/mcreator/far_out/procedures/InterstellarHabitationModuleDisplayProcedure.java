package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class InterstellarHabitationModuleDisplayProcedure {
	public static String execute(LevelAccessor world) {
		double DeltaV = 0;
		double ArrayLocation = 0;
		String StarLocation = "";
		String ComponentStatus = "";
		String ComponentName = "";
		ComponentName = "Interstellar habitation module";
		ArrayLocation = 6;
		if ((FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.substring((int) (ArrayLocation - 1), (int) (ArrayLocation + 1))).contains("0")) {
			ComponentStatus = ComponentName + ": Component has been launched";
		} else {
			ComponentStatus = ComponentName + ": Component has not been launched";
		}
		return ComponentStatus;
	}
}
