// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRocketNoFairing<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rocketnofairing"), "main");
	private final ModelPart RocketNoFairing;

	public ModelRocketNoFairing(ModelPart root) {
		this.RocketNoFairing = root.getChild("RocketNoFairing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RocketNoFairing = partdefinition.addOrReplaceChild("RocketNoFairing", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-1.0F, -108.0F, 0.0F, 1.0F, 103.0F, 1.0F, new CubeDeformation(10.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition fin1_r1 = RocketNoFairing
				.addOrReplaceChild("fin1_r1",
						CubeListBuilder.create().texOffs(18, 12).addBox(-1.0F, -0.75F, -1.75F, 1.0F, 8.0F, 4.0F,
								new CubeDeformation(3.0F)),
						PartPose.offsetAndRotation(0.0F, -7.0F, 7.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition fin2_r1 = RocketNoFairing.addOrReplaceChild("fin2_r1",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -6.25F, 5.75F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 1.5708F, 0.0F));

		PartDefinition Fin3_r1 = RocketNoFairing.addOrReplaceChild("Fin3_r1",
				CubeListBuilder.create().texOffs(8, 12).addBox(0.0F, -5.75F, 5.75F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 3.1416F, 0.0F));

		PartDefinition Fin4_r1 = RocketNoFairing.addOrReplaceChild("Fin4_r1",
				CubeListBuilder.create().texOffs(8, 0).addBox(0.25F, -6.0F, 7.0F, 1.0F, 8.0F, 4.0F,
						new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		RocketNoFairing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}