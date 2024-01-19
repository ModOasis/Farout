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

// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFarOut_spacesuit_head<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_far_out_spacesuit_head"), "main");
	public final ModelPart Head;

	public ModelFarOut_spacesuit_head(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(33, 0).addBox(2.25F, -5.0F, 4.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 11)
						.addBox(2.25F, -5.0F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 1.0F, -3.1416F, -1.5708F, 3.1416F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 8.0F, -3.1416F, -1.5708F, 3.1416F));
		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -4.0F, -3.5F, 0.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -3.0F, 0.0F, 1.5708F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
