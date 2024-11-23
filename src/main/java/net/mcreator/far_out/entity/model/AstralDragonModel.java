package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.AstralDragonEntity;

public class AstralDragonModel extends GeoModel<AstralDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(AstralDragonEntity entity) {
		return new ResourceLocation("farout", "animations/astralgaurdian_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AstralDragonEntity entity) {
		return new ResourceLocation("farout", "geo/astralgaurdian_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AstralDragonEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
