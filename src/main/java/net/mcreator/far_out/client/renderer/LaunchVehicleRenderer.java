
package net.mcreator.far_out.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.far_out.procedures.LaunchVehicleDisplayConditionProcedure;
import net.mcreator.far_out.procedures.LaunchVehicleDisplayCondition1Procedure;
import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.client.model.ModelLaunchVehicle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LaunchVehicleRenderer extends MobRenderer<LaunchVehicleEntity, ModelLaunchVehicle<LaunchVehicleEntity>> {
	public LaunchVehicleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLaunchVehicle(context.bakeLayer(ModelLaunchVehicle.LAYER_LOCATION)), 4f);
		this.addLayer(new RenderLayer<LaunchVehicleEntity, ModelLaunchVehicle<LaunchVehicleEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("farout:textures/entities/launchvehicleunassembled.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LaunchVehicleEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (LaunchVehicleDisplayConditionProcedure.execute()) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<LaunchVehicleEntity, ModelLaunchVehicle<LaunchVehicleEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("farout:textures/entities/smallrockettex.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LaunchVehicleEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (LaunchVehicleDisplayCondition1Procedure.execute(world, x, y, z)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LaunchVehicleEntity entity) {
		return new ResourceLocation("farout:textures/entities/no_glow.png");
	}
}
