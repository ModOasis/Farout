package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ScienceValueProcedure {
	public static String execute(LevelAccessor world) {
		return "\u269B Science:" + FaroutModVariables.MapVariables.get(world).Science;
	}
}
