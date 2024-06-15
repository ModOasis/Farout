package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnEnergyUsedProcedure {
	public static String execute(LevelAccessor world) {
		return "Energy used: " + FaroutModVariables.WorldVariables.get(world).WattageUsed + " kW";
	}
}
