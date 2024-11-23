package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.AncientDroneEntity;

public class AncientDroneModel extends GeoModel<AncientDroneEntity> {
	@Override
	public ResourceLocation getAnimationResource(AncientDroneEntity entity) {
		return new ResourceLocation("farout", "animations/ancientdrone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AncientDroneEntity entity) {
		return new ResourceLocation("farout", "geo/ancientdrone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AncientDroneEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
