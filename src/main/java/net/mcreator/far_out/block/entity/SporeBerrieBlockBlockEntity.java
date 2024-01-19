package net.mcreator.far_out.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.init.FaroutModBlockEntities;

public class SporeBerrieBlockBlockEntity extends BlockEntity {
	public SporeBerrieBlockBlockEntity(BlockPos pos, BlockState state) {
		super(FaroutModBlockEntities.SPORE_BERRIE_BLOCK.get(), pos, state);
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
