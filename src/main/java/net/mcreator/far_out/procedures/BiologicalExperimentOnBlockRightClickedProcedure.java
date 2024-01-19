package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class BiologicalExperimentOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (0 <= FaroutModVariables.WorldVariables.get(world).Energy) {
			FaroutModVariables.MapVariables.get(world).Science = FaroutModVariables.MapVariables.get(world).Science + (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "ScienceMultiplier")) * 0.1;
			FaroutModVariables.MapVariables.get(world).syncData(world);
			FaroutModVariables.WorldVariables.get(world).Energy = FaroutModVariables.WorldVariables.get(world).Energy - 5;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
