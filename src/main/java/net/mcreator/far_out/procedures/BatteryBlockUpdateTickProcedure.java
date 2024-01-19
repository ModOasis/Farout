package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class BatteryBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world) {
		double Battery_storage = 0;
		Battery_storage = 100;
		if (Battery_storage * FaroutModVariables.WorldVariables.get(world).Battery_number < FaroutModVariables.WorldVariables.get(world).Energy) {
			FaroutModVariables.WorldVariables.get(world).Energy = Battery_storage * FaroutModVariables.WorldVariables.get(world).Battery_number;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			FaroutModVariables.WorldVariables.get(world).TotalCapacty = Battery_storage * FaroutModVariables.WorldVariables.get(world).Battery_number;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		} else {
			FaroutModVariables.WorldVariables.get(world).TotalCapacty = Battery_storage * FaroutModVariables.WorldVariables.get(world).Battery_number;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
