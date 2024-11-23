package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class GraphiteRodAssemblyUraniumUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), FaroutModBlocks.GRAPHITE_ROD_ASSEMBLY_PLUTONIUM.get().defaultBlockState(), 3);
	}
}
