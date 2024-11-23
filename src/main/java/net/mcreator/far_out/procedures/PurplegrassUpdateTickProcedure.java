package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class PurplegrassUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double X = 0;
		double Z = 0;
		if (Mth.nextDouble(RandomSource.create(), 0, 5) == 1) {
			X = 1;
			X = -1;
		} else if (Mth.nextDouble(RandomSource.create(), 0, 5) == 1) {
			X = 1;
			Z = 1;
		} else if (Mth.nextDouble(RandomSource.create(), 0, 5) == 1) {
			X = -1;
			Z = -1;
		} else {
			X = -1;
			Z = 1;
		}
		if ((world.getBlockState(BlockPos.containing(x + X, y, z + X))).getBlock() == FaroutModBlocks.PURPLEGRASS.get()) {
			world.setBlock(BlockPos.containing(x + X, y, z + X), FaroutModBlocks.PURPLEGRASS.get().defaultBlockState(), 3);
		}
	}
}
