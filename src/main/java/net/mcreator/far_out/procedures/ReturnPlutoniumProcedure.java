package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnPlutoniumProcedure {
	public static String execute(LevelAccessor world) {
		return "Plutonium: " + FaroutModVariables.WorldVariables.get(world).UraniumNumber;
	}
}
