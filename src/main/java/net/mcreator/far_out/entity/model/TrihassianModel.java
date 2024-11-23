package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.TrihassianEntity;

public class TrihassianModel extends GeoModel<TrihassianEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrihassianEntity entity) {
		return new ResourceLocation("farout", "animations/trihassian.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrihassianEntity entity) {
		return new ResourceLocation("farout", "geo/trihassian.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrihassianEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
