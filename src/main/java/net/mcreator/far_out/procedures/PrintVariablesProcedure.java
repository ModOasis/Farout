package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.FaroutMod;

public class PrintVariablesProcedure {
	public static void execute(LevelAccessor world) {
		FaroutMod.LOGGER.info(("Interstellar Vessel Progress: " + FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress));
		FaroutMod.LOGGER.info(("In transit" + FaroutModVariables.MapVariables.get(world).InTransit));
	}
}
