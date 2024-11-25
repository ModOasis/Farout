package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

@Mod.EventBusSubscriber
public class BlockBrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 1) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			FaroutModVariables.WorldVariables.get(world).WattageUsed = FaroutModVariables.WorldVariables.get(world).WattageUsed - 15;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if (blockstate.getBlock() == FaroutModBlocks.METHANE_POLYMERIZER.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 1) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			FaroutModVariables.WorldVariables.get(world).WattageUsed = FaroutModVariables.WorldVariables.get(world).WattageUsed - 5;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if (blockstate.getBlock() == FaroutModBlocks.STIRLING_ENGINE.get() && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BLAST_FURNACE || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FURNACE
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.LAVA)) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 10;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if (blockstate.getBlock() == FaroutModBlocks.SOLAR_PANELS.get() && world instanceof Level _lvl19 && _lvl19.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 10;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if (blockstate.getBlock() == FaroutModBlocks.NUCLEAR_REACTOR.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 1) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 20;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if (blockstate.getBlock() == FaroutModBlocks.TOKAMAKFUSIONREACTOR.get() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= 1) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == FaroutModItems.DEUTERIUM.get()) {
				FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 50;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == FaroutModItems.TRITIUM.get()) {
				FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 100;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == FaroutModItems.HELIUM_3.get()) {
				FaroutModVariables.WorldVariables.get(world).WattageProduced = FaroutModVariables.WorldVariables.get(world).WattageProduced - 90;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
