// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSmallRocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "smallrocket"), "main");
	private final ModelPart Fairing;
	private final ModelPart Interior;
	private final ModelPart Booster2;
	private final ModelPart Booster1;
	private final ModelPart Core;
	private final ModelPart Booster3;
	private final ModelPart Booster4;
	private final ModelPart bb_main;

	public ModelSmallRocket(ModelPart root) {
		this.Fairing = root.getChild("Fairing");
		this.Interior = root.getChild("Interior");
		this.Booster2 = root.getChild("Booster2");
		this.Booster1 = root.getChild("Booster1");
		this.Core = root.getChild("Core");
		this.Booster3 = root.getChild("Booster3");
		this.Booster4 = root.getChild("Booster4");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Fairing = partdefinition.addOrReplaceChild("Fairing", CubeListBuilder.create(),
				PartPose.offset(0.0F, -149.5F, 0.0F));

		PartDefinition Interior = partdefinition.addOrReplaceChild("Interior",
				CubeListBuilder.create().texOffs(176, 53)
						.addBox(-18.5F, -188.0F, -6.5F, 16.0F, 43.0F, 16.0F, new CubeDeformation(2.0F)).texOffs(191, 68)
						.addBox(-3.5F, -146.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(176, 19)
						.addBox(-18.5F, -148.0F, -4.5F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(191, 20)
						.addBox(-18.5F, -174.0F, 10.5F, 16.0F, 26.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 17.0F, 0.0F));

		PartDefinition Booster2 = partdefinition.addOrReplaceChild("Booster2",
				CubeListBuilder.create().texOffs(61, 1)
						.addBox(0.0F, -2.0F, -22.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(61, 8)
						.addBox(0.0F, -2.0F, -15.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(8, 72)
						.addBox(-2.0F, -96.0F, -22.0F, 8.0F, 90.0F, 8.0F, new CubeDeformation(2.0F)),
				PartPose.offset(-2.0F, 24.0F, 2.0F));

		PartDefinition cube_r1 = Booster2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 8)
						.addBox(-5.0F, -1.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(1, 1)
						.addBox(-5.0F, -1.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -15.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Booster1 = partdefinition.addOrReplaceChild("Booster1",
				CubeListBuilder.create().texOffs(61, 1)
						.addBox(-1.0F, -2.0F, 19.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(61, 8)
						.addBox(-1.0F, -2.0F, 26.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(8, 72)
						.addBox(-3.0F, -96.0F, 19.0F, 8.0F, 90.0F, 8.0F, new CubeDeformation(2.0F)),
				PartPose.offset(-1.0F, 24.0F, -7.0F));

		PartDefinition cube_r2 = Booster1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(1, 8)
						.addBox(3.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(1, 1)
						.addBox(3.0F, -1.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 18.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Core = partdefinition.addOrReplaceChild("Core",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-8.0F, -96.0F, -8.0F, 16.0F, 90.0F, 16.0F, new CubeDeformation(2.0F)).texOffs(60, 0)
						.addBox(-3.0F, -6.0F, -4.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(2.0F)).texOffs(60, 7)
						.addBox(-3.0F, -6.0F, 4.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(2.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = Core.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 7)
						.addBox(-3.0F, -5.0F, -5.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(2.0F)).texOffs(0, 0)
						.addBox(-3.0F, -5.0F, 3.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Booster3 = partdefinition.addOrReplaceChild("Booster3",
				CubeListBuilder.create().texOffs(61, 1)
						.addBox(-16.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(61, 8)
						.addBox(-16.0F, -2.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(8, 72)
						.addBox(-18.0F, -96.0F, -6.0F, 8.0F, 90.0F, 8.0F, new CubeDeformation(2.0F)),
				PartPose.offset(-2.0F, 24.0F, 2.0F));

		PartDefinition cube_r4 = Booster3.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(1, 8)
						.addBox(-1.0F, -1.0F, -2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(1, 1)
						.addBox(-1.0F, -1.0F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-12.0F, -1.0F, -3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Booster4 = partdefinition.addOrReplaceChild("Booster4",
				CubeListBuilder.create().texOffs(61, 1)
						.addBox(-12.0F, -2.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(61, 8)
						.addBox(-12.0F, -2.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(8, 72)
						.addBox(-14.0F, -96.0F, -6.0F, 8.0F, 90.0F, 8.0F, new CubeDeformation(2.0F)),
				PartPose.offset(26.0F, 24.0F, 2.0F));

		PartDefinition cube_r5 = Booster4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(1, 8)
						.addBox(-1.0F, -1.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)).texOffs(1, 1)
						.addBox(-1.0F, -1.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-12.0F, -1.0F, -3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(64, 76)
						.addBox(-8.0F, -143.0F, -8.0F, 16.0F, 36.0F, 16.0F, new CubeDeformation(2.0F)).texOffs(62, 46)
						.addBox(-9.0F, -108.0F, -9.0F, 18.0F, 12.0F, 18.0F, new CubeDeformation(2.0F)).texOffs(98, 142)
						.addBox(-6.5F, -198.0F, -6.5F, 13.0F, 46.0F, 13.0F, new CubeDeformation(7.0F)).texOffs(64, 76)
						.addBox(-8.0F, -146.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(4.0F)).texOffs(98, 142)
						.addBox(-6.5F, -207.0F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(5.0F)).texOffs(98, 142)
						.addBox(-6.5F, -212.0F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(3.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Fairing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Interior.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Booster2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Booster1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Core.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Booster3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Booster4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}