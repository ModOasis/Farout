// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSpaceCapusle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spacecapusle"), "main");
	private final ModelPart Inflatable_bit;
	private final ModelPart LandingLeg;
	private final ModelPart LandingLeg2;
	private final ModelPart LandingLeg3;
	private final ModelPart LandingLeg4;

	public ModelSpaceCapusle(ModelPart root) {
		this.Inflatable_bit = root.getChild("Inflatable_bit");
		this.LandingLeg = root.getChild("LandingLeg");
		this.LandingLeg2 = root.getChild("LandingLeg2");
		this.LandingLeg3 = root.getChild("LandingLeg3");
		this.LandingLeg4 = root.getChild("LandingLeg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Inflatable_bit = partdefinition.addOrReplaceChild("Inflatable_bit",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(-3.0F, -12.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(-1.0F)).texOffs(0, 0)
						.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition LandingLeg = partdefinition.addOrReplaceChild("LandingLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 22.0F, 1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r1 = LandingLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4435F, -2.2691F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = LandingLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition LandingLeg2 = partdefinition.addOrReplaceChild("LandingLeg2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.0F, 22.0F, -1.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r3 = LandingLeg2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4435F, -2.2691F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LandingLeg2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition LandingLeg3 = partdefinition.addOrReplaceChild("LandingLeg3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 22.0F, -1.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r5 = LandingLeg3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4435F, -2.2691F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r6 = LandingLeg3.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition LandingLeg4 = partdefinition.addOrReplaceChild("LandingLeg4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.0F, 22.0F, 1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r7 = LandingLeg4.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.4435F, -2.2691F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r8 = LandingLeg4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -0.5F, -1.5F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -4.5F, -1.5708F, 0.0F, 1.5708F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Inflatable_bit.render(poseStack, buffer, packedLight, packedOverlay);
		LandingLeg.render(poseStack, buffer, packedLight, packedOverlay);
		LandingLeg2.render(poseStack, buffer, packedLight, packedOverlay);
		LandingLeg3.render(poseStack, buffer, packedLight, packedOverlay);
		LandingLeg4.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}