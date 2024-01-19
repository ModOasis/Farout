package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class LargeSolarPanelsUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _lvl0 && _lvl0.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
			FaroutModVariables.WorldVariables.get(world).Energy = 10 + FaroutModVariables.WorldVariables.get(world).Energy;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
