package net.mcreator.far_out.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.block.model.StirlingEngineBlockModel;
import net.mcreator.far_out.block.entity.StirlingEngineTileEntity;

public class StirlingEngineTileRenderer extends GeoBlockRenderer<StirlingEngineTileEntity> {
	public StirlingEngineTileRenderer() {
		super(new StirlingEngineBlockModel());
	}

	@Override
	public RenderType getRenderType(StirlingEngineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
