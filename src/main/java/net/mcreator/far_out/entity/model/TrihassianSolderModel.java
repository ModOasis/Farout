package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.TrihassianSolderEntity;

public class TrihassianSolderModel extends GeoModel<TrihassianSolderEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrihassianSolderEntity entity) {
		return new ResourceLocation("farout", "animations/trihassiansolder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrihassianSolderEntity entity) {
		return new ResourceLocation("farout", "geo/trihassiansolder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrihassianSolderEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
