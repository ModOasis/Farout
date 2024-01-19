// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelInflatableGreenHouse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "inflatablegreenhouse"), "main");
	private final ModelPart Plant;
	private final ModelPart InflatableGreenHouse;
	private final ModelPart Plant2;
	private final ModelPart Plant3;
	private final ModelPart Plant4;

	public ModelInflatableGreenHouse(ModelPart root) {
		this.Plant = root.getChild("Plant");
		this.InflatableGreenHouse = root.getChild("InflatableGreenHouse");
		this.Plant2 = root.getChild("Plant2");
		this.Plant3 = root.getChild("Plant3");
		this.Plant4 = root.getChild("Plant4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Plant = partdefinition.addOrReplaceChild("Plant",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Plant.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition InflatableGreenHouse = partdefinition.addOrReplaceChild("InflatableGreenHouse",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -26.0F, -74.0F, 14.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(164, 12)
						.addBox(-20.0F, -24.0F, -68.0F, 36.0F, 2.0F, 86.0F, new CubeDeformation(1.0F)).texOffs(78, 100)
						.addBox(-20.0F, -18.0F, -68.0F, 36.0F, 2.0F, 86.0F, new CubeDeformation(3.0F)).texOffs(0, 188)
						.addBox(-20.0F, -7.25F, -68.0F, 36.0F, 2.0F, 86.0F, new CubeDeformation(6.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Plant2 = partdefinition.addOrReplaceChild("Plant2",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -6.0F));

		PartDefinition cube_r2 = Plant2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Plant3 = partdefinition.addOrReplaceChild("Plant3",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -12.0F));

		PartDefinition cube_r3 = Plant3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Plant4 = partdefinition.addOrReplaceChild("Plant4",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -50.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -50.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -52.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -52.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -43.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -43.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -45.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -45.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -36.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -36.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -38.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -38.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -29.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -29.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -31.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -31.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -43.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -43.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -45.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -45.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -36.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -36.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -38.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -38.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -29.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -29.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -31.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -31.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -22.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -22.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -24.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -24.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 5.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 5.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 3.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 3.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 25.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 25.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 23.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 23.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 32.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 32.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(8.0F, -6.0F, 30.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(12.0F, -6.0F, 30.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 25.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 25.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 23.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 23.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 32.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 32.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 30.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 30.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -17.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -17.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -19.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -19.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -10.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -10.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -12.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -12.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -3.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -3.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -5.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -5.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, 2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, 2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -45.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -45.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -47.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -47.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -38.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -38.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -40.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -40.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -31.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -31.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -33.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -33.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -24.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -24.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-13.0F, -6.0F, -26.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-9.0F, -6.0F, -26.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -4.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -2.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -18.0F));

		PartDefinition cube_r4 = Plant4.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = Plant4.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -25.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = Plant4.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -32.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = Plant4.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -39.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = Plant4.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -46.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r9 = Plant4.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, 2.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = Plant4.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -4.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r11 = Plant4.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -11.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r12 = Plant4.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, -18.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = Plant4.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, 30.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r14 = Plant4.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, 23.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r15 = Plant4.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, 16.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r16 = Plant4.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -3.0F, 9.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r17 = Plant4.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, 30.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r18 = Plant4.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, 23.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r19 = Plant4.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, 16.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r20 = Plant4.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, 9.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r21 = Plant4.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, 3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r22 = Plant4.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r23 = Plant4.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -10.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r24 = Plant4.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -17.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r25 = Plant4.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -23.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r26 = Plant4.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -30.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r27 = Plant4.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -37.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r28 = Plant4.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -3.0F, -44.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r29 = Plant4.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -30.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r30 = Plant4.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -37.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r31 = Plant4.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -44.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r32 = Plant4.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -51.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Plant5 = Plant4.addOrReplaceChild("Plant5",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -11.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -9.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Plant5.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -10.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Plant6 = Plant4.addOrReplaceChild("Plant6",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -18.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -16.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Plant6.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -17.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Plant7 = Plant6.addOrReplaceChild("Plant7",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(1.0F, -6.0F, -25.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -25.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-3.0F, -6.0F, -23.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(1.0F, -6.0F, -23.0F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Plant7.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(201, 0)
						.addBox(-0.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, 0.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(3.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(201, 0)
						.addBox(-0.5F, -3.0F, -1.5F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.0F, -24.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Plant.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		InflatableGreenHouse.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Plant2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Plant3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Plant4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}