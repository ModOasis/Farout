package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class ChlorellaCultureUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x + 1, y, z), FaroutModBlocks.CHLORELLA_CULTURE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x - 1, y, z), FaroutModBlocks.CHLORELLA_CULTURE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y + 1, z), FaroutModBlocks.CHLORELLA_CULTURE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y - 1, z), FaroutModBlocks.CHLORELLA_CULTURE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z + 1), FaroutModBlocks.CHLORELLA_CULTURE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER) {
			world.setBlock(BlockPos.containing(x, y, z - 1), FaroutModBlocks.CHLORELLA_CULTURE.get().defaultBlockState(), 3);
		}
	}
}
