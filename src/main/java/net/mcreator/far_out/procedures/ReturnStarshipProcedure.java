package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnStarshipProcedure {
	public static String execute(LevelAccessor world) {
		String FuelLevel = "";
		FuelLevel = !(FaroutModVariables.WorldVariables.get(world).StarshipFuel == 0.1) ? "" + FaroutModVariables.WorldVariables.get(world).StarshipFuel : "Empty!";
		return !(FaroutModVariables.WorldVariables.get(world).StarshipFuel == 0) ? "fuel level: " + FuelLevel : "No starship in orbit!";
	}
}
