package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.umbreorpg.entity.CobiumBowEntity;
import net.mcreator.umbreorpg.client.model.Modelumbreorpg_arrow;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CobiumBowRenderer extends EntityRenderer<CobiumBowEntity> {
	private static final ResourceLocation texture = new ResourceLocation("umbreo_rpg:textures/entities/umbreorpg_arrow_texture.png");
	private final Modelumbreorpg_arrow model;

	public CobiumBowRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelumbreorpg_arrow(context.bakeLayer(Modelumbreorpg_arrow.LAYER_LOCATION));
	}

	@Override
	public void render(CobiumBowEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(CobiumBowEntity entity) {
		return texture;
	}
}
