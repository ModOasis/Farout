
package net.mcreator.far_out.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SubspaceCatalystBlock extends Block {
	public SubspaceCatalystBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(10000f, 100000f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
