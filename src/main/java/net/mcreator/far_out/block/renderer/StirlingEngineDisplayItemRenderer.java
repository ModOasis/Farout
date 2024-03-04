package net.mcreator.far_out.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.block.model.StirlingEngineDisplayModel;
import net.mcreator.far_out.block.display.StirlingEngineDisplayItem;

public class StirlingEngineDisplayItemRenderer extends GeoItemRenderer<StirlingEngineDisplayItem> {
	public StirlingEngineDisplayItemRenderer() {
		super(new StirlingEngineDisplayModel());
	}

	@Override
	public RenderType getRenderType(StirlingEngineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
