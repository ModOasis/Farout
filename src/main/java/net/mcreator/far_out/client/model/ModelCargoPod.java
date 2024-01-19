package net.mcreator.far_out.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCargoPod<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_cargo_pod"), "main");
	public final ModelPart bb_main;

	public ModelCargoPod(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(112, 102).addBox(-18.0F, -2.0F, -17.0F, 34.0F, 2.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(114, 54).addBox(-17.0F, -28.0F, -16.0F, 32.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 26).addBox(1.0F, -16.0F, -26.0F, 28.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(26, 78).addBox(1.0F, 14.0F, -26.0F, 28.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 15.0F, -1.5708F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 130).addBox(-16.0F, 29.0F, -26.0F, 32.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(140, 28).addBox(-16.0F, -1.0F, -26.0F, 32.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 15.0F, -1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
