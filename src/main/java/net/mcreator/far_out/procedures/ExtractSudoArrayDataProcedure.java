package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.FaroutMod;

public class ExtractSudoArrayDataProcedure {
	public static void execute(LevelAccessor world) {
		String ExtractedString = "";
		double i = 0;
		double CurrentIndex = 0;
		boolean Copying = false;
		i = 1;
		for (int index0 = 0; index0 < (int) (i - 1); index0++) {
			if ((FaroutModVariables.MapVariables.get(world).WorkingSudoArray.substring((int) (i - 1), (int) (i + 1))).equals(";")) {
				ExtractedString = "" + i;
			}
			i = i + 1;
		}
		FaroutMod.LOGGER.info(ExtractedString);
	}
}
