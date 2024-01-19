// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsteve<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "steve"), "main");
	private final ModelPart LifeSupport;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelsteve(ModelPart root) {
		this.LifeSupport = root.getChild("LifeSupport");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LifeSupport = partdefinition.addOrReplaceChild("LifeSupport",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-4.0F, -5.0F, -8.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.25F, -10.0F, -5.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(1.0F, -4.5F, -4.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
						.addBox(-4.0F, -4.5F, -4.0F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
						.addBox(-4.0F, -5.0F, -13.0F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 10.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LifeSupport.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
	}
}