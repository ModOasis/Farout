package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnIronProcedure {
	public static String execute(LevelAccessor world) {
		return "Iron" + FaroutModVariables.WorldVariables.get(world).IronNumber;
	}
}
