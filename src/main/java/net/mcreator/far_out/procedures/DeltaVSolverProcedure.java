package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.IntTag;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.FaroutMod;

import com.mojang.datafixers.types.templates.Sum;

public class DeltaVSolverProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String Depart = "";
		String ParentBody = "";
		String TargetPlanet = "";
		double EjectionDeltaV = 0;
		double InsertionDeltaV = 0;
		double GravParamaterParent = 0;
		double R1 = 0;
		double R2 = 0;
		double EjectionMu1 = 0;
		double EjectionMu2 = 0;
		double Sum = 0;
		double DeltaV = 0;
		double RadiusOfPlanet = 0;
		double PeriodOfTransfer = 0;
		double OrbitalPeriodDeparture = 0;
		double OrbitalPeriodArrival = 0;
		TargetPlanet = ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "TargetPlanet")).replace(" ", "")).toLowerCase();
		Depart = ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "DeparturePlanet")).replace(" ", "")).toLowerCase();
		assert Boolean.TRUE; //#dbg:DeltaVSolver:marker1
		if ((TargetPlanet).equals((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")) {
			GravParamaterParent = (FaroutModVariables.MapVariables.get(world).GravitationalParameters.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
			R1 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
			R2 = Math.pow(GravParamaterParent / 15.44, 0.333333333);
			OrbitalPeriodDeparture = 0.625;
			OrbitalPeriodArrival = ((FaroutModVariables.MapVariables.get(world).OrbitalPeriods.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0) / 10;
			FaroutMod.LOGGER.info("moon-parent");
		} else if ((Depart).equals((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")) {
			GravParamaterParent = (FaroutModVariables.MapVariables.get(world).GravitationalParameters.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
			R1 = Math.pow(GravParamaterParent / 15.44, 0.333333333);
			R2 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
			OrbitalPeriodDeparture = ((FaroutModVariables.MapVariables.get(world).OrbitalPeriods.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0) / 10;
			OrbitalPeriodArrival = 0.625;
			FaroutMod.LOGGER.info("parent-moon");
		} else {
			while (!(TargetPlanet).equals(Depart)) {
				if (((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")
						.equals((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")) {
					GravParamaterParent = (FaroutModVariables.MapVariables.get(world).GravitationalParameters
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					R1 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					R2 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					OrbitalPeriodDeparture = (FaroutModVariables.MapVariables.get(world).OrbitalPeriods.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					OrbitalPeriodArrival = (FaroutModVariables.MapVariables.get(world).OrbitalPeriods.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					FaroutMod.LOGGER.info(TargetPlanet);
					FaroutMod.LOGGER.info(Depart);
					FaroutMod.LOGGER.info("planet-planet");
					FaroutMod.LOGGER.info((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "");
					FaroutMod.LOGGER.info((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "");
					break;
				} else if (((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "").equals(
						(FaroutModVariables.MapVariables.get(world).ParentBody.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof StringTag _stringTag
								? _stringTag.getAsString()
								: "")) {
					GravParamaterParent = ((FaroutModVariables.MapVariables.get(world).GravitationalParameters
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0) * 1;
					R1 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag
							? _intTag.getAsInt()
							: 0;
					R2 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					OrbitalPeriodDeparture = (FaroutModVariables.MapVariables.get(world).OrbitalPeriods
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					OrbitalPeriodArrival = (FaroutModVariables.MapVariables.get(world).OrbitalPeriods.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					FaroutMod.LOGGER.info("moon-planet");
					break;
				} else if (((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "").equals((FaroutModVariables.MapVariables.get(world).ParentBody
						.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")) {
					GravParamaterParent = ((FaroutModVariables.MapVariables.get(world).GravitationalParameters
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0) * 1;
					R1 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					R2 = (FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					OrbitalPeriodDeparture = (FaroutModVariables.MapVariables.get(world).OrbitalPeriods.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					OrbitalPeriodArrival = (FaroutModVariables.MapVariables.get(world).OrbitalPeriods
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					FaroutMod.LOGGER.info("planet-moon");
					break;
				} else {
					TargetPlanet = (FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					Depart = (FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					ParentBody = (FaroutModVariables.MapVariables.get(world).ParentBody
							.get(((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					FaroutMod.LOGGER.info("expanding search size...");
				}
			}
		}
		GravParamaterParent = Math.abs(GravParamaterParent);
		R1 = R1 / 100;
		R2 = R2 / 100;
		Sum = R1 + R2;
		EjectionDeltaV = Math.abs(Math.sqrt(GravParamaterParent / R1) * 33 * (Math.sqrt((R2 * 2) / Sum) - 1));
		InsertionDeltaV = Math.abs(Math.sqrt(GravParamaterParent / R2) * 33 * (1 - Math.sqrt((R1 * 2) / Sum)));
		FaroutMod.LOGGER.info(TargetPlanet);
		FaroutMod.LOGGER.info(Depart);
		FaroutMod.LOGGER.info((FaroutModVariables.MapVariables.get(world).ParentBody.get(TargetPlanet)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "");
		FaroutMod.LOGGER.info((FaroutModVariables.MapVariables.get(world).ParentBody.get(Depart)) instanceof StringTag _stringTag ? _stringTag.getAsString() : "");
		FaroutMod.LOGGER.info((FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(Depart)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0);
		FaroutMod.LOGGER.info((FaroutModVariables.MapVariables.get(world).SemiMajorAxis.get(TargetPlanet)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0);
		FaroutMod.LOGGER.info(GravParamaterParent);
		FaroutMod.LOGGER.info(R1);
		FaroutMod.LOGGER.info(R2);
		FaroutMod.LOGGER.info(Math.sqrt(GravParamaterParent / R1));
		FaroutMod.LOGGER.info(Math.sqrt(GravParamaterParent / R2));
		FaroutMod.LOGGER.info(Math.round(EjectionDeltaV));
		FaroutMod.LOGGER.info(Math.round(InsertionDeltaV));
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("TrajectoryDeltaV", Math.round(EjectionDeltaV + InsertionDeltaV));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("TrajectoryOrbitalPeriod", Math.round((OrbitalPeriodArrival / 10 + OrbitalPeriodDeparture / 10) / 2));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
