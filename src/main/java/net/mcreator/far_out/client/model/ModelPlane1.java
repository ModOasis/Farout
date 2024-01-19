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

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPlane1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_plane_1"), "main");
	public final ModelPart Fuel;
	public final ModelPart bb_main;

	public ModelPlane1(ModelPart root) {
		this.Fuel = root.getChild("Fuel");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Fuel = partdefinition.addOrReplaceChild("Fuel", CubeListBuilder.create().texOffs(119, 0).addBox(6.0F, -11.0F, -4.0F, 54.0F, 3.0F, 8.0F, new CubeDeformation(4.0F)).texOffs(0, 0)
				.addBox(50.0F, -13.0F, 3.0F, 18.0F, 7.0F, 5.0F, new CubeDeformation(2.0F)).texOffs(0, 12).addBox(50.0F, -13.0F, -8.0F, 18.0F, 7.0F, 5.0F, new CubeDeformation(2.0F)), PartPose.offset(7.0F, 27.0F, 0.0F));
		PartDefinition Wings = Fuel
				.addOrReplaceChild(
						"Wings", CubeListBuilder.create().texOffs(0, 0).addBox(9.0F, -11.0F, -31.0F, 22.0F, 1.0F, 75.0F, new CubeDeformation(0.0F)).texOffs(95, 76).addBox(-2.0F, -11.0F, -20.0F, 12.0F, 1.0F, 55.0F, new CubeDeformation(0.0F))
								.texOffs(0, 76).addBox(-32.0F, -11.0F, -15.0F, 30.0F, 1.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(119, 11).addBox(-41.0F, -11.0F, -8.0F, 9.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)),
						PartPose.offset(34.0F, 0.0F, -7.0F));
		PartDefinition cube_r1 = Wings.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(39, 89).addBox(-10.5F, -36.5F, 13.0F, 21.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(39, 89).addBox(-10.5F, -25.5F, 13.0F, 21.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7178F, -16.3971F, -23.5F, -1.5708F, 0.0F, -1.6144F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(16, 24).addBox(-17.0F, -9.0F, -1.0F, 19.0F, 1.0F, 2.0F, new CubeDeformation(7.0F)).texOffs(6, 24).addBox(-23.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(5.0F)).texOffs(0, 24)
						.addBox(-28.0F, -9.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(3.0F)).texOffs(16, 27).addBox(-16.0F, -20.0F, -1.0F, 17.0F, 2.0F, 2.0F, new CubeDeformation(4.0F)).texOffs(0, 24)
						.addBox(10.0F, -14.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Fuel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
