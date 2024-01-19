// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSounding_Rocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sounding_rocket"), "main");
	private final ModelPart bb_main;

	public ModelSounding_Rocket(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -14.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 1)
						.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-0.5F, -16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(2, 0).addBox(-0.5F, -5.5F, -1.5F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(3, 0).addBox(-0.5F, -5.5F, -1.5F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(3, 0).addBox(-0.5F, -5.5F, -1.5F, 1.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = bb_main
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(3, 0).addBox(-0.5F, -5.5F, -1.5F, 1.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}