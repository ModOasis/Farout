package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;
import net.mcreator.far_out.FaroutMod;

public class ExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Radians = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double RadiansVertical = 0;
		double radius = 0;
		double radiusIterator = 0;
		double Circumference = 0;
		double NumberOfIterations = 0;
		double CurrentY = 0;
		double rY = 0;
		double Theta = 0;
		double HorizontalIndex = 0;
		double Resolution = 0;
		double FillRadius = 0;
		radius = 50;
		CurrentY = y - 10;
		HorizontalIndex = 0;
		Y = 0;
		Resolution = 1000;
		FillRadius = 50;
		for (int index0 = 0; index0 < (int) (radius * 2); index0++) {
			Radians = 0;
			RadiansVertical = Math.sqrt(Math.pow(radius, 2) - Math.pow(CurrentY - y, 2));
			for (int index1 = 0; index1 < (int) Resolution; index1++) {
				X = RadiansVertical * Math.sin(Radians);
				Z = RadiansVertical * Math.cos(Radians);
				world.setBlock(BlockPos.containing(X + x, CurrentY, Z + z), FaroutModBlocks.CONSTRATIUM_BLOCK.get().defaultBlockState(), 3);
				assert Boolean.TRUE; //#dbg:Explosion:Why
				FaroutMod.LOGGER.info((X + x) + "," + CurrentY + "," + (Z + z));
				Radians = Radians + 6.28 / Resolution;
			}
			CurrentY = CurrentY + 1;
		}
	}
}
