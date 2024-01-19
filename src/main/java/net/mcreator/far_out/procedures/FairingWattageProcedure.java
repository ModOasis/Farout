package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class FairingWattageProcedure {
	public static String execute(LevelAccessor world) {
		return "Wattage:" + FaroutModVariables.MapVariables.get(world).FairingWattage;
	}
}
