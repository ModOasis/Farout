// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart SpaceCraft;

	public Modelcustom_model(ModelPart root) {
		this.SpaceCraft = root.getChild("SpaceCraft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition SpaceCraft = partdefinition.addOrReplaceChild("SpaceCraft", CubeListBuilder.create()
				.texOffs(0, 2).addBox(-5.0F, -2.0F, -5.0F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, -1.0F));

		PartDefinition Anntena = SpaceCraft.addOrReplaceChild("Anntena",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-3.0F, -6.0F, -3.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-3.0F, -8.0F, 4.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(0.0F, -11.0F, 0.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-3.0F, -8.0F, -4.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Anntena.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-0.5F, -1.5F, -4.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-0.5F, -1.5F, 3.5F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -6.5F, -2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition SolarPanels = SpaceCraft.addOrReplaceChild("SolarPanels",
				CubeListBuilder.create().texOffs(16, 46)
						.addBox(-3.0F, -2.0F, -15.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 46)
						.addBox(-3.0F, -2.0F, 6.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Propusion = SpaceCraft.addOrReplaceChild("Propusion",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(1.0F)).texOffs(0, 3)
						.addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		SpaceCraft.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}