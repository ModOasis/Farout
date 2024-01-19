// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStartingLander<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "startinglander"), "main");
	private final ModelPart StartingLander;

	public ModelStartingLander(ModelPart root) {
		this.StartingLander = root.getChild("StartingLander");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition StartingLander = partdefinition.addOrReplaceChild("StartingLander",
				CubeListBuilder.create().texOffs(0, 73)
						.addBox(20.5F, -0.25F, 22.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 56)
						.addBox(-32.5F, -0.25F, 22.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(66, 33)
						.addBox(22.5F, -0.25F, -31.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(54, 68)
						.addBox(-32.5F, -0.25F, -31.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-1.0F, -34.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(20.0F)).texOffs(0, 0)
						.addBox(-16.5F, -56.0F, -15.5F, 32.0F, 1.0F, 32.0F, new CubeDeformation(2.0F)).texOffs(0, 33)
						.addBox(-11.75F, -60.5F, -10.75F, 22.0F, 1.0F, 22.0F, new CubeDeformation(2.0F)).texOffs(0, 56)
						.addBox(-8.75F, -64.25F, -7.75F, 16.0F, 1.0F, 16.0F, new CubeDeformation(1.0F)).texOffs(101, 4)
						.addBox(-23.0F, -42.5F, 7.0F, 1.0F, 17.0F, 11.0F, new CubeDeformation(1.0F)).texOffs(0, 0)
						.addBox(-1.0F, -33.25F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(19.0F)).texOffs(85, 0)
						.addBox(-1.0F, -20.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(76, 83)
						.addBox(-8.5F, -23.0F, -3.0F, 16.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = StartingLander.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(106, 61).addBox(-2.5F, -11.5F, -5.0F, 1.0F, 23.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -34.25F, 2.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r2 = StartingLander.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(101, 4).addBox(-0.5F, -8.5F, -5.5F, 1.0F, 17.0F, 11.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-22.5F, -34.0F, -11.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = StartingLander.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -3.5F, 31.0F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 2.3562F, 0.0F));

		PartDefinition cube_r4 = StartingLander.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, -3.5F, 31.0F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.7592F, 0.0F));

		PartDefinition cube_r5 = StartingLander.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, -3.5F, 31.0F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, -0.7854F, 0.0F));

		PartDefinition cube_r6 = StartingLander.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(12, 0).addBox(-0.5F, -3.5F, 31.0F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, -2.33F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		StartingLander.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}