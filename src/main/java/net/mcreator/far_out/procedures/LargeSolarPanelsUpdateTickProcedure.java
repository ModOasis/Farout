package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class LargeSolarPanelsUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean Allow = false;
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && world instanceof Level _lvl1 && _lvl1.isDay()) {
			if (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Latch")) {
				FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced + 10;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("Latch", false);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if (!(world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && world instanceof Level _lvl5 && _lvl5.isDay())) {
			if (!(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Latch"))) {
				FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 10;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("Latch", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
	}
}
