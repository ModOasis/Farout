package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnCopperProcedure {
	public static String execute(LevelAccessor world) {
		return "Copper: " + FaroutModVariables.MapVariables.get(world).CopperIngotNumber;
	}
}
