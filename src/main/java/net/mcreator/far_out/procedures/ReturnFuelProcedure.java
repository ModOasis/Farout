package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnFuelProcedure {
	public static double execute(LevelAccessor world) {
		return FaroutModVariables.WorldVariables.get(world).StarshipFuel;
	}
}
