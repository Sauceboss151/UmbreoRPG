
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.umbreorpg.entity.DemonEntity;
import net.mcreator.umbreorpg.client.model.Modeldemonmodel;

public class DemonRenderer extends MobRenderer<DemonEntity, Modeldemonmodel<DemonEntity>> {
	public DemonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldemonmodel(context.bakeLayer(Modeldemonmodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DemonEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/demon_texture.png");
	}
}
