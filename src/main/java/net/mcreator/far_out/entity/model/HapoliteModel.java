package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.HapoliteEntity;

public class HapoliteModel extends GeoModel<HapoliteEntity> {
	@Override
	public ResourceLocation getAnimationResource(HapoliteEntity entity) {
		return new ResourceLocation("farout", "animations/hapolite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HapoliteEntity entity) {
		return new ResourceLocation("farout", "geo/hapolite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HapoliteEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
