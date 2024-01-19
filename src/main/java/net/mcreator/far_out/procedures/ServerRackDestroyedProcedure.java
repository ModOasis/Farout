package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ServerRackDestroyedProcedure {
	public static void execute(LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).ServerNumber = FaroutModVariables.MapVariables.get(world).ServerNumber - 1;
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
