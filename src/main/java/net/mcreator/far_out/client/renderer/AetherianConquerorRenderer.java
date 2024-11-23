
package net.mcreator.far_out.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.entity.model.AetherianConquerorModel;
import net.mcreator.far_out.entity.AetherianConquerorEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AetherianConquerorRenderer extends GeoEntityRenderer<AetherianConquerorEntity> {
	public AetherianConquerorRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new AetherianConquerorModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(AetherianConquerorEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, AetherianConquerorEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(AetherianConquerorEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
