
package net.mcreator.far_out.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.procedures.DesigningWorkbenchOnBlockRightClickedProcedure;

import java.util.List;
import java.util.Collections;

public class DesigningWorkbenchBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DesigningWorkbenchBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(3f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(21, 0, 14, 23, 13, 16), box(-7, 0, 14, -5, 13, 16), box(-7, 0, 0, -5, 13, 2), box(21, 0, 0, 23, 13, 2), box(-7, 13, 0, 23, 14, 16), box(-7, 14, 11, 23, 22, 16), box(17, 14, 1, 21, 15, 7),
					box(-5, 14, 1, -1, 15, 7), box(12, 14, 3, 13, 15, 7), box(4, 13.25, 1, 9, 14.25, 9));
			case NORTH -> Shapes.or(box(-7, 0, 0, -5, 13, 2), box(21, 0, 0, 23, 13, 2), box(21, 0, 14, 23, 13, 16), box(-7, 0, 14, -5, 13, 16), box(-7, 13, 0, 23, 14, 16), box(-7, 14, 0, 23, 22, 5), box(-5, 14, 9, -1, 15, 15),
					box(17, 14, 9, 21, 15, 15), box(3, 14, 9, 4, 15, 13), box(7, 13.25, 7, 12, 14.25, 15));
			case EAST -> Shapes.or(box(14, 0, -7, 16, 13, -5), box(14, 0, 21, 16, 13, 23), box(0, 0, 21, 2, 13, 23), box(0, 0, -7, 2, 13, -5), box(0, 13, -7, 16, 14, 23), box(11, 14, -7, 16, 22, 23), box(1, 14, -5, 7, 15, -1),
					box(1, 14, 17, 7, 15, 21), box(3, 14, 3, 7, 15, 4), box(1, 13.25, 7, 9, 14.25, 12));
			case WEST -> Shapes.or(box(0, 0, 21, 2, 13, 23), box(0, 0, -7, 2, 13, -5), box(14, 0, -7, 16, 13, -5), box(14, 0, 21, 16, 13, 23), box(0, 13, -7, 16, 14, 23), box(0, 14, -7, 5, 22, 23), box(9, 14, 17, 15, 15, 21),
					box(9, 14, -5, 15, 15, -1), box(9, 14, 12, 13, 15, 13), box(7, 13.25, 4, 15, 14.25, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		DesigningWorkbenchOnBlockRightClickedProcedure.execute(world, x, y, z, entity);
		return InteractionResult.SUCCESS;
	}
}
