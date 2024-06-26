
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
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.procedures.DesigningWorkbenchOnBlockRightClickedProcedure;
import net.mcreator.far_out.procedures.DesigningWorkbenchBlockAddedProcedure;
import net.mcreator.far_out.block.entity.DesigningWorkbenchBlockEntity;

import java.util.List;
import java.util.Collections;

public class DesigningWorkbenchBlock extends Block implements EntityBlock {
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
			default -> Shapes.or(box(21, 0, 14, 23, 13, 16), box(-7, 0, 14, -5, 13, 16), box(-7, 0, 0, -5, 13, 2), box(21, 0, 0, 23, 13, 2), box(-7, 13, 0, 23, 14, 16), box(-7, 14, 0, 23, 22, 5), box(15, 14, 9, 19, 15, 15),
					box(-3.46447, 14, 9.29289, 0.53553, 15, 15.29289), box(11.27269, 14, 8.65642, 12.27269, 15, 12.65642), box(4, 13.25, 7, 9, 14.25, 15));
			case NORTH -> Shapes.or(box(-7, 0, 0, -5, 13, 2), box(21, 0, 0, 23, 13, 2), box(21, 0, 14, 23, 13, 16), box(-7, 0, 14, -5, 13, 16), box(-7, 13, 0, 23, 14, 16), box(-7, 14, 11, 23, 22, 16), box(-3, 14, 1, 1, 15, 7),
					box(15.46447, 14, 0.70711, 19.46447, 15, 6.70711), box(3.72731, 14, 3.34358, 4.72731, 15, 7.34358), box(7, 13.25, 1, 12, 14.25, 9));
			case EAST -> Shapes.or(box(14, 0, -7, 16, 13, -5), box(14, 0, 21, 16, 13, 23), box(0, 0, 21, 2, 13, 23), box(0, 0, -7, 2, 13, -5), box(0, 13, -7, 16, 14, 23), box(0, 14, -7, 5, 22, 23), box(9, 14, -3, 15, 15, 1),
					box(9.29289, 14, 15.46447, 15.29289, 15, 19.46447), box(8.65642, 14, 3.72731, 12.65642, 15, 4.72731), box(7, 13.25, 7, 15, 14.25, 12));
			case WEST -> Shapes.or(box(0, 0, 21, 2, 13, 23), box(0, 0, -7, 2, 13, -5), box(14, 0, -7, 16, 13, -5), box(14, 0, 21, 16, 13, 23), box(0, 13, -7, 16, 14, 23), box(11, 14, -7, 16, 22, 23), box(1, 14, 15, 7, 15, 19),
					box(0.70711, 14, -3.46447, 6.70711, 15, 0.53553), box(3.34358, 14, 11.27269, 7.34358, 15, 12.27269), box(1, 13.25, 4, 9, 14.25, 9));
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
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		DesigningWorkbenchBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
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

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DesigningWorkbenchBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof DesigningWorkbenchBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof DesigningWorkbenchBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
