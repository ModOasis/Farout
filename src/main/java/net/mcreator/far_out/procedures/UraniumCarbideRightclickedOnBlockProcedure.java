package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class UraniumCarbideRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FaroutModBlocks.GRAPHITE_ROD_ASSEMBLY.get()) {
			itemstack.shrink(1);
			world.setBlock(BlockPos.containing(x, y, z), FaroutModBlocks.GRAPHITE_ROD_ASSEMBLY_URANIUM.get().defaultBlockState(), 3);
		}
	}
}
