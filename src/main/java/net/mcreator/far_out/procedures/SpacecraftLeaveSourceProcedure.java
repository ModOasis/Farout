package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class SpacecraftLeaveSourceProcedure {
	public static boolean execute(LevelAccessor world) {
		double i = 0;
		i = 0;
		FaroutModVariables.WorldVariables.get(world).SpacecraftNames.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftHabitiationTime.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftDeltaV.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftDestination.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftSource.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftControlLevel.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV.remove((int) i);
		FaroutModVariables.WorldVariables.get(world).SpacecraftDirection.remove((int) i);
		return true;
	}
}
