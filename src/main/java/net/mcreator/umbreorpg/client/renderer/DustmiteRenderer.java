
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.umbreorpg.entity.DustmiteEntity;
import net.mcreator.umbreorpg.client.model.Modeldustmite;

public class DustmiteRenderer extends MobRenderer<DustmiteEntity, Modeldustmite<DustmiteEntity>> {
	public DustmiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldustmite(context.bakeLayer(Modeldustmite.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(DustmiteEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/dustmite_texture.png");
	}
}
