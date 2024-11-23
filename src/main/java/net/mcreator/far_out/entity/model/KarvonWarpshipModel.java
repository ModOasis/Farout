package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.KarvonWarpshipEntity;

public class KarvonWarpshipModel extends GeoModel<KarvonWarpshipEntity> {
	@Override
	public ResourceLocation getAnimationResource(KarvonWarpshipEntity entity) {
		return new ResourceLocation("farout", "animations/karvonwarpship.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KarvonWarpshipEntity entity) {
		return new ResourceLocation("farout", "geo/karvonwarpship.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KarvonWarpshipEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
