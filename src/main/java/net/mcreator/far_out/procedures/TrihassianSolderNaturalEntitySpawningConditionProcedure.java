package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class TrihassianSolderNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return FaroutModVariables.WorldVariables.get(world).Capitualation != 0;
	}
}
