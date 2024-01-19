package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.LanderEntity;

public class LanderModel extends GeoModel<LanderEntity> {
	@Override
	public ResourceLocation getAnimationResource(LanderEntity entity) {
		return new ResourceLocation("farout", "animations/lander.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LanderEntity entity) {
		return new ResourceLocation("farout", "geo/lander.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LanderEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
