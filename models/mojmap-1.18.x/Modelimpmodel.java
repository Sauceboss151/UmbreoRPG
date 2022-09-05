// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelimpmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "impmodel"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelimpmodel(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 12.0465F, 1.7535F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 0).addBox(-0.6F, -0.5F, -1.2F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7367F, -2.3007F, 1.9429F, -0.3162F, 0.6885F, -0.1752F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(28, 27).addBox(-0.4815F, -0.7432F, -1.9682F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8595F, -2.2674F, 1.0916F, -0.3486F, -0.711F, 0.2329F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(12, 10).addBox(-0.4929F, -0.7612F, -0.0328F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8595F, -2.2674F, 1.0916F, -0.393F, -0.7318F, 0.2927F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 29).addBox(-0.6843F, -1.25F, -1.1689F, 1.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -1.9659F, 0.2588F, -0.3486F, 0.711F, -0.2329F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.713F, -4.9181F, -0.8859F, 0.3288F, 0.6286F, -0.196F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 10).addBox(-0.5F, -0.9066F, -1.1088F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -5.2519F, -0.4136F, 0.3384F, -0.5872F, 0.1793F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 10).addBox(-2.0F, -4.0F, -2.25F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0465F, -0.0035F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.5F, -4.25F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(15, 0)
						.addBox(-2.0F, 0.75F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.25F, 1.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-2.5F, 13.0F, 1.5F));

		PartDefinition cube_r8 = RightArm
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(28, 13).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.5F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0698F));

		PartDefinition cube_r9 = RightArm
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(16, 20).addBox(-1.4698F, -0.829F, -1.25F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.1F, 0.0F, 0.25F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r10 = RightArm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -0.75F, -0.5F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 3.0F, -0.5F, -1.1345F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(11, 13).addBox(0.25F, -4.9302F, -0.1853F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, 13.0F, 1.75F, -3.0107F, 0.0F, 0.0F));

		PartDefinition cube_r11 = LeftArm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(16, 27).addBox(-0.7F, -1.0035F, -0.6F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -2.9696F, 0.3473F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r12 = LeftArm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(20, 11).addBox(-0.1217F, -3.3239F, -0.4741F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, -0.25F, -0.1572F, 0.0762F, 0.4478F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.6F, 18.8806F, 1.3717F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(22, 24).addBox(-1.9F, -2.75F, -2.25F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.9772F, -0.5229F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(26, 9).addBox(-1.0F, -1.1768F, -0.4697F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, 2.5272F, -2.291F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(27, 3).addBox(-1.0F, -0.8085F, -1.1607F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, 0.704F, -2.5271F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r16 = RightLeg.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(8, 20).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4F, 0.2898F, -0.0776F, -1.3526F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.9F, 18.8806F, 1.3717F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r17 = LeftLeg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(24, 18).addBox(-1.9F, -2.75F, -2.25F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 4.9772F, -0.5229F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r18 = LeftLeg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 25).addBox(-1.0F, -1.1768F, -0.4697F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, 2.5272F, -2.291F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r19 = LeftLeg.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(8, 26).addBox(-1.0F, -0.8085F, -1.1607F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, 0.704F, -2.5271F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r20 = LeftLeg.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(20, 5).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1F, 0.2898F, -0.0776F, -1.3526F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}