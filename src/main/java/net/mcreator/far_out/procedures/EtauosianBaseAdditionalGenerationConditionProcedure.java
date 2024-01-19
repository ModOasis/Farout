package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class EtauosianBaseAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return !FaroutModVariables.MapVariables.get(world).EtauosianBaseSpawned;
	}
}
