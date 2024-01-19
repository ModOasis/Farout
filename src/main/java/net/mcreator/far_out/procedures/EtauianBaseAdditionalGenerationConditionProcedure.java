package net.mcreator.far_out.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class EtauianBaseAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double z) {
		double X = 0;
		double Z = 0;
		boolean Result = false;
		Result = true;
		for (int index0 = 0; index0 < (int) X; index0++) {
			for (int index1 = 0; index1 < (int) Z; index1++) {
				if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + X), (int) (z + Z)) > 0) {
					Result = false;
				}
			}
		}
		return !FaroutModVariables.MapVariables.get(world).EtauianBaseSpawned && !Result;
	}
}
