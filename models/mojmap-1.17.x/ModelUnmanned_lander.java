// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelUnmanned_lander<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "unmanned_lander"), "main");
	private final ModelPart Unmanned_lander;

	public ModelUnmanned_lander(ModelPart root) {
		this.Unmanned_lander = root.getChild("Unmanned_lander");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Unmanned_lander = partdefinition.addOrReplaceChild("Unmanned_lander", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Core = Unmanned_lander.addOrReplaceChild("Core", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-7.0F, -10.25F, -7.0F, 14.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Anttena = Core.addOrReplaceChild("Anttena", CubeListBuilder.create(),
				PartPose.offset(-1.25F, 9.25F, 0.0F));

		PartDefinition cube_r1 = Anttena.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5784F, -24.5784F, 0.25F, 1.5708F, 0.0F, -2.3562F));

		PartDefinition cube_r2 = Anttena.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(33, 22)
						.addBox(-3.0F, -3.25F, -4.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 22)
						.addBox(-3.0F, -3.25F, 2.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.75F, -21.75F, 0.5F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition cube_r3 = Anttena.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(33, 22)
						.addBox(-3.75F, -3.25F, 3.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 22)
						.addBox(-3.75F, -3.25F, -4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 19)
						.addBox(-3.75F, -1.25F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.75F, -21.75F, 0.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r4 = Anttena.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, -19.25F, 0.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Landing_leg_assembly = Unmanned_lander.addOrReplaceChild("Landing_leg_assembly",
				CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Landing_Leg = Landing_leg_assembly.addOrReplaceChild("Landing_Leg", CubeListBuilder.create()
				.texOffs(15, 19).addBox(8.5F, -0.75F, -2.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Landing_Leg
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 19).addBox(-5.5F, -1.5F, -0.5F, 9.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.829F));

		PartDefinition Landing_Leg2 = Landing_leg_assembly.addOrReplaceChild("Landing_Leg2",
				CubeListBuilder.create().texOffs(15, 19).addBox(-0.7808F, 1.0814F, -2.5F, 4.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.7192F, -1.8314F, 0.5F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r6 = Landing_Leg2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 19).addBox(-5.5F, -1.5F, -0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2808F, -0.1686F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition Landing_Leg3 = Landing_leg_assembly
				.addOrReplaceChild("Landing_Leg3",
						CubeListBuilder.create().texOffs(15, 19).addBox(8.5F, -0.75F, -2.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = Landing_Leg3
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(0, 19).addBox(-5.5F, -1.5F, -0.5F, 9.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.829F));

		PartDefinition Landing_Leg4 = Landing_leg_assembly.addOrReplaceChild("Landing_Leg4",
				CubeListBuilder.create().texOffs(15, 19).addBox(-0.7808F, 1.0814F, -2.5F, 4.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4692F, -1.8314F, 10.5F, -3.1416F, -1.5708F, 3.1416F));

		PartDefinition cube_r8 = Landing_Leg4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 19).addBox(-5.5F, -1.5F, -0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2808F, -0.1686F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition Drill = Unmanned_lander.addOrReplaceChild("Drill", CubeListBuilder.create().texOffs(0, 0).addBox(
				5.75F, -13.0F, -6.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Drill.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.25F, -0.5F, -6.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r10 = Drill.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 24).addBox(-1.25F, -19.25F, -0.5F, 1.0F, 20.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.25F, -11.5F, -6.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition Camera_assembly = Unmanned_lander.addOrReplaceChild("Camera_assembly", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Camera_assembly.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(5, 25).addBox(-7.5F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -11.0F, 0.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Camera = Camera_assembly.addOrReplaceChild("Camera",
				CubeListBuilder.create().texOffs(50, 0)
						.addBox(-1.0F, -21.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 8)
						.addBox(3.0F, -21.0F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Unmanned_lander.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}