
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.umbreorpg.entity.TwilightGolemEntity;
import net.mcreator.umbreorpg.client.model.Modelmodelgolem;

public class TwilightGolemRenderer extends MobRenderer<TwilightGolemEntity, Modelmodelgolem<TwilightGolemEntity>> {
	public TwilightGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodelgolem(context.bakeLayer(Modelmodelgolem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<TwilightGolemEntity, Modelmodelgolem<TwilightGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("umbreo_rpg:textures/entities/twilightgolem_glowing_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TwilightGolemEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/twilightgolem_texture.png");
	}
}
