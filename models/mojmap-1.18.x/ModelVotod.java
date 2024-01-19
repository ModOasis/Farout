// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVotod<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "votod"), "main");
	private final ModelPart head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelVotod(ModelPart root) {
		this.head = root.getChild("head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-4.0F, -21.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 16)
						.addBox(-4.0F, -22.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(56, 0)
				.addBox(-3.0F, -1.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -12.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(56, 0).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, -12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 10)
				.addBox(-1.0F, 6.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -2.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 10).mirror()
						.addBox(-1.0F, 6.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.zRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.zRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}