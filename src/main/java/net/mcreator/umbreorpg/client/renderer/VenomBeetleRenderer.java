
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.umbreorpg.entity.VenomBeetleEntity;
import net.mcreator.umbreorpg.client.model.Modelvenom_beetle;

public class VenomBeetleRenderer extends MobRenderer<VenomBeetleEntity, Modelvenom_beetle<VenomBeetleEntity>> {
	public VenomBeetleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvenom_beetle(context.bakeLayer(Modelvenom_beetle.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(VenomBeetleEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/venom_beetle_texture.png");
	}
}
