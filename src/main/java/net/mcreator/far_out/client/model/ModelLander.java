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

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelLander<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_lander"), "main");
	public final ModelPart bb_main;

	public ModelLander(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -27.0F, -13.0F, 26.0F, 19.0F, 26.0F, new CubeDeformation(1.0F)).texOffs(0, 45).addBox(-11.0F, -63.0F, -11.0F, 22.0F, 28.0F, 22.0F, new CubeDeformation(1.0F)).texOffs(64, 71)
						.addBox(-12.0F, -33.0F, -12.0F, 24.0F, 6.0F, 24.0F, new CubeDeformation(1.0F)).texOffs(16, 104).addBox(-9.0F, -68.0F, -9.0F, 18.0F, 5.0F, 18.0F, new CubeDeformation(1.0F)).texOffs(0, 0)
						.addBox(-15.0F, -21.0F, -15.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(13.0F, -21.0F, -15.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.0F, -21.0F, 13.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-15.0F, -21.0F, 13.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(11.0F, -1.0F, -17.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-4, -4).addBox(11.0F, -1.0F, 11.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-4, -4)
						.addBox(-17.0F, -1.0F, 11.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-4, -4).addBox(-17.0F, -1.0F, -17.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(81, 13)
						.addBox(-5.0F, -7.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(85, 17).addBox(-3.0F, -5.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(89, 21)
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
