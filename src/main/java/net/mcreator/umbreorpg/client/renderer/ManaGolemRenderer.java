
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.umbreorpg.entity.ManaGolemEntity;
import net.mcreator.umbreorpg.client.model.Modelmodelgolem;

public class ManaGolemRenderer extends MobRenderer<ManaGolemEntity, Modelmodelgolem<ManaGolemEntity>> {
	public ManaGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodelgolem(context.bakeLayer(Modelmodelgolem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<ManaGolemEntity, Modelmodelgolem<ManaGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("umbreo_rpg:textures/entities/managolem_glowing_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ManaGolemEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/managolem_texture.png");
	}
}
