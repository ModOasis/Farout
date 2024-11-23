package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnChipsProcedure {
	public static String execute(LevelAccessor world) {
		return "Medium IC's:" + FaroutModVariables.MapVariables.get(world).MediumComputeChipsNumber;
	}
}
