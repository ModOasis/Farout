// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLandingModule<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "landingmodule"), "main");
	private final ModelPart bone;

	public ModelLandingModule(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-21.6667F, 7.6667F, -22.0F, 44.0F, 11.0F, 44.0F, new CubeDeformation(2.0F)).texOffs(0, 55)
				.addBox(-18.6667F, -6.3333F, -19.0F, 38.0F, 11.0F, 38.0F, new CubeDeformation(2.0F)).texOffs(0, 104)
				.addBox(-15.6667F, -15.3333F, -15.0F, 30.0F, 6.0F, 30.0F, new CubeDeformation(2.0F)).texOffs(139, 0)
				.addBox(-5.0F, 27.0F, -4.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(7.0F)).texOffs(0, 0)
				.addBox(-22.0F, 21.0F, 13.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(12.0F, 21.0F, 13.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(12.0F, 21.0F, -21.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-22.0F, 21.0F, -21.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(3, 191)
				.addBox(-5.0F, 35.0F, -5.0F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3333F, -19.6667F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(38, 170).addBox(-2.0F, 8.0F, 29.0F, 2.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3333F, 43.6667F, 0.0F, 0.6981F, 2.3824F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 170).addBox(-2.0F, 8.0F, 29.0F, 2.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3333F, 43.6667F, 0.0F, 0.6981F, -2.2864F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(38, 170).addBox(-2.0F, 8.0F, 29.0F, 2.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3333F, 43.6667F, 0.0F, 0.6981F, -0.7418F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 170).addBox(-2.0F, 8.0F, 29.0F, 2.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3333F, 43.6667F, 0.0F, 0.6981F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}