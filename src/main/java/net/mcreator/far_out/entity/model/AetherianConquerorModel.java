package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.AetherianConquerorEntity;

public class AetherianConquerorModel extends GeoModel<AetherianConquerorEntity> {
	@Override
	public ResourceLocation getAnimationResource(AetherianConquerorEntity entity) {
		return new ResourceLocation("farout", "animations/aetherianconqueror.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AetherianConquerorEntity entity) {
		return new ResourceLocation("farout", "geo/aetherianconqueror.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AetherianConquerorEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
