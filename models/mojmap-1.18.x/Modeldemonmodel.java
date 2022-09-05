// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldemonmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "demonmodel"), "main");
	private final ModelPart head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modeldemonmodel(ModelPart root) {
		this.head = root.getChild("head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(43, 18)
						.addBox(-5.0F, -9.0F, -4.0F, 10.0F, 8.0F, 9.0F, new CubeDeformation(-0.5F)).texOffs(33, 37)
						.addBox(-5.0F, -2.0F, -4.0F, 10.0F, 3.0F, 9.0F, new CubeDeformation(-0.5F)).texOffs(40, 6)
						.addBox(1.5F, -12.4F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
						.addBox(2.0F, -14.4F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 3)
						.addBox(2.5F, -16.4F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(1.5F, -9.4F, -5.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-4.5F, -12.4F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 46)
						.addBox(-4.0F, -14.4F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 27)
						.addBox(-3.5F, -16.4F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 35)
						.addBox(-4.5F, -9.4F, -5.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -22.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-1.5F, -3.0F, 6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.5F, -3.0F, -1.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-1.5F, -3.0F, 2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 31)
						.addBox(-1.5F, -3.0F, 4.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 8)
						.addBox(-0.25F, -2.25F, 5.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 54)
						.addBox(-0.25F, -2.25F, 3.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 27)
						.addBox(-0.25F, -2.25F, 1.75F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-0.25F, -2.25F, -1.25F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, -4.75F, 0.25F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -13.75F, -5.75F, 14.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-6.0F, 1.25F, -4.75F, 12.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.25F, -0.25F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 80)
						.addBox(-3.0F, -2.0F, -1.0F, 4.0F, 30.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 63)
						.addBox(1.0F, -2.0F, -3.0F, 3.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, -19.0F, -1.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(0, 46)
						.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 30.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-5.0F, -2.0F, -3.0F, 3.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -19.0F, -1.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(50, 54)
						.addBox(-2.0F, 0.0F, -3.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 70)
						.addBox(-1.5F, 11.0F, -2.5F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(30, 54)
				.addBox(-3.0F, 0.0F, -3.0F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition bone_r1 = LeftLeg.addOrReplaceChild("bone_r1",
				CubeListBuilder.create().texOffs(30, 70).addBox(-1.75F, -4.5F, -2.25F, 4.0F, 11.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7935F, 15.5F, -0.3241F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}