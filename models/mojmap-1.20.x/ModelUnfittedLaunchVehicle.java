// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelUnfittedLaunchVehicle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "unfittedlaunchvehicle"), "main");
	private final ModelPart bb_main;

	public ModelUnfittedLaunchVehicle(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(72, 90)
				.addBox(-12.0F, -230.25F, -12.0F, 24.0F, 68.0F, 24.0F, new CubeDeformation(12.0F)).texOffs(0, 0)
				.addBox(-12.0F, -120.0F, -12.0F, 24.0F, 90.0F, 24.0F, new CubeDeformation(18.0F)).texOffs(168, 104)
				.addBox(-8.0F, -12.0F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(168, 104)
				.addBox(14.0F, -12.0F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(168, 104)
				.addBox(-30.0F, -12.0F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(168, 104)
				.addBox(-8.0F, -12.0F, -30.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(168, 104)
				.addBox(-8.0F, -12.0F, 14.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(168, 104)
				.addBox(-8.0F, -150.25F, -8.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(96, 35)
				.addBox(21.0F, -152.0F, -1.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 197)
				.addBox(-26.0F, -186.0F, -1.0F, 2.0F, 33.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 197)
				.addBox(24.0F, -186.0F, -1.0F, 2.0F, 33.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 197)
				.addBox(-2.0F, -186.0F, -26.0F, 2.0F, 33.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 197)
				.addBox(-2.0F, -186.0F, 26.0F, 2.0F, 33.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(16, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(72, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(80, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(88, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(96, 0).addBox(21.0F, -8.5F, -1.0F, 2.0F, 15.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -143.5F, 0.0F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}