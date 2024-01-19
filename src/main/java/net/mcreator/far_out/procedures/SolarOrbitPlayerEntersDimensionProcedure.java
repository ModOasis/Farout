package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SolarOrbitPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.BEDROCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
