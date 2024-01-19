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
public class ModelLatticeConfinementFusionReactor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("farout", "model_lattice_confinement_fusion_reactor"), "main");
	public final ModelPart LatticeConfinementFusionReactor;

	public ModelLatticeConfinementFusionReactor(ModelPart root) {
		this.LatticeConfinementFusionReactor = root.getChild("LatticeConfinementFusionReactor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LatticeConfinementFusionReactor = partdefinition.addOrReplaceChild("LatticeConfinementFusionReactor", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -24.5F, -10.5F, 56.0F, 28.0F, 28.0F, new CubeDeformation(0.0F))
				.texOffs(60, 140).addBox(-38.0F, -16.5F, -2.5F, 24.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(20, 144).addBox(-14.0F, -20.5F, -6.5F, 8.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.5F, -0.5F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LatticeConfinementFusionReactor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
