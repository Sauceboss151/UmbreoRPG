
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.umbreorpg.entity.FireflyEntity;
import net.mcreator.umbreorpg.client.model.Modelfirefly;

public class FireflyRenderer extends MobRenderer<FireflyEntity, Modelfirefly<FireflyEntity>> {
	public FireflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfirefly(context.bakeLayer(Modelfirefly.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireflyEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/firefly_texture.png");
	}
}
