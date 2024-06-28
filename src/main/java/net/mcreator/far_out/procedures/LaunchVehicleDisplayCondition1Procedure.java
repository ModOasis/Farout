package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class LaunchVehicleDisplayCondition1Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean State = false;
		if ((world.getBlockState(BlockPos.containing(x + 3, y - 1, z))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x + 3, y - 1, z), "RocketReadyForLaunch")) {
			State = true;
		} else if ((world.getBlockState(BlockPos.containing(x - 3, y - 1, z))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x + 3, y - 1, z), "RocketReadyForLaunch")) {
			State = true;
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 3))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y - 1, z + 3), "RocketReadyForLaunch")) {
			State = true;
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 3))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y - 1, z - 3), "RocketReadyForLaunch")) {
			State = true;
		} else {
			State = false;
		}
		return State;
	}
}
