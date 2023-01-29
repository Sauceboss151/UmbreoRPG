
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.umbreorpg.entity.FrostGolemEntity;
import net.mcreator.umbreorpg.client.model.Modelmodelgolem;

public class FrostGolemRenderer extends MobRenderer<FrostGolemEntity, Modelmodelgolem<FrostGolemEntity>> {
	public FrostGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodelgolem(context.bakeLayer(Modelmodelgolem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FrostGolemEntity, Modelmodelgolem<FrostGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("umbreo_rpg:textures/entities/frostgolem_glowing_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FrostGolemEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/frostgolem_texture.png");
	}
}
