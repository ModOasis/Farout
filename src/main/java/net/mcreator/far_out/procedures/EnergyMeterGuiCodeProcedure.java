package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class EnergyMeterGuiCodeProcedure {
	public static String execute(LevelAccessor world) {
		return "Energy Capacity:" + FaroutModVariables.WorldVariables.get(world).TotalCapacty + " Current Energy:" + FaroutModVariables.WorldVariables.get(world).Energy;
	}
}
