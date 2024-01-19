package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class GeothermalGeneratorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.LAVA == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock()) {
			FaroutModVariables.WorldVariables.get(world).Energy = FaroutModVariables.WorldVariables.get(world).Energy + 10;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
