// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelImp extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;

	public ModelImp() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(1.0F, 12.0F, 2.0F);
		Head.setTextureOffset(0, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(20, 20).addBox(-3.0F, -3.9F, -2.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(20, 12).addBox(0.0F, -3.9F, -2.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(18, 23).addBox(-3.0F, -5.9F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(2.0F, -5.9F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 23).addBox(-0.5F, -3.0F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(1.0F, 12.0F, 2.0F);
		Body.setTextureOffset(0, 8).addBox(-2.0F, 0.0F, -1.5F, 4.0F, 6.0F, 3.0F, 0.0F, false);
		Body.setTextureOffset(22, 15).addBox(-2.0F, 1.0F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(14, 22).addBox(1.0F, 1.0F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(3.0F, 12.0F, 2.0F);
		LeftArm.setTextureOffset(20, 0).addBox(0.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(22, 8).addBox(0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(8, 17).addBox(1.0F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		LeftArm.setTextureOffset(16, 4).addBox(0.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-1.0F, 12.0F, 2.0F);
		RightArm.setTextureOffset(0, 17).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(8, 21).addBox(-1.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(12, 0).addBox(-2.0F, 6.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		RightArm.setTextureOffset(16, 0).addBox(-1.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(0.0F, 18.0F, 2.0F);
		LeftLeg.setTextureOffset(14, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 18.0F, 2.0F);
		RightLeg.setTextureOffset(14, 6).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
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
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}