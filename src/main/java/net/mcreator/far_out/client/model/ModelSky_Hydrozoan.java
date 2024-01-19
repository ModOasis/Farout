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

// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSky_Hydrozoan<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_sky_hydrozoan"), "main");
	public final ModelPart Root;
	public final ModelPart Tentacle1;
	public final ModelPart Tentacle2;
	public final ModelPart Tentacle3;
	public final ModelPart Tentacle4;

	public ModelSky_Hydrozoan(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Tentacle1 = root.getChild("Tentacle1");
		this.Tentacle2 = root.getChild("Tentacle2");
		this.Tentacle3 = root.getChild("Tentacle3");
		this.Tentacle4 = root.getChild("Tentacle4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition bone = Root.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -9.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(10.0F)).texOffs(0, 5).addBox(-1.5F, -10.0F, 0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(10.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Tentacles = Root.addOrReplaceChild("Tentacles", CubeListBuilder.create(), PartPose.offset(-0.25F, 21.0F, 0.0F));
		PartDefinition Tentacle1 = partdefinition.addOrReplaceChild("Tentacle1", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -19.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(3.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Tentacle2 = partdefinition.addOrReplaceChild("Tentacle2", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -19.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(3.0F)), PartPose.offset(8.0F, 24.0F, 9.0F));
		PartDefinition Tentacle3 = partdefinition.addOrReplaceChild("Tentacle3", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -19.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(3.0F)), PartPose.offset(-8.0F, 24.0F, 8.0F));
		PartDefinition Tentacle4 = partdefinition.addOrReplaceChild("Tentacle4", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -19.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(3.0F)), PartPose.offset(0.0F, 24.0F, 16.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, buffer, packedLight, packedOverlay);
		Tentacle1.render(poseStack, buffer, packedLight, packedOverlay);
		Tentacle2.render(poseStack, buffer, packedLight, packedOverlay);
		Tentacle3.render(poseStack, buffer, packedLight, packedOverlay);
		Tentacle4.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Tentacle2.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Tentacle3.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Tentacle4.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Tentacle1.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
