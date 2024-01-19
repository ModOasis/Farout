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

import cpw.mods.modlauncher.Launcher;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelLauncher<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_launcher"), "main");
	public final ModelPart Launcher;

	public ModelLauncher(ModelPart root) {
		this.Launcher = root.getChild("Launcher");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Launcher = partdefinition
				.addOrReplaceChild(
						"Launcher", CubeListBuilder.create().texOffs(8, 24).addBox(-1.0F, -172.0F, 0.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(10.0F)).texOffs(12, 24).addBox(-1.0F, -166.0F, 0.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(11.0F))
								.texOffs(4, 0).addBox(-1.0F, -161.0F, 0.0F, 1.0F, 34.0F, 1.0F, new CubeDeformation(12.0F)).texOffs(0, 0).addBox(-1.0F, -108.0F, 0.0F, 1.0F, 103.0F, 1.0F, new CubeDeformation(10.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition fin1_r1 = Launcher.addOrReplaceChild("fin1_r1", CubeListBuilder.create().texOffs(18, 12).addBox(-1.0F, -0.75F, -1.75F, 1.0F, 8.0F, 4.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 7.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition fin2_r1 = Launcher.addOrReplaceChild("fin2_r1", CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -6.25F, 5.75F, 1.0F, 8.0F, 4.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 1.5708F, 0.0F));
		PartDefinition Fin3_r1 = Launcher.addOrReplaceChild("Fin3_r1", CubeListBuilder.create().texOffs(8, 12).addBox(0.0F, -5.75F, 5.75F, 1.0F, 8.0F, 4.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 3.1416F, 0.0F));
		PartDefinition Fin4_r1 = Launcher.addOrReplaceChild("Fin4_r1", CubeListBuilder.create().texOffs(8, 0).addBox(0.25F, -6.0F, 7.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Launcher.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
