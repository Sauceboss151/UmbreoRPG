// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelStone_golem extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Mouth;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public ModelStone_golem() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 23.0F, -4.0F);
		Head.setTextureOffset(0, 23).addBox(-1.0F, -11.0F, 0.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(26, 10).addBox(-1.0F, -11.0F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		Mouth = new ModelRenderer(this);
		Mouth.setRotationPoint(1.0F, -8.0F, 2.0F);
		Head.addChild(Mouth);
		Mouth.setTextureOffset(20, 0).addBox(-2.0F, 0.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(1.0F, 15.0F, -2.0F);
		Body.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(20, 5).addBox(-1.0F, 5.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 18).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		Body.setTextureOffset(0, 10).addBox(-3.0F, -1.5F, 1.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(0.0F, 23.0F, -4.0F);
		LeftArm.setTextureOffset(15, 10).addBox(4.0F, -10.0F, 1.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		LeftArm.setTextureOffset(8, 30).addBox(4.0F, -7.0F, 3.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(1.0F, 15.0F, -2.0F);
		RightArm.setTextureOffset(0, 15).addBox(-6.0F, -2.0F, -0.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 29).addBox(-5.0F, 1.0F, 1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.0F, 15.0F, -2.0F);
		LeftLeg.setTextureOffset(24, 25).addBox(1.0F, 5.0F, 0.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 2).addBox(1.5F, 6.6F, 0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(1.0F, 15.0F, -2.0F);
		RightLeg.setTextureOffset(14, 25).addBox(-3.0F, 5.0F, 0.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(-2.5F, 6.6F, 0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}