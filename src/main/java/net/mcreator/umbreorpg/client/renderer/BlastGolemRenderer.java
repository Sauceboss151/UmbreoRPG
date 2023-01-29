
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.umbreorpg.entity.BlastGolemEntity;
import net.mcreator.umbreorpg.client.model.Modelmodelgolem;

public class BlastGolemRenderer extends MobRenderer<BlastGolemEntity, Modelmodelgolem<BlastGolemEntity>> {
	public BlastGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmodelgolem(context.bakeLayer(Modelmodelgolem.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BlastGolemEntity, Modelmodelgolem<BlastGolemEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("umbreo_rpg:textures/entities/blastgolem_glowing_texture.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BlastGolemEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/blastgolem_texture.png");
	}
}
