package net.mcreator.far_out.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.block.entity.RocketAssemblerTileEntity;

public class RocketAssemblerBlockModel extends GeoModel<RocketAssemblerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RocketAssemblerTileEntity animatable) {
		return new ResourceLocation("farout", "animations/rocketassembler.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RocketAssemblerTileEntity animatable) {
		return new ResourceLocation("farout", "geo/rocketassembler.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RocketAssemblerTileEntity animatable) {
		return new ResourceLocation("farout", "textures/block/rocketassemblertex.png");
	}
}
