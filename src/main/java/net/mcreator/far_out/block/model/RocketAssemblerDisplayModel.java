package net.mcreator.far_out.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.block.display.RocketAssemblerDisplayItem;

public class RocketAssemblerDisplayModel extends GeoModel<RocketAssemblerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RocketAssemblerDisplayItem animatable) {
		return new ResourceLocation("farout", "animations/rocketassembler.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RocketAssemblerDisplayItem animatable) {
		return new ResourceLocation("farout", "geo/rocketassembler.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RocketAssemblerDisplayItem entity) {
		return new ResourceLocation("farout", "textures/block/rocketassemblertex.png");
	}
}
