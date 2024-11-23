package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.SentinelEntity;

public class SentinelModel extends GeoModel<SentinelEntity> {
	@Override
	public ResourceLocation getAnimationResource(SentinelEntity entity) {
		return new ResourceLocation("farout", "animations/sentinel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SentinelEntity entity) {
		return new ResourceLocation("farout", "geo/sentinel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SentinelEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
