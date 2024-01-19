package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class VolcanoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Radius = 0;
		double RadiusIterator = 0;
		double X = 0;
		double Z = 0;
		double AngleIterator = 0;
		double Height = 0;
		double HeightIterator = 0;
		double Y = 0;
		double HeightRatio = 0;
		double Slope = 0;
		HeightRatio = 0;
		Height = 100;
		Radius = 50;
		Slope = Radius / Height;
		for (int index0 = 0; index0 < (int) Math.pow(Slope, -1); index0++) {
			for (int index1 = 0; index1 < 360; index1++) {
				X = (x + HeightRatio) * Math.cos(AngleIterator) * (1 - HeightRatio);
				Y = (y + HeightRatio) * Math.cos(AngleIterator) * (1 - HeightRatio);
				Z = (z + HeightRatio) * Math.cos(AngleIterator) * (1 - HeightRatio);
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(X, Y, Z), Blocks.BASALT.defaultBlockState(), 3);
					if (HeightRatio <= 0.9) {
						world.setBlock(BlockPos.containing(X, Y, Z), Blocks.LAVA.defaultBlockState(), 3);
					}
				}
				AngleIterator = AngleIterator + 1;
			}
			HeightRatio = HeightRatio + Slope;
		}
	}
}
