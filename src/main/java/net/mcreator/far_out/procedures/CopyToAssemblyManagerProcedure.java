package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.DoubleTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.FaroutMod;

import java.util.concurrent.atomic.AtomicReference;

public class CopyToAssemblyManagerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		i = 0;
		{
			CompoundTag provideddatamap = (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getOrCreateTag();
			{
				CompoundTag _compoundTag = provideddatamap;
				for (String keyiterator : _compoundTag.getAllKeys()) {
					Tag dataelementiterator = _compoundTag.get(keyiterator);
					if (!(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((keyiterator.replace("\u0394", ""))).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR.asItem())) {
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble((i + "L"), ((new Object() {
									public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										BlockEntity _ent = world.getBlockEntity(pos);
										if (_ent != null)
											_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
										return _retval.get();
									}
								}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getOrCreateTag().getDouble(keyiterator)));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble((keyiterator + " i"), i);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = BlockPos.containing(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putString(("" + i), keyiterator);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						FaroutMod.LOGGER.info("R" + (new Object() {
							public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
								return _retval.get();
							}
						}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getOrCreateTag().getDouble(keyiterator));
						i = i + 1;
					}
				}
			}
		}
		if (!world.isClientSide()) {
			BlockPos _customNBTPos = BlockPos.containing(x, y, z);
			BlockEntity _customNBTContext = world.getBlockEntity(_customNBTPos);
			if (_customNBTContext != null) {
				CompoundTag provideddatamap = _customNBTContext.getPersistentData();
				{
					CompoundTag _compoundTag = provideddatamap;
					for (String keyiterator : _compoundTag.getAllKeys()) {
						Tag dataelementiterator = _compoundTag.get(keyiterator);
						if (!(ForgeRegistries.ITEMS.getValue(new ResourceLocation((keyiterator).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR.asItem())) {
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble(("" + i), (dataelementiterator instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putString(("" + i), keyiterator);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble(keyiterator, i);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
						i = i + 1;
					}
				}
				if (world instanceof Level _customNBTlevel) {
					BlockState _customNBTState = _customNBTlevel.getBlockState(_customNBTPos);
					_customNBTlevel.sendBlockUpdated(_customNBTPos, _customNBTState, _customNBTState, 3);
				}
			}
		}
		assert Boolean.TRUE; //#dbg:CopyToAssemblyManager:Copied
	}
}
