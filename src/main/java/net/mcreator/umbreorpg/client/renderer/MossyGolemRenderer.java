
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.umbreorpg.entity.MossyGolemEntity;
import net.mcreator.umbreorpg.client.model.Modelmodelgolem;

public class MossyGolemRenderer extends MobRenderer<MossyGolemEntity, Modelmodelgolem<MossyGolemEntity>> {
	public MossyGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodelgolem(context.bakeLayer(Modelmodelgolem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MossyGolemEntity, Modelmodelgolem<MossyGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("umbreo_rpg:textures/entities/mossygolem_glowing_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MossyGolemEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/mossygolem_texture.png");
	}
}
