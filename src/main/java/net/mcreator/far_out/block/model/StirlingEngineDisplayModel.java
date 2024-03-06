package net.mcreator.far_out.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.block.display.StirlingEngineDisplayItem;

public class StirlingEngineDisplayModel extends GeoModel<StirlingEngineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StirlingEngineDisplayItem animatable) {
		return new ResourceLocation("farout", "animations/stirling_engine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StirlingEngineDisplayItem animatable) {
		return new ResourceLocation("farout", "geo/stirling_engine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StirlingEngineDisplayItem entity) {
		return new ResourceLocation("farout", "textures/block/stirlingenginetex.png");
	}
}
