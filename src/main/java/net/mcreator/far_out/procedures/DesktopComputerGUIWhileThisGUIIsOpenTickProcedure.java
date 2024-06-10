package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class DesktopComputerGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		double j = 0;
		i = 1;
		for (int index0 = 0; index0 < 9; index0++) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString(("" + i), "Hello World!");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			i = i + 1;
		}
	}
}
