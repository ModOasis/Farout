package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class SuperConductingMagneticBatteryDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world) {
		FaroutModVariables.WorldVariables.get(world).TotalCapacty = FaroutModVariables.WorldVariables.get(world).TotalCapacty * 10;
		FaroutModVariables.WorldVariables.get(world).syncData(world);
	}
}
