package net.mcreator.far_out.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.block.model.RocketAssemblerBlockModel;
import net.mcreator.far_out.block.entity.RocketAssemblerTileEntity;

public class RocketAssemblerTileRenderer extends GeoBlockRenderer<RocketAssemblerTileEntity> {
	public RocketAssemblerTileRenderer() {
		super(new RocketAssemblerBlockModel());
	}

	@Override
	public RenderType getRenderType(RocketAssemblerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
