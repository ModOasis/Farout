package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlocks;

public class LaunchVehicleOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean State = false;
		if ((world.getBlockState(BlockPos.containing(x + 3, y - 1, z))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x + 3, y - 1, z), "Launched")) {
			State = true;
			for (int index0 = 0; index0 < 1000; index0++) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 3, 3, 3, 0);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else if ((world.getBlockState(BlockPos.containing(x - 3, y - 1, z))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x + 3, y - 1, z), "Launched")) {
			State = true;
			for (int index1 = 0; index1 < 1000; index1++) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 3, 3, 3, 0);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 3))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y - 1, z + 3), "Launched")) {
			State = true;
			for (int index2 = 0; index2 < 1000; index2++) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 3, 3, 3, 0);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 3))).getBlock() == FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get() && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y - 1, z - 3), "Launched")) {
			State = true;
			for (int index3 = 0; index3 < 1000; index3++) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 3, 3, 3, 0);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			State = false;
		}
	}
}
