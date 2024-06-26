package net.mcreator.far_out.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.block.model.RocketAssemblerDisplayModel;
import net.mcreator.far_out.block.display.RocketAssemblerDisplayItem;

public class RocketAssemblerDisplayItemRenderer extends GeoItemRenderer<RocketAssemblerDisplayItem> {
	public RocketAssemblerDisplayItemRenderer() {
		super(new RocketAssemblerDisplayModel());
	}

	@Override
	public RenderType getRenderType(RocketAssemblerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
