package net.mcreator.far_out.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.item.RailgunItem;

public class RailgunItemModel extends GeoModel<RailgunItem> {
	@Override
	public ResourceLocation getAnimationResource(RailgunItem animatable) {
		return new ResourceLocation("farout", "animations/railgun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RailgunItem animatable) {
		return new ResourceLocation("farout", "geo/railgun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RailgunItem animatable) {
		return new ResourceLocation("farout", "textures/item/railguntexture.png");
	}
}
