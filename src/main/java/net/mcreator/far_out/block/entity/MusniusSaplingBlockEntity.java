package net.mcreator.far_out.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlockEntities;

public class MusniusSaplingBlockEntity extends BlockEntity {
	public MusniusSaplingBlockEntity(BlockPos pos, BlockState state) {
		super(FaroutModBlockEntities.MUSNIUS_SAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
