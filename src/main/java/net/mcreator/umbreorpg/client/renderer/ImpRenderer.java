
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.umbreorpg.entity.ImpEntity;
import net.mcreator.umbreorpg.client.model.Modelimpmodel;

public class ImpRenderer extends MobRenderer<ImpEntity, Modelimpmodel<ImpEntity>> {
	public ImpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelimpmodel(context.bakeLayer(Modelimpmodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ImpEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/imp_texture.png");
	}
}
