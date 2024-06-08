package net.mcreator.far_out.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.block.entity.StirlingEngineTileEntity;

public class StirlingEngineBlockModel extends GeoModel<StirlingEngineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StirlingEngineTileEntity animatable) {
		return new ResourceLocation("farout", "animations/stirlingengine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StirlingEngineTileEntity animatable) {
		return new ResourceLocation("farout", "geo/stirlingengine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StirlingEngineTileEntity animatable) {
		return new ResourceLocation("farout", "textures/block/stirlingenginetex.png");
	}
}
