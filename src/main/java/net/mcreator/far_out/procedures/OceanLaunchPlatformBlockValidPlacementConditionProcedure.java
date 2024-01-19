package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OceanLaunchPlatformBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean Valid = false;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			Valid = true;
		} else {
			Valid = false;
		}
		return Valid;
	}
}
