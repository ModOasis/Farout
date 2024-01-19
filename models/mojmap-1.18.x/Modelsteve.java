// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsteve<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "steve"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Head;
	private final ModelPart Body;

	public Modelsteve(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-1.85F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(1, 1)
						.addBox(-4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(33, 0)
						.addBox(2.25F, -5.0F, 4.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 11)
						.addBox(2.25F, -5.0F, 3.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 7.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(1, 0).addBox(0.0F, -4.0F, -4.0F, 0.0F, 7.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -4.0F, 0.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 1.0F, -3.1416F, -1.5708F, 3.1416F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(1, 0).addBox(-4.0F, -32.0F, -4.0F, 0.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 8.0F, -3.1416F, -1.5708F, 3.1416F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(26, 48).addBox(0.0F, -4.0F, -3.5F, 0.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -3.0F, 0.0F, 1.5708F, 1.5708F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.25F, -5.0F, 4.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(1.0F, 0.5F, 6.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(-4.0F, 0.5F, 6.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}