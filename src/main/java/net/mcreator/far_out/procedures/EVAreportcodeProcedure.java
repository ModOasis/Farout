package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class EVAreportcodeProcedure {
	public static void execute(LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).Science = Math.round(FaroutModVariables.MapVariables.get(world).Science + FaroutModVariables.MapVariables.get(world).EVA_report_data_value / FaroutModVariables.MapVariables.get(world).ED);
		FaroutModVariables.MapVariables.get(world).syncData(world);
		FaroutModVariables.MapVariables.get(world).ED = 2 + FaroutModVariables.MapVariables.get(world).ED;
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
