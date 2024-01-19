
package net.mcreator.far_out.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.entity.CapsuleEntity;
import net.mcreator.far_out.client.model.ModelSpaceCapusle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CapsuleRenderer extends MobRenderer<CapsuleEntity, ModelSpaceCapusle<CapsuleEntity>> {
	public CapsuleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSpaceCapusle(context.bakeLayer(ModelSpaceCapusle.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CapsuleEntity, ModelSpaceCapusle<CapsuleEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("farout:textures/entities/no_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CapsuleEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CapsuleEntity entity) {
		return new ResourceLocation("farout:textures/entities/spacecapusle.png");
	}
}
