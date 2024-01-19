package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class ServerRackUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FaroutModVariables.MapVariables.get(world).GeneralScience = FaroutModVariables.MapVariables.get(world).Science - 0.5;
		FaroutModVariables.MapVariables.get(world).syncData(world);
		FaroutModVariables.WorldVariables.get(world).Energy = FaroutModVariables.WorldVariables.get(world).Energy - 1;
		FaroutModVariables.WorldVariables.get(world).syncData(world);
		if (world instanceof Level _level0 && _level0.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			FaroutModVariables.MapVariables.get(world).GeneralScience = FaroutModVariables.MapVariables.get(world).Science + 0.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else {
			FaroutModVariables.MapVariables.get(world).GeneralScience = FaroutModVariables.MapVariables.get(world).Science + 0.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
