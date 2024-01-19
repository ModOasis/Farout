package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class BatteryBlockBlockAddedProcedure {
	public static void execute(LevelAccessor world) {
		FaroutModVariables.WorldVariables.get(world).Battery_number = FaroutModVariables.WorldVariables.get(world).Battery_number + 1;
		FaroutModVariables.WorldVariables.get(world).syncData(world);
	}
}
