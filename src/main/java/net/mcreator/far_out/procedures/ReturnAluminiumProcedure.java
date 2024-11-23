package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnAluminiumProcedure {
	public static String execute(LevelAccessor world) {
		return "Aluminium: " + FaroutModVariables.MapVariables.get(world).AluminiumNumber;
	}
}
