package net.mcreator.far_out.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFlutefish<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_flutefish"), "main");
	public final ModelPart PropTentacle2;
	public final ModelPart PropTentacle1;
	public final ModelPart PropTentacle3;
	public final ModelPart PropTentacle4;
	public final ModelPart HuntTentacle1;
	public final ModelPart HuntTentacle2;
	public final ModelPart HuntTentacle3;
	public final ModelPart HuntTentacle4;
	public final ModelPart bb_main;

	public ModelFlutefish(ModelPart root) {
		this.PropTentacle2 = root.getChild("PropTentacle2");
		this.PropTentacle1 = root.getChild("PropTentacle1");
		this.PropTentacle3 = root.getChild("PropTentacle3");
		this.PropTentacle4 = root.getChild("PropTentacle4");
		this.HuntTentacle1 = root.getChild("HuntTentacle1");
		this.HuntTentacle2 = root.getChild("HuntTentacle2");
		this.HuntTentacle3 = root.getChild("HuntTentacle3");
		this.HuntTentacle4 = root.getChild("HuntTentacle4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition PropTentacle2 = partdefinition.addOrReplaceChild("PropTentacle2", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 19.0F, 17.0F));
		PartDefinition PropTentacle1 = partdefinition.addOrReplaceChild("PropTentacle1", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 17.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition PropTentacle3 = partdefinition.addOrReplaceChild("PropTentacle3", CubeListBuilder.create().texOffs(24, 32).addBox(2.0F, -6.0F, 17.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition PropTentacle4 = partdefinition.addOrReplaceChild("PropTentacle4", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = PropTentacle4.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 17.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition HuntTentacle1 = partdefinition.addOrReplaceChild("HuntTentacle1", CubeListBuilder.create().texOffs(0, 60).addBox(-17.0F, -6.0F, -18.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition HuntTentacle2 = partdefinition.addOrReplaceChild("HuntTentacle2", CubeListBuilder.create(), PartPose.offset(10.5F, 19.0F, -17.0F));
		PartDefinition cube_r2 = HuntTentacle2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 60).addBox(-11.5F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 3.1416F, 3.1416F, 0.0F));
		PartDefinition HuntTentacle3 = partdefinition.addOrReplaceChild("HuntTentacle3", CubeListBuilder.create(), PartPose.offset(10.5F, 19.0F, -17.0F));
		PartDefinition cube_r3 = HuntTentacle3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 60).addBox(-13.0F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -4.0F, 0.0F, -1.5708F, 3.1416F, -1.5708F));
		PartDefinition HuntTentacle4 = partdefinition.addOrReplaceChild("HuntTentacle4", CubeListBuilder.create(), PartPose.offset(0.25F, 28.8481F, -18.7365F));
		PartDefinition cube_r4 = HuntTentacle4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 60).addBox(-12.5F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -6.0F, 2.0F, 3.1416F, 3.1416F, 1.5708F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -16.0F, 2.0F, 2.0F, 30.0F, new CubeDeformation(3.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		PropTentacle2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PropTentacle1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PropTentacle3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		PropTentacle4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HuntTentacle1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HuntTentacle2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HuntTentacle3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		HuntTentacle4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.PropTentacle1.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.PropTentacle2.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.PropTentacle3.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.PropTentacle4.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.HuntTentacle3.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.HuntTentacle4.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.HuntTentacle1.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.HuntTentacle2.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
