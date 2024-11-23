package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.C;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class EtauosTrajectoriesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Entity TargetEntity = null;
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		double MaxDeltaV = 0;
		double FullTransfer = 0;
		boolean Interplanetry = false;
		boolean I = false;
		boolean C = false;
		boolean R = false;
		boolean Result = false;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putString("TargetPlanet", "etauos");
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
