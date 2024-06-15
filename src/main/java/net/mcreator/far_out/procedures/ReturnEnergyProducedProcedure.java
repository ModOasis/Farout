package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnEnergyProducedProcedure {
	public static String execute(LevelAccessor world) {
		return "Energy produced: " + FaroutModVariables.WorldVariables.get(world).WattageProduced + " kW";
	}
}
