package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class SurfaceSampleCodeProcedure {
	public static void execute(LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).Science = Math.round(FaroutModVariables.MapVariables.get(world).Science + FaroutModVariables.MapVariables.get(world).surface_sample_data_value / FaroutModVariables.MapVariables.get(world).SD);
		FaroutModVariables.MapVariables.get(world).syncData(world);
		FaroutModVariables.MapVariables.get(world).SD = 2 + FaroutModVariables.MapVariables.get(world).SD;
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
