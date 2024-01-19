// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSpaceSuitBody<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spacesuitbody"), "main");
	private final ModelPart LifeSupport;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public ModelSpaceSuitBody(ModelPart root) {
		this.LifeSupport = root.getChild("LifeSupport");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LifeSupport = partdefinition.addOrReplaceChild("LifeSupport", CubeListBuilder.create()
				.texOffs(0, 32).addBox(-3.6071F, -4.7857F, -0.8929F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.8571F, -9.7857F, 1.3571F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 6).addBox(1.3929F, -4.2857F, 3.1071F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 6).addBox(-3.6071F, -4.2857F, 3.1071F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(24, 35).addBox(-3.6071F, -4.7857F, -5.8929F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 27).addBox(-3.6071F, -4.7857F, -5.8929F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(54, 27).addBox(4.3929F, -4.7857F, -5.8929F, 0.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6071F, 11.7857F, 0.8929F, 0.0F, 3.1416F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-3.0F, -2.0F, 5.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm
				.addOrReplaceChild("LeftArm_r1",
						CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, -6.0F, -9.0F, 4.0F, 12.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LifeSupport.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}