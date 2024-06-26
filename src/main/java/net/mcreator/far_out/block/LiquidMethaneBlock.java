
package net.mcreator.far_out.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.procedures.LiquidMethaneBlockAddedProcedure;
import net.mcreator.far_out.init.FaroutModFluids;

public class LiquidMethaneBlock extends LiquidBlock {
	public LiquidMethaneBlock() {
		super(() -> FaroutModFluids.LIQUID_METHANE.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(0f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		LiquidMethaneBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
