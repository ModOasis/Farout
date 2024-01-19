
package net.mcreator.far_out.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.procedures.NuclearBombRedstoneOnProcedure;

import java.util.List;
import java.util.Collections;

public class NuclearBombBlock extends FallingBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public NuclearBombBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1.5f, 10f).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(2, 0, 2, 14, 25, 14), box(3, 25, 3, 13, 28, 13), box(4, 28, 4, 12, 31, 12), box(-3, -2.25, 7, 2, 11.75, 9), box(7, -2.25, -2.5, 9, 10.75, 2.5), box(13, -2.25, 7, 18, 11.75, 9), box(7, -2.25, 14, 9, 11.75, 19));
			case NORTH -> Shapes.or(box(2, 0, 2, 14, 25, 14), box(3, 25, 3, 13, 28, 13), box(4, 28, 4, 12, 31, 12), box(14, -2.25, 7, 19, 11.75, 9), box(7, -2.25, 13.5, 9, 10.75, 18.5), box(-2, -2.25, 7, 3, 11.75, 9), box(7, -2.25, -3, 9, 11.75, 2));
			case EAST -> Shapes.or(box(2, 0, 2, 14, 25, 14), box(3, 25, 3, 13, 28, 13), box(4, 28, 4, 12, 31, 12), box(7, -2.25, 14, 9, 11.75, 19), box(-2.5, -2.25, 7, 2.5, 10.75, 9), box(7, -2.25, -2, 9, 11.75, 3), box(14, -2.25, 7, 19, 11.75, 9));
			case WEST -> Shapes.or(box(2, 0, 2, 14, 25, 14), box(3, 25, 3, 13, 28, 13), box(4, 28, 4, 12, 31, 12), box(7, -2.25, -3, 9, 11.75, 2), box(13.5, -2.25, 7, 18.5, 10.75, 9), box(7, -2.25, 13, 9, 11.75, 18), box(-3, -2.25, 7, 2, 11.75, 9));
			case UP -> Shapes.or(box(2, 2, 0, 14, 14, 25), box(3, 3, 25, 13, 13, 28), box(4, 4, 28, 12, 12, 31), box(14, 7, -2.25, 19, 9, 11.75), box(7, -2.5, -2.25, 9, 2.5, 10.75), box(-2, 7, -2.25, 3, 9, 11.75), box(7, 14, -2.25, 9, 19, 11.75));
			case DOWN -> Shapes.or(box(2, 2, -9, 14, 14, 16), box(3, 3, -12, 13, 13, -9), box(4, 4, -15, 12, 12, -12), box(14, 7, 4.25, 19, 9, 18.25), box(7, 13.5, 5.25, 9, 18.5, 18.25), box(-2, 7, 4.25, 3, 9, 18.25), box(7, -3, 4.25, 9, 2, 18.25));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			NuclearBombRedstoneOnProcedure.execute();
		}
	}
}
