package net.mcreator.far_out.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.StationReadyForLaunchGUIMenu;
import net.mcreator.far_out.world.inventory.RocketAssemblyManagerGUIMenu;
import net.mcreator.far_out.world.inventory.ReadyForLaunchGUIMenu;
import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModBlocks;

import io.netty.buffer.Unpooled;

public class RocketAssemblyManagerOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean CorrectlyMade = false;
		double X = 0;
		double Y = 0;
		double Z = 0;
		CorrectlyMade = true;
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get()) {
			if (true) {
				X = 0;
				for (int index0 = 0; index0 < 5; index0++) {
					Z = -3;
					X = X + 1;
					for (int index1 = 0; index1 < 5; index1++) {
						Z = Z + 1;
						if (!((world.getBlockState(BlockPos.containing(X + x, y, Z + z))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get() && CorrectlyMade)) {
							CorrectlyMade = false;
						}
					}
				}
				Y = 1;
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get()) {
			if (true) {
				X = 0;
				for (int index2 = 0; index2 < 5; index2++) {
					Z = -3;
					X = X - 1;
					for (int index3 = 0; index3 < 5; index3++) {
						Z = Z + 1;
						if (!((world.getBlockState(BlockPos.containing(X + x, y, Z + z))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get() && CorrectlyMade)) {
							CorrectlyMade = false;
						}
					}
				}
				Y = 1;
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get()) {
			if (true) {
				Z = 0;
				for (int index4 = 0; index4 < 5; index4++) {
					X = -3;
					Z = Z - 1;
					for (int index5 = 0; index5 < 5; index5++) {
						X = X + 1;
						if (!((world.getBlockState(BlockPos.containing(X + x, y, Z + z))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get() && CorrectlyMade)) {
							CorrectlyMade = false;
						}
					}
				}
				Y = 1;
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get()) {
			if (true) {
				Z = 0;
				for (int index6 = 0; index6 < 5; index6++) {
					X = -3;
					Z = Z + 1;
					for (int index7 = 0; index7 < 5; index7++) {
						X = X + 1;
						if (!((world.getBlockState(BlockPos.containing(X + x, y, Z + z))).getBlock() == FaroutModBlocks.LAUNCHPAD_TILES.get() && CorrectlyMade)) {
							CorrectlyMade = false;
						}
					}
				}
				Y = 1;
			}
		} else {
			CorrectlyMade = false;
		}
		if (CorrectlyMade) {
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("RocketAssemblyManagerGUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new RocketAssemblyManagerGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
			if (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "RocketReadyForLaunch")) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "\u0394V") > 0) {
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("ReadyForLaunchGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ReadyForLaunchGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				} else {
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("StationReadyForLaunchGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new StationReadyForLaunchGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			} else {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("RocketAssemblyManagerGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new RocketAssemblyManagerGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		{
			double _setval = x;
			entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AccessLocationX = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = y;
			entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AccessLocationY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = z;
			entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AccessLocationZ = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
