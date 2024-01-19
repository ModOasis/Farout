package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class EtauianBaseAddSpawnerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), FaroutModBlocks.ETAUIAN_BASE_SPAWNER.get().defaultBlockState(), 3);
		world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 20);
	}
}
