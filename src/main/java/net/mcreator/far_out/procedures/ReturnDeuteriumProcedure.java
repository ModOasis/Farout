package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnDeuteriumProcedure {
	public static String execute(LevelAccessor world) {
		return "Deuterium: " + FaroutModVariables.MapVariables.get(world).DeuteriumNumber;
	}
}
