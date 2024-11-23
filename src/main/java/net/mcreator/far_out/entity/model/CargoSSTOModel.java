package net.mcreator.far_out.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.entity.CargoSSTOEntity;

public class CargoSSTOModel extends GeoModel<CargoSSTOEntity> {
	@Override
	public ResourceLocation getAnimationResource(CargoSSTOEntity entity) {
		return new ResourceLocation("farout", "animations/cargossto.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CargoSSTOEntity entity) {
		return new ResourceLocation("farout", "geo/cargossto.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CargoSSTOEntity entity) {
		return new ResourceLocation("farout", "textures/entities/" + entity.getTexture() + ".png");
	}

}
