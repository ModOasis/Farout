package net.mcreator.far_out.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.item.AutomaticRifleItem;

public class AutomaticRifleItemModel extends GeoModel<AutomaticRifleItem> {
	@Override
	public ResourceLocation getAnimationResource(AutomaticRifleItem animatable) {
		return new ResourceLocation("farout", "animations/automaticrifle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AutomaticRifleItem animatable) {
		return new ResourceLocation("farout", "geo/automaticrifle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AutomaticRifleItem animatable) {
		return new ResourceLocation("farout", "textures/item/automaticrifletex.png");
	}
}
