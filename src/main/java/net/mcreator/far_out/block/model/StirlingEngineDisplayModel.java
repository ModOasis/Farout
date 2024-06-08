package net.mcreator.far_out.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.block.display.StirlingEngineDisplayItem;

public class StirlingEngineDisplayModel extends GeoModel<StirlingEngineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StirlingEngineDisplayItem animatable) {
		return new ResourceLocation("farout", "animations/stirlingengine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StirlingEngineDisplayItem animatable) {
		return new ResourceLocation("farout", "geo/stirlingengine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StirlingEngineDisplayItem entity) {
		return new ResourceLocation("farout", "textures/block/stirlingenginetex.png");
	}
}
