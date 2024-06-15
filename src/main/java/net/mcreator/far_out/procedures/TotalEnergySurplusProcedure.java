package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class TotalEnergySurplusProcedure {
	public static String execute(LevelAccessor world) {
		return "Total energy surplus: " + (FaroutModVariables.WorldVariables.get(world).WattageProduced - FaroutModVariables.WorldVariables.get(world).WattageUsed) + " kW";
	}
}
