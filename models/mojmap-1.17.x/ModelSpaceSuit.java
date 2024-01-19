// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSpaceSuit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spacesuit"), "main");
	private final ModelPart SpaceSuit;

	public ModelSpaceSuit(ModelPart root) {
		this.SpaceSuit = root.getChild("SpaceSuit");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition SpaceSuit = partdefinition.addOrReplaceChild("SpaceSuit", CubeListBuilder.create(),
				PartPose.offset(3.25F, -4.0F, 3.75F));

		PartDefinition LifeSupport = SpaceSuit.addOrReplaceChild("LifeSupport",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-4.0F, -5.0F, -8.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.25F, -10.0F, -5.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(1.0F, -4.5F, -4.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(-4.0F, -4.5F, -4.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
						.addBox(-4.0F, -5.0F, -13.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.25F, 9.0F, 6.25F));

		PartDefinition Head = SpaceSuit.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(1, 1)
						.addBox(-4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(33, 0)
						.addBox(2.25F, -5.0F, 4.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 11)
						.addBox(2.25F, -5.0F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.25F, 4.0F, -3.75F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 7.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 7.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 0.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 1.0F, -3.1416F, -1.5708F, 3.1416F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 0.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 8.0F, -3.1416F, -1.5708F, 3.1416F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(0, 49).addBox(0.0F, -4.0F, -3.5F, 0.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -3.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition RightArm = SpaceSuit.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-8.25F, 6.0F, -3.75F));

		PartDefinition LeftArm = SpaceSuit.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(28, 16)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.75F, 6.0F, -3.75F));

		PartDefinition RightLeg = SpaceSuit.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.15F, 16.0F, -3.75F));

		PartDefinition LeftLeg = SpaceSuit.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 48)
				.addBox(-1.5F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.35F, 16.0F, -3.75F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		SpaceSuit.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}