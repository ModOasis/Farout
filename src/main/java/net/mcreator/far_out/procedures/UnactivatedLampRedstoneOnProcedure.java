package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class UnactivatedLampRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (FaroutModVariables.WorldVariables.get(world).WattageProduced - FaroutModVariables.WorldVariables.get(world).WattageUsed > 1) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			FaroutModVariables.WorldVariables.get(world).WattageUsed = FaroutModVariables.WorldVariables.get(world).WattageUsed - 0.5;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
