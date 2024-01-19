package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class LargeSolarPanelproProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && world instanceof Level _lvl1 && _lvl1.isDay()) {
			FaroutModVariables.WorldVariables.get(world).Energy = 0.15 + FaroutModVariables.WorldVariables.get(world).Energy;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
