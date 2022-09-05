// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldustmite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dustmite"), "main");
	private final ModelPart section_2;
	private final ModelPart bb_main;

	public Modeldustmite(ModelPart root) {
		this.section_2 = root.getChild("section_2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition section_2 = partdefinition.addOrReplaceChild("section_2", CubeListBuilder.create().texOffs(0, 14)
				.addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 2.5F));

		PartDefinition section_0 = section_2.addOrReplaceChild("section_0", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.0F, -3.0F, -4.4F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -2.5F));

		PartDefinition section_1 = section_2.addOrReplaceChild("section_1", CubeListBuilder.create().texOffs(0, 5)
				.addBox(-3.0F, -4.0F, -2.4F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -2.5F));

		PartDefinition section_3 = section_2.addOrReplaceChild("section_3", CubeListBuilder.create().texOffs(0, 18)
				.addBox(-0.5F, -2.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -2.5F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 21)
						.addBox(-2.0F, -2.0F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 22)
						.addBox(-0.5F, -1.5F, 4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		section_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}