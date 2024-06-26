package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Mass;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class RefreshFairingPropertiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean InterplanatryCapable = false;
		double Mass = 0;
		double FuelCapacity = 0;
		double FuelFraction = 0;
		double WetMass = 0;
		double DeltaV = 0;
		double ISP = 0;
		double TotalWatts = 0;
		double ExhaustVelocity = 0;
		double Watts = 0;
		double HabitationTime = 0;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PowID") == 0) {
			Watts = Watts + 10;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PowID") == 1) {
			Watts = Watts + 200;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PowID") == 2) {
			Watts = Watts + 1000;
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 0) {
			ISP = 450;
			Mass = Mass + 0.1;
			FuelCapacity = 7;
			Mass = Mass + 0.05;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 1) {
			ISP = 1000;
			Mass = Mass + 1;
			FuelCapacity = 20;
			Mass = Mass + 0.1;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 2) {
			ISP = 1490;
			Mass = Mass + 2;
			FuelCapacity = 20;
			Mass = Mass + 0.1;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 3) {
			Mass = Mass + 0.5;
			ISP = 1550;
			FuelCapacity = 10;
			Watts = Watts - 100;
			Mass = Mass + 0.1;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 4) {
			ISP = 3000;
			Watts = Watts - 200;
			Mass = Mass + 0.5;
			FuelCapacity = 10;
			Mass = Mass + 0.1;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 5) {
			ISP = 6730;
			Mass = Mass + 5;
			FuelCapacity = 20;
			Mass = Mass + 0.5;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 6) {
			ISP = 20000;
			Mass = Mass + 1.5;
			FuelCapacity = 15;
			Mass = Mass + 0.1;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "PropID") == 7) {
			Mass = Mass + 0.5;
			Mass = Mass + 5;
			FuelCapacity = 15;
			ISP = 100000;
			Watts = TotalWatts + 400;
		} else {
			FuelCapacity = 0;
			ISP = 0;
			Mass = Mass + 0;
			Watts = Watts - 0;
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "HabID") == 0) {
			Mass = Mass + 0.5;
			HabitationTime = 5;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "HabID") == 1) {
			Mass = Mass + 1.5;
			HabitationTime = 25;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "HabID") == 2) {
			Mass = Mass + 6.5;
			HabitationTime = 90;
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "CompID") == 0) {
			Mass = Mass + 0.1;
			InterplanatryCapable = false;
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "CompID") == 1) {
			InterplanatryCapable = true;
			Mass = Mass + 0.08;
		}
		ExhaustVelocity = ISP * 9.8;
		WetMass = FuelCapacity + Mass;
		FuelFraction = WetMass / Mass;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("\u0394V", Math.round(ExhaustVelocity * Math.log(FuelFraction)));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("HabTime", Math.round(HabitationTime));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("Wattage", Math.round(Watts + 0.5 * Mass));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
